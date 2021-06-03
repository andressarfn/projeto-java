package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

import view.gestor.CadastrarFuncionario;
import view.voluntario.Doar;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

public class Voluntario extends JFrame {

	private JPanel contentPane;
	
	//OBJETO EVENTO - 18/05
	private model.Evento evento = new model.Evento();
	private model.Trabalho trabalho = new model.Trabalho();
	
	//OBJETO VOLUNTÁRIO LOGADO- ANDRÉ 21/05
	model.Voluntario voluntarioLogin = new model.Voluntario();
	
	//ARRAYS NECESSÁRIOS PARA SEREM MOSTRADOS NO TEXTAREA
	private static ArrayList<model.Evento> eventos = new ArrayList<model.Evento>();
	private static ArrayList<model.Trabalho> trabalhos = new ArrayList<model.Trabalho>();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Voluntario frame = new Voluntario();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//tela do voluntario
	public Voluntario() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Volunt\u00E1rio", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//texto do voluntario
		JLabel lblNewLabel = new JLabel("Escolha uma das op\u00E7\u00F5es");
		lblNewLabel.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblNewLabel.setBounds(171, 173, 165, 14);
		contentPane.add(lblNewLabel);
		
		//combobox do voluntário
		JComboBox comboBoxVoluntario = new JComboBox();
		comboBoxVoluntario.setFont(new Font("Gadugi", Font.BOLD, 13));
		comboBoxVoluntario.setModel(new DefaultComboBoxModel(new String[] {"", "Buscar eventos", "Buscar trabalhos", "Doar"}));
		comboBoxVoluntario.setBounds(171, 198, 365, 25);
		contentPane.add(comboBoxVoluntario);
		
		//TEXT ÁREA INFORMAÇÕES - 17/05
		JTextArea textAreaInformacoes = new JTextArea();
		textAreaInformacoes.setEditable(false);
		textAreaInformacoes.setFont(new Font("Gadugi", Font.PLAIN, 15));
		contentPane.add(textAreaInformacoes);
		
		//ADD SCROLL
		JScrollPane scroll = new JScrollPane(textAreaInformacoes, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBackground(new Color(192, 192, 192));
		scroll.setBounds(45, 270, 600, 338);
		scroll.setFont(new Font("Gadugi", Font.BOLD, 15));
		contentPane.add(scroll);
		
		//botão avançar
		JButton botaoAvancar = new JButton("Avan\u00E7ar");
		botaoAvancar.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//BUSCAR EVENTOS
				if(comboBoxVoluntario.getSelectedItem().equals("Buscar eventos")) {
					eventos = evento.getEventos();
					for (int i = 0; i < eventos.size(); i++) {
						textAreaInformacoes.setText(eventos.toString());	
					}
				}
				//BUSCAR TRABALHOS
				if(comboBoxVoluntario.getSelectedItem().equals("Buscar trabalhos")) {
					trabalhos = trabalho.getTrabalhos();
					
					String diaVoluntario = voluntarioLogin.getDiaDisponivel();
					
					//BLOCO - CRUZAR E APRESENTAR DATAS DE TRABALHO E VOLUNTÁRIO COMPATÍVEIS
					for (int i = 0; i < trabalhos.size(); i++) {
						//
						String diaTrabalho = trabalhos.get(i).getData();
						//SE A SITUAÇÃO DO TRABALHO E A DATA DE VOLUNTÁRIO E TRABALHO COINCIDEM, A PERGUNTA SERÁ FEITA
						if(diaTrabalho.equals(diaVoluntario) && trabalhos.get(i).getSituacao() == false) {
							int decisao = JOptionPane.showConfirmDialog(null,trabalhos.get(i)+"\nDeseja Aceitar Trabalho?");
							//ACEITAR TRABALHO
							if(decisao == JOptionPane.YES_OPTION) {
								//OBJETO -> ARRAY -> POSÇÃO DO ARRAY -> ATRIBUTO -> COLOCAR VOLUNTARIO LOGADO
								trabalho.getTrabalhos().get(i).setVoluntario(voluntarioLogin);
								//MUDANDO SITUAÇÃO DO TRABALHO
								trabalho.getTrabalhos().get(i).setSituacao(true);
								JOptionPane.showMessageDialog(null,"Trabalho Aceito");
							}
							//RECUSAR TRABALHO
							else {
								
								JOptionPane.showMessageDialog(null,"Trabalho Rejeitado");
							}
						}
						
						//APRESENTAR TODOS OS TRABALHOS
						textAreaInformacoes.setText("Trabalhos da Ong \n"+trabalhos.toString());	
					}
				}
				//DOAR
				if(comboBoxVoluntario.getSelectedItem().equals("Doar")) {
					view.voluntario.Doar frame = new view.voluntario.Doar();
					frame.pegar(voluntarioLogin);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					dispose();
				}
			}
		});
		botaoAvancar.setBounds(171, 619, 365, 25);
		contentPane.add(botaoAvancar);
		
		//BOTÃO SAIR
		JButton botaoSair = new JButton("Sair");
		botaoSair.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				dispose();
			}
		});
		botaoSair.setBounds(171, 655, 365, 25);
		contentPane.add(botaoSair);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("logos\\70x70.png"));
		lblNewLabel_1.setBounds(254, 11, 200, 151);
		contentPane.add(lblNewLabel_1);
		
		
		JLabel lblInformacoes = new JLabel("Informa\u00E7\u00F5es");
		lblInformacoes.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblInformacoes.setBounds(45, 234, 98, 25);
		contentPane.add(lblInformacoes);
	}
}

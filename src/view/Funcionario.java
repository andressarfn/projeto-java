package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;

import model.Voluntario;
import view.funcionario.CadastrarVoluntario;
import view.funcionario.CriarEvento;
import view.funcionario.CriarTrabalho;


import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class Funcionario extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	private model.Voluntario voluntario = new model.Voluntario();
	private model.Evento evento = new model.Evento();
	private  model.Trabalho trabalho = new model.Trabalho();
	private model.Doacao doacao = new model.Doacao();
	//PEGAR FUNCIONARIO LOGADO
	private model.Funcionario funcionarioLogado = new model.Funcionario();
	//ARRAYS APENAS PARA SEREM MOSTRADOS NO TEXTAREA
	private static ArrayList<model.Voluntario> cadastroVoluntarios = new ArrayList<model.Voluntario>();
	private static ArrayList<model.Evento> eventos = new ArrayList<model.Evento>();
	private static ArrayList<model.Trabalho> trabalhos = new ArrayList<model.Trabalho>();
	private static ArrayList<model.Doacao> doacoes = new ArrayList<model.Doacao>();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario frame = new Funcionario();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//PEGAR FUNCIONÁRIO LOGADO NO SISTEMA
	public void pegarFuncionarioLogado(model.Funcionario loginFuncionario) {
		funcionarioLogado = loginFuncionario;
	}
	
	//TELA FUNCIONÁRIO
	public Funcionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new TitledBorder(null, "Funcion\u00E1rio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//COMBOBOX FUNCIONÁRIO
		JComboBox comboBoxFuncionario = new JComboBox();
		comboBoxFuncionario.setFont(new Font("Gadugi", Font.BOLD, 13));
		comboBoxFuncionario.setModel(new DefaultComboBoxModel(new String[] {"", "Cadastrar volunt\u00E1rio", "Criar evento", "Criar trabalho", "Mostrar volunt\u00E1rios", "Remover volunt\u00E1rio", "Mostrar eventos", "Mostrar trabalhos", "Mostrar doa\u00E7\u00F5es", "Gerar relat\u00F3rio"}));
		comboBoxFuncionario.setBounds(171, 198, 365, 25);
		contentPane.add(comboBoxFuncionario);
		
		//TEXT ÁREA INFORMAÇÕES - 17/05
		JTextArea textAreaInformacoes = new JTextArea();
		textAreaInformacoes.setEditable(false);
		textAreaInformacoes.setBounds(1, 142, 598, 195);
		textAreaInformacoes.setFont(new Font("Gadugi", Font.PLAIN, 15));
		contentPane.add(textAreaInformacoes);
		
		//ADD SCROLL
		JScrollPane scroll = new JScrollPane(textAreaInformacoes, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBackground(new Color(192, 192, 192));
		scroll.setBounds(45, 270, 600, 338);
		scroll.setFont(new Font("Gadugi", Font.BOLD, 15));
		contentPane.add(scroll);
		
		//BOTÃO AVANÇAR
		JButton botaoAvancar = new JButton("Avan\u00E7ar");
		botaoAvancar.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//CADASTRAR VOLUNTÁRIO
				if (comboBoxFuncionario.getSelectedItem().equals("Cadastrar voluntário")) {
					textAreaInformacoes.setText(null);
					view.funcionario.CadastrarVoluntario frame = new CadastrarVoluntario();
					frame.pegarFuncionarioLogado(funcionarioLogado);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					dispose();
				}
				//REMOVER VOLUNTÁRIO
				if (comboBoxFuncionario.getSelectedItem().equals("Remover voluntário")) {
					String cpf = JOptionPane.showInputDialog("Digite o cpf do voluntáro que deseja remover: ");
					for(int i = 0; i < voluntario.getVoluntarios().size(); i++) {
						
						if(voluntario.getVoluntarios().get(i).getCpfOrCnpj().equals(cpf)) {
							model.Voluntario voluntarioSelecionado;
							voluntarioSelecionado = voluntario.getVoluntarios().get(i);
							voluntario.removerVoluntario(voluntarioSelecionado);
							JOptionPane.showMessageDialog(null,"Voluntario removido");
						}
						else {
							JOptionPane.showMessageDialog(null,"Voluntario não encontrado");
						}
					}
				}
				
				//MOSTRAR VOLUNTÁRIOS CADASTRADOS - 17/05
				if (comboBoxFuncionario.getSelectedItem().equals("Mostrar voluntários")) {
					textAreaInformacoes.setText(null);
					cadastroVoluntarios = voluntario.getVoluntarios();
					for(int i = 0; i < cadastroVoluntarios.size(); i++) {
						textAreaInformacoes.setText(cadastroVoluntarios.toString());
					}
				}
				//MOSTRAR EVENTOS CRIADOS - 18/05
				if (comboBoxFuncionario.getSelectedItem().equals("Mostrar eventos")) {
					textAreaInformacoes.setText(null);
					eventos = evento.getEventos();
					for(int i = 0; i < eventos.size(); i++) {
						textAreaInformacoes.setText(eventos.toString());
						
					}
				}
				// MOSTRAR TRABALHOS CRIADOS - 18/05
				if (comboBoxFuncionario.getSelectedItem().equals("Mostrar trabalhos")) {
					textAreaInformacoes.setText(null);
					trabalhos = trabalho.getTrabalhos();
					for(int i = 0; i < trabalhos.size(); i++) {
						textAreaInformacoes.setText(trabalhos.toString());
					}
				}
				//VER TODAS AS DOAÇÕES - 19/05
				if (comboBoxFuncionario.getSelectedItem().equals("Mostrar doações")) {
					doacoes = doacao.getDoacoes();
					for(int i = 0; i < doacoes.size(); i++) {
						
						textAreaInformacoes.setText(null);
						
						if(doacoes.get(i).getSituacao() == false) {
							int decisao = JOptionPane.showConfirmDialog(null,doacoes.get(i)+"\nDeseja aceitar doação?");
							//MUDAR SITUAÇÃO PARA DOAÇÃO ACEITA
							if(decisao == JOptionPane.YES_OPTION) {
								JOptionPane.showMessageDialog(null,"Doação aceita");
								doacoes.get(i).setSituacao(true);
							}
							else {
								doacao.rejeitarDoacao(doacoes.get(i));
								JOptionPane.showMessageDialog(null,"Doação rejeitada");
							}
						}
						
						textAreaInformacoes.setText(doacoes.toString());
					}
				}
				//IR PARA TELA DE CRIAR EVENTO
				if (comboBoxFuncionario.getSelectedItem().equals("Criar evento")) {
					CriarEvento frame = new CriarEvento();
					frame.pegarFuncionarioLogado(funcionarioLogado);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					dispose();
				}
				//IR PARA TELA CRIAR TRABALHO
				if (comboBoxFuncionario.getSelectedItem().equals("Criar trabalho")) {
					CriarTrabalho frame = new CriarTrabalho();
					frame.pegarFuncionarioLogado(funcionarioLogado);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					dispose();
				}
				// GERAR RELATÓRIO DE QUANTITATIVO
				if (comboBoxFuncionario.getSelectedItem().equals("Gerar relatório")) {
					textAreaInformacoes.setText(null);
					textAreaInformacoes.setText("\n\tEventos em andamento \n"+evento.getEventos()+
												"\n\tDoações Arrecadadas \n"+doacao.getDoacoes()+
												"\n\tVoluntários Vinculados \n"+voluntario.getVoluntarios());
				
				}
				
			}
		});
		botaoAvancar.setBounds(171, 619, 365, 25);
		contentPane.add(botaoAvancar);
		
		//BOTÃO SAIR
		JButton botaoSair = new JButton("Sair");
		botaoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				dispose();
			}
		});
		botaoSair.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoSair.setBounds(171, 655, 365, 25);
		contentPane.add(botaoSair);
		
		//ÁREA DOS JLABEL'S 17/05
		JLabel lblNewLabel = new JLabel("Escolha uma das op\u00E7\u00F5es");
		lblNewLabel.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblNewLabel.setBounds(171, 173, 197, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("logos\\70x70.png"));
		lblNewLabel_1.setBounds(261, 11, 200, 151);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblInformacoes = new JLabel("Informa\u00E7\u00F5es");
		lblInformacoes.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblInformacoes.setBounds(45, 234, 83, 25);
		contentPane.add(lblInformacoes);
			
	}
	
}


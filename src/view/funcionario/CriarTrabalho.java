package view.funcionario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import model.Evento;
import model.Trabalho;
import model.Voluntario;
import view.Funcionario;

import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class CriarTrabalho extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoData;
	private JTextField campoHora;
	private JTextField campoEndereco;

	private static model.Evento evento = new model.Evento();
	private model.Funcionario funcionarioLogado = new model.Funcionario();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriarTrabalho frame = new CriarTrabalho();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void pegarFuncionarioLogado(model.Funcionario funcionario) {
		funcionarioLogado = funcionario;
	}

	//tela de cadastro
	public CriarTrabalho() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Criar Trabalho", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ArrayList<Evento> eventos = evento.getEventos();
		model.Evento eventoSelecionado = null;
		JComboBox comboBoxEventos = new JComboBox();
		
		comboBoxEventos.setBounds(169, 246, 365, 22);
		contentPane.add(comboBoxEventos);
		comboBoxEventos.addItem("");
		
		//ADICIONANDO NOME DOS EVENTOS NO COMBOBOX - ANDRÉ 28/08
		for(int i = 0; i < evento.getEventos().size(); i ++) {
			comboBoxEventos.addItem(eventos.get(i).getNome());
			eventoSelecionado = eventos.get(i);
		}
		
		// texto nome
		JLabel lblTipo = new JLabel("Tipo do trabalho");
		lblTipo.setBounds(169, 323, 130, 14);
		lblTipo.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblTipo);
		
		//texto do cpf ou cnpj
		JLabel lblCPForCNPJ = new JLabel("Data");
		lblCPForCNPJ.setBounds(169, 384, 72, 14);
		lblCPForCNPJ.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblCPForCNPJ);
		
		//texto do RG
		JLabel lblRG = new JLabel("Hora");
		lblRG.setBounds(367, 384, 72, 14);
		lblRG.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblRG);
		
		//texto do endereço
		JLabel lblEndereco = new JLabel("Local");
		lblEndereco.setBounds(169, 445, 56, 14);
		lblEndereco.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblEndereco);
		
		//input do nome
		campoNome = new JTextField();
		campoNome.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoNome.setBounds(169, 348, 365, 25);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		//input do cpf ou cnpj
		try {
			campoData = new JFormattedTextField(new MaskFormatter("##/##/####"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		campoData.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoData.setBounds(168, 409, 175, 25);
		campoData.setColumns(10);
		contentPane.add(campoData);
		
		//input RG
		try {
			campoHora = new JFormattedTextField(new MaskFormatter("##:##"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		campoHora.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoHora.setBounds(367, 409, 167, 25);
		campoHora.setColumns(10);
		contentPane.add(campoHora);
		
		
		//input do endereço
		campoEndereco = new JTextField();
		campoEndereco.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoEndereco.setBounds(169, 470, 365, 25);
		contentPane.add(campoEndereco);
		campoEndereco.setColumns(10);
		
		//CLIQUE DO COMBOBOX - ANDRÉ 28/08
		comboBoxEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PERCORRER ARRAY DOS EVENTOS
				for(int i = 0; i < eventos.size(); i ++) {
					//CAPTURANDO CLIQUE NO EVENTO ESCOLHIDO
					if(comboBoxEventos.getSelectedItem().equals(eventos.get(i).getNome())) {
						//PREENCHENDO CAMPOS DE TRABALHO COM DADOS DO EVENTO
						campoData.setText(eventos.get(i).getData());
						campoHora.setText(eventos.get(i).getHora());
						campoEndereco.setText(eventos.get(i).getLocal());
						
					}
				}
				
			}
		});
		
		//botão enviar
		JButton botaoCriar = new JButton("Criar");
		botaoCriar.setBounds(169, 506, 365, 25);
		botaoCriar.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//OBJETOS - 18/05
			model.Trabalho trabalho = new model.Trabalho();
			
			//CAPTURAR ENTRADA DE DADOS - 18/05
			String tipo = campoNome.getText();
			String data = campoData.getText();
			String hora = campoHora.getText();
			String local = campoEndereco.getText();
			
			trabalho.setTipo(tipo); trabalho.setData(data);
			trabalho.setHora(hora); trabalho.setHora(hora);
			trabalho.setEndereco(local);
			
			trabalho.criarTrabalho(trabalho);
			
			JOptionPane.showMessageDialog(null, "Trabalho criado!");
			Limpar();
			}
		});
		contentPane.add(botaoCriar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("logos\\70x70.png"));
		lblNewLabel.setBounds(254, 14, 200, 151);
		contentPane.add(lblNewLabel);
		
		//BOTÃO VOLTAR
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.Funcionario frame = new Funcionario();
				frame.pegarFuncionarioLogado(funcionarioLogado);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				dispose();
			}
		});
		botaoVoltar.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoVoltar.setBounds(169, 578, 365, 25);
		contentPane.add(botaoVoltar);
		
		//BOTÃO LIMPAR CAMPOS
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Limpar();
			}
		});
		btnLimpar.setFont(new Font("Gadugi", Font.BOLD, 13));
		btnLimpar.setBounds(169, 542, 365, 25);
		contentPane.add(btnLimpar);
		
		JLabel lblNewLabel_1 = new JLabel("Escolha o evento");
		lblNewLabel_1.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblNewLabel_1.setBounds(169, 212, 113, 22);
		contentPane.add(lblNewLabel_1);
	}
	
	//LIMPAR CAMPOS
	public void Limpar() {
		campoNome.setText(null);
		campoData.setText(null);
		campoHora.setText(null);
		campoEndereco.setText(null);
		campoEndereco.setText(null);

	}
}

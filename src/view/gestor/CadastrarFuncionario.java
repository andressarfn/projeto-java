package view.gestor;

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

import model.Funcionario;
import view.Gestor;

import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class CadastrarFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoCpfCnpj;
	private JTextField campoEmail;
	private JTextField campoRG;
	private JTextField campoEndereco;
	private JTextField campoTelefone;
	private JPasswordField campoSenha;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarFuncionario frame = new CadastrarFuncionario();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//tela de cadastro
	public CadastrarFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 725);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Cadastrar Funcion\u00E1rio", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// texto nome
		JLabel lblNome = new JLabel("Nome Completo");
		lblNome.setBounds(169, 176, 101, 14);
		lblNome.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblNome);
		
		// texto email
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(169, 423, 46, 14);
		lblEmail.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblEmail);
		
		//texto senha
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(169, 484, 46, 14);
		lblSenha.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblSenha);
		
		//texto do cpf ou cnpj
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setBounds(169, 237, 72, 14);
		lblCPF.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblCPF);
		
		//texto do RG
		JLabel lblRG = new JLabel("RG");
		lblRG.setBounds(367, 237, 32, 14);
		lblRG.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblRG);
		
		//texto do endereço
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setBounds(169, 298, 56, 14);
		lblEndereco.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblEndereco);
		
		//input do nome
		campoNome = new JTextField();
		campoNome.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoNome.setBounds(169, 201, 365, 25);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		//input do cpf ou cnpj
		try {
			campoCpfCnpj = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		campoCpfCnpj.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoCpfCnpj.setBounds(169, 262, 175, 25);
		campoCpfCnpj.setColumns(10);
		contentPane.add(campoCpfCnpj);
		
		//input RG
		
		try {
			campoRG = new JFormattedTextField(new MaskFormatter("#.###.###"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		campoRG.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoRG.setBounds(367, 262, 167, 25);
		campoRG.setColumns(10);
		contentPane.add(campoRG);
		
		//input do email
		campoEmail = new JTextField();
		campoEmail.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoEmail.setBounds(169, 448, 365, 25);
		campoEmail.setColumns(10);
		contentPane.add(campoEmail);
		
		//input do endereço
		campoEndereco = new JTextField();
		campoEndereco.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoEndereco.setBounds(169, 326, 365, 25);
		contentPane.add(campoEndereco);
		campoEndereco.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(169, 362, 72, 14);
		lblTelefone.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblTelefone);
		
		try {
			campoTelefone = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		campoTelefone.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoTelefone.setBounds(169, 387, 365, 25);
		campoTelefone.setColumns(10);
		contentPane.add(campoTelefone);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("logos\\70x70.png"));
		lblNewLabel.setBounds(254, 14, 200, 151);
		contentPane.add(lblNewLabel);
		
		campoSenha = new JPasswordField();
		campoSenha.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoSenha.setBounds(169, 509, 365, 25);
		contentPane.add(campoSenha);
		
		//botão enviar
		JButton botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.setBounds(169, 560, 365, 25);
		botaoCadastrar.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CAPTURAR DADOS - 17/05
				String nome = campoNome.getText(); String cpf = campoCpfCnpj.getText();
				String rg = campoRG.getText(); String endereco = campoEndereco.getText();
				String telefone = campoTelefone.getText(); String email = campoEmail.getText();
				String senha = campoSenha.getText();
				
				model.Funcionario funcionario = new model.Funcionario();
				funcionario.setNome(nome); funcionario.setCpf(cpf);
				funcionario.setRg(rg); funcionario.setEndereco(endereco);
				funcionario.setTelefone(telefone); funcionario.setEmail(email);
				funcionario.setSenha(senha);
				
				funcionario.cadastrarFuncionario(funcionario);
			
				JOptionPane.showMessageDialog(null, "Funcionário cadastrado!");
				apagarCampos();
				
			}
		});
		contentPane.add(botaoCadastrar);
		
		//BOTÃO VOLTAR
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OBJETO DA TELA GESTOR - 15/05
				Gestor frame = new Gestor();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Gadugi", Font.BOLD, 13));
		btnVoltar.setBounds(169, 630, 365, 25);
		contentPane.add(btnVoltar);
		
		//BOTÃO LIMPAR CAMPOS - 15/05
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				apagarCampos();
			}
		});
		btnLimpar.setFont(new Font("Gadugi", Font.BOLD, 13));
		btnLimpar.setBounds(169, 596, 365, 25);
		contentPane.add(btnLimpar);
	}
	
	//LIMPAR CAMPOS - 15/05
	public void apagarCampos() {
		campoNome.setText(null);
		campoCpfCnpj.setText(null);
		campoRG.setText(null);
		campoEndereco.setText(null);
		campoTelefone.setText(null);
		campoEmail.setText(null);
		campoSenha.setText(null);
	}
}

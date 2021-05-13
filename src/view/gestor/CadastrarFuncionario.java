package view.gestor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
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
	private JPasswordField passwordField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarFuncionario frame = new CadastrarFuncionario();
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
		setBounds(100, 100, 700, 730);
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
		campoNome.setBounds(169, 201, 365, 25);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		//input do cpf ou cnpj
		campoCpfCnpj = new JTextField();
		campoCpfCnpj.setBounds(169, 262, 175, 25);
		campoCpfCnpj.setColumns(10);
		contentPane.add(campoCpfCnpj);
		
		//input RG
		campoRG = new JTextField();
		campoRG.setBounds(367, 262, 167, 25);
		campoRG.setColumns(10);
		contentPane.add(campoRG);
		
		//input do email
		campoEmail = new JTextField();
		campoEmail.setBounds(169, 448, 365, 25);
		campoEmail.setColumns(10);
		contentPane.add(campoEmail);
		
		//input do endereço
		campoEndereco = new JTextField();
		campoEndereco.setBounds(169, 326, 365, 25);
		contentPane.add(campoEndereco);
		campoEndereco.setColumns(10);
		
		//botão enviar
		JButton botaoEnviar = new JButton("Enviar");
		botaoEnviar.setBounds(169, 594, 365, 25);
		botaoEnviar.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(botaoEnviar);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(169, 362, 72, 14);
		lblTelefone.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblTelefone);
		
		campoTelefone = new JTextField();
		campoTelefone.setBounds(169, 387, 365, 25);
		campoTelefone.setColumns(10);
		contentPane.add(campoTelefone);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\andre\\eclipse-workspace\\projeto_java\\logos\\70x70.png"));
		lblNewLabel.setBounds(254, 14, 200, 151);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(169, 509, 365, 25);
		contentPane.add(passwordField);
	}
}

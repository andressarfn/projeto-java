package view.funcionario;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

public class CadastrarVoluntario extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoCpfCnpj;
	private JTextField campoEmail;
	private JTextField campoRG;
	private JTextField campoEndereco;
	private JTextField campoTelefone;
	private JPasswordField campoSenha;
	private JTextField campoDiaDisponivel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarVoluntario frame = new CadastrarVoluntario();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//tela de cadastro
	public CadastrarVoluntario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Cadastrar Volunt\u00E1rio", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// texto nome
		JLabel lblNome = new JLabel("Nome completo");
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
		JLabel lblCPForCNPJ = new JLabel("CPF/CNPJ");
		lblCPForCNPJ.setBounds(169, 237, 72, 14);
		lblCPForCNPJ.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblCPForCNPJ);
		
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
		} catch (java.text.ParseException e1) {
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
		
		//DATA DISPONÍVEL
		try {
			campoDiaDisponivel = new JFormattedTextField(new MaskFormatter("##/##/####"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		campoDiaDisponivel.setBounds(367, 387, 167, 25);
		contentPane.add(campoDiaDisponivel);
		campoDiaDisponivel.setColumns(10);
		
		//TELEFONE
		try {
			campoTelefone = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		campoTelefone.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoTelefone.setBounds(169, 387, 175, 25);
		campoTelefone.setColumns(10);
		contentPane.add(campoTelefone);
		
		//SENHA
		campoSenha = new JPasswordField();
		campoSenha.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoSenha.setBounds(169, 509, 365, 25);
		contentPane.add(campoSenha);
		
		//botão enviar
		JButton botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.setBounds(169, 562, 365, 25);
		botaoCadastrar.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OBJETO - 17/05
				model.Voluntario voluntario = new model.Voluntario();
				//CAPTURAR ENTRADA DE DADOS - 17/05
				voluntario.setNome(campoNome.getText()); voluntario.setCpfOrCnpj(campoCpfCnpj.getText());
				voluntario.setRg(campoRG.getText()); voluntario.setEndereco(campoEndereco.getText());
				voluntario.setTelefone(campoTelefone.getText()); voluntario.setDiaDisponivel(campoDiaDisponivel.getText());
				voluntario.setEmail(campoEmail.getText()); voluntario.setSenha(campoSenha.getText());
				//CADASTRAR VOLUNTÁRIO - 22/05
				voluntario.cadastrarVoluntario(voluntario);
				
				JOptionPane.showMessageDialog(null, "Voluntário cadastrado!");
				limparCampo();
			}
		});
		contentPane.add(botaoCadastrar);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(169, 362, 72, 14);
		lblTelefone.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblTelefone);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("logos\\70x70.png"));
		lblNewLabel.setBounds(254, 14, 200, 151);
		contentPane.add(lblNewLabel);
		
		//botão voltar
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.Funcionario frame = new view.Funcionario();
				model.Voluntario voluntario = new model.Voluntario();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				dispose();
			}
		});
		botaoVoltar.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoVoltar.setBounds(169, 634, 365, 25);
		contentPane.add(botaoVoltar);
		//BOTÃO LIMPAR CAMPOS
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampo();
			}
		});
		btnLimpar.setFont(new Font("Gadugi", Font.BOLD, 13));
		btnLimpar.setBounds(169, 598, 365, 25);
		contentPane.add(btnLimpar);
		
		JLabel lblNewLabel_1 = new JLabel("Data de disponibilidade");
		lblNewLabel_1.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblNewLabel_1.setBounds(367, 363, 167, 14);
		contentPane.add(lblNewLabel_1);
	}
	
	//LIMPAR CAMPOS
	public void limparCampo() {
		campoNome.setText(null);
		campoCpfCnpj.setText(null);
		campoRG.setText(null);
		campoEndereco.setText(null);
		campoTelefone.setText(null);
		campoEmail.setText(null);
		campoSenha.setText(null);
		campoDiaDisponivel.setText(null);
	}
}

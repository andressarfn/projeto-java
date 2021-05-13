package view.funcionario;

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

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriarTrabalho frame = new CriarTrabalho();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
		
		// texto nome
		JLabel lblTipo = new JLabel("Tipo do trabalho");
		lblTipo.setBounds(169, 176, 130, 14);
		lblTipo.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblTipo);
		
		//texto do cpf ou cnpj
		JLabel lblCPForCNPJ = new JLabel("Data");
		lblCPForCNPJ.setBounds(169, 237, 72, 14);
		lblCPForCNPJ.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblCPForCNPJ);
		
		//texto do RG
		JLabel lblRG = new JLabel("Hora");
		lblRG.setBounds(367, 237, 72, 14);
		lblRG.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblRG);
		
		//texto do endereço
		JLabel lblEndereco = new JLabel("Local");
		lblEndereco.setBounds(169, 298, 56, 14);
		lblEndereco.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblEndereco);
		
		//input do nome
		campoNome = new JTextField();
		campoNome.setBounds(169, 201, 365, 25);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		//input do cpf ou cnpj
		campoData = new JTextField();
		campoData.setBounds(169, 262, 175, 25);
		campoData.setColumns(10);
		contentPane.add(campoData);
		
		//input RG
		campoHora = new JTextField();
		campoHora.setBounds(367, 262, 167, 25);
		campoHora.setColumns(10);
		contentPane.add(campoHora);
		
		//input do endereço
		campoEndereco = new JTextField();
		campoEndereco.setBounds(169, 326, 365, 25);
		contentPane.add(campoEndereco);
		campoEndereco.setColumns(10);
		
		//botão enviar
		JButton botaoEnviar = new JButton("Enviar");
		botaoEnviar.setBounds(169, 431, 365, 25);
		botaoEnviar.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(botaoEnviar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\andre\\eclipse-workspace\\projeto_java\\logos\\70x70.png"));
		lblNewLabel.setBounds(254, 14, 200, 151);
		contentPane.add(lblNewLabel);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Funcionario().setVisible(true);
				dispose();
			}
		});
		botaoVoltar.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoVoltar.setBounds(169, 467, 365, 25);
		contentPane.add(botaoVoltar);
	}
}

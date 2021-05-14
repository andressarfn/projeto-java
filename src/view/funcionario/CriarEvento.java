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

public class CriarEvento extends JFrame {

	private JPanel contentPane;
	private JTextField campoNomeEvento;
	private JTextField campoData;
	private JTextField campoParceria;
	private JTextField campoHora;
	private JTextField campoLocal;
	private JTextField campoDuracao;
	private JTextField campoCusto;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriarEvento frame = new CriarEvento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//tela de cadastro
	public CriarEvento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Criar Evento", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// texto nome
		JLabel lblNome = new JLabel("Nome do evento");
		lblNome.setBounds(169, 176, 130, 14);
		lblNome.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblNome);
		
		// texto email
		JLabel lblParceria = new JLabel("Parceria");
		lblParceria.setBounds(169, 423, 72, 14);
		lblParceria.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblParceria);
		
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
		campoNomeEvento = new JTextField();
		campoNomeEvento.setBounds(169, 201, 365, 25);
		contentPane.add(campoNomeEvento);
		campoNomeEvento.setColumns(10);
		
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
		
		//input do email
		campoParceria = new JTextField();
		campoParceria.setBounds(169, 448, 365, 25);
		campoParceria.setColumns(10);
		contentPane.add(campoParceria);
		
		//input do endereço
		campoLocal = new JTextField();
		campoLocal.setBounds(169, 326, 365, 25);
		contentPane.add(campoLocal);
		campoLocal.setColumns(10);
		
		//botão enviar
		JButton botaoEnviar = new JButton("Enviar");
		botaoEnviar.setBounds(169, 512, 365, 25);
		botaoEnviar.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(botaoEnviar);
		
		JLabel lblTelefone = new JLabel("Dura\u00E7\u00E3o do evento");
		lblTelefone.setBounds(169, 362, 130, 14);
		lblTelefone.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblTelefone);
		
		campoDuracao = new JTextField();
		campoDuracao.setBounds(169, 387, 175, 25);
		campoDuracao.setColumns(10);
		contentPane.add(campoDuracao);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("logos\\70x70.png"));
		lblNewLabel.setBounds(254, 14, 200, 151);
		contentPane.add(lblNewLabel);
		
		campoCusto = new JTextField();
		campoCusto.setColumns(10);
		campoCusto.setBounds(367, 387, 167, 25);
		contentPane.add(campoCusto);
		
		JLabel lblCusto = new JLabel("Custo do evento");
		lblCusto.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblCusto.setBounds(367, 363, 130, 14);
		contentPane.add(lblCusto);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Funcionario().setVisible(true);
				dispose();
			}
		});
		botaoVoltar.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoVoltar.setBounds(169, 548, 365, 25);
		contentPane.add(botaoVoltar);
	}
}

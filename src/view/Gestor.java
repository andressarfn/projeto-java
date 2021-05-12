package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

public class Gestor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestor frame = new Gestor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//tela do gestor
	public Gestor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new TitledBorder(null, "Gestor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//texto do gestor
		JLabel lblNewLabel = new JLabel("Escolha uma das op\u00E7\u00F5es");
		lblNewLabel.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblNewLabel.setBounds(171, 263, 165, 14);
		contentPane.add(lblNewLabel);
		
		//combobox do gestor
		JComboBox comboBoxGestor = new JComboBox();
		comboBoxGestor.setFont(new Font("Gadugi", Font.BOLD, 13));
		comboBoxGestor.setModel(new DefaultComboBoxModel(new String[] {"", "Cadastrar funcion\u00E1rio", "Analisar receitas", "Analisar despesas", "Gerar relat\u00F3rio financeiro"}));
		comboBoxGestor.setBounds(171, 288, 365, 25);
		contentPane.add(comboBoxGestor);
		
		//botão ok
		JButton botaoOk = new JButton("Ok");
		botaoOk.setBounds(171, 374, 365, 25);
		contentPane.add(botaoOk);
		
		//botão cancelar
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(171, 410, 365, 25);
		contentPane.add(botaoCancelar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\andre\\eclipse-workspace\\projeto_java\\logos\\70x70.png"));
		lblNewLabel_1.setBounds(261, 70, 200, 151);
		contentPane.add(lblNewLabel_1);
	}

}

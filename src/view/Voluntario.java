package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;

public class Voluntario extends JFrame {

	private JPanel contentVoluntario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Voluntario frame = new Voluntario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//tela do voluntário
	public Voluntario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 730);
		contentVoluntario = new JPanel();
		contentVoluntario.setBackground(Color.WHITE);
		contentVoluntario.setBorder(new TitledBorder(null, "Volunt\u00E1rio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentVoluntario);
		contentVoluntario.setLayout(null);
		
		//comboBox do voluntário
		JComboBox comboBoxVoluntario = new JComboBox();
		comboBoxVoluntario.setForeground(Color.BLACK);
		comboBoxVoluntario.setBackground(Color.WHITE);
		comboBoxVoluntario.setToolTipText("");
		comboBoxVoluntario.setFont(new Font("Gadugi", Font.BOLD, 13));
		comboBoxVoluntario.setModel(new DefaultComboBoxModel(new String[] {"", "Buscar eventos", "Trabalho disponiveis ", "Doar"}));
		comboBoxVoluntario.setBounds(171, 288, 365, 25);
		contentVoluntario.add(comboBoxVoluntario);
		
		//lbl do voluntário
		JLabel lblVoluntario = new JLabel("Escolha uma das op\u00E7\u00F5es");
		lblVoluntario.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblVoluntario.setBounds(171, 263, 206, 14);
		contentVoluntario.add(lblVoluntario);
		
		//botão ok
		JButton botaoOK = new JButton("Ok");
		botaoOK.setBounds(171, 374, 365, 25);
		contentVoluntario.add(botaoOK);
		
		//botão cancelar
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoCancelar.setBounds(171, 410, 365, 25);
		contentVoluntario.add(botaoCancelar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\andre\\eclipse-workspace\\projeto_java\\logos\\70x70.png"));
		lblNewLabel.setBounds(261, 70, 200, 151);
		contentVoluntario.add(lblNewLabel);
	}
}

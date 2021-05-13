package view.voluntario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import view.Voluntario;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Trabalhos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trabalhos frame = new Trabalhos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Trabalhos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 726);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 662, 143);
		contentPane.add(panel);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("C:\\Users\\andre\\eclipse-workspace\\projeto_java\\logos\\70x70.png"));
		panel.add(lblLogo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new TitledBorder(null, "Trabalhos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 165, 662, 464);
		contentPane.add(panel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		panel_1.add(comboBox);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Voluntario().setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(581, 641, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnSelecionar = new JButton("Selecionar");
		btnSelecionar.setBounds(463, 643, 102, 23);
		contentPane.add(btnSelecionar);
	}

}

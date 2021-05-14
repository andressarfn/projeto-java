package view.voluntario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;

import view.Voluntario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Eventos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eventos frame = new Eventos();
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
	public Eventos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 725);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 667, 143);
		contentPane.add(panel);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("logos\\70x70.png"));
		panel.add(lblLogo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new TitledBorder(null, "Eventos Dispon\u00EDveis", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 165, 665, 463);
		contentPane.add(panel_1);
		
		JComboBox comboBoxEventos = new JComboBox();
		comboBoxEventos.setEditable(true);
		comboBoxEventos.setBounds(171, 288, 365, 25);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addGap(23)
					.addComponent(comboBoxEventos, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(311, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(38)
					.addComponent(comboBoxEventos, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(381, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		//VOLTAR
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Voluntario().setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(577, 642, 98, 23);
		contentPane.add(btnVoltar);
		
		JButton btnAvancar = new JButton("Avan\u00E7ar");
		btnAvancar.setBounds(454, 643, 103, 23);
		contentPane.add(btnAvancar);
	}
}

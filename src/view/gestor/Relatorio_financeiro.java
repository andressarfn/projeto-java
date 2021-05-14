package view.gestor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import view.Gestor;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Relatorio_financeiro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Relatorio_financeiro frame = new Relatorio_financeiro();
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
	public Relatorio_financeiro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 725);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 663, 143);
		contentPane.add(panel);
		
		JLabel lbLogo = new JLabel("");
		lbLogo.setIcon(new ImageIcon("logos\\70x70.png"));
		panel.add(lbLogo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new TitledBorder(null, "Relat\u00F3rio Financeiro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 165, 663, 464);
		contentPane.add(panel_1);
		
		//BOTÃO VOLTAR
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gestor().setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(582, 642, 89, 23);
		contentPane.add(btnVoltar);
	}
}

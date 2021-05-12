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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;

public class Funcionario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario frame = new Funcionario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//tela do funcionário
	public Funcionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new TitledBorder(null, "Funcion\u00E1rio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//comboBox do funcionário
		JComboBox comboBoxFuncionario = new JComboBox();
		comboBoxFuncionario.setFont(new Font("Gadugi", Font.BOLD, 13));
		comboBoxFuncionario.setModel(new DefaultComboBoxModel(new String[] {"", "Doa\u00E7\u00F5es", "Gerenciar entrega", "Importar dados", "Gerar relat\u00F3rio", "Cadastrar volunt\u00E1rios", "Cadastrar eventos", "Cadastrar trabalhos"}));
		comboBoxFuncionario.setBounds(171, 288, 365, 25);
		contentPane.add(comboBoxFuncionario);
		
		//botão ok
		JButton botaoOk = new JButton("Ok");
		botaoOk.setFont(new Font("Gadugi", Font.PLAIN, 13));
		botaoOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoOk.setBounds(171, 374, 365, 25);
		contentPane.add(botaoOk);
		
		//botão cancelar
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setFont(new Font("Gadugi", Font.PLAIN, 13));
		botaoCancelar.setBounds(171, 410, 365, 25);
		contentPane.add(botaoCancelar);
		
		JLabel lblNewLabel = new JLabel("Escolha uma das op\u00E7\u00F5es");
		lblNewLabel.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblNewLabel.setBounds(171, 263, 197, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\andre\\eclipse-workspace\\projeto_java\\logos\\70x70.png"));
		lblNewLabel_1.setBounds(261, 70, 200, 151);
		contentPane.add(lblNewLabel_1);
	}
}

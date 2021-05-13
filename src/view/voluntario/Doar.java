package view.voluntario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Cursor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;

import view.Voluntario;

import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Doar extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private JTextField textFieldDinheiro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doar frame = new Doar();
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
	public Doar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 725);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 663, 143);
		contentPane.add(panel);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("C:\\Users\\andre\\eclipse-workspace\\projeto_java\\logos\\70x70.png"));
		panel.add(lblLogo);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(null, "Doa\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1.setAutoscrolls(true);
		panel_1.setBounds(11, 165, 661, 466);
		contentPane.add(panel_1);
		
		
		//COMBOBOX TIPO DE DOAÇÃO
		JComboBox comboBoxTipo = new JComboBox();
		comboBoxTipo.addItem("");
		comboBoxTipo.addItem("Dinheiro");
		comboBoxTipo.addItem("Roupa");
		comboBoxTipo.addItem("Alimento");
		
		//CAMPO ENTRADA DO VALOR
		textFieldDinheiro = new JTextField();
		textFieldDinheiro.setEnabled(false);
		textFieldDinheiro.setColumns(10);
		
		//LABEL VALOR
		JLabel lblValor = new JLabel("Valor");
		lblValor.setEnabled(false);
		lblValor.setFont(new Font("Gadugi", Font.BOLD, 13));
		
		//HABILITAR VALOR DA DOAÇÃO EM DINHEIRO
		comboBoxTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxTipo.getSelectedItem().equals("Dinheiro")) {
					textFieldDinheiro.enable(true);
					lblValor.setEnabled(true);
				}
				else {
					textFieldDinheiro.enable(false);
					lblValor.setEnabled(false);
				}
			}
		});
		
		
		JLabel lblTipoDoacao = new JLabel("Tipo");
		lblTipoDoacao.setFont(new Font("Gadugi", Font.BOLD, 13));
		
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(136)
							.addComponent(lblValor))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(134)
							.addComponent(lblTipoDoacao)))
					.addGap(20)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBoxTipo, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldDinheiro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(204, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(26)
							.addComponent(comboBoxTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(40)
							.addComponent(textFieldDinheiro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(21)
							.addComponent(lblTipoDoacao)
							.addGap(51)
							.addComponent(lblValor)))
					.addContainerGap(336, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		//BOTÃO VOLTAR
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Voluntario().setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(570, 642, 97, 23);
		contentPane.add(btnVoltar);
		
		//BOTÃO CADASTRAR
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(457, 643, 97, 23);
		contentPane.add(btnCadastrar);
	}
}

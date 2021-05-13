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

import view.gestor.CadastrarFuncionario;
import view.gestor.Despesas;
import view.gestor.Receitas;
import view.gestor.Relatorio_financeiro;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		comboBoxGestor.setModel(new DefaultComboBoxModel(new String[] {"", "Cadastrar funcionário", "Analisar receitas", "Analisar despesas", "Gerar relatório financeiro"}));
		comboBoxGestor.setBounds(171, 288, 365, 25);
		contentPane.add(comboBoxGestor);
		
		//botão ok
		JButton botaoAvancar = new JButton("Avan\u00E7ar");
		botaoAvancar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//CADASTRAR FUNCIONÁRIO
				if(comboBoxGestor.getSelectedItem().equals("Cadastrar funcionário")) {
					new CadastrarFuncionario().setVisible(true);
					dispose();
				}
				//ANALISAR RECEITAS
				if(comboBoxGestor.getSelectedItem().equals("Analisar receitas")) {
					new Receitas().setVisible(true);
					dispose();
				}
				//ANALISAR DESPESAS
				if(comboBoxGestor.getSelectedItem().equals("Analisar despesas")) {
					new Despesas().setVisible(true);
					dispose();
				}
				//RELATÓRIO FINANCEIRO
				if(comboBoxGestor.getSelectedItem().equals("Gerar relatório financeiro")) {
					new Relatorio_financeiro().setVisible(true);
					dispose();
				}
				
			}
		});
		botaoAvancar.setBounds(171, 374, 365, 25);
		contentPane.add(botaoAvancar);
		
		//botão cancelar
		JButton botaoSair = new JButton("Sair");
		botaoSair.setBounds(171, 410, 365, 25);
		contentPane.add(botaoSair);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\andre\\eclipse-workspace\\projeto_java\\logos\\70x70.png"));
		lblNewLabel_1.setBounds(261, 70, 200, 151);
		contentPane.add(lblNewLabel_1);
	}

}

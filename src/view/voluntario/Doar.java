package view.voluntario;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import java.awt.Cursor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;

import model.Doacao;
import model.Ong;
import view.Voluntario;

import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Doar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel_1;
	private JTextField campoDinheiro;
	private JTextField campoRoupa;
	private JTextField campoKg;
	
	private model.Ong ong = new model.Ong();
	static model.Voluntario voluntarioLogin = new model.Voluntario();
	
	//VARIÁVEL RESPONSÁVEL EM PEGAR ENDEREÇO DE ENTREGA SELECIONADO
	private String endereco;
	
	//PEGAR VOLUNTÁRIO LOGADO - 22/05
	public void pegar(model.Voluntario voluntarioLogado) {
		voluntarioLogin = voluntarioLogado;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doar frame = new Doar();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		lblLogo.setIcon(new ImageIcon("logos\\70x70.png"));
		panel.add(lblLogo);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(null, "Doa\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1.setAutoscrolls(true);
		panel_1.setBounds(11, 165, 661, 380);
		contentPane.add(panel_1);
		
		//COMBOBOX LOCAL DE ENTREGA
		JComboBox<String> comboBoxLocalDeEntrega = new JComboBox<String>();
		comboBoxLocalDeEntrega.setBounds(169, 246, 365, 22);
		contentPane.add(comboBoxLocalDeEntrega);
		
		comboBoxLocalDeEntrega.addItem("Seu Endereço");
		comboBoxLocalDeEntrega.addItem("Endereço da Ong");
		
		//COMBOBOX TIPO DE DOAÇÃO
		JComboBox<String> comboBoxTipo = new JComboBox<String>();
		comboBoxTipo.setFont(new Font("Gadugi", Font.BOLD, 13));
		comboBoxTipo.addItem("");
		comboBoxTipo.addItem("Dinheiro");
		comboBoxTipo.addItem("Roupa");
		comboBoxTipo.addItem("Alimento");
		
		//CAMPO ENTRADA DO VALOR - 18/05
		campoDinheiro = new JTextField();
		campoDinheiro.setText("");
		campoDinheiro.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoDinheiro.setEnabled(false);
		campoDinheiro.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setEnabled(false);
		lblQuantidade.setFont(new Font("Gadugi", Font.BOLD, 13));
		
		JLabel lblKg = new JLabel("Kg");
		lblKg.setEnabled(false);
		lblKg.setFont(new Font("Gadugi", Font.BOLD, 13));
		
		//LABEL VALOR
		JLabel lblValor = new JLabel("Valor");
		lblValor.setEnabled(false);
		lblValor.setFont(new Font("Gadugi", Font.BOLD, 13));
		
		//HABILITAR VALOR/QUANTIDADE/KG DA DOAÇÃO - 19/05
		comboBoxTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SE ESCOLHER DINHEIRO ATIVAR O CAMPO VALOR - 18/05
				if(comboBoxTipo.getSelectedItem().equals("Dinheiro")) {
					campoDinheiro.enable(true);
					lblValor.setEnabled(true);
					//LIMPAR - 18/05
					campoRoupa.setText(null);
					campoKg.setText(null);
					}
				else {
					campoDinheiro.enable(false);
					lblValor.setEnabled(false);
				}
				
				//SE ESCOLHER ROUPA ATIVAR O CAMPO QUANTIDADE - 18/05
				if(comboBoxTipo.getSelectedItem().equals("Roupa")) {
					campoRoupa.enable(true);
					lblQuantidade.setEnabled(true);
					//LIMPAR - 18/05
					campoDinheiro.setText(null);
					campoKg.setText(null);
				}
				else {
					campoRoupa.enable(false);
					lblQuantidade.setEnabled(false);
				}
				
				//SE ESCOLHER ALIMENTO ATIVAR O CAMPO KG - 18/05
				if(comboBoxTipo.getSelectedItem().equals("Alimento")) {
					campoKg.enable(true);
					lblKg.setEnabled(true);
					//LIMPAR - 18/05
					campoDinheiro.setText(null);
					campoRoupa.setText(null);
				}
				else {
					campoKg.enable(false);
					lblKg.setEnabled(false);
				}	
			}
		});
		
		JLabel lblTipoDoacao = new JLabel("Tipo");
		lblTipoDoacao.setFont(new Font("Gadugi", Font.BOLD, 13));
		
		//CAMPO ENTRADA QUANTIDADE - 18/05
		campoRoupa = new JTextField();
		campoRoupa.setText("0");
		campoRoupa.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoRoupa.setEnabled(false);
		campoRoupa.setColumns(10);
		//CAMPO ENTRADA KG - 18/05
		campoKg = new JTextField();
		campoKg.setText("0");
		campoKg.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoKg.setEnabled(false);
		campoKg.setColumns(10);
		
		JLabel lblNewLabelLocalDeEntrega = new JLabel("Local de Entrega");
		lblNewLabelLocalDeEntrega.setFont(new Font("Gadugi", Font.BOLD, 13));
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(125)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblQuantidade)
								.addComponent(lblKg)
								.addComponent(lblValor))
							.addGap(18))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabelLocalDeEntrega)
								.addComponent(lblTipoDoacao))
							.addGap(27)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(campoDinheiro, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addComponent(campoKg, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxTipo, 0, 256, Short.MAX_VALUE)
						.addComponent(campoRoupa, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxLocalDeEntrega, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(178, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTipoDoacao)
						.addComponent(comboBoxTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxLocalDeEntrega, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabelLocalDeEntrega))
					.addGap(35)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(campoDinheiro, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblValor))
					.addGap(46)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuantidade)
						.addComponent(campoRoupa, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(campoKg, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblKg))
					.addGap(43))
		);
		panel_1.setLayout(gl_panel_1);
		//AÇÃO DO COMBOBOX LOCAL DE ENTREGA
		comboBoxLocalDeEntrega.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBoxLocalDeEntrega.getSelectedItem().equals("Seu Endereço")) {
					endereco = voluntarioLogin.getEndereco();
					System.out.println("Local Voluntarop: "+endereco);
				}
				if(comboBoxLocalDeEntrega.getSelectedItem().equals("Endereço da Ong")) {
					endereco = ong.getEndereco();
				}
			}
		});
		
		//BOTÃO DOAR - 18/05
		JButton btnCadastrar = new JButton("Doar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TRATAMENTO DE ERRO
				try {
					//CRIANDO O OBJETO - 19/05
					model.Doacao doacao = new model.Doacao();
					
					//CAPTURAR ENTRADA DE DADOS - 19/05
					String tipo = (String) comboBoxTipo.getSelectedItem();
					doacao.setTipo(tipo);
					doacao.setVoluntario(voluntarioLogin);
					doacao.setLocalEntrega(endereco);
					//TESTE ENDEREÇO DO FUNCIONÁRIO LOGADO
					System.out.println("Local de entrega: "+endereco);
					//iniciando quantidade
					Double quantidade = (double) 0;
					
					if(tipo == "") {
						JOptionPane.showMessageDialog(null, "Selecione uma opção!");
						return;
					}
					else {
						//DINHEIRO - ANDRÉ 21/05
						if(comboBoxTipo.getSelectedItem().equals("Dinheiro")) {
							Double dinheiro = Double.parseDouble((campoDinheiro.getText()));
							doacao.setValor(dinheiro);
							
						}
						//ROUPA - ANDRÉ 21/05
						if(comboBoxTipo.getSelectedItem().equals("Roupa")) {
							
							quantidade  = Double.parseDouble((campoRoupa.getText()));
							doacao.setQuantidade(quantidade);
							
						}
						//ALIMENTO - ANDRÉ 21/05
						if(comboBoxTipo.getSelectedItem().equals("Alimento")) {
							
							Double kg = Double.parseDouble((campoKg.getText()));
							doacao.setKg(kg);
						}
						
						//CADASTRAR DOAÇÕES - 22/05
						doacao.doar(doacao);
						
						JOptionPane.showMessageDialog(null, "Doação feita! Obrigado.");
						Limpar();
					}
					
				}
				//ERRO DE VALOR
				catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Digite O valor Correto!!!");
				}
				
			}
		});
		btnCadastrar.setFont(new Font("Gadugi", Font.BOLD, 13));
		btnCadastrar.setBounds(171, 579, 365, 25);
		contentPane.add(btnCadastrar);
		
		//BOTÃO VOLTAR
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Gadugi", Font.BOLD, 13));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voluntario frame = new Voluntario();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(171, 615, 365, 25);
		contentPane.add(btnVoltar);
	}
	//LIMPAR CAMPOS - 19/05
	public void Limpar() {
		campoDinheiro.setText("");
		campoRoupa.setText("");
		campoKg.setText("");
	}
}

package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

import model.Doacao;
import model.Evento;
import view.funcionario.CriarEvento;
import view.gestor.CadastrarFuncionario;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Gestor extends JFrame {

	private JPanel contentPane;
	
	//OBJETO 17/05
	model.Ong ong = new model.Ong();
	private model.Funcionario funcionario = new model.Funcionario();
	private model.Doacao doacao = new model.Doacao();
	private model.Evento evento = new model.Evento();
	
	//CADASTRO DE FUNCIONÁRIOS 17/05
	private static ArrayList<model.Funcionario> cadastroFuncionario = new ArrayList<model.Funcionario>();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestor frame = new Gestor();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//TELA GESTOR
	public Gestor() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new TitledBorder(null, "Gestor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//TEXTO DO GESTOR
		JLabel lblNewLabel = new JLabel("Escolha uma das op\u00E7\u00F5es");
		lblNewLabel.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblNewLabel.setBounds(171, 173, 165, 14);
		contentPane.add(lblNewLabel);
		
		//COMBOBOX DO GESTOR
		JComboBox comboBoxGestor = new JComboBox();
		comboBoxGestor.setFont(new Font("Gadugi", Font.BOLD, 13));
		comboBoxGestor.setModel(new DefaultComboBoxModel(new String[] {"", "Cadastrar funcion\u00E1rio", "Funcion\u00E1rios", "Remover funcion\u00E1rio", "Analisar receitas", "Analisar despesas", "Gerar relat\u00F3rio financeiro"}));
		comboBoxGestor.setBounds(171, 198, 365, 25);
		contentPane.add(comboBoxGestor);
		
		//TEXT ÁREA INFORMAÇÕES - 17/05
		JTextArea textAreaInformacoes = new JTextArea();
		textAreaInformacoes.setEditable(false);
		textAreaInformacoes.setFont(new Font("Gadugi", Font.PLAIN, 15));
		contentPane.add(textAreaInformacoes);
		
		//ADD SCROLL
		JScrollPane scroll = new JScrollPane(textAreaInformacoes, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBackground(new Color(192, 192, 192));
		scroll.setBounds(45, 270, 600, 338);
		scroll.setFont(new Font("Gadugi", Font.BOLD, 15));
		contentPane.add(scroll);
		
		//BOTÃO AVANÇAR
		JButton botaoAvancar = new JButton("Avan\u00E7ar");
		botaoAvancar.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoAvancar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//CADASTRAR FUNCIONÁRIO
				if(comboBoxGestor.getSelectedItem().equals("Cadastrar funcionário")) {
					CadastrarFuncionario frame = new CadastrarFuncionario();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					dispose();
				}
				//MOSTRAR FUNCIONÁRIOS
				if(comboBoxGestor.getSelectedItem().equals("Funcionários")) {
					//PEGAR CADASTROS DE FUNCIONARIO - ANDRÉ 22/05
					cadastroFuncionario = funcionario.getFuncionarios();
					
					for (int i = 0; i < cadastroFuncionario.size(); i++) {
						textAreaInformacoes.setText(cadastroFuncionario.toString());
					}
				}
				//ANALISAR RECEITAS
				if(comboBoxGestor.getSelectedItem().equals("Analisar despesas")) {
					ArrayList<Object> despesasOng = new ArrayList<Object>();
					
					for(int i = 0; i < evento.getEventos().size(); i++) {
						despesasOng.add("\n\tEvento: "+evento.getEventos().get(i).getNome()+
										"\n\tCusto: "+evento.getEventos().get(i).getCustos()+
										"\n");
						
						textAreaInformacoes.setText(despesasOng.toString());
						
					}
					
				}
				
				//ANALISAR DESPESAS
				if(comboBoxGestor.getSelectedItem().equals("Analisar receitas")) {
					//PEGAR MÉTODO GERAR RECEITA
					ArrayList<Object> receitaDoador = new ArrayList<Object>();

					for(int i = 0; i < doacao.getDoacoes().size(); i++) {
						
						receitaDoador.add("\n\tNome: "+doacao.getDoacoes().get(i).getVoluntario().getNome()
											+"\n\tValor: "+doacao.getDoacoes().get(i).getValor()+
											"\n");
					}
					textAreaInformacoes.setText(receitaDoador.toString());
				}
				
				//RELATÓRIO FINANCEIRO
				if(comboBoxGestor.getSelectedItem().equals("Gerar relatório financeiro")) {
					//PEGAR MÉTODO DE GERAR DESPESAS
					double receitaTotal = ong.analisarReceita();
					double despesaTotal = ong.analisarDespesa();
					double caixa = ong.caixa();
					textAreaInformacoes.setText("\n\tReceita Total: R$" + receitaTotal+
												"\n\tDespesa Total: " + despesaTotal+
												"\n\tCaixa: "+ caixa+
												"\n");
				}
				//REMOVER FUNCIONÁRIO
				if (comboBoxGestor.getSelectedItem().equals("Remover funcionário")) {
					String cpf = JOptionPane.showInputDialog("Digite o cpf do funcionário que deseja remover: ");
					for(int i = 0; i < funcionario.getFuncionarios().size(); i++) {
						
						if(funcionario.getFuncionarios().get(i).getCpf().equals(cpf)) {
							model.Funcionario funcionarioSelecionado;
							funcionarioSelecionado = funcionario.getFuncionarios().get(i);
							funcionario.removerFuncionario(funcionarioSelecionado);
							JOptionPane.showMessageDialog(null,"Funcionário removido");
						}
						else {
							JOptionPane.showMessageDialog(null,"Funcionário não encontrado");
						}
					}
				}
			}
		});
		botaoAvancar.setBounds(171, 619, 365, 25);
		contentPane.add(botaoAvancar);
		
		//BOTÃO SAIR
		JButton botaoSair = new JButton("Sair");
		botaoSair.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				dispose();
			}
		});
		botaoSair.setBounds(171, 655, 365, 25);
		contentPane.add(botaoSair);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("logos\\70x70.png"));
		lblNewLabel_1.setBounds(254, 11, 200, 151);
		contentPane.add(lblNewLabel_1);
		
		
		JLabel lblInformacoes = new JLabel("Informa\u00E7\u00F5es");
		lblInformacoes.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblInformacoes.setBounds(45, 234, 98, 25);
		contentPane.add(lblInformacoes);
	}
}

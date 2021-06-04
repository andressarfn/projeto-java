package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

import model.Doacao;
import model.Evento;
import model.Funcionario;
import model.Trabalho;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Login extends JFrame {
	
	private JPanel contentLogin;
	private JTextField campoEmail;
	private JPasswordField campoSenha;
	
	//OBJETOS NECESSÁRIOS
	private model.Funcionario funcionario = new model.Funcionario();
	private model.Voluntario voluntario = new model.Voluntario();
	private model.Voluntario voluntarioSelecionado = new model.Voluntario();
	private model.Funcionario funcionarioLogado = new model.Funcionario();
	
	//OBJETOS CRIADOS APENAS PARA BUSCAR TAMANHO DAS LISTAS E USAR NO MÉTODO FUNCIONÁRIO FAKE
	private model.Trabalho trabalho = new model.Trabalho();
	private model.Evento evento = new model.Evento();
	private model.Doacao doacao = new model.Doacao();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//----------------------------------
					Login frame = new Login();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					//----------------------------------
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//TELA LOGIN
	public Login() {
		
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 726);
		contentLogin = new JPanel();
		contentLogin.setBackground(Color.WHITE);
		contentLogin.setBorder(new TitledBorder(null, "Entrar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentLogin);
		contentLogin.setLayout(null);
		
		//EMAIL
		campoEmail = new JTextField();
		campoEmail.setForeground(Color.BLACK);
		campoEmail.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoEmail.setBounds(167, 350, 365, 25);
		contentLogin.add(campoEmail);
		campoEmail.setColumns(10);
		
		//EMAIL
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(new Color(0, 0, 0));
		lblEmail.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblEmail.setBounds(167, 325, 46, 14);
		contentLogin.add(lblEmail);
		
		//SENHA
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(new Color(0, 0, 0));
		lblSenha.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblSenha.setBounds(167, 386, 46, 14);
		contentLogin.add(lblSenha);
		
		//CRIANDO OS 3 OBJETOS PARA AS CONDIÇÕES DE CHECKBOX - 18/05
		JCheckBox chckbxGestor = new JCheckBox("Gestor");
		JCheckBox chckbxFuncionario = new JCheckBox("Funcion\u00E1rio");
		JCheckBox chckbxVoluntario = new JCheckBox("Volunt\u00E1rio");
		
		//CHECKBOX GESTOR - 18/05
		chckbxGestor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxGestor.isSelected()) {
					chckbxFuncionario.setEnabled(false);
					chckbxVoluntario.setEnabled(false);
				} else {
					chckbxGestor.setEnabled(true);
					chckbxFuncionario.setEnabled(true);
					chckbxVoluntario.setEnabled(true);
				}
			}
		});
		chckbxGestor.setBackground(Color.WHITE);
		chckbxGestor.setForeground(new Color(0, 0, 0));
		chckbxGestor.setFont(new Font("Gadugi", Font.PLAIN, 13));
		chckbxGestor.setBounds(167, 443, 69, 23);
		contentLogin.add(chckbxGestor);
		
		//CHECKBOX FUNCIONÁRIO - 18/05
		chckbxFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFuncionario.isSelected()) {
					chckbxGestor.setEnabled(false);
					chckbxVoluntario.setEnabled(false);
				} else {
					chckbxFuncionario.setEnabled(true);
					chckbxGestor.setEnabled(true);
					chckbxVoluntario.setEnabled(true);
				}
			}
		});
		chckbxFuncionario.setBackground(Color.WHITE);
		chckbxFuncionario.setForeground(new Color(0, 0, 0));
		chckbxFuncionario.setFont(new Font("Gadugi", Font.PLAIN, 13));
		chckbxFuncionario.setBounds(296, 443, 99, 23);
		contentLogin.add(chckbxFuncionario);
		
		
		//CHECKBOX VOLUNTÁRIO - 18/05
		chckbxVoluntario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxVoluntario.isSelected()) {
					chckbxGestor.setEnabled(false);
					chckbxFuncionario.setEnabled(false);
				} else {
					chckbxVoluntario.setEnabled(true);
					chckbxFuncionario.setEnabled(true);
					chckbxGestor.setEnabled(true);
				}
			}
		});
		chckbxVoluntario.setBackground(Color.WHITE);
		chckbxVoluntario.setForeground(new Color(0, 0, 0));
		chckbxVoluntario.setFont(new Font("Gadugi", Font.PLAIN, 13));
		chckbxVoluntario.setBounds(444, 443, 88, 23);
		contentLogin.add(chckbxVoluntario);
		
		//SENHA
		campoSenha = new JPasswordField();
		//CONFIGURAÇÕES
		campoSenha.setBounds(167, 411, 365, 25);
		contentLogin.add(campoSenha);
		
		//BOTÃO ENTRAR
				JButton botaoEntrar = new JButton("Entrar");
				botaoEntrar.setForeground(new Color(0, 0, 0));
				botaoEntrar.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						//TESTE LOGIN COM VOLUNTÁRIO CADASTRADOS (DEU CERTO) "NÃO APAGAR" - ANDRÉ 21/05
						
						//TELA DE GESTOR
						if(chckbxGestor.isSelected()) {
							if (CheckLogin(campoEmail.getText(), new String(campoSenha.getPassword()))) {
								JOptionPane.showMessageDialog(null, "Bem vindo(a)");
								//OBJETO PARA TROCAR TELA GESTOR - 19/05
								Gestor frame = new Gestor();
								//CENTRALIZANDO A TELA
								frame.setLocationRelativeTo(null);
								frame.setVisible(true);
								dispose();
							}
							else {
								JOptionPane.showMessageDialog(null, "Dados incorretos!", "Erro", JOptionPane.WARNING_MESSAGE);
								Limpar();
							}
						}
						
						//TELA FUNCIONÁRIO
						if(chckbxFuncionario.isSelected()) {
							if(loginFuncionario(campoEmail.getText(), campoSenha.getText())) {
								JOptionPane.showMessageDialog(null, "Bem vindo(a)");
								view.Funcionario frame = new view.Funcionario();
								frame.pegarFuncionarioLogado(funcionarioLogado);
								frame.setLocationRelativeTo(null);
								frame.setVisible(true);
								dispose();
							}
							else {
								JOptionPane.showMessageDialog(null, "Dados Incorretos");
								Limpar();
							}
							
						}
						
						//TELA VOLUNTÁRIO
						if(chckbxVoluntario.isSelected()) {
							if(loginVoluntario(campoEmail.getText(), campoSenha.getText()) == true) {
								JOptionPane.showMessageDialog(null, "Bem vindo(a)");
								
								Voluntario telavoluntario = new Voluntario();
								telavoluntario.setLocationRelativeTo(null);
								//PASSAR VOLUNTÁRIO LOGADO PARA A TELA DE VOLUNTÁRIO - ANDRÉ 21/05
								telavoluntario.voluntarioLogin = voluntarioSelecionado;
								telavoluntario.setVisible(true);
								dispose();
							}
							else {
								JOptionPane.showMessageDialog(null, "Dados Incorretos");
								Limpar();
							}
						}
						
						// INVOCAR MÉTODO CADASTRAR FAKE
						cadastrarFake();
					}
				});
				//CONFIGURAÇÕES DO BOTÃO ENTRAR
				botaoEntrar.setFont(new Font("Gadugi", Font.BOLD, 13));
				botaoEntrar.setBounds(167, 486, 365, 25);
				contentLogin.add(botaoEntrar);
				
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon("logos\\todo-70x70.png"));
				lblNewLabel.setBounds(230, 70, 200, 228);
				contentLogin.add(lblNewLabel);
	}
		
	//LIMPAR
    public void Limpar() {
    	campoEmail.setText("");
        campoEmail.requestFocus();
        campoSenha.setText("");
    }

	//ENTRAR COMO GESTOR
	public boolean CheckLogin(String email, String senha) {
		boolean situacao = false;
		
		if (email.equals("andre@ong.com") && senha.equals("12345")){
			situacao = true;
		}
		
		if (email.equals("andressa@ong.com") && senha.equals("12345")){
			situacao = true;
		}
		
		if (email.equals("sablina@ong.com") && senha.equals("12345")){
			situacao = true;
		}
		if (email.equals("alana@ong.com") && senha.equals("12345")){
			situacao = true;
		}
		
		return situacao;
		
	}
	
	//PERCORRER CADASTRO DE VOLUNTÁRIOS - ANDRÉ 21/05
	public boolean loginVoluntario(String email, String senha) {
		boolean situacao = false;
		
		for(int i = 0;i < voluntario.getVoluntarios().size(); i++) {
			if(email.equals(voluntario.getVoluntarios().get(i).getEmail()) && senha.equals(voluntario.getVoluntarios().get(i).getSenha())) {
				//PEGAR VOLUNTÁRIO QUE FARÁ O LOGIN - ANDRÉ 21/05
				voluntarioSelecionado = voluntario.getVoluntarios().get(i);
				situacao = true;
			}
		}
		
		return situacao;
	}
	
	//PERCORRER CADASTRO DE FUNCIONÁRIOS - ANDRÉ 21/05
	public boolean loginFuncionario(String email, String senha) {
		boolean situacao = false;
		
		for(int i = 0; i < funcionario.getFuncionarios().size(); i++) {
			if(email.equals(funcionario.getFuncionarios().get(i).getEmail()) && senha.equals(funcionario.getFuncionarios().get(i).getSenha())) {
				funcionarioLogado = funcionario.getFuncionarios().get(i);
				situacao = true;
			}
		}
		
		return situacao;
	}
	
	//CADASTRAR FAKE
	public void cadastrarFake() {
		model.Voluntario voluntarioFake = null;
		model.Funcionario funcionarioFake = null;
		model.Trabalho trabalhoFake;
		model.Evento eventoFake = null;
		model.Doacao doacaoFake;
		
		//CRIANDO VOLUNTÁRIO FAKE
		if(voluntario.getVoluntarios().size()  == 0) {
			voluntarioFake = new model.Voluntario("MariaZinha","000.000.000-00","000000","83999999999","Rua da faculdade",
													"maria@ong.com","12345", "01/01");
			voluntarioFake.cadastrarVoluntario(voluntarioFake);
		}
		//CRIANDO TRABALHO FAKE
		if(funcionario.getFuncionarios().size() == 0) {
			funcionarioFake = new model.Funcionario("Zezinho","111.111.111-11","111111","Rua da República",
																		"8399887666","zezinho@ong.com","12345");
			funcionarioFake.cadastrarFuncionario(funcionarioFake);
		}
		//CRIANDO TRABALHO FAKE
		if(trabalho.getTrabalhos().size() == 0) {
			trabalhoFake = new model.Trabalho("Organizar Fila", "01/01/2021","10:00","Rua Chico Bento",voluntarioFake,true);
			trabalhoFake.criarTrabalho(trabalhoFake);
		}
		//CRIANDO EVENTO FAKE
		if(evento.getEventos().size() == 0) {
			eventoFake = new model.Evento("Mães Solteiras","01/01/2021","Rua da Faculdade","10:00","00:60:00",500,funcionarioFake,
											"Prefeitura Municipal de João Pessoa",
											"Evento consiste em ajudar mães solteiras afetadas pela pandemia");
			eventoFake.setResponsavel(funcionarioFake); eventoFake.criarEvento(eventoFake);
		}
		
		//CRIANDO DOAÇÃO FAKE
		if(doacao.getDoacoes().size() == 0) {
			doacaoFake = new model.Doacao(voluntarioFake,"Dinheiro", 2000.0,10.0,10.0,false,"Rua Da Faculdade");
			doacaoFake.doar(doacaoFake);
		}
		
	}

}

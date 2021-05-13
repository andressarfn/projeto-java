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
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {
	
	private JPanel contentLogin;
	private JTextField campoEmail;
	private JPasswordField campoSenha;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	//tela de login
	public Login() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 730);
		contentLogin = new JPanel();
		contentLogin.setBackground(Color.WHITE);
		contentLogin.setBorder(new TitledBorder(null, "Entrar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentLogin);
		contentLogin.setLayout(null);
		
		//input do email
		campoEmail = new JTextField();
		campoEmail.setForeground(Color.BLACK);
		campoEmail.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoEmail.setBounds(167, 350, 365, 25);
		contentLogin.add(campoEmail);
		campoEmail.setColumns(10);
		
		//texto email
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(new Color(0, 0, 0));
		lblEmail.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblEmail.setBounds(167, 325, 46, 14);
		contentLogin.add(lblEmail);
		
		//texto senha
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(new Color(0, 0, 0));
		lblSenha.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblSenha.setBounds(167, 386, 46, 14);
		contentLogin.add(lblSenha);
		
		//checkbox gestor
		JCheckBox chckbxGestor = new JCheckBox("Gestor");
		chckbxGestor.setBackground(Color.WHITE);
		chckbxGestor.setForeground(new Color(0, 0, 0));
		chckbxGestor.setFont(new Font("Gadugi", Font.PLAIN, 13));
		chckbxGestor.setBounds(167, 443, 69, 23);
		contentLogin.add(chckbxGestor);
		
		//checkbox funcionario
		JCheckBox chckbxFuncionario = new JCheckBox("Funcion\u00E1rio");
		chckbxFuncionario.setBackground(Color.WHITE);
		chckbxFuncionario.setForeground(new Color(0, 0, 0));
		chckbxFuncionario.setFont(new Font("Gadugi", Font.PLAIN, 13));
		chckbxFuncionario.setBounds(296, 443, 99, 23);
		contentLogin.add(chckbxFuncionario);
		
		
		//checkbox voluntário
		JCheckBox chckbxVoluntario = new JCheckBox("Volunt\u00E1rio");
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
		
		//botão entrar
				JButton botaoEntrar = new JButton("Entrar");
				botaoEntrar.setForeground(new Color(0, 0, 0));
				botaoEntrar.addActionListener(new ActionListener() {
					
					//entrar quando apertar o botão
					public void actionPerformed(ActionEvent e) {
						
						if (CheckLogin(campoEmail.getText(), new String(campoSenha.getPassword()))) {
							
							
							//TELA DE GESTOR
							if(chckbxGestor.isSelected()) {
								JOptionPane.showMessageDialog(null, "Bem vindo(a)");
								new Gestor().setVisible(true);
								dispose();
							}
							
							//TELA FUNCIONÁRIO
							if(chckbxFuncionario.isSelected()) {
								JOptionPane.showMessageDialog(null, "Bem vindo(a)");
								new Funcionario().setVisible(true);
								dispose();
							}
							
							//TELA VOLUNTÁRIO
							if(chckbxVoluntario.isSelected()) {
								JOptionPane.showMessageDialog(null, "Bem vindo(a)");
								new Voluntario().setVisible(true);
								dispose();
							}
							
							//CHECKBOX VAZIO
							else {
								JOptionPane.showMessageDialog(null,"Escolha uma opção");
							}
							
						//DADOS INCORRETOS
						} else {
							JOptionPane.showMessageDialog(null, "Dados incorretos!", "Erro", JOptionPane.WARNING_MESSAGE);
							Limpar();
						};
					}
				});
				//CONFIGURAÇÕES DO BOTÃO ENTRAR
				botaoEntrar.setFont(new Font("Gadugi", Font.BOLD, 13));
				botaoEntrar.setBounds(167, 486, 365, 25);
				contentLogin.add(botaoEntrar);
				
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon("C:\\Users\\andre\\eclipse-workspace\\projeto_java\\logos\\todo-70x70.png"));
				lblNewLabel.setBounds(230, 70, 200, 228);
				contentLogin.add(lblNewLabel);
	}
	
	
	//LIMPAR
    public void Limpar() {
    	campoEmail.setText("");
        campoEmail.requestFocus();
        campoSenha.setText("");
}

   
	//ENTRAR
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
		
		return situacao;
		
	}

}

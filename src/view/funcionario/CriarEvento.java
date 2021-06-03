package view.funcionario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import model.Evento;
import view.Funcionario;

import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class CriarEvento extends JFrame {

	private JPanel contentPane;
	private JTextField campoNomeEvento;
	private JTextField campoData;
	private JTextField campoParceria;
	private JTextField campoHora;
	private JTextField campoLocal;
	private JTextField campoDuracao;
	private JTextField campoCusto;
	
	//OBJETO PARA OBTER FUNCIONARIO LOGADO
	model.Funcionario funcionarioLogado = new model.Funcionario();
	private JTextField campoObjetivo;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriarEvento frame = new CriarEvento();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//PEGAR FUNCIONÁRIO LOGADO 
	public void pegarFuncionarioLogado(model.Funcionario funcionario) {
		funcionarioLogado = funcionario;
	}

	//TELA CRIAR
	public CriarEvento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Criar Evento", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//TEXTO NOME
		JLabel lblNome = new JLabel("Nome do evento");
		lblNome.setBounds(169, 176, 130, 14);
		lblNome.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblNome);
		
		//TEXTO EMAIL
		JLabel lblParceria = new JLabel("Parceria");
		lblParceria.setBounds(169, 423, 72, 14);
		lblParceria.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblParceria);
		
		//TEXTO CPF E CNPJ
		JLabel lblCPForCNPJ = new JLabel("Data");
		lblCPForCNPJ.setBounds(169, 237, 72, 14);
		lblCPForCNPJ.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblCPForCNPJ);
		
		//TEXTO DO RG
		JLabel lblRG = new JLabel("Hora");
		lblRG.setBounds(367, 237, 72, 14);
		lblRG.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblRG);
		
		//TEXTO DE ENDEREÇO
		JLabel lblEndereco = new JLabel("Local");
		lblEndereco.setBounds(169, 298, 56, 14);
		lblEndereco.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblEndereco);
		
		//INPUT NOME
		campoNomeEvento = new JTextField();
		campoNomeEvento.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoNomeEvento.setBounds(169, 201, 365, 25);
		contentPane.add(campoNomeEvento);
		campoNomeEvento.setColumns(10);
		
		//DATA
		try {
			campoData = new JFormattedTextField(new MaskFormatter("##/##/####"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		campoData.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoData.setBounds(169, 262, 175, 25);
		campoData.setColumns(10);
		contentPane.add(campoData);
		
		//HORA
		try {
			campoHora = new JFormattedTextField(new MaskFormatter("##:##"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		campoHora.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoHora.setBounds(367, 262, 167, 25);
		campoHora.setColumns(10);
		contentPane.add(campoHora);
		
		//PARCERIA
		campoParceria = new JTextField();
		campoParceria.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoParceria.setBounds(169, 448, 175, 25);
		campoParceria.setColumns(10);
		contentPane.add(campoParceria);
		
		//INPUT ENDEREÇO
		campoLocal = new JTextField();
		campoLocal.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoLocal.setBounds(169, 326, 365, 25);
		contentPane.add(campoLocal);
		campoLocal.setColumns(10);
		
		//DURAÇÃO
		try {
			campoDuracao = new JFormattedTextField(new MaskFormatter("##:##:##"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		campoDuracao.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoDuracao.setBounds(169, 387, 175, 25);
		campoDuracao.setColumns(10);
		contentPane.add(campoDuracao);
		
		//CUSTO
		campoCusto = new JTextField();
		campoCusto.setFont(new Font("Gadugi", Font.PLAIN, 13));
		campoCusto.setColumns(10);
		campoCusto.setBounds(367, 387, 167, 25);
		contentPane.add(campoCusto);
		
		//OBJETIVO
		campoObjetivo = new JTextField();
		campoObjetivo.setBounds(367, 449, 167, 25);
		contentPane.add(campoObjetivo);
		campoObjetivo.setColumns(10);
		
		//BOTÃO ENVIAR
		JButton botaoCriar = new JButton("Criar");
		botaoCriar.setBounds(169, 512, 365, 25);
		botaoCriar.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//tratamento de erro
				try {
					//OBJETOS - 17/05
					model.Evento evento = new model.Evento();
					model.Trabalho trabalho = new model.Trabalho();
					//CAPTURAR ENTRADA DE DADOS - 17/05
					String nome = campoNomeEvento.getText();
					String data = campoData.getText();
					String hora = campoHora.getText();
					String parceria = campoParceria.getText();
					String local = campoLocal.getText();
					String duracao = campoDuracao.getText();
					double custo = Double.parseDouble(campoCusto.getText());
					String objetivo = campoObjetivo.getText();
					//CADASTRAR INFORMAÇÕES DE EVENTO
					evento.setNome(nome); evento.setData(data); evento.setHora(hora);
					evento.setLocal(local); evento.setDuracao(duracao); evento.setCustos(custo);
					evento.setResponsavel(funcionarioLogado); evento.setParceria(parceria); evento.setObjetivo(objetivo);
					evento.incluirTrabalhosEventos(trabalho.getTrabalhos());
					//CADASTRAR EVENTO NO BANCO DE DADOS
					evento.criarEvento(evento);
					
					JOptionPane.showMessageDialog(null, "Evento criado!");
					 Limpar();
				}
				//Erro de valor
				catch(NumberFormatException nbfex) {
					JOptionPane.showMessageDialog(null, "Digite os valores dos campos correto!!!");
				}
			}
		});
		contentPane.add(botaoCriar);
		
		JLabel lblTelefone = new JLabel("Dura\u00E7\u00E3o do evento");
		lblTelefone.setBounds(169, 362, 130, 14);
		lblTelefone.setFont(new Font("Gadugi", Font.BOLD, 13));
		contentPane.add(lblTelefone);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("logos\\70x70.png"));
		lblNewLabel.setBounds(254, 14, 200, 151);
		contentPane.add(lblNewLabel);
		
		JLabel lblCusto = new JLabel("Custo do evento");
		lblCusto.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblCusto.setBounds(367, 363, 130, 14);
		contentPane.add(lblCusto);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario frame = new Funcionario();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				dispose();
			}
		});
		botaoVoltar.setFont(new Font("Gadugi", Font.BOLD, 13));
		botaoVoltar.setBounds(169, 584, 365, 25);
		contentPane.add(botaoVoltar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Limpar();
			}
		});
		btnLimpar.setFont(new Font("Gadugi", Font.BOLD, 13));
		btnLimpar.setBounds(169, 548, 365, 25);
		contentPane.add(btnLimpar);
		
		JLabel lblNewLabelObjetivo = new JLabel("Objetivo");
		lblNewLabelObjetivo.setFont(new Font("Gadugi", Font.BOLD, 13));
		lblNewLabelObjetivo.setBounds(367, 424, 63, 14);
		contentPane.add(lblNewLabelObjetivo);
	}
	
	// LIMPAR OS CAMPOS - 18/05
	public void Limpar() {
		campoNomeEvento.setText(null);
		campoData.setText(null);
		campoHora.setText(null);
		campoParceria.setText(null);
		campoLocal.setText(null);
		campoDuracao.setText(null);
		campoCusto.setText(null);
		campoObjetivo.setText(null);
	}
}

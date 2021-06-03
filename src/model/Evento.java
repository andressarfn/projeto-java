package model;

import java.util.ArrayList;

public class Evento {
	
	private String nome;
	private String data;
	private String local;
	private String hora;
	private String duracao;
	private double custos;
	private Funcionario responsavel;
	private String parceria;
	private String objetivo;
	
	private static ArrayList<Trabalho> trabalhos = new ArrayList<Trabalho>();
	private static ArrayList<Evento> eventos = new ArrayList<Evento>();
	
	public Evento(String nomeC, String dataC, String localC, String horaC, String duracaoC, double custosC,
			Funcionario responsavelC, String parceriaC, String objetivoC) {
		
		this.nome = nomeC;
		this.data = dataC;
		this.local = localC;
		this.hora = horaC;
		this.duracao = duracaoC;
		this.custos = custosC;
		this.responsavel = responsavelC;
		this.parceria = parceriaC;
		this.objetivo = objetivoC;
	}
	
	public Evento() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	public double getCustos() {
		return custos;
	}
	public void setCustos(double custos) {
		this.custos = custos;
	}
	
	public Funcionario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}
	
	public String isParceria() {
		return parceria;
	}
	public void setParceria(String parceria) {
		this.parceria = parceria;
	}
	
	public String getObjetivo() {
		return this.objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	public ArrayList<Evento> getEventos(){
		return this.eventos;
	}
	public void setEvento(ArrayList<Evento> eventos) {
		this.eventos = eventos;
	}
	
	public ArrayList<Trabalho> getTrabalhos(){
		return this.trabalhos;
	}
	public void setTrabalhos(ArrayList<Trabalho> trabalhos) {
		this.trabalhos = trabalhos;
	}

	//AJUSTADO - 18/05
	public String toString() {
		return "\n\t               EVENTO                   " +
				"\n\tNome: " + getNome() + 
				"\n\tData: " + getData() + 
				"\n\tLocal: " + getLocal() + 
				"\n\tHorario: " + getHora() + 
				"\n\tDuracao: " + getDuracao() + 
				"\n\tCustos: "+getCustos()+
				"\n\tResponsável: " + getResponsavel().getNome() + 
				"\n\tParceria: " + isParceria() +
				"\n\tObjetivo: " + getObjetivo() +
				"\n";
	}
	
	//CRIAR EVENTOS 23/05
	public void criarEvento(Evento evento) {
		this.eventos.add(evento);
	}
	
	//REMOVER DOAÇÃO - ANDRÉ - 23/05
	public boolean removerEvento(Evento evento) {
		boolean situacao = false;
		
		for(int i = 0; i < eventos.size(); i++) {
			
			if(eventos.get(i).equals(evento)) {
				eventos.remove(i);
				situacao = true;
				break;
			}
		}
		
		return situacao;
	}
	
	//CADASTRAR TRABALHOS EM EVENTOS
	public void incluirTrabalhosEventos(ArrayList<Trabalho> trabalhos) {
		this.trabalhos = trabalhos;
	}
	
}

package model;

import java.util.Date;

public class Evento {
	
	private String nome;
	private Date data;
	private String local;
	private Date horario;
	private int duracao;
	private double custos;
	private Voluntario voluntario;
	private Funcionario responsavel;
	private boolean parceria;
	
	public Evento(String nomeC, Date dataC, String localC, Date horarioC, int duracaoC, double custosC, Voluntario voluntarioC,
			Funcionario responsavelC, boolean parceriaC) {
		
		this.nome = nomeC;
		this.data = dataC;
		this.local = localC;
		this.horario = horarioC;
		this.duracao = duracaoC;
		this.custos = custosC;
		this.voluntario = voluntarioC;
		this.responsavel = responsavelC;
		this.parceria = parceriaC;
	}
	
	public Evento() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	public Date getHorario() {
		return horario;
	}
	public void setHorario(Date horario) {
		this.horario = horario;
	}
	
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public double getCustos() {
		return custos;
	}
	public void setCustos(double custos) {
		this.custos = custos;
	}
	
	public Voluntario getVoluntario() {
		return voluntario;
	}
	public void setVoluntario(Voluntario voluntario) {
		this.voluntario = voluntario;
	}
	
	public Funcionario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}
	
	public boolean isParceria() {
		return parceria;
	}
	public void setParceria(boolean parceria) {
		this.parceria = parceria;
	}

	
	public String toString() {
		return "Nome = " + getNome() + 
				"\nData = " + getData() + 
				"\nLocal = " + getLocal() + 
				"\nHorario = " + getHorario() + 
				"\nDuracao = " + getDuracao() + 
				"\ngetCustos = " + getCustos() +
				"\nVoluntário = " + getVoluntario() + 
				"\nResponsável = " + getResponsavel() + 
				"\nParceria = " + isParceria();
	}
	
	
	
	

}

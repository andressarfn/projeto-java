package model;

import java.util.ArrayList;

public class Trabalho {
	
	//ATRIBUTOS
	private String tipo;
	private String data;
	private String hora;
	private String endereco;
	private Voluntario voluntario;
	private boolean situacao = false;
	
	private static ArrayList<Trabalho> trabalhos = new ArrayList<Trabalho>();
	
	//CONSTRUTOR
	public Trabalho(String tipoC, String dataC, String horaC, String enderecoC, Voluntario voluntarioC, boolean situacaoC ) {
		this.tipo = tipoC;
		this.data = dataC;
		this.hora = horaC;
		this.endereco = enderecoC;
		this.voluntario = voluntarioC;
		this.situacao = situacaoC;
		
	}
	
	//CONSTRUTOR VAZIO
	public Trabalho() {}
	
	// GETTERS E SETTERS
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Voluntario getVoluntario() {
		return voluntario;
	}

	public void setVoluntario(Voluntario voluntario) {
		this.voluntario = voluntario;
	}
	
	public boolean getSituacao() {
		return this.situacao;
	}
	
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	public ArrayList<Trabalho> getTrabalhos(){
		return this.trabalhos;
	}
	
	public void setTrabalhos(ArrayList<Trabalho> trabalhos) {
		this.trabalhos = trabalhos;
	}
	
	//AJUSTADO - 18/05
	public String toString() {
		return "\n\t               TRABALHO                   " +
				"\n\tTipo: " + getTipo() +
				"\n\tData: " + getData() + 
				"\n\tHora: " + getHora() + 
				"\n\tEndereço: " + getEndereco()+
				"\nVoluntário: "+ this.voluntario +
				"\n";
	}
	
	//CRIAR TRABALHO
	public void criarTrabalho(Trabalho trabalho) {
		this.trabalhos.add(trabalho);
	}
	
	
}

package model;

import java.sql.Date;

public class Trabalho {
	
	//ATRIBUTOS
	private String tipo;
	private Date data;
	private Date hora;
	private String local;
	private Voluntario voluntario;
	
	//CONSTRUTOR
	public Trabalho(String tipoC, Date dataC, Date horaC, String localC, Voluntario voluntarioC ) {
		this.tipo = tipoC;
		this.data = dataC;
		this.hora = horaC;
		this.local = localC;
		this.voluntario = voluntarioC;
		
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

	public Date getDia() {
		return data;
	}

	public void setDia(Date data) {
		this.data = data;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Voluntario getVoluntario() {
		return voluntario;
	}

	public void setVoluntario(Voluntario voluntario) {
		this.voluntario = voluntario;
	}
	
	
}

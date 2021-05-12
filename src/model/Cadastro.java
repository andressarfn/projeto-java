package model;

import java.util.ArrayList;

public class Cadastro {
	
	private ArrayList<Funcionario> funcionarios;
	private ArrayList<Voluntario> voluntarios;
	private ArrayList<Evento> eventos;
	
	//CONSTRUTOR
	public Cadastro(ArrayList<Funcionario> funcionariosC, ArrayList<Voluntario> voluntariosC, ArrayList<Evento> eventosC) {
		this.funcionarios = funcionariosC;
		this.voluntarios = voluntariosC;
		this.eventos = eventosC;
	}
	//CONSTRUTOR VAZIO
	public Cadastro() {}
	
	//GET SET FUNCIONARIOS
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	//GET SET VOLUNTÁRIOS
	public ArrayList<Voluntario> getVoluntarios() {
		return voluntarios;
	}
	public void setVoluntarios(ArrayList<Voluntario> voluntarios) {
		this.voluntarios = voluntarios;
	}
	
	//GET SET EVENTOS
	public ArrayList<Evento> getEventos() {
		return eventos;
	}
	public void setEventos(ArrayList<Evento> eventos) {
		this.eventos = eventos;
	}
	
	//TOSTRING
	public String toString() {
		return "Voluntários = " + this.getVoluntarios() + 
				"\nFuncionários = " + this.getFuncionarios() + 
				"\nEventos = " + this.getEventos();
	}
	
	
	
	
	
	

}

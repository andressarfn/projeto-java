package model;

public class Gestor {

	private Funcionario funcionario;
	
	public Gestor (Funcionario funcionarioC) {
		this.funcionario = funcionarioC;
	}
	
	public Gestor () {}
	

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public String toString() {
		return "Gestor = " + this.getFuncionario();
	}
	
	
}

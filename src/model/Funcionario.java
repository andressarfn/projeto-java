package model;

import java.util.ArrayList;

public class Funcionario {
	
	private String nome;
	private String rg;
	private String cpf;
	private String endereco;
	private String telefone;
	private String email;
	private String senha;
	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public Funcionario (String nomeC, String rgC, String cpfC, String enderecoC, String telefoneC, String emailC, String senhaC) {
		this.nome = nomeC;
		this.rg = rgC;
		this.cpf = cpfC;
		this.endereco = enderecoC;
		this.telefone = telefoneC;
		this.email = emailC;
		this.senha = senhaC;
	}
	
	public Funcionario () {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public ArrayList<Funcionario> getFuncionarios(){
		return this.funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
	//AJUSTADO - 18/05
	public String toString() {
		return "\n\t               FUNCIONÁRIO                   " +
				"\n\tNome: " + getNome() + 
				"\n\tRG: "+ getRg() + 
				"\n\tCPF: " + getCpf() + 
				"\n\tEndereço: "+ getEndereco()+
				"\n\tTelefone: "+ getTelefone()+
				"\n\tE-mail: " + getEmail()+
				"\n";
	}
	
	//CADASTRAR FUNCIONÁRIO - ANDRÉ 21/05
	public ArrayList<Funcionario> cadastrarFuncionario(Funcionario funcionario){
		this.funcionarios.add(funcionario);
		
		return this.funcionarios;
	}
	
	//REMOVER FUNCIONÁRIO - ANDRESSA 03/06
	public boolean removerFuncionario(Funcionario funcionario) {
		boolean situacao  = false;
		
		for(int i = 0; i < this.funcionarios.size(); i++) {
			
			if(funcionarios.get(i).equals(funcionario)) {
				funcionarios.remove(i);
				situacao = true;
				break;
			}
			
		}
		
		return situacao;
	}
	
}


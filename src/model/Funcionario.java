package model;

public class Funcionario {
	
	private String nome;
	private String rg;
	private String cpf;
	private String endereco;
	private String telefone;
	private String email;
	private String senha;
	
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

	public String toString() {
		return "Nome = " + getNome() + 
				"\nRG = "+ getRg() + 
				"\nCPF = " + getCpf() + 
				"\nEndereço = "+ getEndereco()+
				"\nTelefone = "+ getTelefone()+
				"\nE-mail = " + getEmail();
	}
}


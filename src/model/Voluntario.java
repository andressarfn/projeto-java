package model;

public class Voluntario {
	private String nome;
	private String cpfOrCnpj;
	private String rg;
	private String telefone;
	private String endereco;
	private String email;
	private String senha;
	
	public Voluntario (String nomeC, String cpfOrCnpjC, String rgC, String telefoneC, String enderecoC, String emailC, String senhaC) {
		this.nome = nomeC;
		this.cpfOrCnpj = cpfOrCnpjC;
		this.rg = rgC;
		this.telefone = telefoneC;
		this.endereco = enderecoC;
		this.email = emailC;
		this.senha = senhaC;
	}


	public Voluntario () {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfOrCnpj() {
		return cpfOrCnpj;
	}

	public void setCpfOrCnpj(String cpfOrCnpj) {
		this.cpfOrCnpj = cpfOrCnpj;
	}
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
	
	public String toString () {
		return "Nome = " + getNome() +
				"\nCPF OU CNPJ = " + getCpfOrCnpj() +
				"\nTelefone = " + getTelefone() +
				"\nEndereço = " + getEndereco() +
				"\nEmail = " + getEmail();
	}
}

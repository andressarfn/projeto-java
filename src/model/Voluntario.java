package model;

import java.util.ArrayList;

public class Voluntario {
	private String nome;
	private String cpfOrCnpj;
	private String rg;
	private String telefone;
	private String endereco;
	private String email;
	private String senha;
	private String diaDisponvel;
	private static ArrayList<Voluntario> voluntarios = new ArrayList<Voluntario>();
	
	public Voluntario (String nomeC, String cpfOrCnpjC, String rgC, String telefoneC, String enderecoC, String emailC, String senhaC, String diaDisponivelC) {
		this.nome = nomeC;
		this.cpfOrCnpj = cpfOrCnpjC;
		this.rg = rgC;
		this.telefone = telefoneC;
		this.endereco = enderecoC;
		this.email = emailC;
		this.senha = senhaC;
		this.diaDisponvel = diaDisponivelC;
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
		return this.endereco;
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
	
	public String getDiaDisponivel() {
		return this.diaDisponvel;
	}
	
	public void setDiaDisponivel(String diaDisponivel) {
		this.diaDisponvel = diaDisponivel;
	}
	
	public ArrayList<Voluntario> getVoluntarios(){
		return this.voluntarios;
	}
	
	public void setVoluntarios(ArrayList<Voluntario> voluntario) {
		this.voluntarios = voluntarios;
	}
	
	//AJUSTADO - 18/05
	public String toString () {
		return "\n\t               VOLUNTÁRIO                   " +
				"\n\tNome: " + getNome() +
				"\n\tCPF OU CNPJ: " + getCpfOrCnpj() +
				"\n\tTelefone: " + getTelefone() +
				"\n\tEndereço: " + getEndereco() +
				"\n\tE-mail: " + getEmail()+
				"\n";
	}
	
	//CADASTRAR VOLUNTARIOS - ANDRÉ 22/05
	public ArrayList<Voluntario> cadastrarVoluntario(Voluntario voluntario){
		this.voluntarios.add(voluntario);
		return this.voluntarios;
	}
	
	//REMOVER VOLUNTÁRIO - ANDRÉ 23/05
	public boolean removerVoluntario(Voluntario voluntario) {
		boolean situacao  = false;
		
		for(int i = 0; i < this.voluntarios.size(); i++) {
			
			if(voluntarios.get(i).equals(voluntario)) {
				voluntarios.remove(i);
				situacao = true;
				break;
			}
			
		}
		
		return situacao;
	}
	
	public String pegarEnderecoVoluntario (String enderecoVolu) {
		String enderecoV = null;
		System.out.println("Endereco: Método"+ enderecoVolu);
		for(int i = 0; i < voluntarios.size(); i ++) {
			if(voluntarios.get(i).getEndereco().equals(enderecoVolu)) {
				System.out.println("Endereco: "+ voluntarios.get(i).getEndereco());
				enderecoV = voluntarios.get(i).getEndereco();
			}
		}
		
		return enderecoV;
	}
	
	
}

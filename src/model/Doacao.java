package model;

import java.util.ArrayList;

public class Doacao {
	//ATUALIZADA CLASSE 19/05
	private model.Voluntario voluntario;
	private String tipo;
	private double valor;
	private double kg;
	private double quantidade;
	private boolean situacao = false;
	private String localEntrega;
	private static ArrayList<Doacao> doacoes = new ArrayList<Doacao>();
	
	
	//SE FOR ROUPAS
	public Doacao(model.Voluntario voluntarioC, String tipoC, Double valorC, Double kgC, Double quantidadeC, boolean situacaoC, String localEntregaC) {
		this.voluntario = voluntarioC;
		this.setTipo(tipoC);
		this.valor = valorC;
		this.kg = kgC;
		this.quantidade = quantidadeC;
		this.situacao = situacaoC;
		this.localEntrega = localEntregaC;
	}
	
	public Doacao() {}
	
	public model.Voluntario getVoluntario() {
		return voluntario;
	}
	public void setVoluntario(Voluntario voluntarioLogin) {
		this.voluntario = voluntarioLogin;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Double getValor() {
		return this.valor;
	}
	
	public void setValor(double i) {
		this.valor = i;
	}
	
	public Double getKg() {
		return this.kg;
	}
	public void setKg(Double kg) {
		this.kg = kg;
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade2) {
		this.quantidade = quantidade2;
	}
	
	public boolean getSituacao() {
		return this.situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	public String getLocalEntrega() {
		return this.localEntrega;
	}
	public void setLocalEntrega(String localEntrega) {
		this.localEntrega = localEntrega;
	}
	
	public ArrayList<Doacao> getDoacoes(){
		return this.doacoes;
	}
	public void setDoacoes(ArrayList<Doacao> doacoes) {
		this.doacoes = doacoes;
	}
	
	
	//AJUSTADO - 18/05
	public String toString() {
		return "\n\t               DOAÇÃO                   " +
				"\n\tVoluntário: "+this.getVoluntario().getNome() + 
				"\n\tValor: " + getValor() +
				"\n\tKg: " + getKg() +
				"\n\tTipo: "+ getTipo() + 
				"\n\tQuantidade: "+ getQuantidade() +
				"\n\tLocal de Entrega: " + getLocalEntrega();
	}
	
	//DOAR - ANDRÉ 22/05
	public ArrayList<Doacao> doar(Doacao doacao){
		this.doacoes.add(doacao);
		return this.doacoes;
	}
	
	//REJEITAR DOACÃO - ANDRÉ - 23/05
	public boolean rejeitarDoacao(Doacao doacao) {
		boolean situacao = false;
		
		for(int i = 0; i < doacoes.size(); i++) {
			if(doacoes.get(i).equals(doacao)) {
				doacoes.remove(i);
				situacao = true;
				break;
			}
		}
		
		return situacao;
	}
	
	//Analisar Receita
	public ArrayList<Doacao> receita() {
		ArrayList<Doacao> receitas = new ArrayList<Doacao>();
		
		for (int i = 0; i < doacoes.size(); i++) {
			if(this.doacoes.get(i).getValor() > 0) {
				receitas.add(this.doacoes.get(i));
			}
		}
		
		return receitas;
	}

}

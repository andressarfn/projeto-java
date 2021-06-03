package model;

public class Ong {
	
	private String nome = "Regando Rosas";
	private String endereco = "Rod. BR-230, km. 14, Cabedelo, PB";
	private double receita;
	private double despesa;
	private double caixa;
	private model.Doacao doacao = new model.Doacao();
	private model.Evento evento = new model.Evento();
	
	public Ong(double receita, double despesa, double caixa) {
		
		this.receita = receita;
		this.despesa = despesa;
		this.caixa = caixa;
	}
	
	public Ong() {}

	public String getEndereco() {
		return this.endereco;
	}
	
	public double getReceita() {
		return receita;
	}

	public void setReceita(double receita) {
		this.receita = receita;
	}

	public double getDespesa() {
		return despesa;
	}

	public void setDespesa(double despesa) {
		this.despesa = despesa;
	}

	public double getCaixa() {
		return caixa;
	}

	public void setCaixa(double caixa) {
		this.caixa = caixa;
	}

	public String toString() {
		return "Ong [nome=" + nome + ", endereco=" + endereco + ", receita=" + receita + ", despesa=" + despesa
				+ ", caixa=" + caixa + "]";
	}
	
	//RECEITA
	public double analisarReceita() {
		double receita2 = 0;
		for (int i = 0; i < this.doacao.getDoacoes().size(); i++) {
			if(this.doacao.getDoacoes().get(i).getValor() != 0) {
				receita2 = receita2 + doacao.getDoacoes().get(i).getValor();
			}
			
			this.receita = receita2;
			System.out.println("Receita: "+ receita2);
		}
		
		return this.receita;
		
	}
	
	//DESPESA
	public double analisarDespesa() {
		double despesa2 = 0;
		for( int i = 0; i < evento.getEventos().size(); i++) {
			despesa2 = despesa2 + evento.getEventos().get(i).getCustos();
		}
		
		this.despesa = despesa2;
		
		return this.despesa;
	}
	
	//CAIXA
	public double caixa() {
		double resultado = 0;
		resultado = this.receita - this.despesa;
		this.caixa = resultado;
		return this.caixa;
	}

}

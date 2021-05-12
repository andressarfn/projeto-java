package model;

public class Doacao {
	
	private Voluntario voluntario;
	private String tipo;
	private boolean repetir;
	
	public Doacao (Voluntario voluntarioC, String tipoC, boolean repetirC) {
		this.voluntario = voluntarioC;
		this.tipo = tipoC;
		this.repetir = repetirC;
	}
	public Doacao() {}
	
	public Voluntario getVoluntario() {
		return voluntario;
	}
	public void setVoluntario(Voluntario voluntario) {
		this.voluntario = voluntario;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public boolean isRepetir() {
		return repetir;
	}
	public void setRepetir(boolean repetir) {
		this.repetir = repetir;
	}
	
	public String toString() {
		return "Voluntário = "+this.getVoluntario() + 
				"\nTipo = " + getTipo() + 
				"\nRepetir = " + isRepetir();
	}
	
	
	
	
	

}

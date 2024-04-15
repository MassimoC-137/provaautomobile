package it.prova.provaautomobile.model;

public class Motore {

	private String marcaMotore; 
	private String modelloMotore; 
	private int pistoniMotore; 
	private int cilindrata; 
	
	public Motore() {
		
	}
	
	public Motore(String marcaMotore, String modelloMotore, int pistoniMotore, int cilindrata) {
		this.marcaMotore = marcaMotore; 
		this.modelloMotore = modelloMotore; 
		this.pistoniMotore = pistoniMotore; 
		this.cilindrata = cilindrata; 
	}
	
	public String getModelloMotore() {
		return modelloMotore; 
	}
	
	public void getModelloMotore(String modelloMotore) {
		this.modelloMotore = modelloMotore; 
	}
	
	public String getMarcaMotore() {
		return marcaMotore; 
	}
	
	public void getMarcaMotore(String MarcaMotore) {
		this.marcaMotore = MarcaMotore; 
	}
	
	public int getPistoniMotore() {
		return pistoniMotore; 
	}
	
	public void setPistoniMotore(int pistoniMotore) {
		this.pistoniMotore = pistoniMotore; 
	}
	
	
	public int getCilindrata() {
		return cilindrata; 
	}
	
	public void getCilindrata(int cilindrata) {
		this.cilindrata = cilindrata; 
	}
	
}








package it.prova.provaautomobile.model;

public class Auto {

	private String marca; 
	private String modello; 
	private int chilometraggio; 
	private Motore motore; 
	
	public Auto() {
		
	}
	
	public Auto(String marca, String modello, int chilometraggio, Motore motore) {
		
		this.marca = marca; 
		this.modello = modello; 
		this.chilometraggio = chilometraggio; 
		this.motore = motore; 
	}
	
	public String getMarca() {
		return marca; 
	}
	
	public void setMarca(String marca) {
		this.marca = marca; 
	}
	
	public String getModello() {
		return modello; 
	}
	
	public void setModello(String modello) {
		this.modello = modello; 
	}
	
	public int getChilometraggio() {
		return chilometraggio; 
	}
	
	public void setChilometraggio(int chilometraggio) {
		this.chilometraggio = chilometraggio; 
	}
	
	public Motore getMotore() {
		return motore; 
	}
	
	public void setMotore(Motore motore) {
		this.motore = motore; 
	}
	
//	++++++++++++++++++++++++++++++++++++++++++
	
	public int numeroMacchineConLoStessoMotore(Auto[] garage) {
		
		int quanteMacchine = 0; 
		for (int i = 0; i < garage.length; i++) {
			if (this.motore.getMarcaMotore() == (garage[i].getMotore().getMarcaMotore())) {
				quanteMacchine ++; 
			}
		}
		return quanteMacchine;	
	}
	
//	++++++++++++++++++++++++++++++++++++++++++
	
	public int calcolaCilindrataTotale(Auto[] garage) { 
		
		int cilindrataTotale = 0; 
		for (int i = 0; i < garage.length; i++) {
			cilindrataTotale = cilindrataTotale +garage[i].getMotore().getCilindrata(); 
			}
		return cilindrataTotale; 
		
	}
	
//	++++++++++++++++++++++++++++++++++++++++++
	
	public void stampaAutoConStessoMotore(Auto[] garage) {
		
		for (int i = 0; i < garage.length; i++) {
			if (this.motore.getMarcaMotore().equals(garage[i].getMotore().getMarcaMotore())) {
				System.out.println(garage[i].getMarca() + garage[i].getModello());
			}
			
		}
	}	
	
//	++++++++++++++++++++++++++++++++++++++++++
	
	public boolean contieneMotore(String modelloMotore, Auto[] garage) {
		
		String motoreDaCercare = this.motore.getMarcaMotore(); 
		for (int i = 0; i < garage.length; i++) {
			if (motoreDaCercare == garage[i].getMotore().getMarcaMotore()) {
				return true; 
			}
		}
		return false; 
	}
		
//	++++++++++++++++++++++++++++++++++++++++++
	
	public void stampaAutoConPistoniMassimi(Auto[] garage) {
		
		Auto autoPiuPistosa = garage[0]; 
		for (int i = 1; i < garage.length; i++) {
			if (autoPiuPistosa.getMotore().getPistoniMotore() < garage[i].getMotore().getPistoniMotore()) {
				autoPiuPistosa = garage[i]; 
			}			
		}
		System.out.println(autoPiuPistosa.getMarca() + autoPiuPistosa.getModello() 
		+ " ha questo numero di pistoni : " + autoPiuPistosa.getMotore().getPistoniMotore());
	}
	
//	++++++++++++++++++++++++++++++++++++++++++

}












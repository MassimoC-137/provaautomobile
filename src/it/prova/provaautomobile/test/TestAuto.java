package it.prova.provaautomobile.test;

import it.prova.provaautomobile.model.Auto;
import it.prova.provaautomobile.model.Motore;

public class TestAuto {

	public static void main(String[] args) {

		Auto car1 = new Auto("Ferrari", "Enzo", 50000, new Motore("Ferrari", "V10", 10, 4000)); 
		Auto car2 = new Auto("Lamborghini", "Murcielago", 70000, new Motore("Lamborghini", "V12", 12, 3500));
		Auto car3 = new Auto("Ferrari", "Monza", 7000, new Motore("Ferrari", "V12", 12, 4500));
		Auto car4 = new Auto("Bugatti", "Mistral", 2000, new Motore("Bugatti", "W16", 16, 6000));
		
		 
		Auto miaAuto = new Auto("Maserati", "Quattroporte", 100000, new Motore("Ferrari", "V8", 8, 3000)); 
		
	
		Auto[] garage = {car1, car2, car3, car4}; 
		
		System.out.println(miaAuto.numeroMacchineConLoStessoMotore(garage));
		
		System.out.println(miaAuto.calcolaCilindrataTotale(garage));
		
		miaAuto.stampaAutoConStessoMotore(garage);
		
		System.out.println(miaAuto.contieneMotore("Ferrari", garage));
		
		miaAuto.stampaAutoConPistoniMassimi(garage);
		
		
	}

}

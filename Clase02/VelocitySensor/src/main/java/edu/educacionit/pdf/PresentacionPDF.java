package edu.educacionit.pdf;

import edu.educacionit.interfaces.CalculadorCuotas;

public class PresentacionPDF {

	private CalculadorCuotas calculadorCuotas;

	public PresentacionPDF(CalculadorCuotas calculadorCuotas) {
		this.calculadorCuotas = calculadorCuotas;
	}
	
	public void enviarPdf() {
		System.out.println("Enviando pdf...");
		for(Integer i : calculadorCuotas.calcular()) {
			System.out.println("Cuota: " + i);
		}
	}
	
}

package edu.educacionit.sistemaCuotas;

import java.util.ArrayList;
import java.util.List;

import edu.educacionit.interfaces.CalculadorCuotas;

public class SistemaAleman implements CalculadorCuotas {

	@Override
	public List<Integer> calcular() {
		ArrayList<Integer> enteros = new ArrayList<Integer>();
		enteros.add(2000);
		enteros.add(1800);
		enteros.add(1600);
		enteros.add(1300);
		
		return enteros;
	}
}

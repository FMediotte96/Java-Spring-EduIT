package edu.educacionit.sistemaCuotas;

import java.util.ArrayList;
import java.util.List;

import edu.educacionit.interfaces.CalculadorCuotas;

public class SistemaFrances implements CalculadorCuotas {

	@Override
	public List<Integer> calcular() {
		ArrayList<Integer> enteros = new ArrayList<Integer>();
		enteros.add(2000);
		enteros.add(2000);
		enteros.add(2000);
		enteros.add(2000);
		
		return enteros;
	}

}

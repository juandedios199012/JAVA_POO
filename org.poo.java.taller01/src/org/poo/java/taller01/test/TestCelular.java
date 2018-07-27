package org.poo.java.taller01.test;

import org.poo.java.taller01.java.Celular;

public class TestCelular {

	public static void main(String[] args) {
		
		Celular celular = new Celular();
		
		celular.setMarca("Huawei");
		celular.setModelo("Y6");
		celular.setColor("Negro");
		celular.datos();
		
		System.out.println("\n");
		
		celular.setMarca("Huawei");
		celular.setModelo("P20");
		celular.setColor("Platiado");
		celular.datos();
	}
}

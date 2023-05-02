package gui;

import java.awt.EventQueue;


import bmicalc.BMICalcImpl;

public class Main {
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMICalcImpl modelo = BMICalcImpl.getInstance();
					vista Vista = new vista();
					Vista.frame.setVisible(true);
					controlador controlador = new controlador(modelo, Vista);
					Vista.registrarControlador(controlador);
					Vista.registrarControlador2(controlador);
					Vista.registrarControlador3(controlador);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

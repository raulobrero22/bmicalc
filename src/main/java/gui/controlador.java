package gui;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import bmicalc.BMICalcImpl;

public class controlador implements ActionListener {

	private BMICalcImpl modelo;
	private vista Vista;
	
	public controlador(BMICalcImpl modelo, vista vista) {
		this.modelo = modelo;
		this.Vista = vista;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando = e.getActionCommand();
		if(comando.equalsIgnoreCase("CalcularBMI")){
			//if(e.getSource()==){
			double mass=Vista.getMass();
			double height=Vista.getHeigh();
			try {
				double bmi=modelo.bmi(mass, height);
				Vista.setBMI(Math.round(bmi*100.0)/100.0);
			}catch(Exception q) {
				Vista.errorBMI("introduce valores válidos");
			}
			
			
		}else if(comando.equalsIgnoreCase("CalcularCategoria")) {
			//else if(e.getSource()=="CalcBMI") {
			double bmi=Vista.getbmi();
			try {
				String res=modelo.category(bmi);
				Vista.setCategoria(res);
			}catch(Exception q) {
				Vista.errorCategoria("Introduce un BMI válido");
			}
			
		}else if(comando.equalsIgnoreCase("CalcularObesidadAbdominal")) {
			double ancho=Vista.getAncho();
			char sexo=Vista.getSexo();
			try {
				boolean res=modelo.abdominalObesity(ancho,sexo);
				Vista.setObesidad(res);
			}catch(Exception q) {
				Vista.errorCategoria("Introduce un BMI válido");
			}
			
		}
	}
	

}

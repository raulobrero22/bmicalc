package patron3;

import java.util.HashMap;
import java.util.Map;

import bmicalc.BMICalcImpl;

public class IMCHospitalEspañol implements IMCHospital{
	private bmicalc.BMICalcImpl BMICalcImpl;
	public IMCHospitalEspañol() {
		this.BMICalcImpl=bmicalc.BMICalcImpl.getInstance();
	}

	@Override
	public String imc(double altura, double peso) {
		double a = BMICalcImpl.bmi(peso, altura);
		String b=BMICalcImpl.category(a);
		String c="La persona con altura " +altura+ "metros y "+ peso +" kilos de peso tiene un IMC de "+ b;
		return c;
	}

	@Override
	public boolean tieneObesidadAbdominal(char genero, double circunferencia) {
		return BMICalcImpl.abdominalObesity(circunferencia, genero);
	}



}

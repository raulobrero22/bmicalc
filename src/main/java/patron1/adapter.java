package patron1;

import java.util.HashMap;
import java.util.Map;

public class adapter implements IMCHospital{
	private bmicalc.BMICalcImpl BMICalcImpl;
	
	public adapter() {
		this.BMICalcImpl=bmicalc.BMICalcImpl.getInstance();
	}

	@Override
	public Map<Double, String> imc(double altura, double peso) {
		double a=BMICalcImpl.bmi(peso, altura);
		String b=BMICalcImpl.category(a);
		Map<Double,String> c=new HashMap<Double,String>();
		c.put(a,b);
		return c;
	}

	@Override
	public boolean tieneObesidadAbdominal(char genero, double circunferencia) {
		return BMICalcImpl.abdominalObesity(circunferencia, genero);
	}
	
	

}

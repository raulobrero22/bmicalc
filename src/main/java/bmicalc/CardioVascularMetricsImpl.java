package bmicalc;

public class CardioVascularMetricsImpl implements CardioVascularMetrics {
	private double bmi;

	
private static CardioVascularMetricsImpl instancia;
	
	private CardioVascularMetricsImpl() {
	}
	public static CardioVascularMetricsImpl getInstance() {
		if(instancia==null) {
			instancia=new CardioVascularMetricsImpl();
		}
		return instancia;
	}
	public double bmi(double mass, double height) {
		if(height==0) {
			throw new ArithmeticException("No se puede dividir entre 0");
		}
		if(mass<0) {
			throw new RuntimeException("La masa no puede ser negativa");
		}
		bmi= mass/(height*height);
		return bmi;
	}

	public ObesityCategory category(double bmi) {
		ObesityCategory categoria;
		if(bmi<0) {
			throw new RuntimeException("El bmi no puede ser negativo");
		}
		if(bmi<18.5) {
			categoria=ObesityCategory.OVERWEIGHT;
		}else if (18.5<=bmi && bmi<=24.9){
			categoria=ObesityCategory.NORMAL;
		}else if(25.0<=bmi && bmi<=29.9) {
			categoria=ObesityCategory.OVERWEIGHT;
		}else {
			categoria=ObesityCategory.OBESE;
		}
		return categoria;
	}



}

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

	public String category(double bmi) {
		String categoria;
		if(bmi<0) {
			throw new RuntimeException("El bmi no puede ser negativo");
		}
		if(bmi<18.5) {
			categoria="UNDERWEIGHT";
		}else if (18.5<=bmi && bmi<=24.9){
			categoria="NORMAL";
		}else if(25.0<=bmi && bmi<=29.9) {
			categoria="OVERWEIGHT";
		}else {
			categoria="OBESE";
		}
		return categoria;
	}



}

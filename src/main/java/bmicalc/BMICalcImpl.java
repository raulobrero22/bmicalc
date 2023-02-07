package bmicalc;

public class BMICalcImpl implements BMICalc {

	double bmi;
	String categoria;

	public double bmi(double mass, double height) {
		bmi= mass/(height*height);
		return bmi;
	}

	public String category(double bmi) {
		if(bmi<18.5) {
			categoria="UNDERWEIGHT";
		}else if (18.5<bmi && bmi<24.9){
			categoria="NORMAL";
		}else if(25.0<bmi && bmi<29.9) {
			categoria="OVERWEIGHT";
		}else {
			categoria="OBESE";
		}
		return categoria;
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		boolean t=false;
		if(gender=='M' && waistCircumference>0.9) {
			t=true;
		}else if(gender=='F' && waistCircumference>0.8) {
			t=true;
		}
		return t;
	}

}

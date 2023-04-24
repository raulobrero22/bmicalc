package patron3;

public class IMCHospitalIngles implements IMCHospital{
	private bmicalc.BMICalcImpl BMICalcImpl;
	public IMCHospitalIngles() {
		this.BMICalcImpl=bmicalc.BMICalcImpl.getInstance();
	}

	@Override
	public String imc(double altura, double peso) {
		double peso1=peso/3.28084;
		double altura1=altura/2.20462;
		double a = BMICalcImpl.bmi(peso1, altura1);
		String b=BMICalcImpl.category(a);
		String c="The person with height "+ altura+" pies and "+ peso +" libra of weight has a BMI of "+ b;
		return c;
	}

	@Override
	public boolean tieneObesidadAbdominal(char genero, double circunferencia) {
		return BMICalcImpl.abdominalObesity(circunferencia, genero);
	}
}

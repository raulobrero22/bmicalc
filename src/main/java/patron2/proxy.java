package patron2;

import bmicalc.BMICalc;

public class proxy implements BMICalc{
	private bmicalc.BMICalcImpl BMICalcImpl;
	private IMCStatsImpl stats;
	static int numPac=0;
	
	public proxy() {
		this.BMICalcImpl=bmicalc.BMICalcImpl.getInstance();
		this.stats=IMCStatsImpl.getInstance();
	}

	@Override
	public double bmi(double mass, double height) {
		// TODO Auto-generated method stub
		stats.setAltura(height);
		stats.setpeso(mass);
		numPac++;
		return BMICalcImpl.bmi(mass, height);
	}

	@Override
	public String category(double bmi) {
		stats.setimc(bmi);
		return BMICalcImpl.category(bmi);
	}

	@Override
	public boolean abdominalObesity(double waistCircumference, char gender) {
		return false;
	}
	
	public double getAlturaMedia() {
		return stats.alturaMedia();
	}
	public double getPesoMedio() {
		return stats.pesoMedio();
	}
	public double getIMCMedio() {
		return stats.imcMedio();
	}
	public int getNumPacientes() {
		return numPac;
	}

}

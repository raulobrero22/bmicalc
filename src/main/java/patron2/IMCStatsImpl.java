package patron2;

import java.sql.Array;
import java.util.Arrays;

import bmicalc.BMICalcImpl;

public class IMCStatsImpl implements IMCstats{
	
	private double[] altura=new double[0];
	private double[] peso=new double[0];
	private double[] imc=new double[0];
	private int numPac;
	private static IMCStatsImpl instancia;
	
	private IMCStatsImpl() {
		
	}
	
	public static IMCStatsImpl getInstance() {
		if(instancia==null) {
			instancia=new IMCStatsImpl();
		}
		return instancia;
	}
	
	public void setAltura(double a) {
		altura=Arrays.copyOf(altura, altura.length+1);
		altura[altura.length-1]=a;
	}
	public void setpeso(double a) {
		peso=Arrays.copyOf(peso, peso.length+1);
		peso[peso.length-1]=a;
	}
	public void setimc(double a) {
		imc=Arrays.copyOf(imc, imc.length+1);
		imc[imc.length-1]=a;
	}
	

	@Override
	public double alturaMedia() {
		double res = 0;
		for(int i=0;i<altura.length;i++) {
			res+=altura[i];
		}
		return res/altura.length;
	}

	@Override
	public double pesoMedio() {
		double res = 0;
		for(int i=0;i<peso.length;i++) {
			res+=peso[i];
		}
		return res/peso.length;
	}

	@Override
	public double imcMedio() {
		double res = 0;
		for(int i=0;i<imc.length;i++) {
			res+=imc[i];
		}
		return res/imc.length;
	}

	@Override
	public int numPacientes() {
		return numPac;
	}



	

	

}

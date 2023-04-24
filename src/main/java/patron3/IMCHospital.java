package patron3;



public interface IMCHospital {
	public String imc(double altura, double peso);
	
	public boolean tieneObesidadAbdominal(char genero, double circunferencia);

}

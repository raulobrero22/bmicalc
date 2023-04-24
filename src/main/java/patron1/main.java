package patron1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMCHospital a=new adapter();
		
		a.tieneObesidadAbdominal('M', 0.7);
		System.out.print(""+a.imc(20, 10)+"  "+a.tieneObesidadAbdominal('M', 0.7));

	}

}

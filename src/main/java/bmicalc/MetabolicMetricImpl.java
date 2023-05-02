package bmicalc;

public class MetabolicMetricImpl implements MetabolicMetric{

	@Override
	public boolean abdominalObesity(double waistCircumference, char gender) {
		if(waistCircumference<0) {
			throw new RuntimeException("El waistCircumference no puede ser negativo");
		}
		if(gender!='M' && gender!='F') {
			throw new RuntimeException("Género no reconocido");
		}
		boolean t=false;
		if(gender=='M' && waistCircumference>0.9) {
			t=true;
		}else if(gender=='F' && waistCircumference>0.8) {
			t=true;
		}
		return t;
	}

}

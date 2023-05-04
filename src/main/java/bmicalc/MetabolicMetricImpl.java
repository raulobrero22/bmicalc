package bmicalc;

public class MetabolicMetricImpl implements MetabolicMetric{

	@Override
	public boolean abdominalObesity(double waistCircumference, Gender gender) {
		if(waistCircumference<0) {
			throw new RuntimeException("El waistCircumference no puede ser negativo");
		}
		if(gender!=Gender.MALE && gender!=Gender.FEMALE) {
			throw new RuntimeException("Género no reconocido");
		}
		boolean t=false;
		if(gender==Gender.MALE && waistCircumference>0.9 || gender==Gender.FEMALE && waistCircumference>0.8) {
			t=true;
		}
		
		return t;
	}

}

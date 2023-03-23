package bmicalc.bdd;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;

import bmicalc.BMICalcImpl;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	BMICalcImpl a;
	double bmi;
	double mass;
	double height;
	boolean excepcion;
	@Before
	public void inizialitation() {
		a=null;
	}
	@Given("los valores son válidos")
	public void los_valores_son_válidos() {
	     a = new BMICalcImpl();
	    //throw new io.cucumber.java.PendingException();
	}

@When("introduzo los valores {double} y {double} en la calculadora")
public void introduzo_los_valores_y_en_la_calculadora(double mass, double height) {
    // Write code here that turns the phrase above into concrete actions
	this.mass=mass;
	this.height=height;
	bmi=mass/height*height;
    //throw new io.cucumber.java.PendingException();
}
	@Then("dara el valor del bmi")
	public void dara_el_valor_del_bmi() {
	    // Write code here that turns the phrase above into concrete actions
		Assertions.assertEquals(bmi,mass/height*height);
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("Tengo una calculadora")
	public void tengo_una_calculadora() {
	    // Write code here that turns the phrase above into concrete actions
		a = new BMICalcImpl();
	}
	@Given("la {double} es negativa")
	public void la_es_negativa(double mass) {
	    // Write code here that turns the phrase above into concrete actions

	    Assertions.assertTrue(mass<0);
	}
	@When("introduzo los valores {double} y {double}")
	public void introduzo_los_valores_y(double mass, double height) {
	    // Write code here that turns the phrase above into concrete actions
		try {
			bmi=a.bmi(mass, height);
			excepcion=false;
		}catch(RuntimeException e) {
			excepcion=true;
		}
		
	}
	
	@Then("me volverá un error.")
	public void me_volverá_un_error() {
	    // Write code here that turns the phrase above into concrete actions
		Assertions.assertTrue(excepcion);
	}
	
	@Given("{double} es igual a {double}")
	public void es_igual_a(double height, double int2) {
	    // Write code here that turns the phrase above into concrete actions
		Assertions.assertTrue(height==0);
	}
	@When("introduzco los valores2 y {double}")
	public void introduzco_los_valores2_y(double int1) {
		try {
			bmi=a.bmi(mass, height);
			excepcion=false;
		}catch(Exception e) {
			excepcion=true;
		}
	}
	@Then("Devolvera una excepcion")
	public void devolvera_una_excepcion() {
	    Assertions.assertTrue(excepcion);
	}
	
}

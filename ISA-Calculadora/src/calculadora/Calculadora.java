package calculadora;

import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * Clase Calculadora
 * @author Domingo Martinez
 * @author Giovanni L�pez
 * @author Miguel Setien
 * @author Noelia Alonso
 * @author Pablo garcia 
 * 
 * @version 1.0
 * 
 * PREMISAS
 * 1.	Suma y resta de n�meros reales.
 * 
 **/

public class Calculadora {
	//Variables
	private double a;
	private double b;
	private double resultado;

	/**
     * Constructor 
     **/
	public Calculadora () {	
		this.setA(a);
		this.setB(b);
	}
	
	public double getA() {
		return this.a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return this.b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	public double sumar () {
		this.resultado = this.a + this.b;
		return formatoNumero(resultado);
	}
	
	public double restar () {
		this.resultado = this.a - this.b;
		return formatoNumero(resultado);
	}
	
	private static double formatoNumero(double d) {
        BigDecimal bigDecimal = new BigDecimal(Double.toString(d));
        bigDecimal = bigDecimal.setScale(3, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
}

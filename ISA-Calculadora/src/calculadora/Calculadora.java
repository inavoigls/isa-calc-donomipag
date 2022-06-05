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
	
	public double multiplicar () {
		this.resultado = this.a * this.b;
		return formatoNumero(resultado);
	}
	
	public double dividir () {
		if(this.b==0) {return -999;}
		else {
			this.resultado = this.a / this.b;
			return formatoNumero(resultado);
		}
	}
	
	private double valorAbsoluto(double n) {
	    if (n < 0) {return n * -1;}
	    return n;
	}
	
	public double raizCuadrada() {
	    if(this.a>0) {
	    	double margen = (double) 0.000001;
			double estimacion = (double) 1.0;
	    	while (valorAbsoluto((estimacion * estimacion) - this.a) >= margen) {
	    		double cociente = this.a / estimacion;
	    		double promedio = (double) ((cociente + estimacion) / 2.0);
	    		estimacion = promedio;
	    	}
	    	return (double) formatoNumero(estimacion);
		} else if(this.a==0){return 0;}
		else {return -999;}
	    
	}
	
	public double exponencial() {
			this.a = 2.71828;
			return formatoNumero(elevar());
	}
	
	public double elevar() {
		double num = 2.71828;
		double power = (double) this.b;
		double answer = 1;
			if(power==0){
				return answer;
			}
			else if(power < 0){
				answer=0;
				for(int i = 1; i<= power; i++){
					answer = answer*num;
				}
				return answer;
			}
			else{
				for(int i = 1; i<= power; i++){
					answer = answer*num;
				}
				return answer;
			}
    }
	
	private static double formatoNumero(double d) {
        BigDecimal bigDecimal = new BigDecimal(Double.toString(d));
        bigDecimal = bigDecimal.setScale(3, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
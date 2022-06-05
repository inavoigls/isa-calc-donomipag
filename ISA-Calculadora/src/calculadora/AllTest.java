/**
 * Test pruebas calculadora
 */
package calculadora;

import static org.junit.Assert.*;

/**
 * JUnit - Test-Driven Development
 * 
 * @author Domingo Martinez
 * @author Giovanni López
 * @author Miguel Setien
 * @author Noelia Alonso
 * @author Pablo garcia 
 * 
 * @version 1.0
 * 
 * COMENTARIOS:
 * Controlamos error de calculo con -999 
 * en cada uno de los los métodos.
 * 
 */
public class AllTest {
	//Fase de inicialización
    private Calculadora c = new Calculadora();
    private double a = 0, b = 0;
	
	@org.junit.Test
	public void testSuma() {		
		//SUMA
		a=2;b=3;c.setA(a);c.setB(b);
		assertEquals(5, c.sumar(), 0.00);
		a=2;b=3.5;c.setA(a);c.setB(b);
		assertEquals(5.5, c.sumar(), 0.00);
		a=0;b=-1;c.setA(a);c.setB(b);
		assertEquals(-1, c.sumar(), 0.00);
		a=-1;b=2;c.setA(a);c.setB(b);
		assertEquals(1, c.sumar(), 0.00);
	}
	
	@org.junit.Test
	public void testResta() {		
		//RESTA
        a=2;b=3;c.setA(a);c.setB(b);
		assertEquals(-1, c.restar(), 0.00);
		a=2;b=3.5;c.setA(a);c.setB(b);
		assertEquals(-1.5, c.restar(), 0.00);
		a=0;b=-1;c.setA(a);c.setB(b);
		assertEquals(1, c.restar(), 0.00);
		a=-1;b=2;c.setA(a);c.setB(b);
		assertEquals(-3, c.restar(), 0.00);
	}
	
	@org.junit.Test
	public void testMultiplicacion() {		
		//MULTIPLICACIÓN
        a=2;b=3;c.setA(a);c.setB(b);
		assertEquals(6, c.multiplicar(), 0.00);
		a=2;b=3.5;c.setA(a);c.setB(b);
		assertEquals(7, c.multiplicar(), 0.00);
		a=0;b=-1;c.setA(a);c.setB(b);
		assertEquals(0, c.multiplicar(), 0.00);
		a=-1;b=2;c.setA(a);c.setB(b);
		assertEquals(-2, c.multiplicar(), 0.00);
	}
	
	@org.junit.Test
	public void testDivision() {
		//DIVISION
		a=6;b=3;c.setA(a);c.setB(b);
		assertEquals(2, c.dividir(), 0.00);
		a=3;b=2;c.setA(a);c.setB(b);
		assertEquals(1.5, c.dividir(), 0.00);
		a=0;b=-1;c.setA(a);c.setB(b);
		assertEquals(0, c.dividir(), 0.00);
		a=-1;b=2;c.setA(a);c.setB(b);
		assertEquals(-0.5, c.dividir(), 0.00);
		a=-1;b=1;c.setA(a);c.setB(b);
		assertEquals(-1, c.dividir(), 0.00);
	}
	
	@org.junit.Test
	public void testRaizCuadrada() {
		//RAIZ CUADRADA
		a=2;c.setA(a);
		assertEquals(1.414, c.raizCuadrada(), 0.00);
		a=9;c.setA(a);
		assertEquals(3, c.raizCuadrada(), 0.00);
		a=0;c.setA(a);
		assertEquals(0, c.raizCuadrada(), 0.00);
		a=-1;c.setA(a);
		assertEquals(-999, c.raizCuadrada(), 0.00);
	}	
	
	@org.junit.Test
	public void testExponencial() {
		//EXPONENCIAL
		b=3;c.setB(b);
		assertEquals(20.085, c.exponencial(), 0.00);
		b=0;c.setB(b);
		assertEquals(1, c.exponencial(), 0.00);
		b=-3;c.setB(b);
		assertEquals(0.0, c.exponencial(), 0.00);
	}

}

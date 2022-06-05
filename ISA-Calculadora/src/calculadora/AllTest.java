/**
 * 
 */
package calculadora;

import static org.junit.Assert.*;

/**
 * JUnit - Test-Driven Development
 * 
 * @author Domingo Martinez
 * @author Giovanni L�pez
 * @author Miguel Setien
 * @author Noelia Alonso
 * @author Pablo garcia 
 * 
 * @version 1.0
 * 
 * COMENTARIOS:
 * Controlamos error de calculo con -999 
 * en cada uno de los los m�todos.
 * 
 */
public class AllTest {
	//Fase de inicializaci�n
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

}
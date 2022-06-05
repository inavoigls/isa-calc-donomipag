package calculadora;

/**
 * Test Clase Calculadora 
 * @author Domingo Martinez
 * @author Giovanni López
 * @author Miguel Setien
 * @author Noelia Alonso
 * @author Pablo garcia 
 * 
 * @version 1.0
 * @version 1.0
 **/
public class PruebaClaseCalculadora {

	public static void main(String[] args) {
		try {
			Calculadora c = new Calculadora();
			double a = 2;
			double b = 3;
			c.setA(a);
			c.setB(b);
			System.out.println("NUMERO A:" + a);
			System.out.println("NUMERO B:" + b);
			System.out.println("SUMA:" + c.sumar());
			System.out.println("RESTA:" + c.restar());
			System.out.println("MULTIPLICAR:" + c.multiplicar());
			System.out.println("DIVIDIR:" + c.dividir());
			System.out.println("RAIZ:" + c.raizCuadrada());
			System.out.println("EXP:" + c.exponencial());
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}

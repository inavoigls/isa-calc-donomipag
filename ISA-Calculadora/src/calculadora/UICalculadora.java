package calculadora;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * VentanaPricipal Calculadora
 * representa la interfaz gráfica principial de la Aplicación
 * 
 * @author Domingo Martinez
 * @author Giovanni López
 * @author Miguel Setien
 * @author Noelia Alonso
 * @author Pablo garcia 
 * 
 * @version 1.0
 * 
 **/
public class UICalculadora extends JFrame implements ActionListener, DocumentListener {
	
	//Inicializamos componentes
	private static final long serialVersionUID = 1L;
	private JTextField calculo;
	private JButton botonSumar;
	private JButton botonRestar;
	private JButton botonMultiplicar;
	private JButton botonDividir;
	private JButton botonRaiz;
	private JButton botonExp;
	
	private JButton cero;
	private JButton uno;
	private JButton dos;
	private JButton tres;
	private JButton cuatro;
	private JButton cinco;
	private JButton seis;
	private JButton siete;
	private JButton ocho;
	private JButton nueve;
	private JButton botonIgual;
	private JButton botonClear;
	private JButton botonPunto;
    
	Font fuente_resultado = new Font("Arial", Font.PLAIN, 40);
	Font fuente_botones = new Font("Arial", Font.BOLD, 15);
	
	double resultado = 0;
	String operacion;
	
	Calculadora c = new Calculadora();
	
    /**
     * Constructor 
     **/
	public UICalculadora () {	
		super("Calculadora");
		
		this.operacion="";
		
		// inicializamos los componentes
		this.initComponentes();
	}
	
	/**
	 * Metodo para inicializar componentes
	 **/
	private void initComponentes() {
		
		 // Creación de controles gráficos	
		 calculo = new JTextField(10);
		 calculo.setEditable(false);
		 calculo.setText("");
		 calculo.addKeyListener(new KeyAdapter() {
		 	@Override
		 	public void keyPressed(KeyEvent e) {
		 	}
		 });
		 calculo.setFont(fuente_resultado);
		 
		 botonSumar= new JButton("+");
		 botonSumar.setFont(fuente_botones);
		 botonSumar.setMargin(new Insets(0, 0, 0, 0));
		 botonRestar= new JButton("-");
		 botonRestar.setFont(fuente_botones);
		 botonRestar.setMargin(new Insets(0, 0, 0, 0));
		 botonMultiplicar= new JButton("*");
		 botonMultiplicar.setFont(fuente_botones);
		 botonMultiplicar.setMargin(new Insets(0, 0, 0, 0));
		 botonDividir= new JButton("/");
		 botonDividir.setFont(fuente_botones);
		 botonDividir.setMargin(new Insets(0, 0, 0, 0));
		 botonRaiz= new JButton("SQRT");
		 botonRaiz.setFont(fuente_botones);
		 botonRaiz.setMargin(new Insets(0, 0, 0, 0));
		 botonExp= new JButton("EXP");
		 botonExp.setFont(fuente_botones);
		 botonExp.setMargin(new Insets(0, 0, 0, 0));
		
		 cero = new JButton("0");
		 cero.setMargin(new Insets(0, 0, 0, 0));
		 uno = new JButton("1");
		 uno.setMargin(new Insets(0, 0, 0, 0));
		 dos = new JButton("2");
		 dos.setMargin(new Insets(0, 0, 0, 0));
		 tres = new JButton("3");
		 tres.setMargin(new Insets(0, 0, 0, 0));
		 cuatro = new JButton("4");
		 cuatro.setMargin(new Insets(0, 0, 0, 0));
		 cinco = new JButton("5");
		 cinco.setMargin(new Insets(0, 0, 0, 0));
		 seis = new JButton("6");
		 seis.setMargin(new Insets(0, 0, 0, 0));
		 siete = new JButton("7");
		 siete.setMargin(new Insets(0, 0, 0, 0));
		 ocho = new JButton("8");
		 ocho.setMargin(new Insets(0, 0, 0, 0));
		 nueve = new JButton("9");
		 nueve.setMargin(new Insets(0, 0, 0, 0));
		 
		 botonIgual = new JButton ("=");
		 botonIgual.setFont(fuente_botones);
		 botonClear = new JButton ("C");
		 botonClear.setFont(fuente_botones);
		 botonPunto = new JButton(".");
		 botonPunto.setFont(fuente_botones);
		 
		// Dimensionamos la ventana principal
		this.setSize(330, 460);
		
		//Definimos las posiciones de los elementos del panel
		calculo.setBounds(5, 10, 300, 50);
		botonClear.setBounds(5, 65, 75, 50);
		botonPunto.setBounds(80, 65, 75, 50);
		botonIgual.setBounds(155, 65, 149 , 50);
		botonSumar.setBounds(237, 121, 68, 76);
		botonRestar.setBounds(237, 199, 68, 71);
		botonMultiplicar.setBounds(237, 272, 68, 71);
		botonDividir.setBounds(237, 346, 68, 72);
		botonRaiz.setBounds(5, 346, 75, 72);
		botonExp.setBounds(155, 346, 81, 72);
		
		uno.setBounds(5, 121, 75, 76);
		dos.setBounds(80, 121, 75, 76);
		tres.setBounds(155, 121, 81, 76);
		
		cuatro.setBounds(5, 199, 75, 71);
		cinco.setBounds(80, 199, 75, 71);
		seis.setBounds(155, 199, 81, 71);
		
		siete.setBounds(5, 272, 75, 71);
		ocho.setBounds(80, 272, 75, 71);
		nueve.setBounds(155, 272, 81, 71);
		cero.setBounds(80, 346, 75, 72);
		
		
		
		//Añadimos los componentes
		this.getContentPane().setLayout(null);
		this.getContentPane().add(calculo);
		this.getContentPane().add(botonSumar);
		this.getContentPane().add(botonRestar);
		this.getContentPane().add(botonMultiplicar);
		this.getContentPane().add(botonDividir);
		this.getContentPane().add(botonRaiz);
		this.getContentPane().add(botonExp);
				
		this.getContentPane().add(uno);
		this.getContentPane().add(dos);
		this.getContentPane().add(tres);
		this.getContentPane().add(cuatro);
		this.getContentPane().add(cinco);
		this.getContentPane().add(seis);
		this.getContentPane().add(siete);
		this.getContentPane().add(ocho);
		this.getContentPane().add(nueve);
		this.getContentPane().add(cero);
		
		this.getContentPane().add(botonIgual);
		this.getContentPane().add(botonClear);
		this.getContentPane().add(botonPunto);
		
		getContentPane().add(botonPunto);
		
		// Añadimos los manejadores de eventos a los controles. El manejador es la pripia ventana
		calculo.addActionListener(this);
		botonSumar.addActionListener(this);
		botonRestar.addActionListener(this);
		botonMultiplicar.addActionListener(this);
		botonDividir.addActionListener(this);
		botonRaiz.addActionListener(this);
		botonExp.addActionListener(this);
		uno.addActionListener(this);
		dos.addActionListener(this);
		tres.addActionListener(this);
		cuatro.addActionListener(this);
		cinco.addActionListener(this);
		seis.addActionListener(this);
		siete.addActionListener(this);
		ocho.addActionListener(this);
		nueve.addActionListener(this);
		cero.addActionListener(this);
		botonIgual.addActionListener(this);
		botonClear.addActionListener(this);
		botonPunto.addActionListener(this);
		
		//Habilitamos la visualización del jframe
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// La propia ventana es el manejador de los eventos que se generan en sus controles
		Object o= e.getSource();
		if(o.equals(calculo)){
			
		}
		if(o.equals(uno)){calculo.setText(calculo.getText() + "1");}
		if(o.equals(dos)){calculo.setText(calculo.getText() + "2");}
		if(o.equals(tres)){calculo.setText(calculo.getText() + "3");}
		if(o.equals(cuatro)){calculo.setText(calculo.getText() + "4");}
		if(o.equals(cinco)){calculo.setText(calculo.getText() + "5");}
		if(o.equals(seis)){calculo.setText(calculo.getText() + "6");}
		if(o.equals(siete)){calculo.setText(calculo.getText() + "7");}
		if(o.equals(ocho)){calculo.setText(calculo.getText() + "8");}
		if(o.equals(nueve)){calculo.setText(calculo.getText() + "9");}
		if(o.equals(cero)){calculo.setText(calculo.getText() + "0");}
		if(o.equals(botonSumar)){if(calculo.getText() !=""){this.c.setA(Double.parseDouble(calculo.getText()));this.operacion="Sumar";calculo.setText("");}}
		if(o.equals(botonRestar)){if(calculo.getText() == null || calculo.getText() !=""){this.c.setA(Double.parseDouble(calculo.getText()));this.operacion="Restar";calculo.setText("");}else{calculo.setText("-");System.out.println("v.calculo: "+calculo.getText());}}
		if(o.equals(botonMultiplicar)){if(calculo.getText()!=""){this.c.setA(Double.parseDouble(calculo.getText()));this.operacion="Multiplicar";calculo.setText("");}}
		if(o.equals(botonDividir)){if(calculo.getText() !=""){this.c.setA(Double.parseDouble(calculo.getText()));this.operacion="Dividir";calculo.setText("");}}
		if(o.equals(botonRaiz)){
			this.operacion="RaizCuadrada";
			calculo.setText("");
		}
		if(o.equals(botonExp)){
				//this.c.setB(Double.parseDouble(calculo.getText()));
				this.operacion="Exponencial";
				calculo.setText("");
		}
		if(o.equals(botonIgual)){
			if(calculo.getText()!="") {
				this.c.setB(Double.parseDouble(calculo.getText()));
				if(this.operacion!="") {
					switch(this.operacion) {
						case "Sumar":
							resultado = c.sumar();
							break;
						case "Restar":
							resultado = c.restar();
							break;
						case "Multiplicar":
							resultado = c.multiplicar();
							break;
						case "Dividir":
							resultado = c.dividir();
							break;
						case "RaizCuadrada":
							this.c.setA(Double.parseDouble(calculo.getText()));
							this.c.setB(0);
							resultado = c.raizCuadrada();
							break;
						case "Exponencial":
							this.c.setB(Double.parseDouble(calculo.getText()));
							resultado = c.exponencial();
							break;
						default:
							break;
					}
					String rs = ""+resultado;
					System.out.println("Resultado [" + this.operacion + "] " + resultado);
					if((int)resultado==-999){
						rs="ERROR";
						calculo.setText(rs);
						this.c.setA(0);
						this.c.setB(0);
						this.operacion="";
					}
					else {
						calculo.setText(rs);
						this.c.setA(Double.parseDouble(calculo.getText()));
						this.operacion="";
					}
				}
			}
			this.c.setB(0);
		} 
		if(o.equals(botonClear)){
			this.operacion="";
			this.calculo.setText("");
		}
		if(o.equals(botonPunto)){
			this.calculo.setText(this.calculo.getText()+".");
		}
		
		//Mostramos Action por consola
		System.out.println(e.getActionCommand().toString());
	}
	
	/**
	 * Método formato salida
	 * @param double num
	 **/
	private String format(double num) {
		DecimalFormat formato = new DecimalFormat("0");
		formato.setMinimumFractionDigits(3);
		formato.setMaximumFractionDigits(3);
		String str_double = ""+formato.format(num);
		return str_double;
	}
	
	/**
	 * Método reescritura insertUpdate
	 **/	
	@Override
	public void insertUpdate(DocumentEvent e) {
		System.out.println("registro insertado ");	
	}

	/**
	 * Método reescritura removeUpdate
	 **/
	@Override
	public void removeUpdate(DocumentEvent e) {
		System.out.println("registro borrado ");
	}
	
	/**
	 * Método reescritura changedUpdate
	 **/
	@Override
	public void changedUpdate(DocumentEvent e) {
		System.out.println("registro actualizado ");	
	}
	
	/**
	 * Main - Inicializa VentanaPrincipal(JFrame)
	 * @param Array<String> args
	 **/
	public static void main(String[] args) {
		try {
			UICalculadora v= new UICalculadora();
			v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

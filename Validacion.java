//Valida los corchetes y parantesis de un expresion matemetica
import javax.swing.*;
import java.awt.event.*;
class Pila{
	class Nodo{
		char caracter;
		Nodo sig;
	}
	private Nodo raiz;
	public Pila(){
		raiz = null;
	}
	public void insertar(char x){
		Nodo nuevo;
		nuevo = new Nodo();
		nuevo.caracter = x; 
		if(raiz == null){
			nuevo.sig = null;
			raiz = nuevo;
		}
		else{
			nuevo.sig = raiz;
			raiz = nuevo;
		}			
	}
	public char eliminar(){
		if(raiz != null){
			char info = raiz.caracter;
			raiz = raiz.sig;
			return info;
		}
		else{
			return Character.MAX_VALUE;
		}
	}
	public boolean vacia(){
		if(raiz == null)
			return true;
		else
			return false;
	}
}



public class Validacion extends JFrame implements ActionListener{
	private JTextField formula;
	private JButton boton1;
	public Validacion (){
		setLayout(null);
		formula = new JTextField();
		formula.setBounds(10,10,180,30);
		add(formula);
		
		boton1 = new JButton("Validar");
		boton1.setBounds(10,50,130,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			if(balanceada() == true)
				setTitle("esta balanceada");
			else
				setTitle("no esta balanceada");
		}
	}
	public boolean balanceada(){
		Pila pila1 = new Pila();
		String cadena = formula.getText();
		for(int i = 0; i < cadena.length(); i++){
			if(cadena.charAt(i) == '(' || cadena.charAt(i) == '[' || cadena.charAt(i) == '{'){
				pila1.insertar(cadena.charAt(i));
			}
			else {
    	    	if (cadena.charAt(i)==')') {
    	    	    if (pila1.eliminar()!='(') {
    	    	        return false;
    	    	    }
    	     	} else {
    	    	    if (cadena.charAt(i)==']') {
    	    	        if (pila1.eliminar()!='[') {
    	    	            return false;
    	    	        }
    	    	    } else {
    	    	        if (cadena.charAt(i)=='}') {
    	    	            if (pila1.eliminar()!='{') {
    	    	                return false;
    	    	            }
    	    	        }
    	    	    }
    	        }
		}}
		if(pila1.vacia() == true)
			return true;
		else
			return false;
	}
	public static void main (String [] args){
		Validacion prueba = new Validacion();
		prueba.setBounds(0,0,300,200);
		prueba.setTitle("Valida (),[],{}");
		prueba.setVisible(true);
		prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
		
	}
}
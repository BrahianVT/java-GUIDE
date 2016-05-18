//Confeccionar un programa que muestre 3 objetos de la clase JCheckBox con etiquetas de tres idiomas. Cuando se lo selecciona 
//mostrar en el título del JFrame todos los JCheckBox seleccionados hasta el momento.
import javax.swing.*;
import javax.swing.event.*;

public class Checkbox1 extends JFrame implements ChangeListener{
	private JCheckBox checkbox , checkbox2 , checkbox3;
	public Checkbox1(){
		setLayout(null);
		checkbox = new JCheckBox("Ingles");
		checkbox.setBounds(10,10,150,25);
		add(checkbox);
		checkbox.addChangeListener(this);
		checkbox2 = new JCheckBox("Espaniol");
		checkbox2.setBounds(10,45,150,25);
		add(checkbox2);
		checkbox2.addChangeListener(this);
		checkbox3 = new JCheckBox("Frances");
		checkbox3.setBounds(10,75,150,25);
		add(checkbox3);
		checkbox3.addChangeListener(this);
	}
	public void stateChanged(ChangeEvent e){
		String cad = " ";
		if(checkbox.isSelected() == true){
			cad = cad + "Ingles ";
		}
		if(checkbox2.isSelected() == true){
			cad = cad + "Espaniol ";
		}
		if(checkbox3.isSelected() == true){
			cad = cad + "Frances ";
		}
		setTitle(cad);
	}
	public static void main(String[] args){
		Checkbox1 prueba = new Checkbox1();
		prueba.setBounds(0,0,300,200);
		prueba.setTitle("Check box");
		prueba.setVisible(true);
		prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
	}
} 
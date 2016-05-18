//Disponer tres objetos de la clase JCheckBox con nombres de navegadores web. Cuando se presione un botón mostrar en el título del 
//JFrame los programas seleccionados.
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Checkbox_web extends JFrame implements  ActionListener{
	private JButton boton1;
	private JCheckBox checkbox1, checkbox2, checkbox3;
	public Checkbox_web(){
		setLayout(null);

		checkbox1 = new JCheckBox("Google Chrome");
		checkbox1.setBounds(10,10,180,25);
		add(checkbox1);
		checkbox2 = new JCheckBox("I.Explorer");
		checkbox2.setBounds(10,45,180,25);
		add(checkbox2);
		checkbox3 = new JCheckBox("Opera");
		checkbox3.setBounds(10,75,180,25);
		add(checkbox3);
		
		boton1 = new JButton("Elegir");
		boton1.setBounds(200,45,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
		String cad = "";
		if(checkbox1.isSelected() == true){
			cad = cad + "Google Chrome ";
		}
		if(checkbox2.isSelected() == true){
			cad = cad + "I. Explorer ";
		}
		if(checkbox3.isSelected() == true){
			cad = cad + "Opera ";
		}
		setTitle(cad);
		}
	}
		
	public static void main(String[] args){
		Checkbox_web prueba = new Checkbox_web();
		prueba.setBounds(0,0,400,300);
		prueba.setTitle("Check box elige nav");
		prueba.setVisible(true);
		prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
	}
} 
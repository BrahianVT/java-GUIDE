//Confeccionar un programa que muestre 3 objetos de la clase JRadioButton que permitan configurar el ancho y alto del JFrame.
import javax.swing.*;
import javax.swing.event.*;

public class Radiobuton extends JFrame implements  ChangeListener{
	private JRadioButton rboton1, rboton2, rboton3;
	private ButtonGroup bg;
	public Radiobuton(){
		setLayout(null);
		bg = new ButtonGroup();
		rboton1 = new JRadioButton("640*480");
		rboton1.setBounds(10,10,180,25);
		add(rboton1);
		rboton1.addChangeListener(this);
		bg.add(rboton1);
		rboton2 = new JRadioButton("800*600");
		rboton2.setBounds(10,45,180,25);
		add(rboton2);
		bg.add(rboton2);
		rboton2.addChangeListener(this);
		rboton3 = new JRadioButton("1024*768");
		rboton3.setBounds(10,75,180,25);
		add(rboton3);
		rboton3.addChangeListener(this);
		bg.add(rboton3);
	}
	
	public void stateChanged(ChangeEvent e){
		
		if(rboton1.isSelected() == true){
			setSize(640,480);
		}
		if(rboton2.isSelected() == true){
			setSize(800,6000);
		}
		if(rboton3.isSelected() == true){
			setSize(1024,768);
		}
	}
		
	public static void main(String[] args){
		Radiobuton prueba = new Radiobuton();
		prueba.setBounds(0,0,400,300);
		prueba.setTitle("Radio button");
		prueba.setVisible(true);
		prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
	}
} 
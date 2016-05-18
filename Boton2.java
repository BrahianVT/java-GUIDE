import javax.swing.*;
import java.awt.event.*;
public class Boton2 extends JFrame implements ActionListener{
	JButton boton1 , boton2 , boton3;
	public Boton2(){
		setLayout(null);
		boton1 = new JButton("1");
		boton1.setBounds(10,100,135,30);
		add(boton1);
		boton1.addActionListener(this);
		
		boton2 = new JButton("2");
		boton2.setBounds(150,100,135,30);
		add(boton2);
		boton2.addActionListener(this);
		
		boton3 = new JButton("3");
		boton3.setBounds(290,100,135,30);
		add(boton3);
		boton3.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1)
			setTitle("boton 1");
		if(e.getSource() == boton2)
		    setTitle("boton 2");
		if(e.getSource() == boton3)
			setTitle("boton 3");
	}
	public static void main(String[] args){
		Boton2 prueba = new Boton2();
		prueba.setBounds(0,0,450,350);
		prueba.setVisible(true);
		prueba.setTitle("Botones");
		prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
	}
}
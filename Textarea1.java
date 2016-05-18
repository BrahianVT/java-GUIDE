// programa que permita ingresar en un control de tipo JTextArea una carta. 
//Luego al presionar un botón mostrar un mensaje si la carta contiene el String "mexico".
import javax.swing.*;
import java.awt.event.*;
public class Textarea1 extends JFrame implements ActionListener{
	private JTextArea textarea;
	private JScrollPane scrollpane;
	private JButton boton1;
	public Textarea1(){
		setLayout(null);
		textarea = new JTextArea();
		scrollpane = new JScrollPane(textarea);
		scrollpane.setBounds(10,10,300,400);
		add(scrollpane);
		
		boton1 = new JButton("Analizar");
		boton1.setBounds(10,410,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			String aux = textarea.getText();
			if(aux.indexOf("mexico") != -1)
				setTitle("Esta mexico");
			else
			setTitle("No esta mexico");
		}
		
	}
	public static void main (String[] args){
		Textarea1 prueba = new Textarea1();
		prueba.setBounds(0,0,400,500);
		prueba.setTitle("text area 2");
		prueba.setVisible(true);
		prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
	}
}
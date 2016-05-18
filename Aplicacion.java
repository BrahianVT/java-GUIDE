//programa que permita ingresar el nombre de usuario y cuando se presione un botón mostrar el valor ingresado en la barra de títulos del JFrame
import javax.swing.*;
import java.awt.event.*;
public class Aplicacion extends JFrame implements ActionListener{
	private JLabel label1;
	private JButton boton1;
	private JTextField textfield1;
	public Aplicacion(){
		setLayout(null);
		label1 = new JLabel("Ingrese usuario");
		label1.setBounds(10,10,150,30);
		add(label1);
		
		textfield1 = new JTextField();
		textfield1.setBounds(165,10,150,30);
		add(textfield1);
		
		boton1 = new JButton("Aceptat");
		boton1.setBounds(10,50,150,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			String cadena = textfield1.getText();
				setTitle(cadena);
		}
	}
	public static void main (String[] args){
		Aplicacion app = new Aplicacion();
		app.setBounds(0,0,350,400);
		app.setVisible(true);
		app.setTitle("textfield");
		app.setDefaultCloseOperation(app.EXIT_ON_CLOSE);
	}
}
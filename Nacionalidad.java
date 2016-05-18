//Solicitar el ingreso del nombre de una persona y seleccionar de un control JComboBox un país. 
//Al presionar un botón mostrar en la barra del título del JFrame el nombre ingresado y el país seleccionado.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Nacionalidad extends JFrame implements ActionListener{
	private JLabel label1;
	private JButton boton1;
	private JComboBox combo1;
	private JTextField nombre;
	public Nacionalidad(){
		setLayout(null);
		label1 = new JLabel("Ingrese nombre:");
		label1.setBounds(10,10,150,25);
		add(label1);
		
		nombre = new JTextField();
		nombre.setBounds(170,10,150,25);
		add(nombre);
		
		combo1 = new JComboBox();
		combo1.setBounds(330,10,80,25);
		combo1.addItem("Alemania");
		combo1.addItem("Burundi");
		combo1.addItem("España");
		combo1.addItem("Italia");
		combo1.addItem("Mexico");
		combo1.addItem("Paraguay");
		combo1.addItem("Yugoslabia");
		combo1.addItem("Zambia");
		 add(combo1);
		
		boton1 = new JButton("Ejecutar");
		boton1.setBounds(10,100,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			String pais = (String)combo1.getSelectedItem();
			String nom = nombre.getText();
			String aux2 = " es de ";
			String tol = nom + aux2 + pais;
			setTitle(tol);
		}
	}
	public static void main(String[] args) {
        Nacionalidad formulario1=new Nacionalidad();
        formulario1.setBounds(0,0,450,300);
        formulario1.setVisible(true);
		formulario1.setTitle("Colores");
		formulario1.setDefaultCloseOperation(formulario1.EXIT_ON_CLOSE);
    }   
}
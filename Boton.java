import javax.swing.*;
import java.awt.event.*;
public class Boton extends JFrame implements ActionListener{
	JButton boton1;
	public Boton(){
		setLayout(null);
		boton1 = new JButton("Cerrar aplicacion");
		boton1.setBounds(280,250,135,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1)
			System.exit(0);
	}
	public static void main(String[] args){
		Boton prueba = new Boton();
		prueba.setBounds(0,0,450,350);
		prueba.setVisible(true);
		prueba.setTitle("Boton");
		prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
	}
}
//acceso grafico java
import javax.swing.*;
import java.awt.event.*;
public class Acceso extends JFrame implements ActionListener{
	private JLabel label1, label2;
	private JButton boton1;
	private JTextField textfield;
	private JPasswordField password;
	
	public Acceso(){
		setLayout(null);
		label1 = new JLabel("Ingrese usuario");
		label1.setBounds(10,10,150,25);
		add(label1);
		label2 = new JLabel("Ingrese contraseña");
		label2.setBounds(10,40,130,25);
		add(label2);
		
		textfield = new JTextField();
		textfield.setBounds(165,10,150,25);
		add(textfield);
		
		password = new JPasswordField();
		password.setBounds(165,40,150,25);
		add(password);
		
		boton1 = new JButton("Validar");
		boton1.setBounds(10,80,130,23);
		add(boton1);
		boton1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1){
			String user = textfield.getText();
			String contra = password.getText();
			String aux = "juan",aux2 = "abc123";
			if( user.equals(aux) == true){
				if(contra.equals(aux2) == true)
				setTitle("Correcto");
				}
		else
			setTitle("Incorrecto");
		}
	}
	
	public static void main (String[] args){
		Acceso prueba = new Acceso();
		prueba.setBounds(0,0,350,200);
		prueba.setVisible(true);
		prueba.setTitle("Acceso");
		prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
	}
}
//Disponer un control JLabel que muestre el siguiente mensaje: "Esta de acuerdo con las normas del servicio?
// luego un JCheckBox y finalmente un objeto de tipo JButton desactivo. Cuando se tilde el JCheckBox debemos activar el botón.
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Checkbox_val extends JFrame implements ChangeListener, ActionListener{
	private JLabel label1;
	private JButton boton1;
	private JCheckBox checkbox1;
	public Checkbox_val(){
		setLayout(null);
		label1 = new JLabel("Esta deacuerdo con las normas del servicio?");
		label1.setBounds(10,10,300,30);
		add(label1);
		
		checkbox1 = new JCheckBox("Acepto");
		checkbox1.setBounds(10,50,150,25);
		add(checkbox1);
		checkbox1.addChangeListener(this);
		
		boton1 = new JButton("Finalizar");
		boton1.setBounds(10,85,150,30);
		add(boton1);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
	}
	public void stateChanged(ChangeEvent e){
		boton1.setEnabled(false);
		if(checkbox1.isSelected() == true){
			boton1.setEnabled(true);
		}
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1)
			System.exit(0);
	}
		
	
	public static void main(String[] args){
		Checkbox_val prueba = new Checkbox_val();
		prueba.setBounds(0,0,300,200);
		prueba.setTitle("Check box activa boton");
		prueba.setVisible(true);
		prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
	}
} 
import javax.swing.*;
public class Ventana extends JFrame{
	public Ventana(){
		setLayout(null);
	}

public static void main(String[] args) {
	Ventana formulario1 = new Ventana();
	formulario1.setBounds(10,10,1024,800);
	formulario1.setVisible(true);
	formulario1.setResizable(false);
	
	}
}
// Disponer dos controles de tipo JTextArea, luego al
// presionar un botón verificar si tienen exactamente el mismo contenido.
import javax.swing.*;
import java.awt.event.*;
public class Textarea2 extends JFrame implements ActionListener{
	private JTextArea textarea ,textarea2;
	private JScrollPane scrollpane, scrollpane2;
	private JButton boton1;
	public Textarea2(){
		setLayout(null);
		textarea = new JTextArea();
		scrollpane = new JScrollPane(textarea);
		scrollpane.setBounds(10,10,300,200);
		add(scrollpane);
		textarea2 = new JTextArea();
		scrollpane2 = new JScrollPane(textarea2);
		scrollpane2.setBounds(10,250,300,200);
		add(scrollpane2);
		
		boton1 = new JButton("Analizar");
		boton1.setBounds(10,460,100,20);
		add(boton1);
		boton1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			String cad1 = textarea.getText();
			String cad2 = textarea2.getText();
			if(cad1.equals(cad2))
				setTitle("Tienen lo mismo");
			else
			setTitle("No tiene lo mismo");
		}
		
	}
	public static void main (String[] args){
		Textarea2 prueba = new Textarea2();
		prueba.setBounds(0,0,400,530);
		prueba.setTitle("text area 2");
		prueba.setVisible(true);
		prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
	}
}
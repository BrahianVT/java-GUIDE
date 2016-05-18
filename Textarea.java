//acceso grafico java text area
import javax.swing.*;

class Textarea extends JFrame{
	private JTextArea textarea1;
	private JTextField textfield;
	private JScrollPane scrollpane;
	Textarea(){
		setLayout(null);
		textfield = new JTextField();
		textfield.setBounds(10,10,200,30);
		add(textfield);
		
		textarea1 = new JTextArea();
		scrollpane = new JScrollPane(textarea1);
		scrollpane.setBounds(10,50,570,265);
		add(scrollpane);
	}
	public static void main(String[] args){
		Textarea prueba = new Textarea();
		prueba.setBounds(0,0,610,370);
		prueba.setVisible(true);
		prueba.setTitle("Text area");
		prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
	}
}
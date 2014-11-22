import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Form extends JFrame{
	
	private JPanel panel;
	private JTextField txtart,txtpric,txt3;
	private JLabel lblresultado,lblinsertcode;
	private JButton btnConsulta,btnInsert;
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					Form frame = new Form();
					frame.setVisible(true);
					
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		
	}
	
}

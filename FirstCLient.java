import java.io.BufferedReader;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstCLient {
	
	BufferedReader in;
	PrintWriter out;
	
	JFrame frame = new JFrame("Chatter");
    JTextField textField = new JTextField(40);
    JTextArea messageArea = new JTextArea(8, 40);
    
    public FirstCLient()
    {
    	textField.setEditable(false);
    	messageArea.setEditable(false);
    	frame.getContentPane().add(textField, "North");
    	frame.getContentPane().add(new JScrollPane(messageArea), "Center");
    	frame.setSize(360, 480);
    	
    	textField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				out.println(textField.getText());
				textField.setText("");
				
			}
		});
    }
	
	public static void main(String[] argv)
	{
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

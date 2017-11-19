/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textfieldtests;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Boba
 */
public class MyTextField  {
    private JFrame frame;
    
    private JTextField textField;
    private JTextArea textArea;
    
    public MyTextField(){
        frame = new JFrame();
        frame.setSize(400, 300);
        frame.setLocationByPlatform(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My Textfield");
        
        JPanel creationpanel= new JPanel();
        creationpanel.setLayout(new BorderLayout());
        
        textArea = new JTextArea("", 7, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        creationpanel.add(new JScrollPane(textArea), BorderLayout.SOUTH);
        
        textField = new JTextField(40);
        textField.setEditable(true);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String text = textField.getText();
                System.out.println(".actionPerformed()");
                System.out.println(text);
                textArea.append(text+"\n");
		textField.selectAll();
                //textArea.setCaretPosition(textArea.getDocument().getLength());
            }
        });
        creationpanel.add(new JScrollPane(textField), BorderLayout.NORTH);
        
        
        frame.add(creationpanel);
        
        frame.pack();
        frame.setVisible(true);
    }
    
    
    public static void main(String[] argv)
    {
        MyTextField myTextField= new MyTextField();
        myTextField.textField.setText("Co jest nie tak?");
    }
    
}

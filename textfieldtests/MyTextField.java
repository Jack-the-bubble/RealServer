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
    private JTextArea secTextArea;
    
    private Button button;
    
    public MyTextField(){
        frame = new JFrame();
        //frame.setSize(400, 300);
        frame.setLocationByPlatform(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My Textfield");
        frame.setResizable(false);
        
        JPanel creationpanel= new JPanel();
        creationpanel.setLayout(new BorderLayout());
        
        
        button = new Button("wyslij");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(secTextArea.getText().length()>0){
                String text= secTextArea.getText();
                textArea.append(text+"\n");
                secTextArea.setText("");
                }
            }
        });
        creationpanel.add(button, BorderLayout.EAST);
        
        
        
        textArea = new JTextArea("", 7, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setAlignmentX(FlowLayout.RIGHT);
        creationpanel.add(new JScrollPane(textArea), BorderLayout.NORTH);
        
        
        secTextArea= new JTextArea("", 2, 30);
        secTextArea.setLineWrap(true);
        secTextArea.setWrapStyleWord(true);
        secTextArea.setEditable(true);
        secTextArea.setAlignmentX(FlowLayout.RIGHT);
        secTextArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                if(ke.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    System.out.println(".keyPressed()");  
                }
            }

            @Override
            public void keyPressed(KeyEvent ke) {        
                if(secTextArea.getText().length()!=0){
                    if(ke.getKeyCode() == KeyEvent.VK_ENTER)
                    {
                        System.out.println("enter");
                    String text= secTextArea.getText();
                    textArea.append(text);
                    secTextArea.setText("");
                }
                }

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                //System.out.println(".keyReleased()");
            }
        });
        creationpanel.add(new JScrollPane(secTextArea), BorderLayout.CENTER);
        
        
        
        
        
        
        
        //textField = new JTextField(40);
        //textField.setEditable(true);
        //textField.addActionListener(new ActionListener() {
        //    @Override
        //    public void actionPerformed(ActionEvent ae) {
        //        /*String text= secTextArea.getText();
        //        textArea.append(text+"\n");
        //        System.out.println(".actionPerformed()");*/
        //        //dla textFieldu
        //        String text = textField.getText();
        //        System.out.println(".actionPerformed()");
        //        System.out.println(text);
        //        textArea.append(text+"\n");
	//	textField.selectAll();
        //        //textArea.setCaretPosition(textArea.getDocument().getLength());
        //    }
        //});
        //creationpanel.add(new JScrollPane(textField), BorderLayout.SOUTH);
        
        
        frame.add(creationpanel);
        
        frame.pack();
        frame.setVisible(true);
    }
    
    
    public static void main(String[] argv)
    {
        MyTextField myTextField= new MyTextField();
        //myTextField.textField.setText("Co jest nie tak?");
    }
    
}

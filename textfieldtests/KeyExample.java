/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfieldtests;

import java.awt.*; 
import java.awt.event.*;   
/**
 *
 * @author Boba
 */
public class KeyExample extends Frame{
    Label label1;
    Label label2;
    Panel panel1;
    
    public KeyExample(String s )   {
        super(s);  

        setSize ( 200,100 );  
        panel1 = new Panel();   
        add(panel1);   
    
        label1 = new Label("----------------------");
        label2 = new Label("----------------------");
        panel1.add(label1);
        panel1.add(label2);   
    
        addKeyListener (new KeyWatch()) ;
        setVisible(true);  
    }
    class KeyWatch implements KeyListener {

        public void 
        keyTyped( KeyEvent e ){
            
            label2.setText(new Character(e.getKeyChar()).toString());
        }
        public void keyPressed ( KeyEvent e){
            label1.setText("Key Pressed"); 
        }   

        public void keyReleased ( KeyEvent e ){
            label1.setText( "Key Released" ) ;      
        }
    }     

    public static void main (String[]args ){       
        new KeyExample ( "Key Example" ) ;     
    }
} 



/*
 Matthew Ludwig
 February 21 2019
 This program encrypts and decrypts messages by rotating letters
 */
package simpleencryption;

/**
 *
 * @author malud0519
 */
import javax.swing.*;
public class SimpleEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables declaration
        String message, space;
        space = " ";
        int num = 0;
        message = JOptionPane.showInputDialog("This program will encrypt or decrypt a phrase, by rotating \n the letters." + 
              "\n\n" + "Please enter a phrase");
        String [] encrypt = message.split(space);
        int rotation = Integer.parseInt(JOptionPane.showInputDialog("How many rotations? (1-25)"));
        int cipherSelection = Integer.parseInt(JOptionPane.showInputDialog("1 For Encryption \n2 For Decryption"));
        
        if (cipherSelection == 1) {
            
        }
        else if (cipherSelection == 2) {
            
        }
    }
    private int encryptMessage (String message, int rotation) {
        for (int i = 0; i < message.length(); i++) {
            
        }
     //return the string or char value of the new message
    }
  
}

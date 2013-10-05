/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject1;

import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class wordBank {
    String alphabetChoice;
    
    
  

    void pickone() {
        Scanner input = new Scanner(System.in);
       System.out.println("Type a letter from the following choices.\n" 
               + "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z\n");
       this.alphabetChoice = input.next();
    }
}

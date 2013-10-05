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
public class mysteryWord {
    String letterChoice;

    void chooseLetter() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type your letter: ");
        this.letterChoice = input.next();
    }
    
void displayChoice(){
        System.out.println("You have chosen " + this.letterChoice);
    }
}





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumber;
import java.util.*;

/**
 *
 * @author keyla
 */
public class RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int counter;
        Random rnum = new Random();
        for(counter = 1; counter <= 7; counter++){
            System.out.print(rnum.nextInt(270) + " | ");
        }
    }
    
}

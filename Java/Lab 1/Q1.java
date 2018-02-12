/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.util.Scanner;

/**
 *
 * @author g00061542
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter n numbers.");
        
        Scanner in=new Scanner(System.in);
        double n=in.nextInt();
        
        System.out.println("please enter the values");
        for(int x=0;x<n;x++)
        {
            double v=in.nextInt();
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Arrays;
import java.util.Random;

public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int RMax=4;
        final int CMax=13;
        int[][] card=new int [RMax][CMax];
        
        for(int x=0;x<card.length;x++)
        {
            for(int j=0;j<card[x].length;j++)
            {
                card[x][j]=0;
            }
        }
        Random v=new Random();
        int category =v.nextInt(4);
        int cardNumb=v.nextInt(13);  
         for(int x=0;x<card.length;x++)
        {
            for(int j=0;j<card[x].length;j++)
            {
               if (card[x][j]==0)
               {   
                 System.out.println(category);
                 System.out.println(cardNumb);
               }
               else
               {
                   card[x][j]=1;
               }
            }
        }
     System.out.println(Arrays.deepToString(card));
    }
    
}

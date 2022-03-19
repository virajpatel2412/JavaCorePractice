/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

/**
 *
 * @author HP
 */
public class AlternatePattern {
    public static void main(String args[]){
        int n =8;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if((i+j)%2 == 0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }
}

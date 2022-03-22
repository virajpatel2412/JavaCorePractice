/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

/**
 *
 * @author HP
 *  
 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5  
 
 */
public class HalfPyramidNumber {
    public static void main(String args[]){
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}

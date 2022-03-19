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
public class Square {
    public static void main(String args[]){
        int n = 5;
        int m = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

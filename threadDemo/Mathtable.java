/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threadDemo;

/**
 *
 * @author HP
 */
public class Mathtable {
    public void table(int x) throws Exception{
        for(int i =1; i<6; i++){
            Thread.sleep(3000);
            System.out.println(x*i);
        }
    }
    
    public void table(int x, int n) throws InterruptedException{
        for(int i=1; i<=n; i++){
        	Thread.sleep(3000);	
            System.out.println(x*i);
        }
    }
}

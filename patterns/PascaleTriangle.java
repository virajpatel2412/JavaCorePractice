/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP

For input 5 result is below 

1  
1  1  
1  2  1  
1  3  3  1  
1  4  6  4  1  


 */
public class PascaleTriangle {


//Explanation: There are 5 rows in the output matrix. Each row corresponds to each one of the rows in the image shown above.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l, pre = null;
        for (int i = 0; i < n; ++i) {
            l = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    l.add(1);
                } else {
                    l.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = l;
            list.add(l);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j)+"  ");
            }
            System.out.println();
        }
    }
}

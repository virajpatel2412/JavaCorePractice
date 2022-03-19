/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionsDemo;


import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author HP
 * 
 * Implement a simple text editor. The editor initially contains an empty string S, .
 * Perform  operations of the following  types:

1. append - Append string  to the end of S .
2. delete - Delete the last K characters of S.
3. print - Print the Kth character of S.
4. undo - Undo the last (not previously undone) operation of type  or , reverting  to the state it was in prior to that operation.
 
 * operation
index   S       ops[index]  explanation
-----   ------  ----------  -----------
0       abcde   1 fg        append fg
1       abcdefg 3 6         print the 6th letter - f
2       abcdefg 2 5         delete the last 5 letters
3       ab      4           undo the last operation, index 2
4       abcdefg 3 7         print the 7th characgter - g
5       abcdefg 4           undo the last operation, index 0
6       abcde   3 4         print the 4th character - d
 
 */
public class Stackdemo {

    public static void main(String args[]) {
        String string = "";
        Stack<String> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int op = sc.nextInt();
            if (op == 1) {
                s.add(string);
                String st = sc.next();
                string += st;
            } else if (op == 2) {
                s.add(string);
                int k = sc.nextInt();
                string = string.substring(0, string.length() - k);
            }
            else if(op == 3){
                int k = sc.nextInt();
                System.out.println(string.charAt(k-1));
            }
            else{
                string = s.pop();
            }
        }
    }
}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();

        if(n%2!=0){
            System.out.print("Weird");
        }
        else if(n%2==0){
            if(n>=2 && n<=5){
                System.out.print("Not Weird");
            } else if(n>=6 && n<=20){
                System.out.print("Weird");
            } else if(n>20){
                System.out.print("Not Weird");
            }
        }
    }
}
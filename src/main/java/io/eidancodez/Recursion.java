package io.eidancodez;

import java.util.Vector;

public class Recursion {
    private static String reverseOfText;

    
    public static void main(String[] args) {
        int n = 5;
        System.out.print("Sum of first "+n+" numbers ");
        System.out.println(" is "+sum(n));
        System.out.println("Reverse:"+reverse("My name is Khan"));
       
        
       
    }

    // Print sum of first n natural numbers 
    public static int sum(int number){
        if(number > 0)
        {
            System.out.print(number+" ");
            return number+sum(number-1);
        }
        else{
            return 0;
        }
    }

    public static String reverse(String text){
        if(text.isEmpty())
            return text;
        else
            return reverse(text.substring(1))+text.charAt(0);
    }
   
}

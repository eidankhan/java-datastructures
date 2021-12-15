package io.eidancodez;

public class Recursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.print("Sum of first "+n+" numbers ");
        System.out.println(" is "+sum(n));
    }

    // Print some of first n natural numbers 
     
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

   
}

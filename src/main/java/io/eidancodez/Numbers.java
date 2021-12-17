package io.eidancodez;

public class Numbers {
    public static void main(String[] args) {
        // int number = 132;
        // System.out.println("Is "+number+" a spy number ? "+isSpyNumber(number));

        // Print all spy numbers starting from 10 to 10000
        System.out.println("All spy numbers between 11 to 10000 ");
        for(int number = 11; number <= 10000; number++){
            if(isSpyNumber(number))
                System.out.print(number+" ");
        }
    }

    /* Spy Number: A positive integer is called a spy number if the sum and product
    of its digits are equal. In other words, a number whose sum and product of
    all digits are equal is called a spy number. */

    public static boolean isSpyNumber(int number){
        int sum = 0;
        int product = 1;
        while(number > 0){
            int digit = number%10;
            sum += digit;
            product *= digit;
            number = number/10;
        }
        if(sum == product)
            return true;
        return false;
    }
}

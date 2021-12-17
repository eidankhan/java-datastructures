package io.eidancodez;

public class Arrays {

    public static void main(String[] args) {
        // int[] array = {5,1,8,4,10,7,9};
        // secondLargest(array);
        // replaceElementWithProductOfEveryOtherElement(array);
        // rotateArrayByOne(array);
        int[] repeatativeArray = {1,4,3,2,3,5,2,1,3,2,2};
        System.out.println(findMostRepeatativeNumber(repeatativeArray));
    }
    public static int secondLargest(int[] array){
        int secondMax = array[0];
        int index = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] > secondMax)
            {
                secondMax = array[i];
                index = i;
            } 
        }
        secondMax = array[0];
        for(int j=0; j<array.length; j++){
            if(array[j] > secondMax)
            {
                if( index == j)
                    continue;
                secondMax = array[j];
            }
        }
        System.out.println("Second max:"+secondMax);
        return 0;
    }

     // Replace every element with the product of every other element
     public static void replaceElementWithProductOfEveryOtherElement(int[] array){
        int[] processedArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            int product = 1;
            for(int j=0; j<array.length; j++){
                if(i == j)
                    continue;
                product *= array[j];
            }
            processedArray[i] = product;
        }

        for(int x:processedArray)
            System.out.print(x+" ");
    }


    public static void rotateArrayByOne(int[] array){
        int ele = array[0];
        for(int x=0; x<array.length; x++){
            if(x < array.length-1)
                array[x] = array[x+1];
            else if(x == array.length-1)
                array[x] = ele;
        }
        for(int x: array)
            System.out.print(x+" ");
    }

    // Find most repeatative number in array
    public static Integer findMostRepeatativeNumber(int[] array){
        int mostRepeatativeNumber = array[0];
        int maxCount = 1;
        for(int x=0; x<array.length; x++){
            int counter = 1;
            for(int y=x+1; y<array.length; y++){
                if(array[x] == array[y])
                    ++counter;
            }
            if(maxCount < counter)
            {
                maxCount = counter;
                mostRepeatativeNumber = array[x];
            }
        }
        return mostRepeatativeNumber;
    }



}

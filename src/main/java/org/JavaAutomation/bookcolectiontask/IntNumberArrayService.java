package org.JavaAutomation.bookcolectiontask;

public class IntNumberArrayService {
    public static int maxIntFromArray(int[] inputArray){
        int maxValue = inputArray[0];
        for (int i=0; i< inputArray.length; i++){
            if (maxValue< inputArray[i]){

                 maxValue=inputArray[i];

            }
        }
        return maxValue;

    }


    public static double arithmeticAverage(int[] array){

        int sum = 0;
        for (int i= 0; i < array.length; i++){
            sum = sum +array[i];
        }
        return (double) sum / array.length;

    }

}

package org.JavaAutomation.exceptionsservicetask;

public class ArithmeticOperationService {

    public static int divideDataWithoutTryAndCatch (int a, int b){

        return a/b;
    }

    public static int divideDtaWithTryAndCatch(int a, int b) {
        try {

            return a/b;

        } catch (RuntimeException exception) {
            System.out.println("An exception has occurred: " + exception.getMessage());
            exception.printStackTrace();
            return 0 ;
        }
    }
}

package org.JavaAutomation.exceptionsservicetask;

public class RunTask {
    public static void main(String[] args) {

        int stringLength = TextManager.getTheTextLengthWithoutTryAndCatch("Sternocleidomastoidian");
        System.out.println(stringLength);

        String data = null;
        System.out.println(TextManager.getTheTextLengthWithTryCatch(data));
        System.out.println(" I am happy and i know it");

        System.out.println(ArithmeticOperationService.divideDataWithoutTryAndCatch(10, 10));
        System.out.println(ArithmeticOperationService.divideDtaWithTryAndCatch(10,0));
        System.out.println("The code is fine , the execution is good");
    }
}

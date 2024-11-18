package org.JavaAutomation.exceptionsservicetask;

public class TextManager {
    public static int getTheTextLengthWithoutTryAndCatch(String input) {
        return input.length();
    }

    public static int getTheTextLengthWithTryCatch(String input) {
        try {

            return input.length();
        } catch (NullPointerException informationHolderObject) {
            System.out.println(informationHolderObject.getMessage());
            System.out.println("The exception has been handled");
            return 0;
        } finally {
            System.out.println("The code has been executed ");

        }
    }
}
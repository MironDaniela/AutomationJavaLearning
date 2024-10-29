package org.JavaAutomation.operationsandciclicfunctions;

public class ComparisonOperationsExemple {
    public static void main(String[] args) {
        int a= 10;
        int b = 5 ;

        // Egal cu

        boolean isEqual = a ==b ;
        System.out.println("Egal cu :" + isEqual );

        // Diferit de

        boolean isNotEqual =a !=b;
        System.out.println("Diferit de :" + isNotEqual);

        // Mai mare decat

        boolean isGreaterThan =a > b;
        System.out.println("Mai mare decit:" + isGreaterThan);

        // Mai mic decat

        boolean isLessThan = a < b ;
        System.out.println("Mai mic decat:" + isLessThan);

        // Mai mare sau egal cu

        boolean isGreaterThanOrEqual = a >=b ;
        System.out.println("Mai mare sau egal cu:" + isGreaterThanOrEqual);

        // Mai mic sau egal cu

        boolean isLessThanOrEqual = a <= b ;
        System.out.println(" MAi mic sau egal cu :" + isLessThanOrEqual);
    }
}

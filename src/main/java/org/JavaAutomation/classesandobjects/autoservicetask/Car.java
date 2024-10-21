package org.JavaAutomation.classesandobjects.autoservicetask;

public class Car {
    String plateNumber;
    int kmWhenEnteredTheService;

    String color;
    String make;
    String model;

    // Constructorul de mai jos primeste 3 parametri de intrare, in rezultatul sa creat un obiect Car despre care se va cunoaste
    //marca, modelul, culoarea dar nu si alte detalii precum plateNumber sau km


    public Car(String makeParametruDeIntrare, String modelFormalParameter, String colorLocalVariable) {
        this.make = makeParametruDeIntrare ;
        this.model = modelFormalParameter ;
        this.color = colorLocalVariable ;

    }
    // Acest constructor va crea un obiect de tipul Car despre care vom cunoaste doar numarul de imatriculare

    public Car(String plateNumber){
        this.plateNumber = plateNumber;

    }

}

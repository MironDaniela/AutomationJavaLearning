package org.JavaAutomation.zooclubservice;

public class Dog extends Animal implements AnimalInterface {

    // Definim un constructor pentru a crea obiecte de tipul Dog cu parametrul formal de tip String Name

    public Dog(String name){

        // Cuvintul cheie super este folosit pentru apelul contructorului clasei parinte, care are nevoie de aceasta proprietate

        super(name);
    }

    // makesound() este o metoda declarata in AnimalInterfece respectiv trebuie implementata. ea fiind abstracta acolo

    @Override

public void makeSound() {

        System.out.println("Dog" + getName()+ "says: Woof");
    }

    // eat() este o metoda declarata in clasa abstracta Animal respectiv trebuie implementata, ea fiind abstracta acolo
    @Override
    public void eat() {
        // metoda getName este concreta si implementata in clasa Parinte Animal. Aceasta poate fi declarata si Protected acolo.

        System.out.println(getName()+ "is eating bones.");

    }
}

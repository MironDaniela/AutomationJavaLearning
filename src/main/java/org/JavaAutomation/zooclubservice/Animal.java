package org.JavaAutomation.zooclubservice;

// Clasa Animal este dedicata procesului de mostenire, constructorul Animal nu trebuie folosit pentru initializarea obiectelor.
public abstract class Animal {

    // Variabila de instanta name va fi ssccesibila doar in clasa Animal deoarece e Private

    private String name;

    // Constructorul cu un parametru va permite setarea unui nume pentru absolut toate animalele create in cadrul programului
    public Animal(String name){

        // Valoarea nume colectata din apelul constructorului, va fi atribuita variabilei de instanta name, care se defineste cu ajutorul this.

        this.name = name;

    }

    // Metoda getName este tip public si returneaza valoarea numelui pe care il poseda animalul


    public String getName() {
        return name;
    }

    // Metoda abstracta eat() nu are implementare, aceasta va fi facuta in clasele copil
    public abstract void eat();
}

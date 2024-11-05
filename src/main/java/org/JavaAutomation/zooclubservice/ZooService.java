package org.JavaAutomation.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        // Mai jos se aplica polimorfismul pentru a declara un obiect de tip Animal insa al crea cu constructorul clasei copil Dog
        Animal dog = new Dog("Wolf");
        Cat cat = new Cat("Mimi");
        Cat secondcat = new Cat("Lulu");

        // Metoda makeSound() ce apartine obiectului Dog nu poate fi apelata deoarece dog este de tip Animal iar makeSound()
        // este declarata in Interfata, pentru a fixa acest lucru ar trebui ca interfata sa fie implementata de catre clasa abstracta Animal
        // dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();
        secondcat.eat();
    }
}

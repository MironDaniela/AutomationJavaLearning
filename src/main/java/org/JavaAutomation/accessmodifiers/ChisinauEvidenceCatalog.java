package org.JavaAutomation.accessmodifiers;

import org.JavaAutomation.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {

        // Crearea unui obiect Person, numit ionPerson - folosind cuvintul cheie new si constructorul cu 3 parametri
        // definit in clasa Person

        Person ionPerson = new Person("Ion" , "Burlacu" , 458774455);

        //Proprietatea ionPerson.isRetired detin modificatorul public ceea ce ofera posibilitatea de- al edita din oricare loc al proiectului

        ionPerson.isRetired = true ;

        // Proprietate isRetired este de tipul boolean si serveste drept conditie pentru instructiunea IF

        if (ionPerson.isRetired) {

            // Codul executat in cazul unei conditii adevarate
            System.out.println( " Ion este la pensie");
        } else {

            // codul executat in cazul unei conditii false in blocul IF

            System.out.println("Ion nu este iesit la pensie");
        }

        Person dariaMecan = new Person("Daria", "Mecan" , 46546546, "Chisinau" , true);

        // Proprietatea isRetired este de tipul boolean si serveste drept conditie pentru instructiunea IF

        if (dariaMecan.isRetired) {
            // Codul executat in cazul unei conditii adevarate
            System.out.println("Daria este pensionata");

        }
        else {

            // codul executat in cazul unei conditii false in blocul IF
            System.out.println("Daria nu este pensionata");
        }

        // Defineste inca 3 obiecte si afiseaza informatia despre pensionare mai jos, folosind exemplul de mai sus
    }
}

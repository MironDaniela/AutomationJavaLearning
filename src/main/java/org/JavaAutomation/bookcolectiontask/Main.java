package org.JavaAutomation.bookcolectiontask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book ("Printre tonuri Cenusii", "Ruta Sepetys ");
        Book book2 = new Book("Colectionara de parfumuri interzise","Kathleen Tessaro");
        Book book3 = new Book("Oameni fericiti citesc si beau cafea" , "Agnès Martin-Lugand");

        Library library001 = new Library("Carturesti Mall");
        Library library002 = new Library("Librarius");


        library001.addBook(book1);
        library001.addBook(book1);
        library001.addBook(book1);

        System.out.println(library001.getTotalNumberOfBooks());



        library002.addBook(book1);
        library002.addBook(book2);
        library002.addBook(book3);
        library002.addBook(book3);
        library002.addBooksFromAnotherList(library001.bookList);

        library002.removeBookFromTheStock(book2);

        System.out.println(library002.getTotalNumberOfBooks());
        library002.displayTheBookTitles();


        Map<String, Library> reteauaDeLibrarii = new HashMap<>();

        reteauaDeLibrarii.put("Arborilor 22/1", library001);
        reteauaDeLibrarii.put("Moscovei 1/1", library002);


        reteauaDeLibrarii.get("Arborilor 22/1").displayTheBookTitles();
       reteauaDeLibrarii.get("Moscovei 1/1").displayTheBookTitles();

       int[] integers = new int[5];
       integers[0] = 8;
       integers [1] = 7;
       integers [2] = 8;
       integers [3] = 9;
       integers [4] = 9;
        System.out.println(integers.length);
        System.out.println(IntNumberArrayService.maxIntFromArray(integers));
        System.out.println(IntNumberArrayService.arithmeticAverage(integers));

    }


}

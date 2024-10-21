package org.JavaAutomation.classesandobjects.autoservicetask;

public class Tool {
    double price;
    String name;
    double weight;

    public Tool(String name){
        this.name = name;
        System.out.println ("Un obiect de tip tool a fost creat, numele lui este " + this.name);

    }
        public Tool () {
        System.out.println ("O noua unelta a fost creata in cadrul programului. " +
                "Nu dispunem despre detaliile ei" + "pentru detalii Numele este" + this.name + "iar greutatea " + this.weight);

    }
}

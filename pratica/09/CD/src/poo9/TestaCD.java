package poo9;

import java.util.Date;

public class TestaCD {

    public static void main(String[] args) {
        pessoa zeze = new pessoa("Zezé di Camargo");
        pessoa luciano = new pessoa("Luciano");

        CD zezeLuciano = new CD("Roça", new Date(), zeze);
        zezeLuciano.adicionaCantor(luciano);

        System.out.println(zezeLuciano);
    }
    
}

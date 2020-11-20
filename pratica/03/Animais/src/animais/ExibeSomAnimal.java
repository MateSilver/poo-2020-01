package animais;

public class ExibeSomAnimal implements Operacao {
    public void executa(Object obj) {
        System.out.println(((Animal)obj).som());
    }
}


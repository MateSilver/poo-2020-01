package poo6;

public class TestaPessoa {

    public static void main(String[] args) {
        pessoa h = new pessoa("Joao da Silva");
        pessoa m = new pessoa("Maria de Jesus");

        System.out.println(h);
        System.out.println(m);

        m.setNome(h.getNome());

        System.out.println(h);
        System.out.println(m);
    }
    
}

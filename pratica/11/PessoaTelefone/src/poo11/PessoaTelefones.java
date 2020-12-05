package poo11;


public class PessoaTelefones {

    public static void main(String[] args) {
        pessoa p;
        p = new pessoa("Zeca dos Telefones");

        // Coloca sob controle o estoque do Zeca
        for (int i = 1; i <= 9; i++) {
            p.adicionaTelefone(new Telefone(Integer.toString(i)));
        }
        Telefone t10 = new Telefone("10");
        p.adicionaTelefone(t10);
        System.out.println(p);
        
        p.removeTelefone(t10);
        System.out.println(p);
    }
}

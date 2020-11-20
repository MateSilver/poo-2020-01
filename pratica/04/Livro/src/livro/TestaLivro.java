package livro;

public class TestaLivro {

    public static void main(String[] args) {
        livro l1 = new livro("Inferno", "Dan Brown", "Sextante", 2004);
        livro l2 = new livro("A menina do outro Lado", "Nagabe", "DarkSide", 2004);
        livro l3 = new livro("O cão dos Baskervilles", "Sherlock Holmes", "Lafonte", 2004);

        System.out.println(l1 + "\n");
        System.out.println(l2 + "\n");
        System.out.println(l3 + "\n");
    }
    
}

package pessoa;

public class TesteLivroPessoaEditora {

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("René Descartes", 1596); 
        String en = new String("Rua Alegrete, 62, Bairro Sumaré");
        Editora ed = new Editora("Martin Claret", en);
        Livro l = new Livro("Discurso do Método",ed,p,2002);
        
        System.out.println(l);
    }
}

package animais;

public class TestaAnimais {

    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Sapo();
        animais[1] = new Boi();
        animais[2] = new Cachorro();
        
    }
    void executaOperacao(Animal[] as, Operacao op){
        Animal.executa(as);
    }
}

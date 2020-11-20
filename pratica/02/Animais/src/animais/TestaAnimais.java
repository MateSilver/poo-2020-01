package animais;

public class TestaAnimais {

    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Sapo();
        animais[1] = new Boi();
        animais[2] = new Cachorro();

        for (int i = 0; i < animais.length; i++) {
            System.out.println(animais[i].som());
        }
    }
}

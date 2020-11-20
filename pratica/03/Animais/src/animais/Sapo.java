package animais;

public class Sapo extends Animal{
    int idadeMedia;
    public Sapo(){
        idadeMedia = 10;
    }
    public String som(){
        return "coaxar";
    }
    public int getIdade(){
        return idadeMedia;
    }
}

package animais;

public class Boi extends Animal{
    int idadeMedia;
    public Boi(){
        idadeMedia = 20;
    }
    public String som(){
        return "mugir";
    }
    public int getIdade(){
        return idadeMedia;
    }
}

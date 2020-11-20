package animais;

public class Cachorro extends Animal{
    int idadeMedia;
    public Cachorro(){
        idadeMedia = 13;
    }
    public String som(){
        return "latir";
    }
    public int getIdade(){
        return idadeMedia;
    }
}

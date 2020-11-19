package produto;

public class NotaFiscal extends produto{
    float getTotal(){
        return ((1+getAli()) * (getPrice()));
    }
}

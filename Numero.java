public class Numero{
    private int numero;
    //
    public numero(int valor){
        numero  = valor;
    }

    public boolean par(){
        if(numero%2 == 0){
            return true;
        }
        return false;
    }
    public boolean impar(){
        if(numero%2 != 0){
            return true;
        }
        return false;
    }
    public boolean primo(){
        private int i = 2;
        while(i < numero){
            if(numero%i == 0){
                return false;
            }
        }
        return true;
    }
}

public class MyClass {
  public static void main(String[] args) {
    int num = new Numero(2);
    num.par();
    num.impar();
    num.primo();
  }
}
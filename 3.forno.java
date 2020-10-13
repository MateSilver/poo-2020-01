public class forno{
    private int temperatura;
    private int tempo;
    private boolean cheio;
    private int duracao;

    public forno(int numero,int tempo_da_receita){
        temperatura = numero;
        tempo = 0;
        cheio = false;
        duracao = tempo_da_receita;
    }
    public passa_tempo(int minutos){
        tempo += minutos;
    }
    public mudar_temperatura(int temp){`
        temperatura = temp;
    }
    public boolean pronto(){
        if(tempo > duacao){
            return true;
        }
        return false;
    }
    public add_coisa(){
        if(cheio == true){
            system.out.println("cheio");
            system.out.println();
        }
        cheio = true;
    }
}
public main{
    public static void main(String args[]){
        forno novo_forno = new forno(300,45);
        novo_forno.add_coisa();
        while(novo_forno.pronto() == false){
            novo_forno.passa_tempo(1);
        }
        system.out.println("receita pronta!");
        system.out.println();
    }
}
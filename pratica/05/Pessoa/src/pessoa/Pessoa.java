package pessoa;

public class Pessoa {
    private String nome;
    private int AnoDeNascimento;
    
    public Pessoa(String nome, int ano){
        this.nome = nome;
        this.AnoDeNascimento = ano; 
    }
    public int getAnoDeNascimento(){
        return AnoDeNascimento;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAno(int ano){
        this.AnoDeNascimento = ano;
    }
    public String toString() {
        return getNome() + " (nascimento: " + getAnoDeNascimento() + ")";
    }
}

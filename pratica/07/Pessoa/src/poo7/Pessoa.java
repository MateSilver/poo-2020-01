package poo7;

import java.util.Date;

public class Pessoa {
    private String corOlhos;
    private String corPele;
    private String corCabelo;
    private float peso;
    private float altura;
    private Date dataNascimento;
    private cidade localNascimento;
    private String nome;
    private String cpf;
    private String idt;
    private String passaporte;
    private String nomeMae;
    private String nomePai;
    private Endereco endereco;
    
    public Pessoa(String nome, String nomePai, String nomeMae){
        setNome(nome);
        setNomePai(nomePai);
        setNomeMae(nomeMae);
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNomePai(){
        return nomePai;
    }
    public void setNomePai(String nomePai){
        this.nomePai = nomePai;
    }
    public String getNomeMae(){
        return nomeMae;
    }
    public void setNomeMae(String nomeMae){
        this.nomeMae = nomeMae;
}
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getIdt() {
        return idt;
    }

    public void setIdt(String idt) {
        this.idt = idt;
    }

    public cidade getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String cidade, String estado, String ddd) {
        this.localNascimento.nome = cidade;
        this.localNascimento.estado = estado;
        this.localNascimento.ddd = ddd;
    }
    // Métodos get/set omitidos, por simplicidade, para
    // nome, nomeMae, nomePai, passaporte, peso, endereco

    // XXX Acrescentar demais atributos
    @Override
    public String toString() {
        return "Nome: " + ((getNome() == null) ? "NF" : getNome())
               + "\nPai: " + ((getNomePai() == null) ? "NF" : getNomePai())
               + "\nMae: " + ((getNomeMae() == null) ? "NF" : getNomeMae());
    }
    public String Dados(){
        return "CPF: " + ((getCpf() == null) ? "NF" : getCpf())
                + "\nNascido: " + ((getDataNascimento() == null) ? "NF" : getDataNascimento());
    }
}

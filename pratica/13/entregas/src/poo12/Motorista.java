package poo12;

public class Motorista {
    private String nome;
    private String codigo;
    private TipoHabilitacao habilitacao;
    private CNH cnh;
    private Contrato contrato;

    public Motorista(String nome, String codigo) {
        setNome(nome);
        setCodigo(codigo);
    }
    public void setHabilitacao(TipoHabilitacao habilitacao){
        this.habilitacao = habilitacao;
    }
    public void setCNH(CNH cnh){
        this.cnh = cnh;
    }
    public CNH getCNH(){
        return cnh;
    }
    public TipoHabilitacao getHabilitacao(){
        return this.habilitacao;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setContrato(Contrato contrato){
        this.contrato = contrato;
    }
    public Contrato getContrato(){
        return contrato;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return getNome() + " (" + getCodigo() + ")";
    }
}

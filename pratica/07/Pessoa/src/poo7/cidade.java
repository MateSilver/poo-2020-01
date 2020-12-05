package poo7;

public class cidade {
    public String nome;
    public String estado;
    public String ddd;
    
    public cidade(String cidade, String estado, String ddd){
        setCidade(cidade);
        setEstado(estado);
        setDdd(ddd);
    }
    public void setCidade(String cidade){
        this.nome = cidade;
    }
    public String getCidade(){
        return nome;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return estado;
    }
    public void setDdd(String ddd){
        this.ddd = ddd;
    }
    public String getDdd(){
        return this.ddd;
    }
    @Override
    public String toString(){
        return "Nascido em " + ((getCidade() == null) ? "NF" : getCidade())
                + " - " + ((getEstado() == null) ? "NF" : getEstado())
                + "\nddd: " + ((getDdd() == null) ? "NF" : getDdd());
    }
}

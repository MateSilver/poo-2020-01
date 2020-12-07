package poo12;

import java.util.Date;

public class CNH {
    private Date validade;
    private Date dataEmissao;
    private Date dataPrimeiraCNH;
    private Categoria category;
    
    public CNH(Date validade, Date dataEmissao, Date dataPrimeiraCNH, Categoria category){
        setCategoria(category);
        setValidade(validade);
        setDataEmissao(dataEmissao);
        setDataPrimeiraCNH(dataPrimeiraCNH);
    }
    public void setCategoria(Categoria categoria){
        this.category = categoria;
    }
    public void setValidade(Date validade){
        this.validade = validade;
    }
    public void setDataEmissao(Date dataEmissao){
        this.dataEmissao = dataEmissao;
    }
    public void setDataPrimeiraCNH(Date primeiraCNH){
        this.dataPrimeiraCNH = primeiraCNH;
    }
    public Categoria getCategoria(){
        return category;
    }
    public Date getValidade(){
        return validade;
    }
    public Date getDataEmissao(){
        return dataEmissao;
    }
    public Date getPrimeiraCNH(){
        return dataPrimeiraCNH;
    }
}

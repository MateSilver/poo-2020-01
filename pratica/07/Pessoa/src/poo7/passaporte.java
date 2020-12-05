package poo7;

import java.util.Date;

public class passaporte {
    private String numero;
    public Date dataExpedicao;
    public Date validade;
    public passaporte(String numero, Date origem, Date validade){
        this.dataExpedicao = origem;
        this.numero = numero;
        this.validade = validade;
    }
    public String getNumero(){
        return numero;
    }
    public Date getDataExpedicao(){
        return dataExpedicao;
    }
    public Date validade(){
        return validade;
    }
}

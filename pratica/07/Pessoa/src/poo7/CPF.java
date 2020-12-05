package poo7;

import java.util.Date;

public class CPF {
    private String numero;
    public Date dataExpedicao;
    public boolean validade;
    
    public CPF(String numero,Date dataExpedicao, boolean validade){
        this.numero = numero;
        this.dataExpedicao = dataExpedicao;
        this.validade = validade;
    }
    public String getNumero(){
        return numero;
    }
    public Date getDataExpedicao(){
        return dataExpedicao;
    }
    public boolean valida(){
        return validade;
    }
}

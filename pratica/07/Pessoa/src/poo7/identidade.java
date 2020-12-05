package poo7;

import java.util.Date;

public class identidade {
    public String numero;
    public Date dataExpedicao;
    public String local;
    public String orgaoExpedidor;
    
    public identidade(String numero, String local, String orgao){
        setNumero(numero);
        setLocal(local);
        setExpedidor(orgao);
    }
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public Date getDataExpedicao(){
        return dataExpedicao;
    }
    public void setLocal(String local){
        this.local = local;
    }
    public String getLocal(){
        return local;
    }
    public void setExpedidor(String orgao){
        this.orgaoExpedidor = orgao;
    }
    public String getExpedidor (){
        return orgaoExpedidor;
    }
}

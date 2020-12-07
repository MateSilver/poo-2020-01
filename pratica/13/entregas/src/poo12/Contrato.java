package poo12;

import java.util.Date;

public class Contrato {
    private Date inicio;
    private Date fim;
    
    public Contrato(Date inicio, Date fim){
        this.fim = fim;
        this.inicio = inicio;
    }
    public void setInicio(Date inicio){
        this.inicio = inicio;
    }
    public void setFim(Date fim){
        this.fim = fim;
    }
    public Date getInicio(){
        return inicio;
    }
    public Date getFim(){
        return fim;
    }
}

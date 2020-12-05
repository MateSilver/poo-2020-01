package poo12;

import java.util.Date;

public class locacao {
    private Date dataInicial;
    private Date dataFinal;
    private int kmInicial;
    private int kmFinal;
    private float precoKm;
    private float precoDia;
    private Motorista motorista;
    private Carro carro;

    public double obtemCusto() {
        // Obtém números de dias transcorridos
        long nDias = dataFinal.getTime() - dataInicial.getTime();
        nDias = nDias / (1000 * 60 * 60 * 24);

        return (kmFinal - kmInicial) * precoKm + nDias * precoDia;
    }
    public void setDataInicial(Date data){
        this.dataInicial = data;
    }
    public Date getDataInicial(){
        return this.dataInicial;
    }
    public void setDataFinal (Date data){
        this.dataFinal = data;
    }
    public Date getDataFinal (){
        return this.dataFinal;
    }
    public void setKmInicial(int km){
        this.kmInicial = km;
    }
    public int getKmInicial(){
        return this.kmInicial;
    }
    public void setKmFinal(int km){
        this.kmFinal = km;
    }
    public int getKmFinal(){
        return this.kmFinal;
    }
    public void setPrecoDia(float preco){
        this.precoDia = preco;
    }
    public float getPrecoDia(){
        return this.precoDia;
    }
    public void setPrecoKm(float preco){
        this.precoKm = preco;
    }
    public float getPrecoKm(){
        return this.precoKm;
    }
    public void setCarro(Carro automovel){
        this.carro = automovel;
    }
    public Carro getCarro(){
        return this.carro;
    }
    public void setMotorista(Motorista m1){
        this.motorista = m1;
    }
    public Motorista getMotorista(){
        return this.motorista;
    }

    @Override
    public String toString() {
        String saida = "Motorista: ";
        saida += getMotorista().toString() + "\n";
        saida += "Carro: " + getCarro().toString() + "\n";
        saida += "Quilometragem inicial: " + getKmInicial();
        saida += " final: " + getKmFinal() + "\n";
        saida += "Data locacao: " + getDataInicial().toString();
        saida += " entrega: " + getDataFinal().toString() + "\n";
        saida += "R$/km: " + getPrecoKm() + " R$/dia: " + getPrecoDia();
        saida += "\nCusto da locacao: " + obtemCusto();

        return saida;
    }
}

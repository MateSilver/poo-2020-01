package poo12;

import java.util.Calendar;
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
    public boolean compativel(Motorista m, Carro carro) {
        TipoHabilitacao hab = m.getHabilitacao();

    // C ou D pode dirigir qualquer carro
    boolean retorno = hab.equals(TipoHabilitacao.C)
            || hab.equals(TipoHabilitacao.D);

    // Se não for C ou D, então apenas carro de passeio
    // poderá ser dirigido por carteira B
    if (!retorno) {
        retorno = hab.equals(TipoHabilitacao.B)
		&& carro.getTipo().equals(Tipo.passeio);
    }

    return retorno;
}
    public double custoTotal() {
    // Valores adicionais são calculados sobre preço base (pb)
    double pb = obtemCusto();

    double ca = 0.0; // Custo adicional
    ca = (carro.getCategoria().equals(Categoria.luxo)) ? 0.15 * pb : 0.0;
    ca = (carro.getCategoria().equals(Categoria.superLuxo)) ? 0.2 * pb : 0.0;
    ca = (carro.getTipo().equals(Tipo.utilitario)) ? 0.15 * pb : 0.0;

    // Antiguidade do motorista pode onerar em 5%.
    Calendar inicio = Calendar.getInstance();
    inicio.add(Calendar.YEAR, -5);
    ca = inicio.after(motorista.getContrato().getInicio()) ? 0.05 * pb : ca;
    return pb + ca;
}
}

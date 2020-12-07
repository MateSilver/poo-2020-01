package poo12;

public class Carro {
    private String placa;
    private Tipo type;
    private Categoria category;
    private boolean passeio;
    
    public Carro(String placa) {
        setPlaca(placa);
    }
    public Categoria getCategoria() {
	return category;
    }
    public void setCategoria(Categoria categoria) {
        this.category = categoria;
    }
    public Tipo getTipo() {
        return type;
    }
    public void setTipo(Tipo tipo) {
        this.type = tipo;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return getPlaca();
    }
}

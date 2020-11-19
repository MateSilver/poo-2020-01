package produto;

class ItemNotaFiscal extends NotaFiscal{
    int quantidade;
    
    public ItemNotaFiscal(int total){
        this.quantidade = total;
    }
    float PrecoTotal(){
        return (getTotal()*quantidade);
    }
}

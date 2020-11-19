/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

/**
 *
 * @author M4teS
 */
public class produto {
    float preco;
    float aliquota;
    String descricao;
    
    void produto(String buffer,float valor, float imposto){
        this.descricao = buffer;
        this.aliquota = imposto;
        this.preco = valor;
    }
    public float getPrice(){
        return this.preco;
    }
    public float getAli(){
        return this.aliquota;
    }
    public String getDesc(){
        return this.descricao;
    }
}

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
    private float preco;
    private float aliquota;
    private String descricao;
    
    void produto(String buffer,float valor, float imposto){
        this.descricao = buffer;
        this.aliquota = imposto;
        this.preco = valor;
    }
    private float getPrice(){
        return this.preco;
    }
    private float getAli(){
        return this.aliquota;
    }
    private String getDesc(){
        return this.descricao;
    }
}

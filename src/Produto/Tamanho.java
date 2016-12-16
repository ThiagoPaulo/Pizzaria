/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;
/**
 *Classe com as descrições dos tamanhos das pizzas
 * @author note
 */
public class Tamanho {
    
    private String name;
    private int numFatia;
    /**
     * Construtor da Classe
     * @param descricao String com a descrição do tamanhos
     * @param num inteiro com o numero de fatias correspondente a este tamanho
     */
    public Tamanho(String descricao, int num ){
        
        this.name = descricao;
        this.numFatia = num; 
    }
    /**
     * Função que retorna a descrição do tamanho
     * @return String com a descrição do tamanho
     */
    public String getNome(){
        return this.name;
    }
    /**
     * renorna o numero de fatias no tamnaho
     * @return int com o numero do tamanho
     */
    public int getNumFatia(){
        return this.numFatia;
    }
    
    
}

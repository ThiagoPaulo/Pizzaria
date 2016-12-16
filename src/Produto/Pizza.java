/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;

/**
 *Classe com o item sendo vendido e suas descricoes
 * @author note
 */
public class Pizza {
    private Sabor sabor;
    private Tamanho tamanho;
    private float preço;
    private int quantidade;
    
    /**
     * Construtor da classe
     * @param sabor = classe sabor, 
     * @param tamanho = classe tamanho
     */
    public Pizza(Sabor sabor, Tamanho tamanho){
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preço = setPreco();
        this.quantidade = 1;
    }
    /**
     * Calcula e retorna o preco da pizza
     * @return valor float correspondente ao numero de fatias do tamanho vezes o preço por fatia do sabor
     */
    private float setPreco(){
        return this.preço = sabor.getPrecoFatia() * this.tamanho.getNumFatia();
    }
    /**
     * altera o numero da quantidades do item a serem vendidas
     * @param num inteiro
     */
    public void setQuantidade(int num){
         this.quantidade = num;
    }
    /**
     * recupera a Classe Sabor da pizza
     * @return classe Sabor
     */
    public Sabor getSabor(){
        return this.sabor;
    }
    /**
     * recupera a classe tamanho da pizza
     * @return classe Tamanho
     */
    public Tamanho getTamanho(){
        return this.tamanho;
    }
    /**
     * Recupera o preço unitario da pizza
     * @return float preco
     */
    public float getPreco(){
        return this.preço;
    }
    /**
     * recupera a quantidade do item
     * @return int quantidade
     */
    public int getQuantidade(){
        return this.quantidade;
    }
    /**
     * Calcula e recupera o preço total do item  a ser comprado
     * @return float preço unitario vezes a quantidade
     */
    public float getPrecoTotal(){
        return this.preço*this.quantidade;
    }
    
}

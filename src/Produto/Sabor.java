/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;
import Produto.Sabor;
import Produto.Ingredientes;
import java.util.ArrayList;
/**
 *Classe que conteim as descrições dos sabores das pizza a serem vendidos
 * @author note
 */
public class Sabor {
    
    private String name;
    private float  precoFatia;
    private ArrayList<Ingredientes>  ingredientes;
    private int saida;
    
    /**
     * Construtor da classe
     * @param name String com descrição do nome da pizza
     * @param valor String com o valor de cada fatia da pizza
     */
    public Sabor(String name, float valor){
        
        this.ingredientes = new ArrayList<Ingredientes>();
        this.name = name;
        this.precoFatia = valor;
        this.saida = 0;
    }
    /**
     * Adiciona um ingrediente a Classe sabor
     * @param I = classe ingrediente
     */
    public void setIngredientes(Ingredientes I){
        ingredientes.add(ingredientes.size(), I);
    }
    /**
     * Retorna o nome do ingrediente
     * @return String nome
     */
    public String getName(){
        return this.name;
    }
    /**
     * Retorno o numero de elementos na lista de igredientes
     * @return int com numero de enlementos da lista
     */
    public int numDeIngredientes(){
        return ingredientes.size();
    }
    /**
     * Recupera um elemento da lista de ingredientes na posição i
     * @param i posição a ser recuperada
     * @return objeto da classe ingrediente a retornar
     */
    public Ingredientes getIngredientes(int i){
        return ingredientes.get(i);
    }
    /**
     * recupera o preco da fatia do sabor
     * @return float precoFatia
     */
    public float getPrecoFatia(){
        return precoFatia;
    }
    /**
     * altera o numero de vezes que essa pizza foi vendida
     * @param num quantidade de saida desse sabor
     */
    public void changeSaida(int num){
        this.saida += num;
    }
    /**
     * recupera o numero de vezes que esse sabor foi vendido
     * @return int saida
     */
    public int getSaida(){
        return this.saida;
    }
}

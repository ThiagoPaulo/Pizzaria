/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;

/**
 *Classe para ingredientes 
 * @author note
 */
public class Ingredientes {
    
    private String nome;
    /**
     * Construtor da class
     * @param nome  = String com a descrição
     */
    public Ingredientes(String nome){
        this.nome = nome;
    }
    /**
     * recupera o nome do ingrediente
     * @return String com o nome do ingrediente
     */
    public String getName(){
        return this.nome;
    }

    
}

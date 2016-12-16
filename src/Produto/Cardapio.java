/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;
import java.util.ArrayList;

/**
 *Classe que guarda os sabores e os tamanhos disponiveis
 * @author note
 */
public class Cardapio {
    
    private ArrayList<Sabor> sabores;
    private ArrayList<Tamanho> tamanhos;
    
    /**
     * Construtor da Classe Cardapio. 
     * inicializa as duas listas
     */
    public Cardapio(){
        sabores = new ArrayList<Sabor>();
        tamanhos = new ArrayList<Tamanho>();
        
    }
    /**
     * Adiciona um sabor a lista
     * @param S = objeto da classe sabor
     */
    public void setSabor(Sabor S){
        sabores.add(S);
    }
    /**
     * Adiciona um tamanho a lista
     * @param T = objeto da classe tamnaho
     */
    public void setTamanho(Tamanho T){
        tamanhos.add(T);
    }
    /**
     * Recupera o numero de elementos da lista de tamanhos
     * @return numero de elementos da lista de tamanhos
     */
    public int getNumTamanho(){
        return this.tamanhos.size();
    }
    /**
     * Recupera o numero de elementos da lista de Sabor
     * @return numero de elementos da lista de Sabor
     */
    public int getNumSabor(){
        return this.sabores.size();
    }
    /**
     * Recupera um elemento da lista de tamanhos
     * @param i posicao do elemento a ser recuperado
     * @return objeto da classe tamanho
     */
    public Tamanho getTamanho(int i){
        return this.tamanhos.get(i);
    }
    /**
     * Recupera um elemento da lista de sabor
     * @param i posicao do elemento a ser recuperado
     * @return objeto da classe sabor
     */
    public Sabor getSabor(int i){
        return this.sabores.get(i);
    }
    /**
     * organiza a lista de sabores em ordem crescente do numero segunda a variavel 'saida' da classe Sabor
     * Algoritimo Bubble sort
     */
    public void sortPorSaida(){
        
       for(int j = this.getNumSabor() -1  ; j >=0 ; j-- )
        for(int i = 0 ; i < j ; i++)
            if(this.sabores.get(i).getSaida() > this.sabores.get(i+1).getSaida()){
                Sabor S = this.sabores.get(i);
                this.sabores.set(i, this.sabores.get(i+1));
                this.sabores.set(i+1, S);
            }
                
    }
    
}

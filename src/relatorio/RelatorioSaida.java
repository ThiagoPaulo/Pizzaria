/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorio;

import Produto.*;

/**
 *Relatorio em ordem crescente dos sabores mais vendidos
 * @author note
 */
public class RelatorioSaida extends Relatorio{
     
    Cardapio cardapio;
    int total;
    /**
     * Construtor do Relatorio de Saida
     * @param C = Cardapio
     */
    public RelatorioSaida(Cardapio C){
        this.cardapio = C;
        cardapio.sortPorSaida();
    }
    /**
     * função que constroi uma String com o Cabeçalho com as informações do pedido
     * @return String a ser impreça
     */
    @Override
    protected String imprimirCabecalho(){
        
        String frase = "Relatorio de Saidas das Pizzas\n";
                
        return frase;
    };
   /**
     * função que constroi uma String com o Rodape com as informações do pedido
     * @return String a ser impreça
     */
    @Override
    protected String imprimirRodape(){
    
        String frase = "Numero total de Pizzas vendidas:\t" + total;
        return frase;
    };
    /**
     * função que constroi uma String com a Linha contendo as informações do pedido
     * @return String a ser impreça
     */
    @Override
    protected String imprimirLinha(int num){
        String frase = new String();
        Sabor S = this.cardapio.getSabor(num);
        if(S.getSaida() != 0){
            frase = S.getName()+ "\t\t" + "Unidades vendidas:\t" + S.getSaida() + "\n";
            this.total += S.getSaida();
            frase += compoeSabores(num);
        }
        return frase;
    };
    /**
     * função que constroi uma String os nomes dos ingredientes o sabor
     * @return String a ser impreça
     */
    private String compoeSabores(int num){
        String frase = new String();

        for(int i = 0 ; i < cardapio.getSabor(num).numDeIngredientes() ; i++ ){
            frase += cardapio.getSabor(num).getIngredientes(i).getName() + ", ";
        }
        frase += "\n";
        return frase;
    }
}

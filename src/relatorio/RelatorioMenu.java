/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorio;

import CadastroClientes.Clientes;
import Produto.*;
import pizzaria.Pedido;

/**
 *Relatorio que imprime o Menu do Restaurante
 * @author note
 */
public class RelatorioMenu extends Relatorio {
    
    Cardapio cardapio;
    /**
     * Construtor
     * @param C Cardapio
     */
    public RelatorioMenu(Cardapio C){
        this.cardapio = C;
    }
    /**
     * Informações do Cabeçalho do relatorio
     * @return string a ser impreça
     */
    @Override
    protected String imprimirCabecalho(){
        
        String frase = "Pizzaria Univali\n\n";
        
        frase += compoeTamanhos();
        
        return frase;
    };
    /**
     * Informações do Rodape do relatorio
     * @return string a ser impreça
     */
    @Override
    protected String imprimirRodape(){
    
        String frase = "";
        return frase;
    };
        /**
     * Informações das Linhas do relatorio
     * @return string a ser impreça
     */
    @Override
    protected String imprimirLinha(int num){
        
        Sabor S = this.cardapio.getSabor(num);
        String frase = (num+1) +". " + S.getName()+ "\t\t" + compoePreco(num) + "\n";
        frase += compoeSabores(num);
        return frase;
    };
    /**
     * constroe uma string com as Informações dos ingredientes
     * @return string a ser impreça
     */
    private String compoeSabores(int num){
        String frase = new String();

        for(int i = 0 ; i < cardapio.getSabor(num).numDeIngredientes() ; i++ ){
            frase += cardapio.getSabor(num).getIngredientes(i).getName() + ", ";
        }
        frase += "\n";
        return frase;
    }
    /**
     * constroe uma string com as Informações dos tamanhos
     * @return string a ser impreça
     */
    private String compoeTamanhos(){
        String frase = new String();
        
        for(int i = cardapio.getNumTamanho()-1 ; i >= 0  ; i--){
            frase += "Pizza " + cardapio.getTamanho(i).getNome() + "  " + cardapio.getTamanho(i).getNumFatia() + " Fatias.\n";
        }
        
        return frase;
    }
        /**
     * constroe uma string com as Informações dos preços
     * @return string a ser impreça
     */
    private String compoePreco(int num){
        String frase = new String();
        
        float preco = cardapio.getSabor(num).getPrecoFatia();
        for(int i = cardapio.getNumTamanho() -1 ; i >= 0  ; i--)
            frase += Float.toString(preco*cardapio.getTamanho(i).getNumFatia()) + "\t";
        
        return frase;
    }
    
}

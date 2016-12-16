/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorio;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import pizzaria.Pedido;
import CadastroClientes.*;
import Produto.*;
/**
 *Relatorio dos pedido efetuas
 * @author note
 */
public class RelatorioPedido extends Relatorio{
    
    Pedido pedido;
    /**
     * construtor do relatorio de pedido
     * @param p = Pedido
     */
    public RelatorioPedido(Pedido p){
        this.pedido = p;
    }
    /**
     * função que constroi uma String com o Cabeçalho com as informações do pedido
     * @return String a ser impreça
     */
    @Override
    protected String imprimirCabecalho(){
        Clientes c = pedido.getCliente();
        String frase ="Codido go Pedido:\t " + pedido.getCodigoPedido() + "\n" + c.getCodigocliente() + "\t" +c.getNome() + "\n";
        frase += c.getEndereco() + "\t" + c.getTelefoni();
        
        return frase;
    };
    /**
     * função que constroi uma String com o Rodape com as informações do pedido
     * @return String a ser impreça
     */
    @Override
    protected String imprimirRodape(){
    
        String frase = "Valor Total da Compra:\t" + pedido.getPrecoTotal();
        return frase;
    };
    /**
     * função que constroi uma String com a Linha contendo as informações do pedido
     * @return String a ser impreça
     */
    @Override
    protected String imprimirLinha(int num){
        
        Pizza p = pedido.getPizza(num);
        String frase = p.getTamanho().getNome() +"\t"+ p.getSabor().getName()+"\t"+p.getPreco()+"\t"+p.getQuantidade()+"\t"+p.getPrecoTotal();
        frase += compoeSabores(p);
        return frase;
    };
    /**
     * função que constroi uma String os nomes dos ingredientes o sabor
     * @return String a ser impreça
     */
    private String compoeSabores(Pizza p){
        String frase = "\n";
        Sabor s = p.getSabor();
        for(int i = 0 ; i < s.numDeIngredientes() ; i++ ){
            frase += s.getIngredientes(i).getName() + ", ";
        }
        return frase;
    }
}

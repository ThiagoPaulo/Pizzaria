/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;
import Produto.*;
import java.util.ArrayList;
import CadastroClientes.Clientes;
/**
 *Classe que controla a venda
 * @author note
 */
public class Pedido {
    
    private static int cod = 0;
    private int codigoPedido;
    private ArrayList<Pizza> pizzas;
    private float precoTotal;
    private Clientes cliente;
    
    /**
     * Construtor da classe, também aloca um codigo unico ao pedido
     * @param c Cliente que esta efetuando a compra
     */
    Pedido(Clientes c){
        
        this.cod++;
        this.codigoPedido= this.cod;
        this.pizzas = new ArrayList();
        this.precoTotal = 0;
        this.cliente = c;
    }
    /**
     * Compoe uma pizza ao pedido, tambem calcula de forma altomatica o preco total do pedido
     * @param sabor sabor da  pizza
     * @param tamanho tamanho da pizza
     * @param num quantidade da pizza
     */
    public void setPizza(Sabor sabor, Tamanho tamanho, int num){
        Pizza p = new Pizza(sabor,tamanho);
        p.setQuantidade(num);
        sabor.changeSaida(num);
        this.pizzas.add(p);
        this.precoTotal += p.getPrecoTotal();
        
    }
    /**
     * retorna o cliente
     * @return cliente
     */
    public Clientes getCliente(){
        return this.cliente;
    }
    /**
     * retorna o preco total do pedido
     * @return precoTotal
     */
    public float getPrecoTotal(){
        return this.precoTotal;
    }
    /**
     * retorna o codigo correspondente ao pedido
     * @return codigoDoPedido
     */
    public int getCodigoPedido(){
        return this.codigoPedido;
    }
    /**
     * retorna o numero de elementos na lista da pizza
     * @return inteiro numero de elementos
     */
    public int getNumDeItens(){
        return pizzas.size();
    }
    /**
     * Retorna um pizza na posição num
     * @param num = int com a posição do elemento da lista a ser recuperado
     * @return = Pizza recuperada na posição num
     */
    public Pizza getPizza(int num){
        return pizzas.get(num);
    }
}

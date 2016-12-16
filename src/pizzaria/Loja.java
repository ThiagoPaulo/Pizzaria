/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;
import java.util.ArrayList;
/**
 *Classe que guarda os pedidos feitos
 * @author note
 */
public class Loja {
    
    private ArrayList<Pedido> pedidos;
    /**
     * Construtor da Classe, inicializa a lista
     */
    Loja(){
        
        pedidos = new ArrayList<Pedido>();
    }
    /**
     * Adiciona pedidos a lista
     * @param P = Pedido
     */
    public void addPedido(Pedido P){
        
        pedidos.add(P);
    }
    /**
     * Retorna pedido na posicao num
     * @param num posição a retornar
     * @return classe na posição num
     */
    public Pedido getPedido(int num){
        return pedidos.get(num);
    }
    /**
     * Função que retorn o numero de pedidos da lista
     * @return int com o numero de elementos da lista
     */
    public int getNumPedido(){
        return pedidos.size();
    }
}

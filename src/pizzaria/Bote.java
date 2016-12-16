/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;
import CadastroClientes.*;
import Produto.*;
import java.util.concurrent.ThreadLocalRandom;
/**
 *Classe bote com a inteligencia e simulação do programa
 * @author note
 */
public class Bote {
    
    private CadastroClientes clientes;
    private Cardapio cardapio;
    private Loja aberta;
    /**
     * Construtor da classe bote
     * @param clientes = classe cliente
     * @param cardapio = classe cardapio
     * @param aberta = classe loja
     */
    Bote(CadastroClientes clientes,Cardapio cardapio, Loja aberta ){
        this.clientes = clientes;
        this.cardapio = cardapio;
        this.aberta = aberta;
    }
    /**
     * procedimento que simula um pedido, sorteando um cliente, uma quantidade de itens , a quantidade de cada item,
     * o sabor e o tamanho
     */
    public void simulaPedido(){
        
        Pedido p = new Pedido(simulaCliente());
        for(int i = 0; i < simulaQuantidade(5) ; i++){
            int quantidade = simulaQuantidade(4);
            if(quantidade == 0) // quantidade iqual a zero representa pedido cancelado
                System.out.println("Pedido Cancelado!!");
            p.setPizza(simulaSabor(),simulaTamanho(), quantidade);
        }
        this.aberta.addPedido(p);
    }
    /**
     * funcao que retorna um numero aleatorio de 0 ao numero de tamanhos cadastrados
     * @return um o objeto da classe tamanho correspondente a posicao sorteada
     */
    private Tamanho simulaTamanho(){
        
        int num = ThreadLocalRandom.current().nextInt(0, cardapio.getNumTamanho());
                
        return cardapio.getTamanho(num);
    }
    /**
     * funcao que retorna um numero aleatorio de 0 ao numero de Sabor cadastrados
     * @return um o objeto da classe Sabor correspondente a posicao sorteada
     */
    private Sabor simulaSabor(){
        
        int num = ThreadLocalRandom.current().nextInt(0, cardapio.getNumSabor());
                
        return cardapio.getSabor(num);
    }
    /**
     * funcao que retorna um numero aleatorio de 0 ao numero do paramero
     * @param max int do valor maximo
     * @return int resuldado do sorteio
     */
    public int simulaQuantidade(int max){
        
        int num = ThreadLocalRandom.current().nextInt(0, max);
                
        return num;
    }
    /**
     * funcao que retorna um numero aleatorio de 0 ao numero de Cliente cadastrados
     * @return um o objeto da classe Sabor correspondente a posicao sorteada
     */
    private Clientes simulaCliente(){
        
        int num = ThreadLocalRandom.current().nextInt(0, clientes.getNumClientes());
              
        return clientes.getClientes(num);
    }
    /**
     * Função que retorna o objeto da classe Loja
     * @return Loja aberta
     */
    public Loja getLoja(){
        return this.aberta;
    }
}

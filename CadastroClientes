/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastroClientes;
import java.util.ArrayList;
import LeitorArquivos.LerCliente;
import java.io.IOException;
/**
 *Classe que guarda os cadastros de clientes
 * @author note
 */
public class CadastroClientes {
    
    private ArrayList<Clientes> clientes;
    /**
     * Construtor da Classe
     * return void
     */
    public CadastroClientes(){
        clientes = new ArrayList<Clientes>();
    }
    /**
     * Procedimento que incicializa a classe que lê o dados dos clientes
     * @throws IOException
     * return void
     */
    public void lerClientes()throws IOException{
        LerCliente dados = new LerCliente();
        int num = dados.LerCliente();
        
        for(int i = 0 ; i < num ; i++){
            setClientes(dados.recuperarClientes());
        }
    }
    /**
     * Adiciona um cliente a lista de clientes
     * @param C = Classe Cliente
     * return void
     */
    private void setClientes(Clientes C){
        clientes.add(C);
    }
    /**
     * Classe para recuperar um cliente da lista
     * @param num = posição que deseja recuperar
     * @return cliente na posição 'num' da lista
     */
    public Clientes getClientes(int num){
        
        return this.clientes.get(num);
    }
    /**
     * recupera o numero de elemntos na lista de clientes
     * @return numero de clientes na lista
     */
    public int getNumClientes(){
        return this.clientes.size();
    }
    
    
}

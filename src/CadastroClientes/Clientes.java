/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastroClientes;

/**
 *Classe para guardar as informações de clientes
 * @author note
 */
public class Clientes {
    
    private String cpf;
    private String nome;
    private String endereco;
    private String fone;
    
    
    /**
     * construtor da Classe Clientes
     * @param codigoCliente = cpf do cliente, proveniente do arquivo txt
     * @param nome = nome do cliente, proveniente do arquivo txt
     * @param endereco = endereço do cliente, , proveniente do arquivo txt
     * @param fone telefoni do cliente, proveniente do arquivo txt
     * return void
     */
    public Clientes(String codigoCliente , String nome, String endereco, String fone){
        
        this.cpf = codigoCliente;
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
    }
    /**
     * Função para retornar o nome do cliente
     * @return String do nome
     */
    public String getNome(){
        return this.nome;
    }
    /**
     * Função para retornar o cpf do cliente
     * @return String contendo o cpf
     */
    public String getCodigocliente(){
        return this.cpf;
    }
    /**
     * Função para retornar o endereço do cliente
     * @return String com o endereço do cliente
     */
    public String getEndereco(){
        return this.endereco;
    }
    /**
     * Função para recuperar o telefoni do cliente
     * @return String com o telefoni do cliente
     */
    public String getTelefoni(){
        return this.fone;
    }
    
}

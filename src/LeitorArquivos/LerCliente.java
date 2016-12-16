/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeitorArquivos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import CadastroClientes.Clientes;
/**
 *Classe que lê os dados contidos no arquivo .txt correspondentes aos Clientes
 * @author note
 */
public class LerCliente {
    
    BufferedReader input;
    /**
     * Construtor da classe, abre o arquivo com dados do cliente
     * @return o numero de instancias dentro do arquivo
     * @throws IOException 
     */
    public int LerCliente() throws IOException{
        this.input = new BufferedReader(new FileReader("dados/dadosClientes.txt"));
        
        return  Integer.parseInt(input.readLine());
    }
    /**
     * Le o arquivo linha por linha
     * @return já no formato da classe Cliente
     * @throws IOException 
     */
    public Clientes recuperarClientes() throws IOException{
        
        String codigoCliente = input.readLine();
        String nome = input.readLine();
        String endereco =  input.readLine();
        String fone =  input.readLine();
        Clientes C = new Clientes(codigoCliente, nome, endereco, fone);
        return C;
    }
}

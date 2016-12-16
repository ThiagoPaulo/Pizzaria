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
import Produto.Tamanho;
/**
  *Classe que lê os dados contidos no arquivo .txt correspondentes aos Tamanhos
 * @author note
 */
public class LerTamanho {
    
    BufferedReader input;
    /**
     * Construtor da classe, abre o arquivo com dados do Tamanho
     * @return o numero de instancias dentro do arquivo
     * @throws IOException 
     */
    public int LerTamanho() throws IOException{
        this.input = new BufferedReader(new FileReader("dados/dadosTamanho.txt"));
        
        return  Integer.parseInt(input.readLine());
    }
    /**
     * Le o arquivo linha por linha
     * @return já no formato da classe Tamanho
     * @throws IOException 
     */
    public Tamanho recuperarTamanhos() throws IOException{
        
        String nome = input.readLine();
        int numFatia = Integer.parseInt(input.readLine());
        Tamanho t = new Tamanho(nome, numFatia);
        return t;
    }
}

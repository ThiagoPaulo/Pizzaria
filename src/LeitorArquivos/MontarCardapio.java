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
import Produto.Cardapio;
import Produto.Tamanho;
/**
 *Classe que junta as informações da classe sabor e tamanho para formar a classe cardpio
 * @author note
 */
public class MontarCardapio {
     
    private Cardapio C;
    /**
     * Construtor da classe
     */
    public MontarCardapio(){
        C = new Cardapio();
    }
    /**
     * procedimento que inicializa o processo de leitura dos arquivo de tamanho e sabor
     * @throws IOException 
     */
    public void setCardapio()throws IOException{
        
        setTamanho();
        setSabores();
    }
    /**
     * Procedimento que preenchi o cardapio com os tamanhos disponiveis
     * @throws IOException 
     */
    private void setTamanho()throws IOException{
        LerTamanho T = new LerTamanho();
        int num = T.LerTamanho();
        for(int i = 0 ; i < num ; i++){
            
             C.setTamanho(T.recuperarTamanhos());
        }
    }
    /**
     * Procedimento que agrega os sabores ao cardapio
     * @throws IOException 
     */
    private void setSabores()throws IOException{
        LerSabor S = new LerSabor();
        int num = S.LerSabor();
        
        for(int i = 0 ; i < num ; i++){
            C.setSabor(S.recuperaSabor());
        }
    } 
    /**
     * Função que recupera o cardapio
     * @return 
     */
    public Cardapio getCardapio(){
        return this.C;
    }
    
}

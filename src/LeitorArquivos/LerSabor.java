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
import Produto.Ingredientes;
import Produto.Sabor;
import java.util.ArrayList;
/**
  *Classe que lê os dados contidos no arquivo .txt correspondentes aos Sabores
 * @author note
 */
public class LerSabor {
    
    BufferedReader input;
    /**
     * Construtor da classe, abre o arquivo com dados do Sabor
     * @return o numero de instancias dentro do arquivo
     * @throws IOException 
     */
    public int LerSabor() throws IOException{
        this.input = new BufferedReader(new FileReader("dados/dadosSabores.txt"));
        
        return  Integer.parseInt(input.readLine());
    }
    /**
     * Le o arquivo linha por linha
     * @return já no formato da classe Sabor
     * @throws IOException 
     */
    public Sabor recuperaSabor() throws IOException{
 
        String name = input.readLine();
        String I = input.readLine();
        float valor = Float.parseFloat(input.readLine());
        int i = 0;
        Sabor S = new Sabor(name,valor);
        String auxIngredientes = new String();
        do{
            
            if(I.charAt(i) != ',' )
                auxIngredientes +=  I.charAt(i);
            else{
                Ingredientes Ing =  new Ingredientes(auxIngredientes);
                S.setIngredientes(Ing);
                String aux = I.substring(i);
                auxIngredientes = new String();
            }
          i++;  
        }while(I.charAt(i) != '.');
        
        Ingredientes Ing =  new Ingredientes(auxIngredientes);
        S.setIngredientes(Ing);
        String aux = I.substring(i);
        auxIngredientes = new String();
        return S;
    }
    
}

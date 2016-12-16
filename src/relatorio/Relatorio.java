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
/**
 *Template de dodos os relatorios
 * @author note
 */
public abstract class Relatorio {
    
    File output;
    FileWriter file;
    BufferedWriter bw;
    /**
     * Abre o arquivo que sera salvo o conteudo
     * @param end
     * @throws IOException 
     */
    public void setRelatorio(String end) throws IOException{
        this.output = new File("output/pedido" +end+".txt");
        if(!output.exists()){
                output.createNewFile();
        }
        file = new FileWriter(output.getAbsoluteFile());
        bw = new BufferedWriter(file);
    }
    /**
     * Classe abstrada para o cabeçalho do arquivo
     * @return String para impreção
     */
    protected abstract String imprimirCabecalho();
    /**
     * Classe abstrada para o rodape do arquivo
     * @return String para impreção
     */
    protected abstract String imprimirRodape();
    /**
     * Classe abstrada para quaquer linha do arquivo
     * @return String para impreção
     */
    protected abstract String imprimirLinha(int num);
    /**
     * Procedimento que constroe o relatorio a ser impreço
     * @param num numero de linhas a serem impreças
     * @throws IOException 
     */
    public void imprimir(int num) throws IOException{
        bw.write(imprimirCabecalho());
        for (int i = 0 ; i < num ; i++) {
            bw.write(imprimirLinha(i));
        }
        bw.write(imprimirRodape());
        
        bw.close();
    }
    
}

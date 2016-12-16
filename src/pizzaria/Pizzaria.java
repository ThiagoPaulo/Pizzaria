/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;
import LeitorArquivos.MontarCardapio;
import Produto.Cardapio;
import java.io.IOException;
import CadastroClientes.*;
import relatorio.*;
/**
 *Classe pizzaria responsavel pela execução do programa
 * @author note
 */
public class Pizzaria {

    /**
     * Traz os dados para memoria e chama os relatorios requisitados
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        
        
        Cardapio C = new Cardapio();
        MontarCardapio cardapio = new MontarCardapio();
        cardapio.setCardapio();
        C = cardapio.getCardapio();
        CadastroClientes clientes = new CadastroClientes();
        clientes.lerClientes();
        Loja aberta = new Loja();
        
        RelatorioMenu menu = new RelatorioMenu(C);
        menu.setRelatorio("Menu");
        int num = C.getNumSabor();
        menu.imprimir(num);
        
        simulacao(clientes, C, aberta);
        
        RelatorioSaida saida = new RelatorioSaida(C);
        saida.setRelatorio("Saida");
        saida.imprimir(num);
        
        RelatorioSemSaida semVenda = new RelatorioSemSaida(C);
        semVenda.setRelatorio("Sem_Venda");
        semVenda.imprimir(num);
        
    }
    /**
     * Chama a simulação 
     * @param clientes = CadastroClientes
     * @param cardapio = Cardapio
     * @param aberta = Loja
     * @throws IOException 
     */
    public static void simulacao(CadastroClientes clientes,Cardapio cardapio, Loja aberta )throws IOException{
        
        System.out.println("Inicia simulação");
        Bote simulador = new Bote(clientes, cardapio, aberta);
        int repeticao = simulador.simulaQuantidade(10)+1;
        for(int i = 0 ; i < repeticao ; i++){
        simulador.simulaPedido();
        }
        System.out.println("Fim simulação");
        
        for(int i = 0 ; i < simulador.getLoja().getNumPedido(); i++){
            RelatorioPedido relatorio = new RelatorioPedido(aberta.getPedido(i));
            relatorio.setRelatorio(Integer.toString(aberta.getPedido(i).getCodigoPedido()));
            int num = aberta.getPedido(i).getNumDeItens();
            relatorio.imprimir(num);
        }
    }
}

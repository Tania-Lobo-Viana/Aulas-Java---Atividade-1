/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao6;

import java.util.Scanner;

/**
 *
 * @author R
 */
public class Questao6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner(System.in);
        System.out.println(" Questao 5 - Calcular a vazão (nº de pacotes transmitidos) de um canal de dados");
        
        double capcanal;
        double vazao;
        double tampacote;
        
        System.out.println(" Digite a capacidade do canal em Mbps: ");
        capcanal = ler.nextDouble();
        
        System.out.println(" Digite o tamanho do pacote de dados em bits: ");
        tampacote = ler.nextDouble();
        
        vazao = capcanal / tampacote;
        
        System.out.println("\n A vazão do canal é:  "+vazao);
    }
    
}

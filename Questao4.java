/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

import java.util.Scanner;

/**
 *
 * @author R
 */
public class Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner (System.in);
        System.out.println("Questao 4 - Calcular o comprimento e a área de uma circunferência");
        
        int raio;
        double circ;
        double area;
        double pi = 3.14;
        
        System.out.println(" Digite o valor do raio:");
        raio = ler.nextInt();
        
        circ = 2 * (pi*raio);
        System.out.println("\n Comprimento da circunferência: " + circ);
        
        area = pi * raio * raio;
        System.out.println("\n Área da circunferência: " +area);
    }
    
}

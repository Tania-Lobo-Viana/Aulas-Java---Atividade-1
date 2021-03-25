/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao5;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Questao5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Questão 5");
        System.out.println(" Exibir a tabuada de um número qualquer ");
        
        Scanner ler = new Scanner (System.in);
        int entrada;
        
        System.out.println("  Informe um número: ");
            entrada= ler.nextInt();
            
        int multiplicador = 1;
        while (multiplicador <=10) {
            int resultado = entrada * multiplicador;
            System.out.println(entrada + "*" + multiplicador + "=" + resultado);
            multiplicador ++;
        }
    }
    
}

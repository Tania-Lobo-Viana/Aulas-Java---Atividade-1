/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Questão3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Questão 3");
        
        try (Scanner ler = new Scanner (System.in)) {
            double nota1, nota2, nota3, nota4, media;
            
            System.out.println("  1° nota: ");
            nota1 = ler.nextDouble();
            
            System.out.println("  2° nota: ");
            nota2 = ler.nextDouble();
            
            System.out.println("  3° nota: ");
            nota3 = ler.nextDouble();
            
            System.out.println("  4° nota: ");
            nota4 = ler.nextDouble();
            
            media = (nota1+nota2+nota3+nota4)/4;
            
            System.out.println(" A méda do aluno é:   " + media);
            if (media >=7) {
                System.out.println( "Parabéns, aluno aprovado com sucesso!");
            }
            else {
                System.out.println("Infelizmente você foi reprovado. Estude mais!");
            }
            
            
        }
    }
    
}

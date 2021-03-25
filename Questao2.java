/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SOLICITAR A QUANTIDADE DE ALUNO DO SEXO FEMININO E MASCULINO DE UMA FACULDADE, CALCULAR TAMBÉM A PORCENTAGEM DE CADA SEXO");
        
        Scanner ler = new Scanner (System.in);
            double masc, fem, qtdetotal;
        
        System.out.println("Informe a quantidade de  homens:  ");
        masc = ler.nextDouble();
        
        System.out.println("Informe a quantidade de mulheres:  ");
        fem = ler.nextDouble();
        
        qtdetotal = masc + fem;
        
        System.out.println("Homens:  " + masc);
        System.out.println("Mulheres:  " + fem);
        System.out.println("Total de alunos:  " + qtdetotal);
        
        double porcentagemmasc, porcentagemfem;
        
        porcentagemmasc = (masc / qtdetotal) * 100;
        porcentagemfem = (fem / qtdetotal) * 100;
        
        System.out.println("Percentual masculino:  " + porcentagemmasc + " % ");
        System.out.println("Percentual feminino:  " + porcentagemfem + " % ");
        


}   
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

import java.util.Scanner;

/**
 *
 * @author R
 */
public class Questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Questao 1 - Dado o ano de nascimento da pessoa, calcule e mostre:");
        System.out.println(" A) Sua idade atual");
        System.out.println(" B) Se a pessoa é maior ou menor de idade");
        System.out.println(" A) Ano em que ela terá o triplo da idade atual");
        
        Scanner ler = new Scanner(System.in);
        int anonasc, anoatual, idadeatual, anotriploidade;
        
        System.out.println(" Digite o ano do seu nascimento: ");
        anonasc = ler.nextInt();
        
        System.out.println(" Digite o ano atual: ");
        anoatual = ler.nextInt();
        
        idadeatual = anoatual - anonasc;
        
        System.out.println("Sua idade atual é:  " +idadeatual+ " anos");
        
        if (idadeatual <18) {
            System.out.println(" Você ainda é menor de idade! ");
        }
        else {
            System.out.println(" Parabéns pela maioridade, aproveite com sabedoria!");
        }
        anotriploidade = (idadeatual*3) + anoatual;
        
        System.out.println("Em " +anotriploidade+ " você terá o triplo da sua idade atual");
    }
    
}

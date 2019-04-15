/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorpessoasorg;

import java.util.Scanner;

/**
 *
 * @author jmsgfhr
 */
public class VetorPessoasOrg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int PESSOAS = 10;
        Scanner teclado=new Scanner(System.in);
        Pessoas[] pessoas= new Pessoas[PESSOAS];
        
        for (int i = 0; i < PESSOAS; i++) {
            //teclado.next();
            System.out.println("Digite o nome da "+(i+1)+"ª pessoa: ");
            String nome=teclado.next();
            System.out.println("Digite a idade da "+(i+1)+"ª pessoa: ");
            int idade=teclado.nextInt();
            pessoas[i]=new Pessoas(idade,nome);
        }
        
        pessoas=OrdemCrescente(pessoas);
        System.out.println("----------------- Ordem Crescente -----------------");
        for (int i = 0; i < PESSOAS; i++) {
            System.out.println("Nome: "+pessoas[i].getNome()+" Idade:"+pessoas[i].getIdade());
        }
        
        pessoas=OrdemAlfabetica(pessoas);
        System.out.println("----------------- Ordem Alfabetica -----------------");
        for (int i = 0; i < PESSOAS; i++) {
            System.out.println("Nome: "+pessoas[i].getNome()+" Idade: "+pessoas[i].getIdade());
        }
    }
    
    public static Pessoas[] OrdemCrescente(Pessoas[] pessoas){
        for (int i = 1 ; i < pessoas.length ; i++) {
            Pessoas aux;
            for (int j = 1 ; j < pessoas.length ; j++) {
                if(pessoas[j].getIdade()<pessoas[j-1].getIdade()){
                    aux=pessoas[j];
                    pessoas[j]=pessoas[j-1];
                    pessoas[j-1]=aux;
                }
            }
        }
        return pessoas;
    }
    
    public static Pessoas[] OrdemAlfabetica(Pessoas[] pessoas){
        for (int i = 1 ; i < pessoas.length ; i++) {
            Pessoas aux;
            for (int j = 1 ; j < pessoas.length ; j++) {
                if((pessoas[j].getNome().compareToIgnoreCase(pessoas[j-1].getNome()))<0){
                    aux=pessoas[j];
                    pessoas[j]=pessoas[j-1];
                    pessoas[j-1]=aux;
                }
            }
        }
        return pessoas;
    }
}
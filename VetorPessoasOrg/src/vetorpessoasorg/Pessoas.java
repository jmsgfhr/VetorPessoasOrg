package vetorpessoasorg;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jmsgfhr
 */
public class Pessoas {

    private int idade;
    private String nome;
    
    public Pessoas(int x,String y){
        idade = x;
        nome = y;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Aluno;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author erick Dentro dessa classe vai ser testado todos os requisitos da classe serviços
 * 
 */
public class Main {
    
    
    public static void main(String[] args){
        String nome = "Erick Santos";
        System.out.println("Aluno "+ nome);
        
        Servico servico = new Servico(1, "Mensalidade", 50);
        
        System.out.println("Serviço: "+  servico.getDescricao());
        System.out.println("Valor: "+  servico.getValor());
        
        
        Aluno aluno = new Aluno(1, "Erick Santos", 'M', "81985270632", "Tv do nobre 2857");
        System.out.println(aluno);
        
        Usuario usuario = new Usuario(1, "cezar", "senha");
        System.out.println(usuario);
    }
}

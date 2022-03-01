/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Aluno;
import Model.Mensalidade;
import Model.Pessoa;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author erick Dentro dessa classe vai ser testado todos os requisitos e classes/ A classe "ABSTRATA" pessoa e não pode ser instânciada para não se juntar com outras classes e vir a confundir o código 
 * 
 */
public class Main {
    
    
    public static void main(String[] args){
        String nome = "Erick Santos";
        System.out.println("Aluno "+ nome);
        
        Servico servico = new Servico(1, "Mensalidade", 50);
        
        System.out.println("Serviço: "+  servico.getDescricao());
        System.out.println("Valor: "+  servico.getValor());
        
        
        Aluno aluno = new Aluno(1, "erick", "Tv do nobre 2857", "53401611");
        System.out.println(aluno.getNome());
        
        Usuario usuario = new Usuario(1, "professor", "senha");
        System.out.println(usuario.getNome()); 
    
        Mensalidade mensalidade = new Mensalidade(1, aluno, servico, 50, "18/02/2022  14:00"); 
        System.out.println(mensalidade.getAluno().getNome());
       
    }
}

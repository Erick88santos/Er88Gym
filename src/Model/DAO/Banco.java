/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Mensalidade;
import Model.Aluno;
import Model.Servico;
import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Aluno> aluno;
    public static ArrayList<Servico> servico;
    public static ArrayList<Mensalidade> mensalidade;
    
    
    
    @SuppressWarnings("empty-statement")
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        aluno = new ArrayList<Aluno>();
        servico = new ArrayList<Servico>();
        mensalidade = new ArrayList<Mensalidade >();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "professor", 'M', "09/05/1996", "30212121", "cezar.atitude@gmail.com", "521454123", "professor", "administrador");
        Usuario usuario2 = new Usuario(2, "estagiario", 'M', "09/05/1996", "30212122", "estagiarioatitude@gmail.com", "451244123", "estagiario", "funcionario");
         
        Aluno aluno1 = new Aluno(1, "Alan Figueiredo", 'M', "30/01/1995", "30212126", "tiagoluz.h607@gmail.com", "5142487", "Rua jaboti 35 Canudos NH",  "93300012");
        Aluno aluno2 = new Aluno(2, "Judite Oliveira", 'F', "30/08/1994", "30212127", "juditeoliveirapet@gmail.com", "5142487745", "Rua campo bom 78 Centro NH",  "93300045");
        Aluno aluno3 = new Aluno(3, "Paulo Ricado", 'M', "24/04/1997", "30212128", "pauloricardopet@gmail.com", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH",  "933007496");
        Aluno aluno4 = new Aluno(4, "Neymar Santos", 'M', "20/08/1995", "30212130", "neymarsantospet@gmail.com", "2745487", "Rua Lombardi 40 Canudos NH",  "93300748");
        Aluno aluno5 = new Aluno(5, "Debruine Pipoqueiro", 'M', "13/09/1992", "30212131", "debruinepet@gmail.com", "4742487", "Rua pedro quaresma 784 Canudos Belgica",  "933000847");
        Aluno aluno6 = new Aluno(6, "Matuidi Pareira", 'M', "17/08/1994", "302122324", "matuidipet@gmail.com", "78512457", "Rua champions 10 Kephas Franca",  "933000782");
        Aluno aluno7 = new Aluno(7, "Marta de Souza", 'F', "25/03/1993", "302121292", "martasouzapet@gmail.com", "4658237314", "Rua tesla 215 Canudos NH",  "93352012");
        Aluno aluno8 = new Aluno(8, "Aline Ferrari", 'F', "04/03/1990", "302121451", "alineferraripet@gmail.com", "8475123687", "Rua hyrule 32 Canudos NH",  "9334714747");
        Aluno aluno9 = new Aluno(9, "Samuel Coltinho", 'M', "09/02/1998", "302121189", "samuelcoltinhopet@gmail.com", "74595142487", "Rua floresta 12 Canudos NH",  "9330046364");
        Aluno aluno10 = new Aluno(10, "Felipe Luis", 'M', "12/06/1999", "3021212478", "felipeluispet@gmail.com", "845713647", "Rua marechal 1023 Canudos NH",  "933000874");
        
        Servico servico1 = new Servico(1, "Mensalidade", 55);
        Servico servico2 = new Servico(2, "Personal", 150);
        Servico servico3 = new Servico(3, "Aplique de Knésio", 25);
        Servico servico4 = new Servico(4, "Escolinha de futebol", 50);
        Servico servico5 = new Servico(5, "Venda de Material", 10);
        Servico servico6 = new Servico(6, "Venda de Suplementos", 120);

        Mensalidade mensalidade1 = new Mensalidade(1, aluno1, servico2, 150, "14/02/2022 09:30");
        Mensalidade mensalidade2 = new Mensalidade(2, aluno2, servico4, 50, "14/02/2022 10:00");
        Mensalidade mensalidade3 = new Mensalidade(3, aluno3, servico1, 55, "14/02/2022 10:30");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        aluno.add(aluno1);
        aluno.add(aluno2);
        aluno.add(aluno3);
        aluno.add(aluno4);
        aluno.add(aluno5);
        aluno.add(aluno6);
        aluno.add(aluno7);
        aluno.add(aluno8);
        aluno.add(aluno9);
        aluno.add(aluno10);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        
        mensalidade.add(mensalidade1);
        mensalidade.add(mensalidade2);
        mensalidade.add(mensalidade3);
        
    }
    
    
}

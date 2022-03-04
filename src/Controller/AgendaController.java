/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.DAO.MensalidadeDAO;
import Model.Mensalidade;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author erick
 */
public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    
    public void atualizaTabela(){
        //Busca lista com agendamentos do banco de dados, lembrar de nome no plural 'mensalidades'..
        MensalidadeDAO mensalidadeDAO = new MensalidadeDAO();
        ArrayList<Mensalidade> mensalidades = mensalidadeDAO.selectAll();
       
        //Exibir esta lista na view
        helper.preencherTabela(mensalidades);
        
    }
    
}

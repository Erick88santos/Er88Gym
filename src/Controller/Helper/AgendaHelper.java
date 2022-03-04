/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Mensalidade;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author erick
 */
public class AgendaHelper {
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Mensalidade> mensalidades) {
       
       DefaultTableModel tableModel = (DefaultTableModel) view.getTableMensalidade().getModel();
       tableModel.setNumRows(0);
        
        //percorrendo a lista preenchendo o tableModel
            for (Mensalidade mensalidade : mensalidades) {

                tableModel.addRow(new Object[]{     
                    mensalidade.getId(),
                    mensalidade.getAluno().getNome(),
                    mensalidade.getServico().getDescricao(),
                    mensalidade.getValor(),
                    mensalidade.getData(),
                    mensalidade.getObservacao()       
                });
            
        }
        
        
        
    }
 
}

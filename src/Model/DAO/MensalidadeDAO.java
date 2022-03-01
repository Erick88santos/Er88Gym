/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Mensalidade;
import java.util.ArrayList;

/**
 *
 * @author erick
 */
public class MensalidadeDAO {
    
    /**
     * Insere um agendamento dentro do banco de dados
     * @param mensalidade exige que seja passado um objeto do tipo agendamento
     */
    public void insert(Mensalidade mensalidade){
          
        if(mensalidade.getId() == 0){
            mensalidade.setId(proximoId());
            Banco.mensalidade.add(mensalidade);
        }
        
        
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param mensalidade
     * @return 
     */
    public boolean update(Mensalidade mensalidade){
        
        for (int i = 0; i < Banco.mensalidade.size(); i++) {
            if(idSaoIguais(Banco.mensalidade.get(i),mensalidade)){
                Banco.mensalidade.set(i, mensalidade);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id da mensalidade passado
     * @param mensalidade
     * @return 
     */
    public boolean delete(Mensalidade mensalidade){
        for (Mensalidade mensalidadeLista : Banco.mensalidade) {
            if(idSaoIguais(mensalidadeLista,mensalidade)){
                Banco.mensalidade.remove(mensalidadeLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os mensalidade do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Mensalidade> selectAll(){
        return Banco.mensalidade;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param mensalidade
     * @param mensalidadeAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Mensalidade mensalidade, Mensalidade mensalidadeAComparar) {
        return mensalidade.getId() ==  mensalidadeAComparar.getId();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (Mensalidade mensalidade : Banco.mensalidade) {           
           int id = mensalidade.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    }
    
}

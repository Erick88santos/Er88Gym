/*

 */
package Model.DAO;

import Model.Aluno;
import java.util.ArrayList;

/**
 *
 * @author erick
 */
public class AlunoDAO {
    
    
    /**
     * Insere um aluno dentro do banco de dados
     * @param aluno exige que seja passado um objeto do tipo cliente
     */
    public void insert(Aluno aluno){
        Banco.aluno.add(aluno);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param aluno
     * @return 
     */
    public boolean update(Aluno aluno){
        
        for (int i = 0; i < Banco.aluno.size(); i++) {
            if(idSaoIguais(Banco.aluno.get(i),aluno)){
                Banco.aluno.set(i, aluno);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do aluno passado
     * @param aluno
     * @return 
     */
    public boolean delete(Aluno aluno){
        for (Aluno alunoLista : Banco.aluno) {
            if(idSaoIguais(alunoLista,aluno)){
                Banco.aluno.remove(alunoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os aluno do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Aluno> selectAll(){
        return Banco.aluno;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param aluno
     * @param AlunoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Aluno aluno, Aluno  alunoAComparar) {
        return  aluno.getId() ==   alunoAComparar.getId();
    }
    
    
    
}

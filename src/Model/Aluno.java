/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author erick  Detalhe de acessibilidade da página aluno
 */
public class Aluno extends Pessoa{
    

    private String endereco;
    private String cep;

    public Aluno(String endereco, String cep, int id, String nome, char sexo, String dataNascimento, String telefone, String email, String documento) {
        super(id, nome, sexo, dataNascimento, telefone, email, documento);
        this.endereco = endereco;
        this.cep = cep;
}

    public Aluno( int id, String nome, String endereco, String cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }
     
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

   



}
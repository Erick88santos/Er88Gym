/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Usuario;
import View.Login;

/**
 *
 * @author erick
 */
public class LoginController {

    private final Login View;

    public LoginController(Login View) {
        this.View = View;
    }
    
    public void entrarNoSistema(){
        //Pegando usuário da View
    String nome = View.getTextUsuario().getText();
    String senha = View.getTextSenha().getText();
    
    Usuario modelo = new Usuario(0, nome, senha);
    
    }
    
    public void fizTarefa(){
       System.out.println("Fiz uma consulta de algo do DataBASE");
      
        this.View.exibeMensagem("Você precisa de um usuário e senha para acessar o ERGym");
    }
    
}

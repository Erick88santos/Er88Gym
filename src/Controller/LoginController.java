/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Login;

/**
 *
 * @author erick
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        //Pegando usuário da View
   
    
    }
    
    public void fizTarefa(){
       System.out.println("Fiz uma consulta de algo do DataBASE");
      
        this.view.exibeMensagem("Você precisa de um usuário e senha para acessar o ERGym");
    }
    
}

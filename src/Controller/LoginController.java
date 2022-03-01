/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

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
        Usuario usuario = helper.obterModelo();
        
        //Pesquisando usuarioDAO do banco dao
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        ///Se o usuário da view tiver o  mesmo usuario e senha do banco direcionar para menu principal
        ///Se não informar mensagem "Usuario ou senha inválidos..."
        if(usuarioAutenticado != null){
            //navegar para o menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
            
        }else {
            view.exibeMensagem("Usuário ou Senha inválidos..");
        }
    }
    
    public void fizTarefa(){
       System.out.println("Fiz uma consulta de algo do DataBASE");
      
        this.view.exibeMensagem("Você precisa de um usuário e senha para acessar o ERGym");
    }
    
}

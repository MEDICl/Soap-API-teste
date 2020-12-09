package model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {
    private static List<Usuario> Usuarios = new ArrayList<>();

    public UsuarioDao(){
        popularUsuarios();
    }

    public void popularUsuarios(){
        Usuario usuario = new Usuario("Paulo","27/08/1999","Basico","Leão");
        Usuario usuario1 = new Usuario("pedro","27/08/1999","Avançado","Leão");
        Usuario usuario2 = new Usuario("marcos","27/08/1999","Avançado","Leão");
        Usuario usuario3 = new Usuario("felipe","27/08/1999","Basico","Leão");
        Usuarios.add(usuario);
        Usuarios.add(usuario1);
        Usuarios.add(usuario2);
        Usuarios.add(usuario3);
    }
    public Usuario checkUser(String nome){
        Usuario usuarioCorreto = new Usuario();
        for (Usuario usuario:
             Usuarios) {
            if(usuario.Nome.equals(nome))
                usuarioCorreto =  usuario;
        }
        return usuarioCorreto;
    }
    public boolean checkPremium(Usuario usuario){
        if(usuario.Plano.equals("Avançado"))
                return true;
        return false;
    }
    public void cadastrarUsuario(Usuario usuario){
        Usuarios.add(usuario);
    }
}

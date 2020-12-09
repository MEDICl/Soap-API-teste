package ws;

import model.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
public class Storage {
    public UsuarioDao Usuarios = new UsuarioDao();
    public PrevisaoDao Previsoes = new PrevisaoDao();

    @WebMethod(operationName = "Previsao")
    public String getPrevisao(@WebParam(name = "usuario") String usuario) {
        return Previsoes.sortearPrevisao(usuario);
    }

    @WebMethod(operationName = "cadastrarUsuario")
    public Usuario cadastrarUsuario(@WebParam(name = "usuario") Usuario usuario){
        System.out.println(usuario.Nome + " foi cadastrado !");
        Usuarios.cadastrarUsuario(usuario);
        return usuario;
    }
}

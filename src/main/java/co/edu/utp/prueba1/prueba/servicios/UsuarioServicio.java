package co.edu.utp.prueba1.prueba.servicios;

import co.edu.utp.prueba1.prueba.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioServicio {

    private List<Usuario> usuarios = new ArrayList<>();

    public Usuario guardarUsuario(Usuario usuario){
        if(usuarios.isEmpty()){
            usuario.setId(0);
        } else{
            usuario.setId(usuarios.size()); //ID del ultimo usuario
        }
        usuarios.add(usuario);
        Usuario usuarioResponse = Usuario.builder().id(usuario.getId()).build();
        
        return usuarioResponse;
    }
}

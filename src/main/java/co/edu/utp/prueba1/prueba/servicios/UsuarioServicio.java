package co.edu.utp.prueba1.prueba.servicios;

import co.edu.utp.prueba1.prueba.modelo.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServicio {

    private List<Usuario> usuarios = new ArrayList<>();

    public Usuario guardarUsuario(Usuario usuario){
        if(usuarios.isEmpty()){
            usuario.setId(0);
        } else{
            usuario.setId(usuarios.size()); //ID del ultimo usuario
        }
        usuarios.add(usuario);
        Usuario usuarioResponse = Usuario.builder().id(usuario.getId()).apellido(usuario.getApellido())
                .telefono(usuario.getTelefono()).nombre(usuario.getNombre()).build();

        return usuarioResponse;
    }

    public Usuario obtenerUsuario(int id) {
        Usuario usuarioResponse = new Usuario();
        for(Usuario usuario:usuarios){
            if(usuario.getId()==id){
                usuarioResponse = usuario;
            }
        }
        return usuarioResponse;
    }

    public Usuario eliminarUsuario(int id) {
        Usuario usuarioResponse = new Usuario();
        for(Usuario usuario:usuarios){
            if(usuario.getId()==id){
                usuarios.remove(usuario);
            }
        }
        return usuarioResponse;
    }

    public Usuario actualizarUsuario(int id, String nombre) {
        Usuario usuarioResponse = new Usuario();
        for(Usuario usuario:usuarios){
            if(usuario.getId()==id){
                usuario.setNombre(nombre);
            }
        }
        return usuarioResponse;
    }
}

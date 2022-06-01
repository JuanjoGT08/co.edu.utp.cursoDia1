package co.edu.utp.prueba1.prueba.web;

import co.edu.utp.prueba1.prueba.modelo.Usuario;
import co.edu.utp.prueba1.prueba.servicios.UsuarioServicio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UsuarioController {

    private UsuarioServicio usuarioServicio;

    @PostMapping("guardarUsuario")
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        return usuarioServicio.guardarUsuario(usuario);
    }
}

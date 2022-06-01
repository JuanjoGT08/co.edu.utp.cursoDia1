package co.edu.utp.prueba1.prueba.web;

import co.edu.utp.prueba1.prueba.modelo.Usuario;
import co.edu.utp.prueba1.prueba.servicios.UsuarioServicio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
@AllArgsConstructor
public class UsuarioController {

    private UsuarioServicio usuarioServicio;

    @PostMapping("guardarUsuario")
    public Usuario guardarUsuario(@RequestBody Usuario usuario){return usuarioServicio.guardarUsuario(usuario);}
    @GetMapping("obtenerUsuario")
    public Usuario getUsuario(@RequestParam("id") int id){return usuarioServicio.obtenerUsuario(id);}
    @GetMapping("eliminarUsuario")
    public Usuario eliminarUsuario(@RequestParam("id") int id){return usuarioServicio.eliminarUsuario(id);}
    @GetMapping("actualizarUsuario/{id}/{nombre}")
    public Usuario actualizarUsuario(@PathVariable("nombre") String nombre, @PathVariable("id") int id){return usuarioServicio.actualizarUsuario(id, nombre);}
}

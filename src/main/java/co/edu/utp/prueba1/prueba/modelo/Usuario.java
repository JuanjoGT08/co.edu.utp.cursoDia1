package co.edu.utp.prueba1.prueba.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String telefono;


}

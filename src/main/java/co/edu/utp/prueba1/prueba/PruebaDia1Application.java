package co.edu.utp.prueba1.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

//Git
@RestController
@RequestMapping("prueba")
@SpringBootApplication
public class PruebaDia1Application {
    @GetMapping("/{nombre}/{apellido}")
	public String getUsuario(@PathVariable("nombre") String nombre,
							 @PathVariable("apellido") String apellido){
		return String.format("hola %s %s", nombre, apellido);
	}
	@GetMapping()
	public String getNombre(@RequestParam("nombre") String nombre){
		return String.format("hola %s", nombre);
	}
	public static void main(String[] args) {
		SpringApplication.run(PruebaDia1Application.class, args);
	}

}

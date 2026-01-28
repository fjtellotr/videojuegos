package pe.idat.videojuegos.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.idat.videojuegos.dto.JugadorDTO;
import pe.idat.videojuegos.service.JugadorService;

import java.util.List;

@RestController
@RequestMapping("/api/jugadores")
@RequiredArgsConstructor
public class JugadorController {

    private final JugadorService jugadorServide;

    @GetMapping
    public ResponseEntity<List<JugadorDTO>> obtenerTodosJugadores()
    {
        List<JugadorDTO> jugadores = jugadorServide.obtenerTodosJugadores();
        return ResponseEntity.ok(jugadores);
    }

}

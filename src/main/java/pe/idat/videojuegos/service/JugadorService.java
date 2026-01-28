package pe.idat.videojuegos.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.idat.videojuegos.dto.JugadorDTO;
import pe.idat.videojuegos.entity.Jugador;
import pe.idat.videojuegos.repository.JugadorRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JugadorService {

    private final JugadorRepository jugadorRepository;
    public List<JugadorDTO> obtenerTodosJugadores()
    {
        return jugadorRepository.findAll().stream()
                .map(this::convertirADTO)
                .collect(Collectors.toList());
    }

    private JugadorDTO convertirADTO(Jugador jugador){
        JugadorDTO dto = new JugadorDTO();
        dto.setId(jugador.getId());
        dto.setNombre(jugador.getNombre());
        dto.setEmail(jugador.getEmail());
        dto.setFechaRegistro(jugador.getFechaRegistro());
        return dto;
    }
}

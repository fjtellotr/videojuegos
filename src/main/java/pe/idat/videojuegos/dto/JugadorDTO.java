package pe.idat.videojuegos.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class JugadorDTO {
    private Long id;
    @NotBlank(message = "Este campo es obligatorio")
    @Size( min = 3, max =100, message = "El nombre debe tener entre 3 y 100 caracteres")
    private String nombre;
    private String email;
    private LocalDateTime fechaRegistro;

}

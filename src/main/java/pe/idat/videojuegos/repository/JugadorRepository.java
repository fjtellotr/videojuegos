package pe.idat.videojuegos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.idat.videojuegos.entity.Jugador;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {
}

package fatecfranca.edu.br.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fatecfranca.edu.br.model.Medico;

// usamos JPA é um ORM que mapeia objeto em relações (Pg é um banco relacional
// e Java é orientado a objetos)
public interface MedicoRepository extends JpaRepository<Medico, Long>{

}

package fatecfranca.edu.br.model.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fatecfranca.edu.br.model.Paciente;

// Esta é uma classe interface que herda 
public interface PacienteRepository extends MongoRepository<Paciente, String>{

	// a interface vai herdar métodos para inserção, consulta, remoção e atualização
	
}

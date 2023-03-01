package com.ista.web.ista.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ista.web.ista.modelo.Profesor;

public interface ProfesorRepository extends  MongoRepository<Profesor, Long>{

}

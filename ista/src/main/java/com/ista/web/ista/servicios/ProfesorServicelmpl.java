package com.ista.web.ista.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.web.ista.modelo.Profesor;
import com.ista.web.ista.repositorio.ProfesorRepository;


@Service

public class ProfesorServicelmpl extends GenericServicelmpl <Profesor, Long> implements ProfesorService{

	@Autowired
   ProfesorRepository profesorRepository;
    
    @Override
    public CrudRepository<Profesor, Long> getDao() {
        return profesorRepository;
    }  
	
}
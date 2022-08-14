package com.portfolio.puma.Interface;

import com.portfolio.puma.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto buscando por su Id
    public void deletePersona(Long id);
    
    //Buscar una persona por Id
    public Persona findPersona(Long id);

}

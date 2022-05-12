package co.edu.javeriana.as.personapp.rest.adapter;
import co.edu.javeriana.as.personapp.core.port.out.rest.PersonaRestPort;
import co.edu.javeriana.as.personapp.rest.client.PersonaClient;
import co.edu.javeriana.as.personapp.rest.mapper.PersonaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import co.edu.javeriana.as.personapp.core.domain.Persona;

import java.util.List;

//en core debe haber un paquete que se llame reste ese se consume
@Component
public class PersonaAdapter implements PersonaRestPort {
    @Autowired
    private PersonaMapper personaMapper;
    @Autowired
    private PersonaClient personaClient;

    @Override
    public Persona save(Persona persona) {
        return null;
               // personaMapper.deJSONObjectAPersona(personaClient.create(persona));
    }

    @Override
    public Boolean delete(Integer cc) {
        return null;
    }

    @Override
    public List<Persona> findAll() {
        return personaMapper.deJSONArrayAListPersona(personaClient.get());
    }

    @Override
    public Persona findByCC(Integer cc) {
        return personaMapper.deJSONObjectAPersona(personaClient.byID(cc));
    }

    @Override
    public Integer count() {
        return null;
    }
}

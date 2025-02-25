package es.giss.poc.farp.service;

import es.giss.arch.jpa.service.impl.SimpleJpaServiceImpl;
import es.giss.poc.farp.model.ResultadoCalculoEntity;
import es.giss.poc.farp.repository.BaseDeDatosRepository;
import org.springframework.stereotype.Service;

@Service
public class BaseDeDatosServiceImpl extends SimpleJpaServiceImpl<Integer, ResultadoCalculoEntity, BaseDeDatosRepository>
        implements BaseDeDatosService {

    public BaseDeDatosServiceImpl(final BaseDeDatosRepository repository) {
        super(repository);
    }
}

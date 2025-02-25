package es.giss.poc.farp.service;


import es.giss.arch.jpa.service.SimpleJpaService;
import es.giss.poc.farp.model.ResultadoCalculoEntity;
import org.springframework.stereotype.Service;


public interface BaseDeDatosService extends SimpleJpaService<Integer, ResultadoCalculoEntity> {
}


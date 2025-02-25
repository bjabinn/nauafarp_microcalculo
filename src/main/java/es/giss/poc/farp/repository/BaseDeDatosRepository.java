package es.giss.poc.farp.repository;

import es.giss.arch.jpa.repo.BaseRepository;
import es.giss.poc.farp.model.ResultadoCalculoEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseDeDatosRepository extends BaseRepository<ResultadoCalculoEntity, Integer> {
}

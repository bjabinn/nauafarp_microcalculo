package es.giss.poc.farp.mapper;

import es.giss.arch.jpa.mapper.EntityDtoMapper;
import es.giss.poc.farp.dto.ResultadoCalculoDto;
import es.giss.poc.farp.model.ResultadoCalculoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BaseDeDatosMapper extends EntityDtoMapper<ResultadoCalculoDto, ResultadoCalculoEntity> {
}

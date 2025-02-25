package es.giss.poc.farp.service;

import es.giss.arch.kafka.service.NotificationService;
import es.giss.poc.farp.dto.ResultadoCalculoDto;
import org.springframework.stereotype.Service;

@Service
public class EnviarResultadoService extends NotificationService<String, ResultadoCalculoDto> {
}

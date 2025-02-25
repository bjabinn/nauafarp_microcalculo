package es.giss.poc.farp.controller;

import es.giss.poc.farp.mapper.BaseDeDatosMapper;
import es.giss.poc.farp.service.BaseDeDatosService;
import es.giss.poc.farp.service.EnviarResultadoService;
import es.giss.poc.farp.dto.DatosCalculoDto;
import es.giss.poc.farp.dto.ResultadoCalculoDto;
import es.giss.poc.farp.service.CalculoPensionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/pension")
@RequiredArgsConstructor
public class PensionController {

    private final CalculoPensionService calculoPensionService;

    private final EnviarResultadoService enviarResultadoService;

    private final BaseDeDatosService baseDeDatosService;

    private final BaseDeDatosMapper baseDeDatosMapper;

    @PostMapping
    public ResponseEntity<ResultadoCalculoDto> realizarCalculo(
            @Validated @RequestBody final DatosCalculoDto datosCalculoDto) {
        var resultadoCalculoDto = calculoPensionService.calcularPension(datosCalculoDto);

        //persistimos en BD
        baseDeDatosService.createOrUpdate(resultadoCalculoDto, baseDeDatosMapper);

        //Enviamos evento
        enviarResultadoService.send(UUID.randomUUID().toString(), resultadoCalculoDto);

        return ResponseEntity.ok().body(resultadoCalculoDto);
    }
}





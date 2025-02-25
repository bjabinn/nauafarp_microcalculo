package es.giss.poc.farp.service;

import es.giss.poc.farp.dto.ResultadoCalculoDto;
import es.giss.poc.farp.dto.DatosCalculoDto;
import org.springframework.stereotype.Service;

@Service
public class CalculoPensionService {

    static final int ANIOSCOTIZADOS = 15;
    static final int BASECOTIZACIONMENSUAL = 1200;
    static final double PORCENTAJEPRIMERO15ANIOS = 50.0;
    static final int CIEN = 100;
    static final int QUINCE = 15;
    static final int DIEZ = 10;
    static final double SESENTAPORCIENTO = 0.6;
    static final double DOS = 2.0;

    public ResultadoCalculoDto calcularPension(final DatosCalculoDto datosCalculoDto) {
        ResultadoCalculoDto resultado = new ResultadoCalculoDto();

        if (!datosCalculoDto.isEsResidente()) {
            resultado.setPension(0.0);
            return resultado;
        }

        int anosCotizados = datosCalculoDto.getAniosCotizados();
        double baseMediaMensual = datosCalculoDto.getBaseCotizacionMensual();

        if (anosCotizados >= ANIOSCOTIZADOS) { // Pensión Contributiva
            if (baseMediaMensual > BASECOTIZACIONMENSUAL) {
                double porcentaje = PORCENTAJEPRIMERO15ANIOS + Math.min(anosCotizados - QUINCE, DIEZ) * DOS;
                resultado.setPension(baseMediaMensual * (porcentaje / CIEN));
            } else {
                resultado.setPension(BASECOTIZACIONMENSUAL);
            }
        } else { // Pensión No Contributiva
            resultado.setPension(BASECOTIZACIONMENSUAL * SESENTAPORCIENTO);
        }

        return resultado;
    }
}

package es.giss.poc.farp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DatosCalculoDto {
    private boolean esResidente;
    private int aniosCotizados;
    private int edadJubilizacion;
    private double baseCotizacionMensual;
}

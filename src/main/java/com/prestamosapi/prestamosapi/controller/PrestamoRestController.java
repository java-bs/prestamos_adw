package com.prestamosapi.prestamosapi.controller;

import com.prestamosapi.prestamosapi.dominio.Banco;
import com.prestamosapi.prestamosapi.dominio.Prestamo;
import com.prestamosapi.prestamosapi.dominio.PrestamoHipotecario;
import com.prestamosapi.prestamosapi.dominio.PrestamoPersonal;
import java.math.BigDecimal;
import java.time.LocalDate;
import static java.util.Arrays.asList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrestamoRestController {
    
    @RequestMapping(method = GET, path = "/apirest/prestamos")
    public List<Prestamo> obtenerPrestamos() {

        Banco bancoSaenz = Banco.obtenerBanco();

        BigDecimal elMonto = new BigDecimal("1550.25");
        Prestamo miPrimerPrestamo = new PrestamoPersonal(bancoSaenz, elMonto, 6, "SIT6");
        miPrimerPrestamo.setFechaAcreditacion(LocalDate.of(2019, 10, 20));

        Prestamo miSegundoPrestamo = new PrestamoPersonal(bancoSaenz, elMonto, 12, "SIT3");

        PrestamoHipotecario miPrestamoHipotecario = new PrestamoHipotecario(bancoSaenz, elMonto, 30, "Auto");
        miPrestamoHipotecario.setFechaAcreditacion(LocalDate.of(2020, 11, 1));

        Prestamo[] prestamosDelCliente = {
            miPrimerPrestamo,
            miSegundoPrestamo,
            miPrestamoHipotecario};
        return asList(prestamosDelCliente);
    }
    
    @RequestMapping(method = GET, path = "/apirest/prestamos/{numero}")
    public Prestamo obtenerPrestamoPorNumero(@PathVariable Integer numero) {

        Banco bancoSaenz = Banco.obtenerBanco();

        BigDecimal elMonto = new BigDecimal("1550.25");
        Prestamo miPrimerPrestamo = new PrestamoPersonal(bancoSaenz, elMonto, 6, "SIT6");
        miPrimerPrestamo.setFechaAcreditacion(LocalDate.of(2019, 10, 20));

     //   miPrimerPrestamo.setNumero(numero);
        
        return miPrimerPrestamo;
    }
}

package com.prestamosapi.prestamosapi;

//@Restconotroller para devolver objeto json
//@controller devuelve string

import com.prestamosapi.prestamosapi.dominio.Banco;
import com.prestamosapi.prestamosapi.dominio.Clientes;
import com.prestamosapi.prestamosapi.dominio.Domicilio;
import com.prestamosapi.prestamosapi.dominio.Prestamo;
import com.prestamosapi.prestamosapi.dominio.PrestamoPersonal;
import com.prestamosapi.prestamosapi.dominio.PrestamoHipotecario;

import java.math.BigDecimal;
import java.time.LocalDate;

// importo clases para app web (xq no me las ofrece ??)
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

// java ejecuta  ->  Main.main();
//@SpringBootApplication
public class Main {

    public static void main(String[] args) {
//        SpringApplication.run(Main.class, args);
        
        System.out.println("Hola Mundo");

        Banco bancoSaenz = Banco.obtenerBanco();
        
        System.out.println("Iniciando sistema de banco: " + bancoSaenz);
        
        
        //1er prestamo
        BigDecimal monto = new BigDecimal("15000.00");        
        Prestamo nuevoPrestamo = new PrestamoPersonal(bancoSaenz, monto, 36, "SIT6"); 

//        BigDecimal monto = new BigDecimal("15000.00");
//        nuevoPrestamo.setMonto(monto);
        
//        nuevoPrestamo.setPlazoEnMeses(36);
//        nuevoPrestamo.setCantidadCuotas(36);
        
        BigDecimal tasa = new BigDecimal("95");
        nuevoPrestamo.setTasa(tasa);

        nuevoPrestamo.setFechaAdjudicacion(LocalDate.of(2019, 12, 23));
        nuevoPrestamo.setFechaAcreditacion(LocalDate.of(2019, 12, 24));
        
        //2do prestamo
        monto = new BigDecimal("7000.00");
        Prestamo nuevoPrestamo2 = new PrestamoPersonal(bancoSaenz, monto, 24, "SIT2"); 

//        BigDecimal monto = new BigDecimal("15000.00");
//        nuevoPrestamo.setMonto(monto);
        
//        nuevoPrestamo2.setPlazoEnMeses(24);
//        nuevoPrestamo.setCantidadCuotas(36);
        
        tasa = new BigDecimal("78");
        nuevoPrestamo2.setTasa(tasa);

        nuevoPrestamo2.setFechaAdjudicacion(LocalDate.of(2020, 01, 15));
//        nuevoPrestamo2.setFechaAcreditacion(LocalDate.of(2020, 01, 17)); //para probar filtro x acreditacion = null

        
        //3er prestamo
        monto = new BigDecimal("2500000.00");
        Prestamo nuevoPrestamo3 = new PrestamoHipotecario(bancoSaenz, monto, 360, "PRUEBA");

        tasa = new BigDecimal("17");
        nuevoPrestamo3.setTasa(tasa);

        nuevoPrestamo3.setFechaAdjudicacion(LocalDate.of(2018, 05, 23));
//        nuevoPrestamo3.setFechaAcreditacion(LocalDate.of(2018, 05, 27));
        nuevoPrestamo3.setFechaAcreditacion(LocalDate.of(2020, 01, 20)); // para probar filtro de acreditacion = hoy-1
        
        
        // cliente 1
        Clientes cliente1 = new Clientes();
        cliente1.setDni("29601237");
        cliente1.setNombreApellido("Andrés Wüthrich");
        
        BigDecimal ingresos = new BigDecimal("33330.00");
        cliente1.setIngresos(ingresos);

        Prestamo[] misPrestamos = new Prestamo[] {nuevoPrestamo, nuevoPrestamo2, nuevoPrestamo3};
        cliente1.setPrestamos(misPrestamos);
        
        Domicilio miDomicilio = new Domicilio("Cucha Cucha", 1111, "1 A", "CABA");
        cliente1.setDomicilio(miDomicilio);
        
// reemplazo impresion por toString. Uso imprimirDatos        
//        System.out.println(cliente1);
//        
//        for(Prestamo prestamo : cliente1.getPrestamos()){
//            System.out.println(prestamo);
//        }
       // System.out.println(nuevoPrestamo);
       // System.out.println(nuevoPrestamo2);
       
       cliente1.imprimirDatos();
    }
    
}

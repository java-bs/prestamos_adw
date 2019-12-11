package com.prestamosapi.prestamosapi;

import com.prestamosapi.prestamosapi.dominio.Banco;
import com.prestamosapi.prestamosapi.dominio.Clientes;
import com.prestamosapi.prestamosapi.dominio.Domicilio;
import com.prestamosapi.prestamosapi.dominio.Prestamo;
import com.prestamosapi.prestamosapi.dominio.PrestamoPersonal;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Hola Mundo");

        Banco bancoSaenz = Banco.obtenerBanco();
        
        System.out.println("Iniciando sistema de banco: " + bancoSaenz);
        
        //1er prestamo
        BigDecimal monto = new BigDecimal("15000.00");
        
        Prestamo nuevoPrestamo = new PrestamoPersonal(monto, 36); 

//        BigDecimal monto = new BigDecimal("15000.00");
//        nuevoPrestamo.setMonto(monto);
        
        nuevoPrestamo.setPlazoEnMeses(36);
//        nuevoPrestamo.setCantidadCuotas(36);
        
        BigDecimal tasa = new BigDecimal("95");
        nuevoPrestamo.setTasa(tasa);

        //2do prestamo
        monto = new BigDecimal("7000.00");
        
        Prestamo nuevoPrestamo2 = new PrestamoPersonal(monto, 24); 

//        BigDecimal monto = new BigDecimal("15000.00");
//        nuevoPrestamo.setMonto(monto);
        
        nuevoPrestamo2.setPlazoEnMeses(24);
//        nuevoPrestamo.setCantidadCuotas(36);
        
        tasa = new BigDecimal("78");
        nuevoPrestamo2.setTasa(tasa);

        // cliente 1
        Clientes cliente1 = new Clientes();
        cliente1.setDni("29601237");
        cliente1.setNombreApellido("Andrés Wüthrich");
        
        BigDecimal ingresos = new BigDecimal("33330.00");
        cliente1.setIngresos(ingresos);

        Prestamo[] misPrestamos = new Prestamo[] {nuevoPrestamo, nuevoPrestamo2};
        cliente1.setPrestamos(misPrestamos);
        
        Domicilio miDomicilio = new Domicilio("Cucha Cucha", 1111, "1 A", "CABA");
        cliente1.setDomicilio(miDomicilio);
        
        System.out.println(cliente1);
        
        for(Prestamo prestamo : cliente1.getPrestamos()){
            System.out.println(prestamo);
        }
       // System.out.println(nuevoPrestamo);
       // System.out.println(nuevoPrestamo2);
    }
    
}

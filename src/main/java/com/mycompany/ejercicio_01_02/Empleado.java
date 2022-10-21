/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_02;

/**
 *
 * @author Portal Center
 */
public class Empleado {
    
    String nombre;
    int horasTrabajadas;
    double costoHora;
    int yearIngreso;
    
   

    public double calcularIngreso(int yearActual) {
        var retorno = 0.0d;
        var costoFinal = 0.0d;
        var antiguedad = 0;
        var costoIngreso = 0.0d;
        var horasExtra = 0;
        var bonos = 0.0d;
      
        
        
        antiguedad = yearActual - this.yearIngreso;
        
        if (this.horasTrabajadas > 160) {
            bonos = bonosHorasExtra();
            costoIngreso = this.costoHora * 160;
            costoFinal = ((costoIngreso * 0.02) * antiguedad) + costoIngreso;
            
        } else {
            costoIngreso = this.costoHora * this.horasTrabajadas;
            costoFinal = ((costoIngreso * 0.02) * antiguedad) + costoIngreso;
            
        }
        return costoFinal;
    }
    
    
    
    
    
    
    public double bonosHorasExtra() {
        var horasExtra = 0;
        var bonos = 0.0d;

        if (this.horasTrabajadas > 160) {
            horasExtra = ((horasTrabajadas - 160) * 2);
            bonos = horasExtra * this.costoHora;
        }
        return bonos;
    }
 
    
 
   
    
    
    public double calcularImpuesto(double lim1, double lim2, double lim3) {
        var retorno = 0.0d;
        var ingresoBasico = 0.0d;

        ingresoBasico = this.costoHora * this.horasTrabajadas;

        if (ingresoBasico < lim1) {
            retorno = 0;
            
        } else {
            
            if (ingresoBasico < lim2) {
                retorno = ingresoBasico * 0.05;
                
            } else {
                
                if (ingresoBasico < lim3) {
                    retorno = ingresoBasico * 0.12;
                    
                } else {
                    retorno = ingresoBasico * 0.25;
                }
            }
        }
        return retorno;
    }
    
    
    
    
       
    
    public double calcularTotal(int yearActual, int lim1, int lim2, int lim3){
        var total = 0.0d;
        
        total = calcularIngreso(yearActual) + bonosHorasExtra() +
                calcularImpuesto( lim1, lim2, lim3);
        
        return total;
    }    
}

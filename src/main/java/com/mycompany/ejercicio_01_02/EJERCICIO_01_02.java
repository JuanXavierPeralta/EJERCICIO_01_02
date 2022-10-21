/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_01_02;

/**
 *
 * @author Portal Center
 */
public class EJERCICIO_01_02 {

    public static void main(String[] args) {
        
        var lim1 = 100;
        var lim2 = 300;
        var lim3 = 500;

        
                
        var empleado1 = new Empleado();
        
        empleado1.nombre = " Joaquin ";
        empleado1.horasTrabajadas = 155;
        empleado1.costoHora = 3.45;
        empleado1.yearIngreso = 2021;

        
        System.out.println(" El empleado " + empleado1.nombre
                           + " que  ingreso el año " + empleado1.yearIngreso 
                           + " gana por hora " + empleado1.costoHora + " dólares "
                           + " y ha trabajado " + empleado1.horasTrabajadas + " horas ");
        System.out.println(" El empleado tiene un ingreso de : $ " + empleado1.calcularIngreso(2022));
        System.out.println(" El empleado tiene un bono por horas extra de: $ " + empleado1.bonosHorasExtra());
        System.out.println(" Los impuestos son: $ " + empleado1.calcularImpuesto(lim1, lim2, lim3));
        System.out.println(" El empleado gana en total: $ " + empleado1.calcularTotal(2022, lim1, lim2, lim3));      




        
        var empleado2 = new Empleado();
        
        empleado2.nombre = " Miguel ";
        empleado2.horasTrabajadas = 420;
        empleado2.costoHora = 5.50;
        empleado2.yearIngreso = 2019;
        
        
        System.out.println(" El empleado " + empleado2.nombre
                           + " que ingreso el año " + empleado2.yearIngreso 
                           + " gana por hora " + empleado2.costoHora + " dólares "
                           + " y ha trabajado " + empleado2.horasTrabajadas + " horas ");
        System.out.println(" El empleado tiene un ingreso de : $" + empleado2.calcularIngreso(2022));
        System.out.println(" El empleado tiene un bono por horas extra de: $ " + empleado2.bonosHorasExtra());
        System.out.println(" Los impuestos son: $ " + empleado2.calcularImpuesto(lim1, lim2, lim3));
        System.out.println(" El empleado gana en total: $ " + empleado2.calcularTotal(2022, lim1, lim2, lim3));
        
        
        
        
        
        var empleado3 = new Empleado();
        
        empleado3.nombre = " Leonardo ";
        empleado3.horasTrabajadas = 330;
        empleado3.costoHora = 7.00;
        empleado3.yearIngreso = 2015;

        
        System.out.println(" El empleado " + empleado3.nombre
                           + " que ingreso el año " + empleado3.yearIngreso 
                           + " gana por hora " + empleado3.costoHora + " dólares "
                           + " y ha trabajado " + empleado3.horasTrabajadas + " horas ");
        System.out.println(" El empleado tiene un ingreso de : $ " + empleado3.calcularIngreso(2022));
        System.out.println(" El empleado tiene un bono por horas extra de: $ " + empleado3.bonosHorasExtra());
        System.out.println(" Los impuestos son: $ " + empleado3.calcularImpuesto(lim1, lim2, lim3));
        System.out.println(" El empleado gana en total: $ " + empleado3.calcularTotal(2022, lim1, lim2, lim3));

    }
}        

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejericico_Empleado;

/**
 *
 * @author luzad
 */
public class EmpleadoPorComision extends Empleado{
    private double comisionVentas;
    private int salarioTotal;
    private int precioVentas;

    public EmpleadoPorComision() {
    }

    public EmpleadoPorComision(String nombre, String apellido, int numDocumento, int numVentas, double comisionVentas, int precioVentas) {
        super(nombre, apellido, numDocumento, numVentas, salarioBase);
        this.comisionVentas = comisionVentas;
        this.precioVentas = precioVentas;
        salarioTotal = (int)(precioVentas * (numVentas * comisionVentas));
           
    }

    public double getComisionVentas() {
        return comisionVentas;
    }

    public void setComisionVentas(double comisionVentas) {
        this.comisionVentas = comisionVentas;
    }

    @Override
    public String toString() {
        return "EmpleadoPorComision{" + "comisionVentas=" + comisionVentas + '}';
    }
    
    public void mostrarDatos() {
        System.out.println(super.toString() + "SalarioTotal: " + salarioTotal);
    }
    
    
    
    
    
    
}

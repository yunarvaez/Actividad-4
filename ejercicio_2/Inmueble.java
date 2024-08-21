package Actividad_4.ejercicio_2;

public class Inmueble {
    protected int identificadoroInmobiliario;
    protected int area;
    protected String direccion;
    protected double precioVenta;

    Inmueble(int identificadoroInmobiliario, int area, String direccion){
        this.identificadoroInmobiliario = identificadoroInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }
    double calcularPrecioVenta(double valorArea){
        precioVenta = area * valorArea;
        return precioVenta;
    }
    void imprimir(){
        System.out.println("Identificador inmobiliario = " + identificadoroInmobiliario);
        System.out.println("Área = " + area);
        System.out.println("Dirección = "+ direccion);
        System.out.println("Precio de venta = $"+ precioVenta);
    }
}

package Actividad_4.ejercicio_4;

public class Velocista extends Ciclista{
    private double potenciaPromedio;
    private double velocidadPromedio;

    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio){
        super(identificador, nombre);
        potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }
    protected double getPotenciaPromedio(){
        return potenciaPromedio;
    }
    protected void setPotenciaPromedio(double potenciaPromedio){
        this.potenciaPromedio = potenciaPromedio;
    }
    protected double getVelocidadPromedio(){
        return velocidadPromedio;
    }
    protected void setVelocidadPromedio(){
        this.velocidadPromedio = velocidadPromedio;
    }
    protected void imprimir(){
        super.imprimir();
        System.out.println("Potencia promedio ="+potenciaPromedio);
        System.out.println("Velocidad promedio ="+velocidadPromedio);
    }
    protected String imprimirTipo(){
        return "Es un velocista";
    }
}

package Actividad_4.ejercicio_2;

public class ApartamentoFamiliar extends Apartamento{
    protected static double valorArea = 2000000;
    protected int valorAdministracion;

    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños,int valorAdministracion){
        super(identificadorInmobiliario,area,direccion,numeroHabitaciones,numeroBaños);
        this.valorAdministracion = valorAdministracion;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administración = $"+valorAdministracion);
        System.out.println();
    }
}
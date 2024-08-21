package Actividad_4.ejercicio_2;

public class CasaConjuntoCerrado extends CasaUrbana{
    protected static double valorArea = 2500000;
    protected int valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;
    public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos, int valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos){
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administracion = "+ valorAdministracion);
        System.out.println("¿Tiene piscina? = "+ tienePiscina);
        System.out.println("¿Tiene campos deportivos? = "+ tieneCamposDeportivos);
        System.out.println();
    }
}

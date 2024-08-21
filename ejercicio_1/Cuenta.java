package Actividad_4.ejercicio_1;

public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    public void consignar(float cantidad){
        saldo = saldo + cantidad;
        numeroConsignaciones = numeroConsignaciones + 1;
    }
    public void retirar(float cantidad){
        float nuevoSaldo = saldo - cantidad;

        if (nuevoSaldo >= 0){
            saldo -= cantidad;
            numeroRetiros = numeroRetiros + 1;
        } else {
            System.out.println("La cantidad a retirar excede el saldo actual.");
        }
    }
    public void calcularIntereses(){
        float tasaMensual = tasaAnual / 12;
        float interesesMEnsual = saldo * tasaMensual;
        saldo += interesesMEnsual;
    }
    public void extractoMensual(){
        saldo -= comisionMensual;
        calcularIntereses();
    }
}

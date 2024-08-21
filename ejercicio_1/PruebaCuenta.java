package Actividad_4.ejercicio_1;

import java.util.*;

public class PruebaCuenta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial: $");
        float saldoInicialAhorros = sc.nextFloat();
        System.out.println("Ingrese tasa de interés: $");
        float tasaAhorros = sc.nextFloat();
        CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros,tasaAhorros);
        System.out.println("Ingresar cantidad a consignar : $");
        float cantidadDepositar = sc.nextFloat();
        cuenta1.consignar(cantidadDepositar);
        System.out.println("Ingresar cantidad a retirar: $");
        float cantidadRetirar = sc.nextFloat();
        cuenta1.retirar(cantidadRetirar);
        cuenta1.extractoMensual();
        cuenta1.imprimir();
    }
}
package Actividad_4.ejercicio_5;

import java.util.*;

public class ListaPersonas {
    Vector ListaPersonas;

    public ListaPersonas(){
        ListaPersonas = new Vector();
    }

    public void añadirPersona(Persona p){
        ListaPersonas.add(p);
    }
    public void eliminarPersona(int i){
        ListaPersonas.removeElementAt(i);
    }
    public void borrarLista(){
        ListaPersonas.removeAllElements();
    }
}

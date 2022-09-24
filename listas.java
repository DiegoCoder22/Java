package cl.duoc.democolecciones;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add(1, "como");
        lista.add(0, "estas");
        lista.add(2, "hoy");
        lista.add(0, "antes de Hola");
        
        System.out.println(lista);
        
        lista.remove("Hola");
        
        int position = lista.indexOf("Antes de Hola");
        System.out.println(position);
        
        lista.remove("Antes de Hola");
        lista.add(position, "David");
        
        System.out.println.("son "+ lista.size() + "palabras escritas");
        
        lista.clear();
        
        ArrayList<String> listaAEliminar = new ArrayList();
        listaAEliminar.add("Hola");
        listaAEliminar.add("Hola");
        listaAEliminar.add("Hola");
        
        lista.removeAll(listaAEliminar);
        
        System.out.println(lista);
        
        ArrayList<String> nuevaLista = (ArrayList<String>) lista.clone();
        ArrayList<String> nuevaLista2 = (ArrayList<String>) lista.clone();
        ArrayList<String> nuevaLista3 = (ArrayList<String>) lista.clone();
        
        String busqueda = lista.get(1);
        System.out.println(busqueda);
    }
    
}

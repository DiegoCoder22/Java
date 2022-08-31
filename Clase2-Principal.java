package demoherencia;

import demoherencia.DTO.Vehiculo;
import demoherencia.DTO.Auto; 

public class Principal {
        public static void main(String[] args) {
        Vehiculo mivehiculo = new Vehiculo();
        
        mivehiculo.setMarca("Toyota");
        //mivehiculo.setModelo("Yaris");
        
        System.out.println(mivehiculo.getMarca() + " "
            + mivehiculo.getModelo());
        
        Auto miAuto = new Auto();
        miAuto.setCantidadPuertas(5);
        miAuto.setMarca("Chevrolet");
        miAuto.setModelo("Aveo");
        miAuto.setColor("Blanco");
        
        System.out.println(miAuto.toString());
    }
}

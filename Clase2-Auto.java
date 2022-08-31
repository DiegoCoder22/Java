package demoherencia.DTO;

public class Auto extends Vehiculo {
    
    private int CantidadPuertas;
    
    public Auto(){
        this.CantidadPuertas = 0;
    }

    public int getCantidadPuertas() {
        return CantidadPuertas;
    }

    public void setCantidadPuertas(int CantidadPuertas) {
        this.CantidadPuertas = CantidadPuertas;
    }
    
    //Sobrecarga explícita
    @Override
    public String toString(){
        //return "Hola";
        StringBuilder sb = new StringBuilder();
        sb.append("\nMarca: "+ super.getMarca());
        sb.append("\nMarca: "+ super.getModelo());
        sb.append("\nMarca: "+ super.getColor());
        sb.append("\nCantidad de Puertas: "+this.getCantidadPuertas());
        
        return sb.toString();
    }
}

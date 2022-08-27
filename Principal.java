package demoo;
import demoo.Modelos.Persona;
public class Principal {
    public static void main(String[] args) {
        /*
        System.out.println("Hola mi amor");
        String nombre = "";
        int numero = 0;
        */
        Persona miPersona = new Persona();
        miPersona.Rut = "14.565.789-4";
        miPersona.Nombres = "SOTO";
        miPersona.Apellidos = "SOTO";
        
        String rut = miPersona.Rut;
        
        System.out.println(miPersona);
        System.out.println(" ");
        System.out.println("Rut: " +rut);
        System.out.println(" ");
        System.out.println(miPersona.Nombres + " " + miPersona.Rut);
        System.out.println(" ");
    }
}

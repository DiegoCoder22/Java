package demoo.Modelos;
public class Persona {
    // [Acceso] [estatico] [nombre variable];
    private String Nombres;
    public String Apellidos;
    public String Rut;
    public float Altura;
    public float Peso;
    
    /* Metodo para poder comunicar algun atributo que este en privado */
    /* Metodo GETTER */
    public String getNombres(){
        return this.Nombres;        
    }
    /* Metodo SETTER */
    /* Cuando tengo atributos provados, con esto, puedo hacer una
    excepcion para poder trabajar con el */
    public void setNombres(String nombres, String Apellido, String Rut){
        this.Nombres = nombres;
    }
    
    public void setNombres(String nombres){
        this.Nombres = nombres;
    }
}
/*
CREATE TABLE Persona (
    Nombres     VARCHAR2,
    Apellidos   VARCHAR2,
    RUT     VARCHAR2,
    Altura  DECIMAL(5,2),
    Peso    DECIMAL(5,2),
);
 */

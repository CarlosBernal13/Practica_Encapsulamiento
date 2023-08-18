public class Persona{
    //la encapsulación se logra declarando las variables de instancia de una clase como privadas
    private String nombre;
    private int edad;
    //colocamos el constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona() {   
    }
    // se definen métodos públicos llamados getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    //formato para imprimir
    @Override
    public String toString() {
        return "Persona nombre=" + nombre + ", edad=" + edad ;
    }   
}
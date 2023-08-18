public class Main {
    public static void main(String[] args) {
        //ingresamos datos de tipo persona
        Persona persona=new Persona("Jose",34);
        //imprimimos
        System.out.println(persona.toString());
        //ingresamos mas datos de tipo persona utilizando set
        Persona personaNueva=new Persona();
        personaNueva.setNombre("Carlos");
        personaNueva.setEdad(12);
        //imprimimos los valores ingresados 
        System.out.println("Nombre: "+personaNueva.getNombre());
        System.out.println("Edad: "+personaNueva.getEdad());
    }
}

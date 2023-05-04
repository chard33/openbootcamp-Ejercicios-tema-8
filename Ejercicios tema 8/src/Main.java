public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(29);
        persona.setNombre("Juan");
        persona.setTelefono(123456789);

        System.out.format("%s tiene %d años.\n", persona.getNombre(), persona.getEdad());
        System.out.format("El telefono de %s es %d.", persona.getNombre(), persona.getTelefono());
    }
}

class Persona{

    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
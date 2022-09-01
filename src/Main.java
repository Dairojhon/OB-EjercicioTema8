public class Main {
    public static void main(String[] args)
    {
        persona persona=new persona();
        persona.setNombre("Jhon Dairo");
        persona.setEdad(32);
        persona.setTelefono("3166684082");

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
    }
}

class persona
{
    private String nombre;
    private int edad;
    private String telefono;

    //Set y get de la propiedad nombre
    public void setNombre(String nombre)
    {
        this.nombre =nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }

    //get y set de la propiedad edad
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    public int getEdad()
    {
        return this.edad;
    }

    //set y get de la propiedad telefono
    public void setTelefono(String telefono)
    {
        this.telefono =telefono;
    }
    public String getTelefono()
    {
        return this.telefono;
    }

}
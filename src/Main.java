public class Main {
    public static void main(String[] args)
    {
        Cliente cliente=new Cliente();
        cliente.setNombre("Jhon Dairo");
        cliente.setEdad(32);
        cliente.setTelefono("3166684082");
        cliente.setCredito(90000000.50);

        System.out.println("El nombre del cliente es: "+cliente.getNombre());
        System.out.println("La edad del cliente es: "+cliente.getEdad());
        System.out.println("El número de telefono del cliente es: "+cliente.getTelefono());
        System.out.println("El cliente tiene un credito por: "+cliente.getCredito());
        System.out.println("---------------------------------------------------------"+"\n");

        Trabajador trabajador= new Trabajador();
        trabajador.setNombre("Diana");
        trabajador.setEdad(30);
        trabajador.setTelefono("3174248214");
        trabajador.setSalario(2500);

        System.out.println("El nombre del trabajador es: "+trabajador.getNombre());
        System.out.println("La edad del trabajador es: "+trabajador.getEdad());
        System.out.println("El número de telefono del trabajador es: "+trabajador.getTelefono());
        System.out.println("El trabajador tiene un salario de: "+trabajador.getsalario());

    }
}

class Persona
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

class Cliente extends Persona
{
    double credito;

    public void setCredito(double credito)
    {
        this.credito=credito;
    }
    public double getCredito()
    {
        return this.credito;
    }
}

class Trabajador extends Persona
{
    double salario;

    public void setSalario(double salario)
    {
        this.salario=salario;
    }
    public double getsalario()
    {
        return this.salario;
    }
}
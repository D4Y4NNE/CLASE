public class Restaurante

{
    public String nombre = "Sweet Food";
    public int aforo = 30;
    public String pais = "Korea";

    public String mostrarNombre()
    {
        return nombre;
    }

    public int mostrarAforo()
    {
        return aforo;
    }

    public String mostrarPais()
    {
        return pais;
    }

    public void almacena(){}
    public void preparacion(){}
    public void servicios(){}

    public static void main(String args[])
    {
        Restaurante restaurante = new Restaurante();

        System.out.println(restaurante);

        System.out.println("Nombre: "+restaurante.mostrarNombre());

        System.out.println("Aforo: "+restaurante.mostrarAforo());

        System.out.println("Pais: "+restaurante.mostrarPais());
    }
}
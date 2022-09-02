public class Municipalidad

{
    public String direccion = "Av. Las Americas";
    public String calle = "Las Americas";
    public int pisos = 3;

    public String mostrarDireccion()
    {
        return direccion;
    }

    public String mostrarCalle()
    {
        return calle;
    }

    public int mostrarPisos()
    {
        return pisos;
    }

    public void ayuda(){}
    public void informa(){}
    public void fomentar_bienestar(){}

    public static void main(String args[])
    {
        Municipalidad municipalidad = new Municipalidad();

        System.out.println(municipalidad);

        System.out.println("Nombre: "+municipalidad.mostrarDireccion());

        System.out.println("Poder: "+municipalidad.mostrarCalle());

        System.out.println("Edad: "+municipalidad.mostrarPisos());
    }
}
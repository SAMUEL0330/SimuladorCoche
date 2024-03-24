package autonoma.simuladorcarro.models;

/**
 *
 * @author Samuel Esteban Herrera Bedoya 
 */
public class Motor 
{
    private String nombre;
    private String cilindraje;
    private int velocidadMaxima;

    public Motor(String nombre, String cilindraje, int velocidadMaxima) 
    {
        this.nombre = nombre;
        this.cilindraje = cilindraje;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getCilindraje() 
    {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) 
    {
        this.cilindraje = cilindraje;
    }

    public int getVelocidadMaxima() 
    {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) 
    {
        this.velocidadMaxima = velocidadMaxima;
    }
}

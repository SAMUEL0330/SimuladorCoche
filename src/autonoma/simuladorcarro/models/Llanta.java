package autonoma.simuladorcarro.models;

/**
 *
 * @author Samuel Esteban Herrera Bedoya
 */
public class Llanta 
{
    private String nombre;
    private String tipo;
    private double limitePermitido;
    
    public Llanta(String nombre, String tipo, double limitePermitido)
    {
        this.nombre=nombre;
        this.tipo=tipo;
        this.limitePermitido=limitePermitido;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    public double getLimitePermitido() 
    {
        return limitePermitido;
    }

    public void setLimitePermitido(double limitePermitido) 
    {
        this.limitePermitido = limitePermitido;
    }
}
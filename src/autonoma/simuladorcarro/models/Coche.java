package autonoma.simuladorcarro.models;
/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-18
 */
public class Coche 
{
    private boolean prendido;
    private Llanta tipoLlanta;
    private Motor tipoMotor;
    private double velocidad;

    public Coche(boolean prendido, Llanta tipoLlanta, Motor tipoMotor, double velocidad) 
    {
        this.prendido = prendido;
        this.tipoLlanta = tipoLlanta;
        this.tipoMotor = tipoMotor;
        this.velocidad = velocidad;
    }


    public boolean isPrendido() 
    {
        return prendido;
    }

    public void setPrendido(boolean prendido) 
    {
        this.prendido = prendido;
    }

    public Llanta getTipoLlanta() 
    {
        return tipoLlanta;
    }

    public void setTipoLlanta(Llanta tipoLlanta) 
    {
        this.tipoLlanta = tipoLlanta;
    }

    public Motor getTipoMotor() 
    {
        return tipoMotor;
    }

    public void setTipoMotor(Motor tipoMotor) 
    {
        this.tipoMotor = tipoMotor;
    }

    public double getVelocidad() 
    {
        return velocidad;
    }

    public void setVelocidad(double velocidad) 
    {
        this.velocidad = velocidad;
    }
}
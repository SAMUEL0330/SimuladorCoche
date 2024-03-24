package autonoma.simuladorcarro.exceptions;

/**
 *
 * @author Samuel Esteban Herrera Bedoya
 */
public class CapacidadMotor extends RuntimeException 
{
    public CapacidadMotor() 
    {
        super("La velocidad excedió el límite permitido por el motor :v");
    }
}

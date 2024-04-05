package autonoma.simuladorcarro.exceptions;
/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-24
 */
public class CapacidadMotorException extends Exception 
{
    public CapacidadMotorException() 
    {
        super("La velocidad excedió el límite permitido por el motor");
    }
}
package autonoma.simuladorcarro.exceptions;
/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-27
 */
public class RecuperaPatinajeException extends RuntimeException 
{
    public RecuperaPatinajeException()
    {
        System.out.println("Su vehículo está patinando y por ende perdió el control, debe esperar a que se detenga para recuperarlo.");
    }
    
    public RecuperaPatinajeException(String mensaje)
    {
        super("Su vehículo está patinando y por ende perdió el control, debe esperar a que se detenga para recuperarlo.");
    } 
}
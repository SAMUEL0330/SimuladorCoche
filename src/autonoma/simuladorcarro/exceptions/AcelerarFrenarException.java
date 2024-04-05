package autonoma.simuladorcarro.exceptions;
/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-24
 */
public class AcelerarFrenarException extends Exception
{
    public AcelerarFrenarException()
    {
        super("El carro se encuentra apagado, no puede manejarlo");
    }
    
    public AcelerarFrenarException(String mensaje)
    {
        super(mensaje);
    }
}
package autonoma.simuladorcarro.exceptions;
/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-24
 */
public class ApagarOtraVezException extends Exception
{
    public ApagarOtraVezException()
    {
        super("No se puede apagar otra vez");
    }
    
    public ApagarOtraVezException(String mensaje)
    {
        super(mensaje);
    }
}
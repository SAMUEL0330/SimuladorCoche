package autonoma.simuladorcarro.exceptions;
/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-24
 */
public class MasSesentaKmxhException extends Exception
{
    public MasSesentaKmxhException()
    {
        super("Se acaba de accidentar, que pecao, por ir a más de 60km/h y apagarlo");
    }
    
    public MasSesentaKmxhException(String mensaje)
    {
        super(mensaje);
    }
}
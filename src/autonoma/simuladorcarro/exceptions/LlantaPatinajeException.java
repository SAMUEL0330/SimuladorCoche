package autonoma.simuladorcarro.exceptions;
/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-24
 */
public class LlantaPatinajeException extends Exception
{
    public LlantaPatinajeException()
    {
        super("¡Oh no!... superó el límite permitido por las llantas, patinará");
    }
}
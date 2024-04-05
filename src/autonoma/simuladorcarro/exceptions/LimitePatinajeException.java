package autonoma.simuladorcarro.exceptions;
/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-24
 */
public class LimitePatinajeException extends Exception
{
    public LimitePatinajeException()
    {
        super("Acaba de frenar de manera más intensa que con la velocidad que llevaba, patinará");
    }

    public LimitePatinajeException(String mensaje)
    {
        super(mensaje);
    }
}
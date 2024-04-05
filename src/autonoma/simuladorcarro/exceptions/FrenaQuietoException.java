package autonoma.simuladorcarro.exceptions;
/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-24
 */
public class FrenaQuietoException extends Exception
{
    public FrenaQuietoException()
    {
        super("ya se encuentra detenido, es innecesario frenar");
    }
}
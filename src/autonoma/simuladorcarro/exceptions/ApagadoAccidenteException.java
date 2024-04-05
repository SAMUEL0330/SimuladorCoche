package autonoma.simuladorcarro.exceptions;
/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-24
 */
public class ApagadoAccidenteException extends Exception
{
    public ApagadoAccidenteException()
    {
        super("Se acaba de accidentar, su coche se apagará inmediatamente, además de detenerse por completo");
    }
}
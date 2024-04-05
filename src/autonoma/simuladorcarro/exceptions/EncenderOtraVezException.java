package autonoma.simuladorcarro.exceptions;
/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-24
 */
public class EncenderOtraVezException extends Exception
{
    public EncenderOtraVezException()
    {
        super("No se puede encender otra vez");
    }
    
    public String retornarMensajeUsuario(){
        
        return ("No se puede encender otra vez");
    }
}
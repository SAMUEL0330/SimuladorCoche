package autonoma.simuladorcarro.models;
/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-22
 */
public class Simulador 
{
    private Coche coche;
    
    public void encender()
    {
        System.out.println("El vehículo se ha encendido");
    }
    
    public void apagar()
    {
        System.out.println("El vehículo se ha apagado");
    }
    
    public void acelerar()
    {
        System.out.println("Se aceleró correctamente");
    }
    
    public void frenar()
    {
        System.out.println("Acaba de frenar");
    }
    
    public void frenarBruscamente()
    {
        System.out.println("Frenó muy duro toro");
    }
}

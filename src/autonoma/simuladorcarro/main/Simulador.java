package autonoma.simuladorcarro.main;

import autonoma.simuladorcarro.views.VentanaPrincipal;
import autonoma.simuladorcarro.models.Motor;
import autonoma.simuladorcarro.models.Llanta;
import autonoma.simuladorcarro.models.Coche;
/**
 *
 * @author Samuel Esteban Herrera Bedoya
 */
public class Simulador 
{
    public static void main(String[] args)
    {
        Llanta llanta = new Llanta("Michelin", "Bonitas", 70);
        Motor motor = new Motor("Tezuka", "3000 cc", 190);
        Coche coche=new Coche(true, llanta, motor, 0);
        
        VentanaPrincipal ventana=new VentanaPrincipal(coche);
        ventana.setVisible(true);
        
    }
}

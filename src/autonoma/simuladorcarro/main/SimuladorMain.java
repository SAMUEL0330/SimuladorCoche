package autonoma.simuladorcarro.main;

import autonoma.simuladorcarro.views.VentanaPrincipal;
import autonoma.simuladorcarro.models.Coche;
import autonoma.simuladorcarro.models.Llanta;
import autonoma.simuladorcarro.models.Motor;
import autonoma.simuladorcarro.models.Simulador;
import autonoma.simuladorcarro.models.Taller;
import java.util.ArrayList;
/**
 *
 * @author Samuel Esteban Herrera Bedoya
 */
public class SimuladorMain 
{
    public static void main(String[] args) throws Exception
    {
        Simulador simulador = new Simulador();
        Coche coche = Taller.creaCocheDeDocumento();
        simulador.setCoche(coche);
        
        ArrayList<Motor> motores = new ArrayList<>();
        motores.add(new Motor("1000", 100));
        motores.add(new Motor("2000", 160));
        motores.add(new Motor("3000", 220));
        
        ArrayList<Llanta> llantas = new ArrayList<>();
        llantas.add(new Llanta("Buenas",  110,0 ));
        llantas.add(new Llanta("Bonitas", 70, 0)); 
        llantas.add(new Llanta("Baratas", 50, 0));
        
        coche.setValidarmotores(motores);
        coche.getTipoLlanta().setLlantas(llantas);
        
        System.out.println("Soy el coche " + coche.getTipoLlanta().getNombre()+"\ncon "+coche.getTipoMotor().getCilindraje()+" de cilindraje");
        VentanaPrincipal ventana=new VentanaPrincipal(simulador);
        ventana.setVisible(true);
    }
}

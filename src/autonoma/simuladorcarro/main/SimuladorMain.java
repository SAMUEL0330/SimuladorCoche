package autonoma.simuladorcarro.main;

import autonoma.simuladorcarro.views.VentanaPrincipal;
import autonoma.simuladorcarro.models.Coche;
import autonoma.simuladorcarro.models.Llanta;
import autonoma.simuladorcarro.models.Motor;
import autonoma.simuladorcarro.models.Simulador;
import autonoma.simuladorcarro.models.Taller;
import java.util.ArrayList;
import java.util.Timer;
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
        Timer temporizador = new Timer();
        // inicilalizar motores
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
        
        //valido la creacion de las variables en el taller y el retorno del objeto coche
        System.out.println("Soy el coche " + coche.getTipoLlanta().getNombre()+"\ncon "+coche.getTipoMotor().getCilindraje()+" de cilindraje");
               
        // Fichero del que queremos leer
            
        /*
        try 
        {
            simulador.prenderCoche();
        } catch (EncenderOtraVezException e) {
            System.out.println("No se puede encender otra vez");
            System.exit(0);
            e.getMessage();
        }
        System.out.println("Ha prendido el coche exitosamente");
        
        
        
        try 
        {
            simulador.apagarCoche();
        } catch (ApagarOtraVezException a) {
            System.out.println("No se puede encender otra vez");
            System.exit(0);
            /*
            if (0=0){
            1.   throw new RuntimeException("error"); 
            throw new ApagarOtraVezException("hola error otra vez");
            }
          
            2. try{
                
            }catch(Exception e){
               
                e.getMessage();
                
            }
            
            3. clases personalizadas exception
                   
                    
                
           
        }
        System.out.println("Ha prendido el coche exitosamente");
        */
        VentanaPrincipal ventana=new VentanaPrincipal(simulador);
        ventana.setVisible(true);  
        
        
    }
    
    
    
}

package autonoma.simuladorcarro.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-22
 */
public class Taller
{
    public static Coche creaCocheDeDocumento()
    {
        File fichero = new File("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\SimuladorCarro\\src\\autonoma\\simuladorcarro\\files\\TallerActualizar.txt");
            Scanner s = null;
            int contador =1;
            Llanta l= new Llanta(null, null, 0);
            Motor m = new Motor(0);
            Coche c = new Coche(null, null);

            try 
            {
                s = new Scanner(fichero);
                while (s.hasNextLine())
                {
                    Scanner lineaScanner = new Scanner(s.nextLine());
                    lineaScanner.skip("\\w+\\s");
                    String palabra = lineaScanner.next();
                    if(contador == 1)
                    {
                        l.setNombre(palabra);
                    }else{
                        m.setCilindraje(palabra);
                    }
                    System.out.println(palabra);
                    lineaScanner.close();
                    contador++;
                }
                c= new Coche(m, l);
                c.setTipoMotor(m);
                c.setTipoLlanta(l);
                return c;  
            } catch (FileNotFoundException ex) {
                    System.out.println("Mensaje: " + ex.getMessage());
            } finally {
                    try 
                    {
                        if (s != null)
                            s.close();
                    } catch (Exception ex2) {
                            System.out.println("Mensaje 2: " + ex2.getMessage());
                    }
            }
        return null;
    }
}
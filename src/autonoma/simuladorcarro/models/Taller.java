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
                // Leemos el contenido del fichero
                System.out.println("... Leemos el contenido del fichero ...");
                s = new Scanner(fichero);
                //s.skip(Pattern.compile(" "));
                // Leemos linea a linea el fichero
                while (s.hasNextLine())
                {
                    // Utilizamos Scanner para leer la línea
                    Scanner lineaScanner = new Scanner(s.nextLine());
                    // Omitimos la primera palabra (llantas o motor)
                    lineaScanner.skip("\\w+\\s");
                    // Leemos y almacenamos la segunda palabra (Bonitas o 3000)
                    String palabra = lineaScanner.next();
                    if(contador == 1)
                    {
                        l.setNombre(palabra);
                    }else{
                        m.setCilindraje(palabra);
                    }
                    System.out.println(palabra);
                    // Cerramos el Scanner de la línea
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
                    // Cerramos el fichero tanto si la lectura ha sido correcta o no
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
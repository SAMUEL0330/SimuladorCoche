package autonoma.simuladorcarro.models;

import java.util.ArrayList;
/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-17
 */
public class Llanta
{
    private String nombre;
    private Integer tipo;
    private Integer limitePermitido;
    private ArrayList<Llanta> llantas;

    public Llanta(String nombre, Integer tipo, Integer limitePermitido)
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.limitePermitido = limitePermitido;
    }
    
    public ArrayList<Llanta> getLlantas() 
    {
        return llantas;
    }

    public void setLlantas(ArrayList<Llanta> llantas)
    {
        this.llantas = llantas;
    }
    
    public Llanta(Integer limitePermitido)
    {
        this.limitePermitido=limitePermitido;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Integer getTipo() 
    {
        return tipo;
    }

    public void setTipo(Integer tipo) 
    {
        this.tipo = tipo;
    }

    public double getLimitePermitido()
    {
        return limitePermitido;
    }

    public void setLimitePermitido(Integer limitePermitido) 
    {
        this.limitePermitido = limitePermitido;
    }
    
    public Boolean validarLimitePermitido(Coche c, ArrayList<Llanta> llantas, Integer velocidadFrenado)
    {
        Boolean patinado = false;
        for(Llanta llanta : llantas)
        {
            if(llanta.getNombre().equals(c.getTipoLlanta().getNombre()))
            {
                if(velocidadFrenado > llanta.getLimitePermitido())
                {
                    patinado = true; 
                }
            }
        }
        return patinado;
    }
}
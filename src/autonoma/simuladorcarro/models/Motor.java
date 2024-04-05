package autonoma.simuladorcarro.models;

import autonoma.simuladorcarro.exceptions.ApagarOtraVezException;
import autonoma.simuladorcarro.exceptions.EncenderOtraVezException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Samuel Esteban Herrera Bedoya 
 */
public class Motor 
{
    private String cilindraje;
    private Integer velocidadMaxima;
    private boolean prendido;

    public Motor(String cilindraje) 
    {
        this.cilindraje = cilindraje;
    }

    public Motor(String cilindraje, Integer velocidadMaxima)
    {
        this.cilindraje = cilindraje;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public Motor(Integer velocidadMaxima) 
    {
        this.cilindraje = cilindraje;
        this.velocidadMaxima = velocidadMaxima;
        this.prendido = false;
    }

    public String getCilindraje() 
    {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) 
    {
        this.cilindraje = cilindraje;
    }

    public Integer getVelocidadMaxima() 
    {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(Integer velocidadMaxima) 
    {
        this.velocidadMaxima = velocidadMaxima;
    }

    public boolean isPrendido() 
    {
        return prendido;
    }

    public void setPrendido(boolean prendido) 
    {
        this.prendido = prendido;
    }
    
    public void prender() throws EncenderOtraVezException
    {
        if(this.prendido)
        {
            throw new EncenderOtraVezException();
        }else{
            this.prendido=true;
        }
    }
    
    public void apagar(Coche c)throws ApagarOtraVezException
    {
        if(!this.prendido)
        {
            throw new ApagarOtraVezException();
        }else{
            this.prendido=false;
        }
    }
    
    public Boolean validarVelocidadMaxima(Motor m, ArrayList<Motor> motores, Integer aceleracion) 
    {
        Boolean colision=false;
        for(Motor motor : motores)
        {
            if (motor.getCilindraje().equals(m.getCilindraje()))
            {
                if (aceleracion>motor.getVelocidadMaxima()) 
                {
                    colision=true;
                }
            }
        }
        return colision;
    }
}
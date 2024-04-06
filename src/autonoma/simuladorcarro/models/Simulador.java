package autonoma.simuladorcarro.models;

import autonoma.simuladorcarro.exceptions.AcelerarFrenarException;
import autonoma.simuladorcarro.exceptions.ApagadoAccidenteException;
import autonoma.simuladorcarro.exceptions.ApagarOtraVezException;
import autonoma.simuladorcarro.exceptions.CapacidadMotorException;
import autonoma.simuladorcarro.exceptions.EncenderOtraVezException;
import autonoma.simuladorcarro.exceptions.FrenaQuietoException;
import autonoma.simuladorcarro.exceptions.LimitePatinajeException;
import autonoma.simuladorcarro.exceptions.LlantaPatinajeException;
import autonoma.simuladorcarro.exceptions.MasSesentaKmxhException;
import autonoma.simuladorcarro.exceptions.RecuperaPatinajeException;
/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-22
 */
public class Simulador 
{
    private Coche coche;

    public Simulador() 
    {
        this.coche = Taller.creaCocheDeDocumento();
    }

    public Coche getCoche() 
    {
        return coche;
    }

    public void setCoche(Coche coche) 
    {
        this.coche = coche;
    }

    public void prenderCoche() throws EncenderOtraVezException
    {
        this.coche.prenderMotor();
    }
    
    public void apagarCoche(Coche c) throws ApagarOtraVezException, MasSesentaKmxhException, ApagadoAccidenteException
    {
            this.coche.apagarMotor(c);
    }
    
    public void acelerarCoche(Integer aceleracion) throws AcelerarFrenarException, CapacidadMotorException, RecuperaPatinajeException, ApagadoAccidenteException, ApagarOtraVezException
    {
            this.coche.acelerar(aceleracion, this.coche);
    }
    
    public void frenarCoche(Integer intensidadFrenado) throws LlantaPatinajeException, AcelerarFrenarException, LimitePatinajeException, FrenaQuietoException
    {
            this.coche.frenar(intensidadFrenado, this.coche);
    }
}

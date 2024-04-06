package autonoma.simuladorcarro.models;

import autonoma.simuladorcarro.models.Motor;
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
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-18
 */
public class Coche
{   
    private Timer temporizador = new Timer();
    
    private Llanta tipoLlanta;
    private Motor tipoMotor;
    private Integer velocidad;
    private boolean acelerado;
    private boolean patinando;
    ArrayList<Motor> validarmotores;

    public Coche(Motor tipoMotor, Llanta tipoLlanta)
    {
        this.tipoLlanta = tipoLlanta;
        this.tipoMotor = tipoMotor;
        this.velocidad = 0;
        this.acelerado = false;
        this.patinando = false;
    }

    public Llanta getTipoLlanta()
    {
        return tipoLlanta;
    }

    public void setTipoLlanta(Llanta tipoLlanta)
    {
        this.tipoLlanta = tipoLlanta;
    }

    public Motor getTipoMotor()
    {
        return tipoMotor;
    }

    public void setTipoMotor(Motor tipoMotor)
    {
        this.tipoMotor = tipoMotor;
    }

    public Integer getVelocidad()
    {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad)
    {
        this.velocidad = velocidad;
    }

    public boolean isAcelerado()
    {
        return acelerado;
    }

    public void setAcelerado(boolean acelerado)
    {
        this.acelerado = acelerado;
    }

    public boolean isPatinando()
    {
        return patinando;
    }

    public void setPatinando(boolean patinando)
    {
        this.patinando = patinando;
    }

    public ArrayList<Motor> getValidarmotores()
    {
        return validarmotores;
    }

    public void setValidarmotores(ArrayList<Motor> validarmotores)
    {
        this.validarmotores = validarmotores;
    }
    
    public void prenderMotor()throws EncenderOtraVezException
    {
        this.tipoMotor.prender();
    }
    
    public void apagarMotor(Coche c)throws ApagarOtraVezException, MasSesentaKmxhException, ApagadoAccidenteException
    {
        this.tipoMotor.apagar(c);
        if (velocidad > 60)
        {
            accidenta(c);
            throw new MasSesentaKmxhException("Se acaba de accidentar, que pecao, por ir a más de 60km/h y apagarlo");
        }
    }

    public void acelerar(Integer velocidad, Coche c) throws AcelerarFrenarException, CapacidadMotorException, RecuperaPatinajeException, ApagadoAccidenteException, ApagarOtraVezException
    {
        if (LlantaPatina(patinando)==true)
        {
            c.setPatinando(true);
            throw new RecuperaPatinajeException();
        } else {
            Integer nVelocidad = this.velocidad + velocidad;
            
            if (c.getTipoMotor().isPrendido()==true)
            {
                c.setVelocidad(velocidad);
                if(!accidenta(c))
                {
                    c.setVelocidad(nVelocidad);
                    c.setAcelerado(true);
                }
            }else{
                throw new AcelerarFrenarException();
            }
        }
    }
    
    public void frenar(Integer intensidadFrenado, Coche c) throws AcelerarFrenarException, LlantaPatinajeException, LimitePatinajeException, FrenaQuietoException, RecuperaPatinajeException
    {
        if (LlantaPatina(patinando)==true)
        {
            c.setPatinando(true);
            throw new RecuperaPatinajeException("Su vehículo está patinando y por ende perdió el control, debe esperar a que se detenga para recuperarlo.");
        } else {
            Integer nVelocidad = c.getVelocidad() - intensidadFrenado;
            if (c.getTipoMotor().isPrendido()==false)
            {
                throw new AcelerarFrenarException();
            }
            if (c.getVelocidad()==0)
            {
                throw new FrenaQuietoException();
            }
            if (intensidadFrenado > 30 && c.getTipoLlanta().validarLimitePermitido(c, c.getTipoLlanta().getLlantas(), intensidadFrenado)) 
            {
               c.setPatinando(true);
                throw new LlantaPatinajeException();
            }
            if (nVelocidad > c.getVelocidad())
            {
                c.setPatinando(true);
                throw new LimitePatinajeException();
            }
        }
    }
    
    public boolean LlantaPatina(boolean patinando) 
    {
        final boolean[] patinandoArray = new boolean[1];
        patinandoArray[0] = patinando;

        if (!patinandoArray[0]) 
        {
            temporizador.schedule(new TimerTask()
            {
                @Override
                public void run()
                {
                    patinandoArray[0] = false;
                    System.out.println("El temporizador ha completado su ejecución.");
                }
            }, 7000);
        }
        return patinandoArray[0];
    }
    
    public void LlantaStopPatina() throws InterruptedException 
    {
       this.patinando = false;
        Thread.sleep(10000);
    }

    public Boolean accidenta(Coche c) throws ApagadoAccidenteException, ApagarOtraVezException
    {
        Boolean accidentado=false;
        if(this.tipoMotor.validarVelocidadMaxima(c.getTipoMotor(), validarmotores, c.velocidad))
        {
            this.tipoMotor.apagar(c);
            accidentado=true;
            throw new ApagadoAccidenteException();
        }else{
            return accidentado;
        }      
    }
}
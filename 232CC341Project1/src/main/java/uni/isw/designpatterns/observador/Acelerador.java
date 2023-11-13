
package uni.isw.designpatterns.observador;

import java.util.ArrayList;

public class Acelerador implements SujetoObservable{
    
    private ArrayList<Observador> observadores;
    
    public Acelerador() {
        observadores = new ArrayList<Observador>();
    }
    
    //Registro de observadores
    public void enlazarObservador(Observador o){
        observadores.add(o);
    }
    
    //detectar cambios y notificamos
    public void pisarElAcelerador(){
        //se dispara el evento notificar
        notificar();
    }

    @Override
    public void notificar() {
        for(Observador o: observadores){
            o.update();
        }
    }
    
}

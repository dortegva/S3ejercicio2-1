package ejercicio1Sprint3.Observable;

import ejercicio1Sprint3.Observer.AgenciaBolsa;

import java.util.ArrayList;

public class Agentedebolsa {
    private ArrayList<AgenciaBolsa> listadeAgencias=new ArrayList<>();

    public void subscribe (AgenciaBolsa agencia){
        listadeAgencias.add(agencia);
    }

    public void unsubscribe(AgenciaBolsa agencia){
        listadeAgencias.remove(agencia);

    }

    public void notify (boolean indicador){
        for (AgenciaBolsa agencia: listadeAgencias){
            agencia.update(indicador);

        }
    }

}

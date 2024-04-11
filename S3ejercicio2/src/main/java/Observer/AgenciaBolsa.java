package ejercicio1Sprint3.Observer;

public class AgenciaBolsa implements Observer {

    @Override
    public void update (boolean indicador){
        if (indicador==true){
            System.out.println("La bolsa ha subido.");
        }else {System.out.println("La bolsa ha bajado.");}
    }

}
import ejercicio1Sprint3.Observable.Agentedebolsa;
import ejercicio1Sprint3.Observer.AgenciaBolsa;

public class Main {
    public static void main(String[] args) {


    Agentedebolsa FTSE100=new Agentedebolsa();


    AgenciaBolsa agenciaBCN =new AgenciaBolsa();
    AgenciaBolsa agenciaTRSS=new AgenciaBolsa();

    FTSE100.subscribe(agenciaBCN);
    FTSE100.subscribe(agenciaTRSS);


    agenciaBCN.update(true);
    agenciaTRSS.update(false);
}}

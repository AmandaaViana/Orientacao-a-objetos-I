import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RadioRelogio implements Radio, Relogio {

    public String ligar(){
        return "Radio ligado";
    }

    public String desligar(){
        return "Radio desligado";
    }

    public String trocarEstacao(float estacao){
        return "Mudando estaçao para " + estacao;
    }

    public String getHoras(){
        //LocalTime horaAtual = LocalTime.now();
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        //return horaAtual.format(dtf);
        //ou:
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    }

}

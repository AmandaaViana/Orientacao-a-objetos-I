import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RelogiodePulso implements Relogio{
    public String getHoras(){
        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        return horaAtual.format(dtf);
    }
    public String iniciarCronometro(){
        return "Iniciando cronometro...";
    }
}

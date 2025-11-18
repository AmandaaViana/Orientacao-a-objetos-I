import java.time.LocalDate;
import java.time.LocalDatetime;
import java.time.LocalTime;
import java.format.DateTimeFormatter;

public class ExemploLocalDateTime{
    public static void main(String[] args){
        LocalDate data = LocalDate.now();
        System.out.println(data);

        LocalDate hora = LocalDate.now();
        System.out.println(hora);

        LocalDate dataHora = LocalDate.now();
        System.out.println(dataHora);

        //Formataçao
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                    //DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Data formatada: " + data.format(formatoData));

        //calcular datas
        LocalDate hoje = LocalDate.now();
        LocalDate amanha = hoje.plusDays(1);
        System.out.println("Hoje: " + hoje.format(formatada));
        System.out.println("Amanha: " + amanha.format(formatada));

        LocalTime horaAtual = LocalTime.now();
        LocalTime menosUmaHora = horaAtual.minusHours(1);
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hora atual: " + horaAtual.format(formatoHora));
        System.out.println("menos 1 hora: " + menosUmaHora.format(formatoHora));

        LocalDatetime agora = LocalDatetime.now();
        LocalDatetime futuro = agora.plusDays(5).minusHours(12).plusMinutes(5);
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
        System.out.println("Agora: " + agora.format(formatoDataHora));
        System.out.println("Futuro: " + futuro.format(formatoDataHora));

        //comparar
        if(agora.equals(futuro)){}

        //criar uma data especifica
        LocalDate minhaData = LocalDate.parse("06/03/2020", formatoData);
        System.out.println("minha data: " + minhaData);
        System.out.println("minha data: " + minhaData.format(formatoData));
    }
}
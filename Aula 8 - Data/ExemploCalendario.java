import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DateFormat;

public class ExemploCalendario{
    public static void main(String[] args){
        Calendar agora = Calendar.getInstance();
        System.out.println("Agora: " + agora);

        Calendar vencimento = agora;
        vencimento.add(Calendar.DATE,7);
        System.out.println("Vencimento: " + vencimento);

        vencimento.add(Calendar.MONTH,-1);
        System.out.println("Novo Vencimento: " + vencimento);

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Ano: " + gc.get(Calendar.YEAR));
        System.out.println("Mes: " + gc.get(Calendar.MONTH));
        System.out.println("Dia do mes: " + gc.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia da semana: " + gc.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do ano: " + gc.get(Calendar.DAY_OF_YEAR));
        System.out.println("Semana do mes: " + gc.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Dia da semanda no mes: " + gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Hora: " + gc.get(Calendar.HOUR));
        System.out.println("AM/PM: " + gc.get(Calendar.AM_PM));
        System.out.println("Hora do dia: " + gc.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minuto: " + gc.get(Calendar.MINUTE));
        System.out.println("Segundo: " + gc.get(Calendar.SECOND));

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Data formatada: " + df.format(gc.getTime()));
        System.out.println("Vencimento: " + vencimento.getTime());
        System.out.println("Vencimento formatado: " + df.format(vencimento.getTime()));

        //criar uma data especifica
        System.out.println("Criando uma data especifica");
        GregorianCalendar dtNasc = new GregorianCalendar();
        dtNasc.set(1999, Calendar.JUNE, 20);
        System.out.println("Aniversario: " + df.format(dtNasc.getTime()));

        System.out.println("Criando uma data a partir de uma String");
        String dataString = "20/06/1999";
        String[] vetDataString = dataString.split("/");
        dtNasc.set(Calendar.YEAR, Integer.parseInt(vetDataString[2]));
        dtNasc.set(Calendar.MONTH, Integer.parseInt(vetDataString[1]) - 1); //no mes precisa de -1, pois começa em 0
        dtNasc.set(Calendar.DAY_OF_MONTH, Integer.parseInt(vetDataString[0]));
        System.out.println("Nova data: " + df.format(dtNasc.getTime()));

        dtNasc.set(Integer.parseInt(vetDataString[2]),
                   Integer.parseInt(vetDataString[1]) -1,
                   Integer.parseInt(vetDataString[0]));
        System.out.println("Nova data: " + df.format(dtNasc.getTime()));
        

    }
}
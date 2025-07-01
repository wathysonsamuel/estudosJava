package dataHora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calend {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat d1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //instanciando objeto Format

        Date d = Date.from(Instant.parse("18/06/25T15:42:07"));

        System.out.println(d);

        Calendar cal = Calendar.getInstance();
        cal.setTime(d); // Calendar recebe a cada "d"
        cal.add(Calendar.HOUR_OF_DAY, 4); // pegar hora do d
        d = cal.getTime();
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);


    }
}

package command;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Time {



    public Time(){

    }


    public boolean timeChecker(String time){

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hhmm", Locale.ENGLISH);
        String dateInString = time;
        try {
            Date date = formatter.parse(dateInString);
            System.out.println(date + " is valid date format");
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public Date timeConverter(String time) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hhmm", Locale.ENGLISH);
        String dateInString = time;
        Date date = formatter.parse(dateInString);
        System.out.println(date);
        return date;
    }


}

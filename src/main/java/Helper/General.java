package Helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class General {
    private String name;

    public String getAName(){return "test"+name;}
    public String getAMail(){return "test"+name+"@mailinator.com";}
    public String getPhone(){return "8456561";}

    public General(){
        name= getDate();
    }

    private String getDate(){
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        Date today = Calendar.getInstance().getTime();
        return df.format(today);
    }
}

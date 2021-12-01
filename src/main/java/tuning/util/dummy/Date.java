package tuning.util.dummy;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {

    private Calendar time;
    private SimpleDateFormat dd = new SimpleDateFormat("dd");
    private SimpleDateFormat YYYYMMdd = new SimpleDateFormat("YYYYMMdd");
    private SimpleDateFormat HHMMDDssSSS = new SimpleDateFormat("HHmmssSSS");

    public Date() {
        this.time = Calendar.getInstance();
    }

    public String getDd() {
        return dd.format(time.getTime());
    }

    public String getYYYYMMdd() {
        return YYYYMMdd.format(time.getTime());
    }

    public String getHHMMDDssSSS() {
        return HHMMDDssSSS.format(time.getTime());
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getDd());
        System.out.println(date.getYYYYMMdd());
        System.out.println(date.getHHMMDDssSSS());

    }
}

package Dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Developer {

    private final String lastName;
    private final Date lastDatePassing;

    public Developer(String lastName) {
        this.lastName = lastName;
        lastDatePassing = new Date();
    }

    public void passTask(){
        lastDatePassing.setTime(System.currentTimeMillis());
    }

    public String getLastPassingTime(){
        String pattern = "HH:mm:ss, dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(lastDatePassing);
    }

    public String getLastName() {
        return lastName;
    }
}
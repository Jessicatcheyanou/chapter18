package testing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class CoordSchedule {

    public static final int MAX_FREQUENCY = 1440;
    public static final int MIN_FREQUENCY = 5;

    private String startingTimeStamp;
    private String endingTimestamp;
    private int frequency;

    public CoordSchedule(String startingTimeStamp, String endingTimestamp, int frequency) {
        this.startingTimeStamp = startingTimeStamp;
        this.endingTimestamp = endingTimestamp;
        this.frequency = frequency;
    }

    public String getStartingTimeStamp() {
        return startingTimeStamp;
    }

    public void setStartingTimeStamp(String startingTimeStamp) {
        this.startingTimeStamp = startingTimeStamp;
    }

    public String getEndingTimestamp() {
        return endingTimestamp;
    }

    public void setEndingTimestamp(String endingTimestamp) {
        this.endingTimestamp = endingTimestamp;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    private Date parseTimeStamp(String timeStamp){
           Date date = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'", Locale.getDefault());
        format.setTimeZone(TimeZone.getTimeZone("UTC"));

        try {
            date = format.parse(timeStamp);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public Date getStartingTimestampAsDate(){
          return parseTimeStamp(startingTimeStamp);
    }

    public Date getEndingTimestampAsDate(){
        return parseTimeStamp(endingTimestamp);
    }
}

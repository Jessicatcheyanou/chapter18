package testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CoordScheduleTest {

    @Test
    @DisplayName("Frequency must be less than 1440")
    void testFrequency(){
       CoordSchedule schedule = new CoordSchedule("2020-12-15T15:32Z",
               "2020-12-30T05:15Z",
               60);

        Assertions.assertTrue(schedule.getFrequency() < 40);
    }
}

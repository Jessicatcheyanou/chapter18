import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DailyGoalTest {

    public static final int DAILY_GOAL = 10000;

    @ParameterizedTest
    @DisplayName("Step counts should meet or exceed the daily Goal")
    @ValueSource( ints = {11000,10000,13500})
    public void testMetStepGoal(int steps){
        DailyGoal dailyGoal = new DailyGoal(DAILY_GOAL);
        Assertions.assertTrue(dailyGoal.hasMetGoals(steps));
    }

    @ParameterizedTest
    @DisplayName("Step counts should not meet nor exceed the daily Goal")
    @ValueSource(ints = {10,999,1580})
    public void testNotMetStepGoal(int steps){
        DailyGoal dailyGoal = new DailyGoal(DAILY_GOAL);
        Assertions.assertFalse(dailyGoal.hasMetGoals(steps));
    }



}

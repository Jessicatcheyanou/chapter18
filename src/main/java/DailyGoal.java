public class DailyGoal {

    int dailyGoal;

    public DailyGoal(int dailyGoal) {
        this.dailyGoal = dailyGoal;
    }

    public boolean hasMetGoals(int steps){
        return steps >= dailyGoal;
    }


}

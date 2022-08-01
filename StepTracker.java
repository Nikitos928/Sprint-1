
public class StepTracker {
    double[][] expenses = new double[12][30];

    double saveStep(double stepsPerDay, double steps, int mauns, int day) {
        stepsPerDay = steps + stepsPerDay;
        expenses[mauns - 1][day - 1] = steps + expenses[mauns - 1][day - 1];
        System.out.println("Значение сохранено! Текущее колличсво шагов " + stepsPerDay);
        return stepsPerDay;
    }
    void printAllSteps(int monthNew) {
        for (int i = 0; i < 30; i++) {
            System.out.println("Месяц " + monthNew +" День " + (i + 1) + ". Шагов: " + expenses[monthNew - 1][i]);
        }
    }
    double findMaxSteps(int monthNew) {
        double maxExpense = 0;
        for (int i = 0; i < 30; i++) {
            if (expenses[monthNew - 1][i] > maxExpense) {
                maxExpense = expenses[monthNew - 1][i];
            }
        }
        return maxExpense;
    }
    double findSumSteps(int monthNew) {
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            sum += expenses[monthNew - 1][i];
        }
        return +sum;
    }
    static int newTargetApply(int newTarget) {
        int target = 10000;
        if (newTarget != 10000) {
            target = newTarget;
            return target;
        }
        return target;
    }
    double bestSeries(int monthNew) {
        int targetApply = newTargetApply(10000);
        int dayStepsSeria = 0;
        for (int i = 0; i < 30; i++)
            if (expenses[monthNew - 1][i] > targetApply) {
                if (expenses[monthNew - 1][i + 1] > targetApply) {
                    dayStepsSeria = dayStepsSeria + 1;
                }
            }
        return dayStepsSeria;
    }


}


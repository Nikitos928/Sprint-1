public class Convertor {
    StepTracker stepTracker = new StepTracker();
    void convert (int monthNew) {
        System.out.println("Среднее колличесво шагов " + (stepTracker.findSumSteps(monthNew) / 30));
        System.out.println("Пройдено в км " + (stepTracker.findSumSteps(monthNew) * 0.00075));
        System.out.println("Сожжено килокорий " + ((stepTracker.findSumSteps(monthNew) * 50) / 1000));

}
}
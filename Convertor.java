public class Convertor {
    StepTracker stepTracker = new StepTracker();
    void convert (int monthNew) {
        System.out.println("������� ���������� ����� " + (stepTracker.findSumSteps(monthNew) / 30));
        System.out.println("�������� � �� " + (stepTracker.findSumSteps(monthNew) * 0.00075));
        System.out.println("������� ��������� " + ((stepTracker.findSumSteps(monthNew) * 50) / 1000));

}
}
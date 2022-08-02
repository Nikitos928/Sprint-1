import java.util.Scanner;
public class Now  { // �� ���� ��� �������� ���������, ����� ������ ��� �������� ������� ���� �� �������������, ��� �� ������� � �� ����� ��������, ������ ��� ���� ������� ������ ��� ���� ����������
    public static void main (String[] args)  {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        Convertor convertor = new Convertor();
        double stepsPerDay = 0;

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("������� �����");
                int mauns = scanner.nextInt();
                System.out.println("������� ����");
                int day = scanner.nextInt();
                System.out.println("������� ���-�� �����");
                double steps = scanner.nextDouble();

                stepsPerDay = stepTracker.saveStep(stepsPerDay, steps, mauns, day);
            } else if (command == 2) {
                    System.out.println("������� �����");
                    int monthNew = scanner.nextInt();
                    stepTracker.printAllSteps(monthNew);
                    System.out.println("����������� ���-�� ����� " + stepTracker.findMaxSteps(monthNew));
                    System.out.println("����� ����� �� ����� " + stepTracker.findSumSteps(monthNew));
                    convertor.convert(monthNew);
                    System.out.println("������ �����  " + stepTracker.bestSeries(monthNew));
            } else if (command == 3) {
                System.out.println("������� ����� ���� �� �����");
                int newTarget = scanner.nextInt();
                stepTracker.newTargetApply(newTarget);

            } else if (command == 0) {
                System.out.println("�����");
                break;
            } else {
                System.out.println("����� ������� ���");
            }

        }
        }
    public static void printMenu() {
        System.out.println("��� �� ������ �������? ");
        System.out.println("1 - ������ ����������� �����");
        System.out.println("2 - ����������");
        System.out.println("3 - �������� ���� �� ���������� ����� � ����");
        System.out.println("0 - ����� �� ����������");

    }
    }



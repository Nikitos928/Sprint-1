import java.util.Scanner;
public class now  {
    public static void main (String[] args)  {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

        double stepsPerDay = 0;

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Введите месяц");
                int mauns = scanner.nextInt();
                System.out.println("Введите день");
                int day = scanner.nextInt();
                System.out.println("Введите кол-во шагов");
                double steps = scanner.nextDouble();

                stepsPerDay = stepTracker.saveStep(stepsPerDay, steps, mauns, day);
            } else if (command == 2) {
                    System.out.println("Введите месяц");
                    int monthNew = scanner.nextInt();
                    stepTracker.printAllSteps(monthNew);
                    System.out.println("Максимально кол-во шагов " + stepTracker.findMaxSteps(monthNew));
                    System.out.println("Сумма шагов за месяц " + stepTracker.findSumSteps(monthNew));
                    System.out.println("Среднее колличесво шагов " + (stepTracker.findSumSteps(monthNew) / 30));
                    System.out.println("Пройдено в км " + (stepTracker.findSumSteps(monthNew) * 0.00075));
                    System.out.println("Сожжено килокорий " + ((stepTracker.findSumSteps(monthNew) * 50) / 1000));
                    System.out.println("Лучшая серия  " + stepTracker.bestSeries(monthNew));
            } else if (command == 3) {
                System.out.println("Введине новую цель по шагам");
                int newTarget = scanner.nextInt();
                stepTracker.newTargetApply(newTarget);

            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Такой команды нет");
            }

        }
        }
    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести колличество шагов");
        System.out.println("2 - Статистика");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения");

    }
    }



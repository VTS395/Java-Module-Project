import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tmpName;
        int tmpSpeed;
        Race race = new Race();

        System.out.println("Добро пожаловать в приложение «24 часа Ле-Мана»!");

        for(int i = 0; i < 3; i++) {
            System.out.println("Введите название машины №" + (i + 1));
            tmpName = scanner.nextLine();

            boolean isSpeedValid = false;
            while(!isSpeedValid) {
                System.out.println("Введите скорость машины №" + (i + 1));
                tmpSpeed = scanner.nextInt();
                if (tmpSpeed > 0 && tmpSpeed <= 250) {
                    Vehicle vehicle = new Vehicle(tmpName, tmpSpeed);
                    race.speedTest(vehicle);
                    isSpeedValid = true;
                } else {
                    System.out.println("Недопустимая скорость");
                }
                scanner.nextLine(); //очистка буфера
            }
        }
        race.printInfo();
    }
}

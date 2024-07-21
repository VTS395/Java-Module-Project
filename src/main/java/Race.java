public class Race {
    String leaderName = "";
    int leaderDistance = 0;

    public void speedTest(Vehicle car) {
        int distance = 24 * car.speed;
        if(distance > leaderDistance) {
            leaderDistance = distance;
            leaderName = car.name;
        }
    }
    public void printInfo() {
        System.out.println("Имя лидера гонки " + leaderName + " он преодолел дистанцию " + leaderDistance + " км!");
    }
}

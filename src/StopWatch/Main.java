package StopWatch;

public class Main {

    public static void main(String[] args) {
        StopWatch stopWatch1 = new StopWatch();
        stopWatch1.start();
        for (int i = 0; i < 100000; i++) {
            System.out.print(i + "\n");
        }
        stopWatch1.stop();
        System.out.println("Thời gian thực thi: "+stopWatch1.getElapsedTime());
    }
}

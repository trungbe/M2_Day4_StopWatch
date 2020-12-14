package StopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {

    }

    //pt do khoang time bd
    public void start() {
        startTime = System.currentTimeMillis();
    }

    //pt do khoang time kt
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    //time troi qua
    public long getElapsedTime() {
        return endTime - startTime;
    }

}

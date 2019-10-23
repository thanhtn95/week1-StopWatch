import java.util.Date;

public class StopWatch {
    private double startTime, endTime;

    public StopWatch() {
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public void start() {
        Date date = new Date();
        this.startTime = date.getTime();
    }

    public void end() {
        Date date = new Date();
        this.endTime = date.getTime();
    }

    public double getElapsedTime() {
        return this.endTime - this.startTime;
    }
}

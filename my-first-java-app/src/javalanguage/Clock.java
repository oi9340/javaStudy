package javalanguage;

public class Clock {
    private long time = 0;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    private Clock(long time){
        this.time = time;
        System.out.println("constructor 1 "+time);
    }

    public Clock(long time, long timeOffset){
        this(time);
        this.time += timeOffset;
        System.out.println("constructor 2 "+time);
    }

    public static Clock newClock(){
        return new Clock(System.currentTimeMillis());
    }

    public static void main(String[] args) {
//        Clock clock = new Clock(12,2);
        Clock.newClock();
    }
}

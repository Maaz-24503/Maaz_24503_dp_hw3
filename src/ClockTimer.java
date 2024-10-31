import java.time.Clock;

public class ClockTimer extends Subject{
    private int hour;
    private int minute;
    private int second;

    public ClockTimer(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) throws InvalidTimeException {
        if(hour >=0 && hour <24)
            this.hour = hour;
        else
            throw new InvalidTimeException("Time Set to invalid Hour Value");
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) throws Exception {
        if(minute >= 0 && minute <60)
            this.minute = minute;
        else
            throw new InvalidTimeException("Time Set to invalid Minute Value");
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) throws Exception {
        if(second >= 0 && second <60)
            this.second = second;
        else
            throw new InvalidTimeException("Time Set to invalid Second Value");
    }

    public void tick(){
        if(this.second<59) this.second++;
        else{
            this.second = 0;
            if(this.minute<59) this.minute++;
            else{
                this.minute = 0;
                if(this.hour<23) this.hour++;
                else hour = 0;
            }
        }
        notifyObservers();
    }

    public String getState(){
        String[] tm = {"", "", ""};
        tm[0] = this.hour +"";
        tm[1] = this.minute + "";
        tm[2] = this.second + "";
        for(int i = 0; i < 3; i++) if(tm[i].length()<2) tm[i] = "0" + tm[i];
        return tm[0]+":"+tm[1]+":"+tm[2];
    }
}

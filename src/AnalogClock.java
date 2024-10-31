public class AnalogClock extends Observer{
    private String time;
    void draw(){
        ColorPrint.printRed("The Analog Clock time is "+ this.time);
    }
    @Override
    public void update(Subject sub) {
        this.time = sub.getState();
    }
}

public class DigitalClock extends Observer{
    private String time;
    void draw(){
        ColorPrint.printGreen("The Digital Clock time is "+ this.time);
    }
    @Override
    public void update(Subject sub) {
        this.time = sub.getState();
    }
}

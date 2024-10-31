public class Main {
    public static void main(String[] args) {
        ClockTimer temp = new ClockTimer();
        DigitalClock clock1 = new DigitalClock();
        AnalogClock clock2 = new AnalogClock();
        temp.attach(clock1);
        temp.attach(clock2);
        temp.notifyObservers();

        // We update the timer every second to make it tick,
        // and without explicitly updating the clocks ourselves,
        // they are updated alongside;
        for(int i = 0; i<10; i++){
            try{
                clock1.draw();
                clock2.draw();
                temp.tick();
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Unexpected error occurred");
            }
        }
        temp.detach(clock1);
        System.out.println("The digital clock has been detached\n");

        // After detaching the digital clock
        for(int i = 0; i<10; i++){
            try{
                clock1.draw();
                clock2.draw();
                temp.tick();
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Unexpected error occurred");
            }
        }
    }
}
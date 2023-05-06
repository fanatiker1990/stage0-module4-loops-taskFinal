package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int powerNum=1;
        int counter=1;
        while (counter<=power){
            powerNum*=numberToPrint;
            counter++;
        }
        System.out.println(powerNum);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}

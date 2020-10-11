package potencias;

import java.lang.Thread;

public class PowerNumbers extends Thread {

    private final int number;

    PowerNumbers(int number) {
        this.number=number;
    }

    @Override
    public void run(){
        for (int i=1; i<=10; i++){
            System.out.printf("%s: %d ^ %d = %f\n ", getName(), number, i, Math.pow(number, i));
        }
    }
}

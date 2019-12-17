public class Main {
    public static void main(String[] args) {
        Main prog = new Main();
       double s2= prog.run();
        prog.printf(s2);

    }


    private double calcSquare(int x)
    {
        double s=1+x+ Math.pow(x,2)/2 + Math.pow(x,3)/6 +Math.pow(x,4)/6;
        return s;
    }

    private double run() {
        int x1= 5;
        double s1 = calcSquare(x1);

        return s1;


    }

    private void printf( double s1) {
        System.out.println(s1);
    }
}


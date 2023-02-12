class Structure {

    static class Sportsman {
        double run;
        double swim;
        double jump;

        Sportsman(double r, double s, double j) {
            run = r;
            swim = s;
            jump = j;
        }
    }

    public static double average(double run, double swim, double jump) {
        double average1 = (run + swim + jump) / 3;
        return average1;
    }
}


public class Main {
    public static void main(String[] args) {
        Structure.Sportsman First = new Structure.Sportsman(23, 45, 56);
        Structure.Sportsman Second = new Structure.Sportsman(45, 21, 32);
        Structure.Sportsman Third = new Structure.Sportsman(54, 22, 34);
        double f = Structure.average(First.run, First.swim, First.jump);
        double s = Structure.average(Second.run, Second.swim, Second.jump);
        double th = Structure.average(Third.run, Third.swim, Third.jump);


        double[] sportsmen = new double[3];
        sportsmen[0] = f;
        sportsmen[1] = s;
        sportsmen[2] = th;

        for (int i = 0; i < sportsmen.length; i++) {
            System.out.println(sportsmen[i]);
        }
    }
}
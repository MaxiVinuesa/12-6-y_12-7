public class Dispersion {

    int M = 101;
    double R = 0.6180334;

    public int dispersion(double x) {
        double t;

        int v;

        t = R * x - Math.floor(R * x);

        v = (int) (M * t);
        return v;
    }
}

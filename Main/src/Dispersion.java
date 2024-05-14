public class Dispersion {

    int M = 1024;
    double R = 0.6180334;

    public int dispersion(double x) {
        double t;

        int v;

        t = R * x - Math.floor(R * x);

        v = (int) (M * t);

        System.out.println("La clave hasheada es: " + v);
        return v;
    }
}

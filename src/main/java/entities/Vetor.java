package entities;

public class Vetor {

    private Double x;
    private Double y;
    private Double z;

    public Vetor() {
    }

    public Vetor(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Vetor(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }



    public static Double calcularMagnitude(Vetor v1, Vetor v2) {

       
        return v1.x * v2.y;

    }

}

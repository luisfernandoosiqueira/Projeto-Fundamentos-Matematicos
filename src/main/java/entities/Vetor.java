package entities;

public class Vetor {

    private Integer x;
    private Integer y;
    private Integer z;

    public Vetor() {
    }

    public Vetor(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Vetor(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public static int calcularMagnitude(Vetor v1, Vetor v2) {

        return v1.x * v2.y;

    }

}

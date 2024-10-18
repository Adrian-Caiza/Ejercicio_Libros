import static java.lang.Math.sqrt;
public class Operaciones {
    Double n1;
    Double n2;

    public Operaciones() {
    }

    public Operaciones(Double n1, Double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    //getters
    private Double getN1() {
        return n1;
    }

    private Double getN2() {
        return n2;
    }
    //setters
    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }
    //metodo personalizado
    public void imprimirDatos(){
        System.out.println("N1: " + getN1());
        System.out.println("N2: " + getN2());
    }
    public double sumatoria() {
        return n1 + n2;
    }
    public void sumaeimpresion() {
        double suma = n1 + n2;
        System.out.println(suma);
    }
    public void raiz() {
        double raiz = Math.sqrt(n1);
        double raiz2 = Math.sqrt(n2);
        System.out.println(raiz);
        System.out.println(raiz2);
    }
}


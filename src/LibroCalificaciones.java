public class LibroCalificaciones {
    private String nombreDelCurso;//atributo
    private String periodo;
    private int anio;
    private double promedio;
    //constructor
    public LibroCalificaciones(String nombre, String periodo, int anio, double promedio) {
        nombreDelCurso = nombre;
        this.periodo = periodo;
        this.anio = anio;
        this.promedio = promedio;
    }
    //setter
    public void establecerNombreDelCurso(String nombre) {
        nombreDelCurso = nombre;
    }
    public void establecerPeriodoDelCurso(String periodo) {
        this.periodo = periodo;
    }
    public void establecerAnioDelCurso(int anio) {
        this.anio = anio;
    }
    public void establecerPromedioDelCurso(double promedio) {
        this.promedio = promedio;
    }
    //getter
    public String obtenerNombreDelCurso() {
        return nombreDelCurso;
    }
    public String obtenerPeriodoDelCurso() {
        return periodo;
    }
    public int obtenerAnioDelCurso() {
        return anio;
    }
    public double obtenerPromedioDelCurso() {
        return promedio;
    }
    //metodo personalizado
    public void mostrarMensaaje() {
        System.out.printf("Bienbenido al libro de calificaciones para %s\n", obtenerNombreDelCurso());
        System.out.printf("El periodo academico es %s\n", obtenerPeriodoDelCurso());
        System.out.printf("El anio del curso es %s\n", obtenerAnioDelCurso());
        System.out.printf("El promedio del curso es %s\n", obtenerPromedioDelCurso());
    }
    public void metodo1() {}
    private void metodo2() {}
}


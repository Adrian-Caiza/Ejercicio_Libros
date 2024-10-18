import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner entrada = new Scanner(System.in); //input de datos
    public static void main(String[] args) {
        /*
        LibroCalificaciones miLibroCalificaciones1 = new LibroCalificaciones("","",0,0.0);
        System.out.print("Escriba el nombre del curso: ");
        String nombreDelCurso = entrada.nextLine();
        miLibroCalificaciones1.establecerNombreDelCurso(nombreDelCurso);

        System.out.print("Escriba el periodo del curso: ");
        String periodo = entrada.nextLine();
        miLibroCalificaciones1.establecerPeriodoDelCurso(periodo);

        System.out.print("Escriba el anio del curso: ");
        int anio = entrada.nextInt();
        miLibroCalificaciones1.establecerAnioDelCurso(anio);

        System.out.print("Escriba el promedio del curso: ");
        double promedio = entrada.nextDouble();
        miLibroCalificaciones1.establecerPromedioDelCurso(promedio);
        miLibroCalificaciones1.mostrarMensaaje();
        */
        Operaciones operaciones = new Operaciones();
        operaciones.setN1(20.0);
        operaciones.setN2(2.0);
        operaciones.imprimirDatos();
        System.out.println(operaciones.sumatoria());
        operaciones.raiz();
        operaciones.sumaeimpresion();

    }

}

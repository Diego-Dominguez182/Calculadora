package djdl.uv.Calculadora;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class CalculadoraApplication {
static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		SpringApplication.run(CalculadoraApplication.class, args);
		int eleccion = mostrarMenu();
        while(eleccion != 3){
            switch (eleccion) {
                case 1:
                    mostrarTabla();
                    break;
                case 2:
                    mostrarTablas();
                    break;
                case 3:
                    break;
            }
        }
    }
    
    public static int mostrarMenu(){

        System.out.println("Bienvenido a las tablas de multiplicar");
        System.out.println("1.- Mostrar una tabla");
        System.out.println("2.- Mostrar tablas del 2 al 5");
        System.out.println("3.- Salir");
        int eleccion = scan.nextInt();
        return eleccion;
    }

    public static void mostrarTabla(){
        System.out.println("De qué número quieres la tabla?");
        int eleccion = scan.nextInt();
        for (int i = 0; i <= 10; i++){
            System.out.println(eleccion + " * " + i + " = " + eleccion * i);
        }
    }

	public static void mostrarTablas(){
        System.out.println("Lta blas del 2 al 5 son");
        for (int i = 2; i <= 5; i++){
            System.out.println();
            for (int j = 0; j <= 10; j++){
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
	}
}

import java.util.Random;
import java.util.Scanner;
import java.io.*;


/**
 *
 */

public class ClassDado{


        static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
        static int select = -1; //opción elegida del usuario
        static int num1 = 0; //Variables

        static int count;


	public void Dado(){
		count = 0;
	}

	public int Lanzar(){
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(6);
		count++;
		return randomInt;
	}
	
	public static void main(String[] args) {
	  ClassDado dado = new ClassDado();
		//Mientras la opción elegida sea 0, preguntamos al usuario
		while(select != 0){
			//Try catch para evitar que el programa termine si hay un error
			try{
				System.out.println("Elige opción:\n1.- Lanzar" +
						"\n0.- Salir");
				//Recoger una variable por consola
				select = Integer.parseInt(scanner.nextLine()); 
	
				//Switch para decidir la opcion a tomar
				switch(select){
                    case 1:
					num1 = dado.Lanzar();
					System.out.println("\n");
					System.out.println("El resultado es: " + num1);
					break;
				    case 0:
				        //Al momento de salir, el usuario conoce cuántos tiros hizo
				        System.out.println("\nUsted ha lanzado el dado " + count + " veces.\n");
					System.out.println("Gracias!");
					break;
					default:
					    //En caso de que se presione una tecla equivocada
                        System.out.println("Por favor, seleccione una opcion válida.");
                        break;
				}
				
				System.out.println("\n"); //Salto de línea
			}catch(Exception e){
				System.out.println("Error!");//Si hay error en la ejecución del case
			}
		}

	}
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Personas> personas = new ArrayList<>();
        List<Perro> perrosDisponibles = new ArrayList<>();

        int opc, edad, edadP;
        String nombre, apellido, documento;
        String placa, nombreP, raza, tamaño, doc;


        do {
            System.out.println("""
                    
         System.out.println("\\n--- Menú de Adopción de Perros ---");
                          1. Registrar persona")       
                          2. Registrar perro");
                          3. Ver personas registradas");
                          4. Ver perros disponibles");
                          5. Adoptar perro");
                          6. Consultar perro más viejo adoptado");
                          7. Salir");
                          Ingrese una opción: """);

            opc = teclado.nextInt();
            teclado.nextLine();

            switch (opc) {
                case 1 -> {

                    System.out.print("Nombre: ");
                     nombre = teclado.nextLine();
                    System.out.print("Apellido: ");
                     apellido = teclado.nextLine();
                    System.out.print("Edad: ");
                     edad = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Documento: ");
                     documento = teclado.nextLine();

                    personas.add(new Personas(nombre, apellido, edad, documento));
                    System.out.println("Persona registrada.");
                    break;

                }
                case 2 -> {
                    System.out.print("Placa: ");
                    placa = teclado.nextLine();
                    System.out.print("Nombre: ");
                    nombreP = teclado.nextLine();
                    System.out.print("Raza: ");
                    raza = teclado.nextLine();
                    System.out.print("Edad: ");
                    edadP = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Tamaño: ");
                    tamaño = teclado.nextLine();

                    perrosDisponibles.add(new Perro(placa, nombreP, raza, edadP, tamaño));
                    System.out.println("Perro registrado.");
                    break;
                }
                case 3 ->{

                    System.out.println("*** PERSONAS ***");
                    for (Personas p : personas) {
                        System.out.println(p);
                    }
                    break;

                }
                case 4 ->{
                    System.out.println("*** PERROS ***");
                    for(Perro e : perrosDisponibles){
                        System.out.println(e);

                    }
                    break;
                }
                case 5 ->{
                    System.out.println("INGRESE SU DOCUMENTO: ");
                    doc= teclado.nextLine();





                }
                case 6 ->{

                }
            }
        }while(opc!=7);

    }

}
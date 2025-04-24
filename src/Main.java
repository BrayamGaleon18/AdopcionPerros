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
        boolean ver= false;
        boolean disponibles = false;
        String buscar;

        do {
            System.out.println("""
                    
              --- ADOPTA TU PERRO ---
         1. Registrar persona      
         2. Registrar perro
         3. Ver personas registradas
         4. Ver perros disponibles
         5. Adoptar perro
         6. Consultar perro más viejo adoptado
         7. Salir
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

                    perrosDisponibles.add(new Perro(placa, nombreP, raza, edadP, tamaño, false));
                    System.out.println("\nPerro registrado.");
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

                    for (Perro e : perrosDisponibles) {
                        if (e.estado()) {
                            System.out.println(e);
                            disponibles = true;
                        }else {
                            System.out.println("\n**** NO HAY PERROS DISPONIBLES ****");
                        }
                    }

                    break;
                }
                case 5 ->{

                    System.out.print("INGRESE SU DOCUMENTO: ");
                    doc = teclado.nextLine();

                    Personas adoptante = null;
                    for (Personas p : personas) {
                        if (p.getDocumento().equalsIgnoreCase(doc)) {
                            adoptante = p;
                            break;
                        }
                    }

                    if (adoptante == null) {
                        System.out.println("NO ESTA REGISTRADO. POR FAVOR REGISTRESE PRIMERO.");
                        break;
                    }



                    System.out.println("**** PERROS DISPONIBLES ****\n");

                    for (Perro e : perrosDisponibles) {
                        if (e.estado()) {
                            System.out.println(e);
                            disponibles = true;
                        }else {
                            System.out.println("\n**** NO HAY PERROS DISPONIBLES ****");
                        }
                    }

                    System.out.print("\nINGRESE LA PLACA DEL PERRO: ");
                    buscar = teclado.nextLine();

                    for (Perro e : perrosDisponibles) {
                        if (e.getPlaca().equalsIgnoreCase(buscar)) {
                            if (e.estado()) {
                                e.adoptar();
                                e.setAdoptadoPor(adoptante);
                                System.out.println("\n¡HAZ ADOPTADO A: " + e.getNombre() + " !");
                            }
                            ver = true;
                            break;
                        }
                    }

                    if (!ver) {
                        System.out.println("NO HAY PERROS CON ESTA PLACA.");
                    }
                    break;


                }
                case 6 ->{
                    System.out.println("*** PERROS ADOPTADOS Y SUS DUEÑOS ***");
                    Perro perroMasViejo = null;

                    for (Perro e : perrosDisponibles) {
                        if (!e.estado() && e.getAdoptadoPor() != null) {
                            System.out.println(e + "\nSU DUEÑO ES: " + e.getAdoptadoPor().getNombre() + " " + e.getAdoptadoPor().getApellido() + "\n");

                            if (perroMasViejo == null || e.getEdad() > perroMasViejo.getEdad()) {
                                perroMasViejo = e;
                            }
                        }
                    }

                    if (perroMasViejo != null) {
                        System.out.println("*** PERRO MÁS VIEJO ADOPTADO ***");
                        System.out.println(perroMasViejo + "\nSU DUEÑO ES: " + perroMasViejo.getAdoptadoPor().getNombre());
                    } else {
                        System.out.println("NO SE HAN ADOPTADO PERROS.");
                    }
                }
            }



        }while(opc!=7);

    }

}
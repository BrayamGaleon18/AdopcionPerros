import java.util.List;
import java.util.ArrayList;

public class Personas {

    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private List<Perro> perrosAdoptados;

    public Personas(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perrosAdoptados = new ArrayList<>();
    }

    public void adoptarPerro(Perro perro) {
        if (perrosAdoptados.size() >= 3) {
            System.out.println("No se puede adoptar más perros. Ya tiene 3.");
        } else {
            perrosAdoptados.add(perro);
            System.out.println("El perro ha sido adoptado exitosamente.");
        }
    }


    public Perro perroMasGrande() {
        if (perrosAdoptados.isEmpty()) return null;
        Perro mayor = perrosAdoptados.get(0);
        for (Perro p : perrosAdoptados) {
            if (p.getEdad() > mayor.getEdad()) {
                mayor = p;
            }
        }
        return mayor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public List<Perro> getPerrosAdoptados() {
        return perrosAdoptados;
    }

    public void setPerrosAdoptados(List<Perro> perrosAdoptados) {
        this.perrosAdoptados = perrosAdoptados;
    }

    public String getDocumento() {
        return documento;
    }


    @Override
    public String toString() {
        return "Persona Registradas: " +
                "Nombre= " + nombre +
                ", Apellido= " + apellido +
                ", Edad= " + edad +
                ", Documento= " + documento
                ;
    }
}

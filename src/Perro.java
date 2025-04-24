public class Perro {
  private String placa;
  private String nombre;
  private String raza;
  private int edad;
  private String tamaño;
    private boolean estado;
    private boolean adoptado;
    private Personas dueño;


    public Perro() {
       this.estado = false;
   }

    public Perro(String placa, String nombre, String raza, int edad, String tamaño, boolean adoptado) {
        this.placa = placa;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
        this.estado = !adoptado;
    }

    public String getPlaca() {
      return placa;
   }

   public void setPlaca(String placa) {
      this.placa = placa;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getRaza() {
      return raza;
   }

   public void setRaza(String raza) {
      this.raza = raza;
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }

   public String getTamaño() {
      return tamaño;
   }

   public void setTamaño(String tamaño) {
      this.tamaño = tamaño;
   }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    public boolean isAdoptado() {
        return adoptado;
    }
    public void adoptar() {
        this.estado = false;
    }

    public boolean estado() {
        return this.estado;
    }
    public void setAdoptadoPor(Personas persona) {
        this.dueño = persona;
    }

    public Personas getAdoptadoPor() {
        return dueño;
    }

   @Override
   public String toString() {
      return "Perro Registrados: " +
              "Placa= " + placa  +
              ", Nombre= " + nombre  +
              ", Raza= " + raza  +
              ", Edad= " + edad +
              ", Tamaño= " + tamaño
              ;
   }



}

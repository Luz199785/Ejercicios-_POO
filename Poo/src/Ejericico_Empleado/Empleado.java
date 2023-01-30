package Ejericico_Empleado;


public abstract class Empleado { //abstractas son padres
    
    //Atributos
    private String nombre;
    private String apellido;
    private int numDocumento;
    public int numVentas;
    public int salarioBase;
    
    //Constructor

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int numDocumento, int numVentas, int salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido; //ubica el dato de la variable 
        this.numDocumento = numDocumento;
        this.numVentas = numVentas;
        this.salarioBase = salarioBase;
    }
    
    //Getter y Setter
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

    public int getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(int numDocumento) {
        this.numDocumento = numDocumento;
    }

    public int getNumVentas() {
        return numVentas;
    }

    public void setNumVentas(int numVentas) {
        this.numVentas = numVentas;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    //Metodos
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    //public int retornarSalrio
    public abstract void mostrarDatos();
    
    
    
    
    
}

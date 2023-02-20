//clase principal padre

public class Empleado {
  private String nombre;
  private double salarioBase;

  public Empleado(String nombre, double salarioBase) {
    this.nombre = nombre;
    this.salarioBase = salarioBase;
  }

  public String getNombre() {
    return nombre;
  }

  public double getSalarioBase() {
    return salarioBase;
  }

  public double calcularSalario() {
    return salarioBase;
  }
}
// clase salario
public class EmpleadoAsalariado extends Empleado {
  public EmpleadoAsalariado(String nombre, double salarioBase) {
    super(nombre, salarioBase);
  }

  @Override
  public double calcularSalario() {
    return super.getSalarioBase();
  }
}
//clase trabajo por horas
public class EmpleadoPorHoras extends Empleado {
  private int horasTrabajadas;
  private double tarifaPorHora;

  public EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
    super(nombre, salarioBase);
    this.horasTrabajadas = horasTrabajadas;
    this.tarifaPorHora = tarifaPorHora;
  }

  @Override
  public double calcularSalario() {
    return super.getSalarioBase() + (horasTrabajadas * tarifaPorHora);
  }
}
// clase operacion
public class EmpleadoPorComision extends Empleado {
  private double ventas;
  private double porcentajeComision;

  public EmpleadoPorComision(String nombre, double salarioBase, double ventas, double porcentajeComision) {
    super(nombre, salarioBase);
    this.ventas = ventas;
    this.porcentajeComision = porcentajeComision;
  }

  @Override
  public double calcularSalario() {
    return super.getSalarioBase() + (ventas * porcentajeComision);
  }
}

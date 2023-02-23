//clase principal padre
//En este ejemplo, la clase Empleado es la superclase, que tiene un atributo nombre y un atributo salarioBase. También tiene un método calcularSalario() 
//que devuelve el salario base del empleado

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
//La clase EmpleadoAsalariado es una subclase que hereda los atributos y métodos de la clase Empleado. En este caso, el salario del 
//empleado asalariado es simplemente el salario base, por lo que el método calcularSalario() se sobrescribe para devolver el salario base.
  
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
//La clase EmpleadoPorHoras es otra subclase que hereda los atributos y métodos de la clase Empleado. 
//En este caso, el salario del empleado por horas se calcula multiplicando las horas trabajadas por la
//tarifa por hora, y sumando ese resultado al salario base. El método calcularSalario() se sobrescribe para realizar este cálculo.
  
//clase trabajo por horas
public class EmpleadoPorHoras extends Empleado {
  private int horasTrabajadas;
  private double tarifaPorHora;

  public EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
    super(nombre, salarioBase);
    this.horasTrabajadas = horasTrabajadas;
    this.tarifaPorHora = tarifaPorHora;

}
  
// clase operacion
public class EmpleadoPorComision extends Empleado {
  private double ventas;
  private double porcentajeComision;
  
// La clase EmpleadoPorComision es una tercera subclase que hereda los atributos y métodos de la clase Empleado.
//En este caso, el salario del empleado por comisión se calcula multiplicando las ventas por el porcentaje de comisión, y sumando ese resultado al salario base.
  // El método calcularSalario() se sobrescribe para realizar este cálculo.De esta manera, se pueden crear instancias de cada subclase y llamar al método calcularSalario() para obtener el salario correspondiente a cada tipo de empleado

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






La clase EmpleadoPorComision es una tercera subclase que hereda los atributos y métodos de la clase Empleado.
En este caso, el salario del empleado por comisión se calcula multiplicando las ventas por el porcentaje de comisión, y sumando ese resultado al salario base. El método calcularSalario() se sobrescribe para realizar este cálculo.

De esta manera, se pueden crear instancias de cada subclase y llamar al método calcularSalario() para obtener el salario correspondiente a cada tipo de empleado.*/

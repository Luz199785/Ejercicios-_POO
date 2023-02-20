Para calcular el salario de empleados utilizando herencia en Java con entrada por teclado, se pueden utilizar las clases y métodos definidos 
en el ejemplo anterior, y agregar funcionalidades para leer los valores de entrada por teclado.

Aquí hay un ejemplo de cómo se podría implementar el cálculo del salario para cada tipo de empleado con entrada por teclado:




import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el nombre del empleado: ");
    String nombre = scanner.nextLine();

    System.out.print("Ingrese el salario base del empleado: ");
    double salarioBase = scanner.nextDouble();

    System.out.print("Ingrese el tipo de empleado (A para asalariado, H para por horas, C para por comision): ");
    String tipo = scanner.next();

    double salario = 0.0;

    if (tipo.equalsIgnoreCase("A")) {
      EmpleadoAsalariado empleado = new EmpleadoAsalariado(nombre, salarioBase);
      salario = empleado.calcularSalario();
    } else if (tipo.equalsIgnoreCase("H")) {
      System.out.print("Ingrese las horas trabajadas: ");
      int horasTrabajadas = scanner.nextInt();

      System.out.print("Ingrese la tarifa por hora: ");
      double tarifaPorHora = scanner.nextDouble();

      EmpleadoPorHoras empleado = new EmpleadoPorHoras(nombre, salarioBase, horasTrabajadas, tarifaPorHora);
      salario = empleado.calcularSalario();
    } else if (tipo.equalsIgnoreCase("C")) {
      System.out.print("Ingrese el total de ventas: ");
      double ventas = scanner.nextDouble();

      System.out.print("Ingrese el porcentaje de comisión: ");
      double porcentajeComision = scanner.nextDouble();

      EmpleadoPorComision empleado = new EmpleadoPorComision(nombre, salarioBase, ventas, porcentajeComision);
      salario = empleado.calcularSalario();
    }

    System.out.println("El salario de " + nombre + " es: " + salario);
  }
}
En este ejemplo, se utiliza un objeto Scanner para leer los valores de entrada por teclado. Primero se solicita el nombre del empleado y el salario base. 
  Luego se pide al usuario que ingrese el tipo de empleado: A para asalariado, H para por horas, C para por comisión.

Dependiendo del tipo de empleado ingresado, se leen los valores adicionales necesarios para calcular el salario. Para empleados por horas, 
se solicitan las horas trabajadas y la tarifa por hora. Para empleados por comisión, se solicitan el total de ventas y el porcentaje de comisión.

Finalmente, se crea una instancia de la subclase correspondiente y se llama al método calcularSalario() para calcular el salario del empleado.
  El resultado se imprime en pantalla.


import Ejericico_Empleado.Empleado;
import Ejericico_Empleado.EmpleadoPorComision;
import Ejericico_Empleado.Registro;

public class main {

    public static void main(String[] args) {

        Empleado empleado;

        Registro registro = new Registro();
        Empleado empleado1 = new EmpleadoPorComision("Laura", "Moreno", 123455, 36, 0.2, 10000);
        registro.registrar(empleado1);

        Empleado empleado2 = new EmpleadoPorComision();
        //"Moreno", 123455, 36, 0.2, 10000, 1000000
        empleado1.setNombre("Laura");
        
        empleado2.setApellido("Moreno");
        System.out.println(empleado1.getNombre());
        
        registro.consultar(); //Me devuelve los datos de la clase empleado(padre)

    }

}

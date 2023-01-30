
package Ejericico_Empleado;

import java.util.ArrayList;
import java.util.List;

public class Registro {
    List<Empleado> listaEmpleados = new ArrayList<>();

    public void registrar(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    public void consultar() {
        for(Empleado objetoEmpleado : listaEmpleados) {
            objetoEmpleado.mostrarDatos();
        }
    }
}




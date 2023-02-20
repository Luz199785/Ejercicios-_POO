public class Vehiculo {
  private String marca;
  private String modelo;
  private int anio;
  private int kilometraje;

  public Vehiculo(String marca, String modelo, int anio, int kilometraje) {
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
    this.kilometraje = kilometraje;
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public int getAnio() {
    return anio;
  }

  public int getKilometraje() {
    return kilometraje;
  }
}

public class Coche extends Vehiculo {
  private int numPuertas;

  public Coche(String marca, String modelo, int anio, int kilometraje, int numPuertas) {
    super(marca, modelo, anio, kilometraje);
    this.numPuertas = numPuertas;
  }

  public int getNumPuertas() {
    return numPuertas;
  }
}

public class Moto extends Vehiculo {
  private String tipo;

  public Moto(String marca, String modelo, int anio, int kilometraje, String tipo) {
    super(marca, modelo, anio, kilometraje);
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }
}

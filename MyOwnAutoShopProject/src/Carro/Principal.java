package Carro;

import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Definimos la clase Motor, que representa el objeto a clonar
 class Motor {

  // Atributos del motor
  private double potencia; // en caballos de fuerza
  private double consumo; // en litros por 100 km
  private double temperatura; // en grados Celsius
  private boolean encendido; // indica si el motor está encendido o apagado

  // Constructor del motor
  public Motor(double potencia, double consumo) {
    this.potencia = potencia;
    this.consumo = consumo;
    this.temperatura = 20; // temperatura inicial
    this.encendido = false; // motor apagado por defecto
  }

  // Método para encender el motor
  public void encender() {
    this.encendido = true;
    System.out.println("El motor se ha encendido.");
  }

  // Método para apagar el motor
  public void apagar() {
    this.encendido = false;
    System.out.println("El motor se ha apagado.");
  }

  // Método para acelerar el motor
  public void acelerar(double velocidad) {
    if (this.encendido) {
      // Calculamos el incremento de la potencia y el consumo
      double incrementoPotencia = this.potencia * velocidad / 100;
      double incrementoConsumo = this.consumo * velocidad / 100;
      // Actualizamos los atributos del motor
      this.potencia += incrementoPotencia;
      this.consumo += incrementoConsumo;
      // Calculamos el incremento de la temperatura
      double incrementoTemperatura = incrementoPotencia / 10;
      // Actualizamos la temperatura del motor
      this.temperatura += incrementoTemperatura;
      // Mostramos el estado del motor
      System.out.println("El motor ha acelerado a " + velocidad + " km/h.");
      System.out.println("La potencia es de " + this.potencia + " caballos de fuerza.");
      System.out.println("El consumo es de " + this.consumo + " litros por 100 km.");
      System.out.println("La temperatura es de " + this.temperatura + " grados Celsius.");
    } else {
      System.out.println("No se puede acelerar el motor si está apagado.");
    }
  }

  // Método para frenar el motor
  public void frenar(double velocidad) {
    if (this.encendido) {
      // Calculamos el decremento de la potencia y el consumo
      double decrementoPotencia = this.potencia * velocidad / 100;
      double decrementoConsumo = this.consumo * velocidad / 100;
      // Actualizamos los atributos del motor
      this.potencia -= decrementoPotencia;
      this.consumo -= decrementoConsumo;
      // Calculamos el decremento de la temperatura
      double decrementoTemperatura = decrementoPotencia / 10;
      // Actualizamos la temperatura del motor
      this.temperatura -= decrementoTemperatura;
      // Mostramos el estado del motor
      System.out.println("El motor ha frenado a " + velocidad + " km/h.");
      System.out.println("La potencia es de " + this.potencia + " caballos de fuerza.");
      System.out.println("El consumo es de " + this.consumo + " litros por 100 km.");
      System.out.println("La temperatura es de " + this.temperatura + " grados Celsius.");
    } else {
      System.out.println("No se puede frenar el motor si está apagado.");
    }
  }

  // Método para clonar el motor
  public Motor clone() {
    // Creamos un nuevo objeto Motor con los mismos atributos que el original
    Motor clon = new Motor(this.potencia, this.consumo);
    clon.temperatura = this.temperatura;
    clon.encendido = this.encendido;
    // Devolvemos el clon
    return clon;
  }

  // Método para guardar el estado del motor en un archivo
  public void guardarEstado(String nombreArchivo) {
    try {
      // Creamos un objeto File con el nombre del archivo
      File archivo = new File(nombreArchivo);
      // Creamos un objeto FileWriter para escribir en el archivo
      FileWriter escritor = new FileWriter(archivo);
      // Escribimos los atributos del motor en el archivo
      escritor.write("Potencia: " + this.potencia + "\n");
      escritor.write("Consumo: " + this.consumo + "\n");
      escritor.write("Temperatura: " + this.temperatura + "\n");
      escritor.write("Encendido: " + this.encendido + "\n");
      // Cerramos el escritor
      escritor.close();
      // Mostramos un mensaje de éxito
      System.out.println("El estado del motor se ha guardado en el archivo " + nombreArchivo + ".");
    } catch (IOException e) {
      // Mostramos un mensaje de error
      System.out.println("Ha ocurrido un error al guardar el estado del motor.");
      e.printStackTrace();
    }
  }

}

// Definimos la clase Principal, que contiene el método main
public class Principal {

  // Método main, que se ejecuta al iniciar el programa
  public static void main(String[] args) {
    // Creamos un objeto Motor con una potencia de 100 caballos de fuerza y un consumo de 5 litros por 100 km
    Motor motorOriginal = new Motor(100, 5);
    // Encendemos el motor original
    motorOriginal.encender();
    // Aceleramos el motor original a 80 km/h
    motorOriginal.acelerar(80);
    // Clonamos el motor original
    Motor motorClon = motorOriginal.clone();
    // Frenamos el motor clon a 40 km/h
    motorClon.frenar(40);
    // Apagamos el motor clon
    motorClon.apagar();
    // Guardamos el estado del motor original en un archivo llamado motorOriginal.txt
    motorOriginal.guardarEstado("motorOriginal.txt");
    // Guardamos el estado del motor clon en un archivo llamado motorClon.txt
    motorClon.guardarEstado("motorClon.txt");
  }

}
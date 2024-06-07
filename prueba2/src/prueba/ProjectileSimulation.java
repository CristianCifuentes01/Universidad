package prueba;

import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class ProjectileSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ángulo de tiro en grados: ");
        double theta = scanner.nextDouble();
        System.out.print("Ingrese la velocidad inicial en m/s: ");
        double v0 = scanner.nextDouble();
        System.out.print("Ingrese la altura inicial en metros: ");
        double yo = scanner.nextDouble();

        final double g = 9.81; // Aceleración de la gravedad, m/s2

        // Reducir el número de iteraciones para valores de distancias pequeños
        final int Iteraciones_total = 1000;
        double[] Iteraciones = new double[10 * Iteraciones_total];
        for (int i = 0; i < Iteraciones.length; i++) {
            Iteraciones[i] = i * (double) Iteraciones_total / Iteraciones.length;
        }

        double[] y = new double[Iteraciones.length];
        double[] x = new double[Iteraciones.length];
        final int[] count = { 0 }; // Contador como un array de una sola posición

        for (double t : Iteraciones) {
            double radians = Math.toRadians(theta);
            double yVal = -(0.5 * g * Math.pow(t, 2)) + (v0 * Math.sin(radians) * t) + yo;
            double xVal = v0 * Math.cos(radians) * t;

            if (yVal > 0 && xVal >= 0) {
                y[count[0]] = yVal;
                x[count[0]] = xVal;
                count[0]++;
            }
        }

        // Crear el gráfico:
        JFrame frame = new JFrame("SIMULACIÓN DE UN PROYECTIL");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;

                // Dibujar el suelo:
                g2d.setColor(Color.GRAY);
                g2d.setStroke(new BasicStroke(20));
                g2d.drawLine(0, 550, 800, 550);

                // Dibujar el cañón:
                g2d.setColor(Color.BLACK);
                g2d.fillOval(390, 500, 20, 20);

                // Dibujar el proyectil:
                g2d.setColor(Color.BLUE);
                for (int i = 0; i < count[0]; i++) {
                    int xPixel = (int) (x[i] * 30); // Escalar para que se vea en la ventana
                    int yPixel = 550 - (int) (y[i] * 30); // Invertir el eje y y escalar
                    g2d.fillOval(xPixel, yPixel, 5, 5);
                }

                // Dibujar la explosión:
                g2d.setColor(Color.RED);
                int xExplosion = (int) (x[count[0] - 1] * 30); // Escalar para que se vea en la ventana
                int yExplosion = 550 - (int) (y[count[0] - 1] * 30); // Invertir el eje y y escalar
                g2d.fillOval(xExplosion - 50, yExplosion - 50, 100, 100);
            }
        };

        frame.add(panel);
        frame.setVisible(true);

        // Esperar a que el usuario cierre la ventana para salir
        while (frame.isVisible()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}



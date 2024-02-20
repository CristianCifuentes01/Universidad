package AnalisisAlgoritmos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JuegoDeLaVida extends JFrame {
    private static final int M = 20; // Tamaño de la matriz (MxM)
    private int[][] matriz;
    private JPanel panelMatriz;
    private Timer timer;

    public JuegoDeLaVida() {
        setTitle("Juego de la Vida");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new BorderLayout());

        matriz = generarSemilla(M);
        panelMatriz = new JPanel(new GridLayout(M, M));

        // Inicializar la interfaz gráfica
        inicializarGUI();

        // Configurar temporizador para actualizar la matriz automáticamente
        int velocidadSimulacion = 500; // Milisegundos entre generaciones
        timer = new Timer(velocidadSimulacion, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                siguienteGeneracion();
                actualizarGUI();
            }
        });

        pack();
        setLocationRelativeTo(null); // Centrar la ventana
        setVisible(true);
        timer.start(); // Iniciar la simulación automáticamente
    }

    private void inicializarGUI() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                JButton botonCelda = new JButton();
                botonCelda.setPreferredSize(new Dimension(20, 20));
                botonCelda.setBackground(matriz[i][j] == 1 ? Color.BLACK : Color.WHITE);

                final int fila = i;
                final int columna = j;

                botonCelda.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        matriz[fila][columna] = 1 - matriz[fila][columna];
                        botonCelda.setBackground(matriz[fila][columna] == 1 ? Color.BLACK : Color.WHITE);
                    }
                });

                panelMatriz.add(botonCelda);
            }
        }

        add(panelMatriz, BorderLayout.CENTER);

        JButton reiniciarButton = new JButton("Reiniciar");
        reiniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reiniciarJuego();
            }
        });

        add(reiniciarButton, BorderLayout.SOUTH);
    }

    private int[][] generarSemilla(int M) {
        int[][] semilla = new int[M][M];
        Random rand = new Random();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                semilla[i][j] = rand.nextInt(2); // 0 o 1 (muerta o viva)
            }
        }

        return semilla;
    }

    private void siguienteGeneracion() {
        int[][] nuevaGeneracion = new int[M][M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                int vecinasVivas = contarVecinasVivas(i, j);

                if (matriz[i][j] == 1 && (vecinasVivas == 2 || vecinasVivas == 3)) {
                    nuevaGeneracion[i][j] = 1; // Célula viva
                } else if (matriz[i][j] == 0 && vecinasVivas == 3) {
                    nuevaGeneracion[i][j] = 1; // Célula muerta nace
                } else {
                    nuevaGeneracion[i][j] = 0; // Célula muere
                }
            }
        }

        matriz = nuevaGeneracion;
    }

    private int contarVecinasVivas(int fila, int columna) {
        int contador = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int filaVecina = (fila + i + M) % M;
                int columnaVecina = (columna + j + M) % M;

                contador += matriz[filaVecina][columnaVecina];
            }
        }

        contador -= matriz[fila][columna];
        return contador;
    }

    private void reiniciarJuego() {
        matriz = generarSemilla(M);
        actualizarGUI();
    }

    private void actualizarGUI() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                Component componente = panelMatriz.getComponent(i * M + j);
                JButton botonCelda = (JButton) componente;
                botonCelda.setBackground(matriz[i][j] == 1 ? Color.BLACK : Color.WHITE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JuegoDeLaVida();
            }
        });
    }
}

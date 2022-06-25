package test;

import javax.swing.JOptionPane;
import domain.Arbol;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        int aux = 1;

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1. Árbol Binario" +
                        "\n2. Árbol n-nario de grado 3" +
                        "\n3. Árbol n-nario de grado 4" +
                        "\n4. Salir del programa" +
                        "\n\nSELECCIONA UNA OPCIÓN",
                "CREACIÓN DE ARBOLES N-NARIOS PERFECTOS",
                JOptionPane.QUESTION_MESSAGE));

        switch (opcion) {
            case 1:
                do {
                    int peso = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Ingrese el peso del Arbol", "Peso",
                            JOptionPane.INFORMATION_MESSAGE));
                    if (peso == 3 || peso == 7 || peso == 15 || peso == 33) {
                        for (int i = 1; i <= peso; i++) {
                            int valor = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Ingresa el valor del nodo/raiz " + i + ": "));
                            arbol.insertar(valor);
                        }
                        do {
                            int opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "1.Preorden" +
                                            "\n2.Posorden" +
                                            "\n3.Inorden" +
                                            "\n\nSELECCIONA UNA OPCIÓN",
                                    "ORDENAMIENTO DE ÁRBOLES",
                                    JOptionPane.QUESTION_MESSAGE));
                            switch (opc) {
                                case 1:
                                    JOptionPane.showMessageDialog(null,
                                            arbol.preorden(),
                                            "Preorden",
                                            JOptionPane.PLAIN_MESSAGE);
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null,
                                            arbol.posorden(),
                                            "Posorden",
                                            JOptionPane.PLAIN_MESSAGE);
                                    break;
                                case 3:
                                    JOptionPane.showMessageDialog(null,
                                            arbol.inorden(),
                                            "Inorden",
                                            JOptionPane.PLAIN_MESSAGE);
                                    break;
                                default:
                                    System.exit(1);
                                    break;
                            }
                        } while (1 == 1);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "NO COINCIDE EL PESO CON EL TIPO DE ARBOL", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } while (1 == 1);
            case 2:
                do {
                    int peso = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Ingrese el peso del Arbol", "Peso",
                            JOptionPane.INFORMATION_MESSAGE));
                    if (peso == 4 || peso == 13) {
                        for (int i = 1; i <= peso; i++) {
                            int valor = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Ingresa el valor del nodo/raiz " + i + ": "));
                            arbol.insertar(valor);
                        }
                        do {
                            int opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "1.Preorden" +
                                            "\n2.Posorden" +
                                            "\n3.Inorden" +
                                            "\n\nSELECCIONA UNA OPCIÓN",
                                    "ORDENAMIENTO DE ÁRBOLES",
                                    JOptionPane.QUESTION_MESSAGE));
                            switch (opc) {
                                case 1:
                                    JOptionPane.showMessageDialog(null,
                                            arbol.preorden(),
                                            "Preorden",
                                            JOptionPane.PLAIN_MESSAGE);
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null,
                                            arbol.posorden(),
                                            "Posorden",
                                            JOptionPane.PLAIN_MESSAGE);
                                    break;
                                case 3:
                                    JOptionPane.showMessageDialog(null,
                                            arbol.inorden(),
                                            "Inorden",
                                            JOptionPane.PLAIN_MESSAGE);
                                    break;
                                default:
                                    System.exit(1);
                                    break;
                            }
                        } while (1 == aux);

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "NO COINCIDE EL PESO CON EL TIPO DE ARBOL", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } while (1 == 1);
            default:
                break;
        }
    }
}
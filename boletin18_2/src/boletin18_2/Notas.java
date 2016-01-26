package boletin18_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Notas {

    int numElementos = pedirElemento();
    String[] nombres = new String[pedirElemento()];
    int[] notas = new int[numElementos];

    public int pedirElemento() {
        return Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero de alumnos"));
    }

    public String pedirNombre() {
        return JOptionPane.showInputDialog("Escribe el nombre del alumno");
    }

    public void cargarArray() {
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = pedirNombre();
            notas[i] = (int) (Math.random() * 10 + 1);
        }

    }

    public void listar() {
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("La nota de " + nombres[i] + " es " + notas[i]);
        }
    }

    //Listar aprobados
    public void listarAprobados() {
        for (int i = 0; i < nombres.length; i++) {
            if (notas[i] > 4) {
                System.out.println("La nota de " + nombres[i] + " es " + notas[i]);
            }
        }
    }
//Calcular media

    public int calcularMedia() {
        int sumaNotas = 0;
        for (int i = 0; i < (notas.length - 1); i++) {
            sumaNotas =sumaNotas+ notas[i];
        }
        int media = sumaNotas / numElementos;
        return media;
    }

//Visualizar aprobados y suspensos
    public void ratio() {
        int aprobados=0;
        int suspensos=0;
        for (int i = 0; i < (notas.length - 1); i++) {
            if (notas[i] > 4) {
                aprobados=++aprobados;
            } 
            else if(notas[i]<4){
                suspensos=++suspensos;
            }
        }
        System.out.println("Aprobados: " + aprobados + "\nSuspensos: " + suspensos);
    }

//Calcular el mayor
    public int calcularMayor() {
        int resultado = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > resultado) {
                resultado = notas[i];
            }
        }
        return resultado;
    }

    //Buscar por posición
    public void buscaPosicion() {
        int posicion = (Integer.parseInt(JOptionPane.showInputDialog("Total posiciones: " + numElementos + "\nIntruce posición")))-1;
        for (int i = 0; i < nombres.length; i++) {
            if (notas[i] == notas[posicion]) {
                JOptionPane.showMessageDialog(null, "La nota de " + nombres[i] + " es " + notas[i]);
            }
        }
    }

    //Buscar por nombre
    public void buscaNombre() {
        boolean nomAfirmative = true;
        String busqueda = pedirNombre();
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(busqueda)) {
                JOptionPane.showMessageDialog(null, "La nota de " + nombres[i] + " es " + notas[i]);
            }
            nomAfirmative = false;
        }
        if (nomAfirmative == true) {
            JOptionPane.showMessageDialog(null, "El nombre buscado no esta en la lista");
        }
    }

    //ordenar los nombres
    public void ordenarNom() {
        String auxNome;
        int auxNota;
        for (int i = 0; i < (nombres.length - 1); i++) {
            for (int j = i + 1; j < nombres.length; j++) {
                if (nombres[i].compareToIgnoreCase(nombres[j]) > 0) {
                    //Intercambiamos valores
                    auxNome = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = auxNome;
                    auxNota = notas[i];
                    notas[i] = notas[j];
                    notas[j] = auxNota;

                }
            }
        }

    }

    public void ordenarNota() {
        String auxNome;
        int auxNota;
        for (int i = 0; i < (notas.length - 1); i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] > notas[j]) {
                    //Intercambiamos valores
                    auxNota = notas[i];
                    notas[i] = notas[j];
                    notas[j] = auxNota;
                    auxNome = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = auxNome;

                }
            }
        }

    }

}

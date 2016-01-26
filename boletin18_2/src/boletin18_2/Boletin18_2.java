package boletin18_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Boletin18_2 {
    public static void main(String[] args) {
        
        //Cargamos el array
        Notas ar1 = new Notas();
        ar1.cargarArray();
        
        //Visualizamos el número de aprobados y de suspensos
        ar1.ratio();
        
        //Visualizamos la media de las notas
        int media =ar1.calcularMedia();
        JOptionPane.showMessageDialog(null, "La media de la clase es: "+media);
        
        //Vemos la mayor nota
        int mayor=ar1.calcularMayor();
        JOptionPane.showMessageDialog(null, "La mayor nota es: "+mayor);
        
        //Visualizar por posicion
        ar1.buscaPosicion();
        
        //Visualizar la nota de un alumno que se pide por teclado
        ar1.buscaNombre();
        
        //alumnos aprobados
        ar1.listarAprobados();
        
        //Orden creciente de notas
        ar1.ordenarNota();
        ar1.listar();
        
    }
    
}

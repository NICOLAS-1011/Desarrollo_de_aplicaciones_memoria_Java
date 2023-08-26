package codigoaplicacionesmemoria;
import javax.swing.JOptionPane;

public class ArreglosDosDimensiones_Matrices {


    public static void main(String[] args) {
        
        //Se crean las variables, arreglo y matriz a utilizar
        int vendedores = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos vendedores desea ingresar? "));
            /*if(vendedores > 4){
                vendedores = 4;
            }*/
        int trimestres = 4;
        String[] nombres = new String[vendedores];
        String[][] valor_de_ventas = new String[vendedores][4];
        float suma_total = 0.0f;
        float promedio_total = 0.0f;
        
        
        //Se realiza el ingreso de datos a la matriz
        for (int i = 0; i < vendedores; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre del vendedor numero " + (i+1));
                for (int j = 0; j < trimestres; j++) {
                    valor_de_ventas[i][j] = JOptionPane.showInputDialog("Cuál es el valor de las ventas de " + nombres[i] + " en el trimestre " + (j+1));
                }
        }
        
        
        //Se realiza el promedio por vendedor 
        for (int i = 0; i < vendedores; i++) {
            float suma = 0.0f;
            float promedio = 0.0f;
                for (int j = 0; j < trimestres; j++) {
                    suma += Integer.parseInt(valor_de_ventas[i][j]);
                    promedio = suma / trimestres;
                    
                    //Se realiza el promedio de todos los vendedores
                    suma_total += Float.parseFloat(valor_de_ventas[i][j]);
                }
                
            JOptionPane.showMessageDialog(null,"El promedio de " + nombres[i] + " es de: " + promedio);
        }
        
        promedio_total = suma_total / (vendedores*trimestres);
        
        JOptionPane.showMessageDialog(null, "El promedio total de todos los vendedres es de: " + promedio_total);
    }
}
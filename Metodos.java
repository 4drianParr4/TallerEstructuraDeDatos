import java.util.Scanner;

public class Metodos {

    public ClaseObj[][] LlenarMatrizA(ClaseObj[][]m, Scanner sc){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Ingrese el nombre del producto: ");
                String nombre = sc.next();
                System.out.println("Ingrese el precio del producto: ");
                Double precio = sc.nextDouble();
                System.out.println("Ingrese el stock: ");
                int stock = sc.nextInt();
                ClaseObj o = new ClaseObj(nombre, precio, stock);
                m[i][j] = o;
            }
        }
        return m;
    }
    public void MostrarAlmacen (ClaseObj[][]m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.println("Nombre del producto" + m[i][j].getNombre());
                System.out.println("Precio del prodcuto" + m[i][j].getPrecio());
                System.out.println("Stock del producto" + m[i][j].getStock());
            }
        }
    }
}
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos M = new Metodos();
        Boolean continuar = true;
        System.out.println("Ingrese la dimension del almacen: ");
        int n = sc.nextInt();
        ClaseObj[][] Almacen1 = new ClaseObj[n][n];
        ClaseObj[][] Almacen2 = new ClaseObj[n][n];
        ClaseObj[][] AlmacenUnificado = new ClaseObj[n][n*n];

        while (continuar) {
            System.out.println("Bienvenidos a HomeCenter");}
            System.out.println("Que desea realizar");
            System.out.println("1) Llenar Almacen 1 ");
            System.out.println("2) Mostrar Almacen 1");
            System.out.println("3) Llenar Almacen 2");
            System.out.println("4) Mostrar Almacen 2");
            System.out.println("5) Buscar Producto");
            System.out.println("6) Unificar Almacenes");
            System.out.println("7) Mostrar Almacenes Unificados");
            System.out.println("8) Salir");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    Almacen1 = M.LlenarMatrizA(Almacen1, sc) ;
                    break;
                case 2:
                    M.MostrarAlmacen(Almacen1);
                    break;
                case 3:
                    Almacen2 = M.LlenarMatrizA(Almacen2, sc);
                    break;
                case 4:
                    M.MostrarAlmacen(Almacen2);
                    break;
                case 5:
                    System.out.println("Pagina en mantenimiento");
                    break;
                case 6:
                    System.out.println("Pagina en mantenimiento");
                    break;
                case 7:
                    M.MostrarAlmacen(AlmacenUnificado);
                    break;
                case 8:
                    System.out.println("FINALIZO EL PROGRAMA");
                    break;
            
                default:
                    break;
            }
        }

    }


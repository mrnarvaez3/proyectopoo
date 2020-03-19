
package puntoventa;

/**
 *
 * @author rober
 */
public class PuntoVenta {
        public static Venta venta = new Venta();
        public static Registro registro = new Registro();
        public static Menu menu = new Menu();
    
        public static void main(String[] args) {
        menu.setTitle("Menu principal");
        menu.setVisible(true);
        
    }
}

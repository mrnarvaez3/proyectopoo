
package puntoventa;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import puntoventa.PuntoVenta;
import puntoventa.Venta;
public class Registro extends javax.swing.JFrame {
    public static String[] prodNombres ;
    public static String[] prodCantidad;
    public static String[] prodPrecio;
    public static String[] prodTipo ;
    
    

    static List<Producto> prod = new ArrayList<Producto>();
    double pre = 0, cant = 0, subto = 0;
    // Para las listas de Registro
    static DefaultListModel rNombre = new DefaultListModel();
    static DefaultListModel rCantidad = new DefaultListModel();
    static DefaultListModel rPrecio = new DefaultListModel();
    static DefaultListModel rTipo = new DefaultListModel();


    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        RlistNombre.setModel(rNombre);
        RlistCantidad.setModel(rCantidad);
        RlistPrecio.setModel(rPrecio);
        RlistTipo.setModel(rTipo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RlistCantidad = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        RlistNombre = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        RlistPrecio = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JComboBox<>();
        txtPrecio = new java.awt.TextField();
        txtCantidad = new java.awt.TextField();
        txtNombre = new java.awt.TextField();
        Rguardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        RlistTipo = new javax.swing.JList<>();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 137, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 175, -1, -1));

        jScrollPane2.setViewportView(RlistCantidad);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 62, 161));

        RlistNombre.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                RlistNombreValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(RlistNombre);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 123, 161));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cantidad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 62, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jScrollPane3.setViewportView(RlistPrecio);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 62, 161));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo Producto");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 104, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo Producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Comestibles", "Utensilios", "Oficina", "Industriales", " " }));
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 67, -1));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 67, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 253, -1));

        Rguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        Rguardar.setToolTipText("");
        Rguardar.setBorder(null);
        Rguardar.setBorderPainted(false);
        Rguardar.setContentAreaFilled(false);
        Rguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RguardarActionPerformed(evt);
            }
        });
        getContentPane().add(Rguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 130, 50));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("REGISTRO DE PRODUCTO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        jToggleButton1.setBorder(null);
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 150, 50));

        jScrollPane4.setViewportView(RlistTipo);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 100, 160));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoFinal.jpg"))); // NOI18N
        fondo.setText("jLabel10");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        this.setVisible(false);
        PuntoVenta.menu.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void RguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RguardarActionPerformed
        //  Vamos a obtener el valor de las cajas de texto
        String nombre = txtNombre.getText();
        String tipoProducto = txtTipo.getSelectedItem().toString();
        int cantidad = Integer.parseInt(txtCantidad.getText());
        double precio = Double.parseDouble(txtPrecio.getText());

        Producto producto = new Producto(nombre,tipoProducto, cantidad, precio);

        prod.add(producto);

        // llamamos al metodo para llenar la lista
        limpiar();
        
        
       //this.llenar_listas(nombre, cantidad, precio, tipoProducto);
       prodNombres = new String[Registro.prod.size()];
       prodCantidad = new String[Registro.prod.size()];
       prodPrecio = new String[Registro.prod.size()];
       prodTipo = new String[Registro.prod.size()];
       
       visualizarProductos();
    }//GEN-LAST:event_RguardarActionPerformed

    
    
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void RlistNombreValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_RlistNombreValueChanged

    }//GEN-LAST:event_RlistNombreValueChanged

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed

    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
      //  Para aceptar unicamente letras, mayusculas, etc...
        char c = evt.getKeyChar();
      if((c< 'a' || c>'z') && (c< 'A' || c>'Z')&& (c>' ')&&(c<'á'||c>'ú')&&
              (c<'Á'||c>'Ú')) evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        //  Para aceptar unicamente numeros
        char c = evt.getKeyChar();
        if(c<='0'||c>='9'){evt.consume();}
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped

    }//GEN-LAST:event_txtPrecioKeyTyped
        public static void visualizarProductos() {
            int cont = 0;
            for (Producto producto : prod) {
                prodNombres[cont] = producto.getNombre();
                prodCantidad[cont] = String.valueOf(producto.getCantidad());
                prodPrecio[cont] = String.valueOf(producto.getPrecio());
                prodTipo[cont] = producto.getTipoProducto();

                cont++;
        }
        RlistNombre.setListData(prodNombres);
        RlistCantidad.setListData(prodCantidad);
        RlistPrecio.setListData(prodPrecio);
        RlistTipo.setListData(prodTipo);
    }
        /*
    //  Metodo para llenar listas
    public static void llenar_listas(String nom, int cant, double pre, String tip){
        rNombre.addElement(nom);
        rPrecio.addElement(pre);
        rTipo.addElement(tip);
        rCantidad.addElement(cant);
        
    }     
*/  
  
    public void limpiar(){
        txtNombre.setText("");
        txtTipo.setSelectedIndex(0);
        txtCantidad.setText("");
        txtPrecio.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Rguardar;
    public static javax.swing.JList<String> RlistCantidad;
    public static javax.swing.JList<String> RlistNombre;
    public static javax.swing.JList<String> RlistPrecio;
    public static javax.swing.JList<String> RlistTipo;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JToggleButton jToggleButton1;
    public static java.awt.TextField txtCantidad;
    public static java.awt.TextField txtNombre;
    public static java.awt.TextField txtPrecio;
    private javax.swing.JComboBox<String> txtTipo;
    // End of variables declaration//GEN-END:variables
}

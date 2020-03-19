
package puntoventa;

import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import puntoventa.Registro;
public class Venta extends javax.swing.JFrame {
    double pre = 0, cant = 0, subto = 0;
    public static double sum = 0;
    public static int actual = 0;
    public static int x = 0;
    public static int y = 0;
    public static String aux;
    DecimalFormat f = new DecimalFormat("0.00");
    // Para las listas de Ventas
    static DefaultListModel vNombre = new DefaultListModel();
    static DefaultListModel vCantidad = new DefaultListModel();
    static DefaultListModel vPrecio = new DefaultListModel();
    static DefaultListModel vTipo = new DefaultListModel();
    static DefaultListModel vTotal = new DefaultListModel();
    public Venta() {
        initComponents();
        this.setLocationRelativeTo(null);
        VlistNombre.setModel(vNombre);
        VlistCantidad.setModel(vCantidad);
        VlistPrecio.setModel(vPrecio);
        VlistTipo.setModel(vTipo);
        VlistTotal.setModel(vTotal);
        txtIva.setEditable(false);
        txtTotal.setEditable(false);
        txtsub.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btBuscar = new javax.swing.JToggleButton();
        VtxtNombre = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        VtxtCantidad = new java.awt.TextField();
        btComprar = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        lblPrecio = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        VlistCantidad = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtsub = new java.awt.TextField();
        txtIva = new java.awt.TextField();
        txtTotal = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        VlistNombre = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        VlistPrecio = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        VlistTipo = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        VlistTotal = new javax.swing.JList<>();

        button1.setLabel("button1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PUNTO DE VENTA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre del producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, -1, -1));

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btBuscar.setBorder(null);
        btBuscar.setBorderPainted(false);
        btBuscar.setContentAreaFilled(false);
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 120, 50));

        VtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VtxtNombreActionPerformed(evt);
            }
        });
        VtxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                VtxtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(VtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 160, 24));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cantidad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 144, 168, 26));

        VtxtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VtxtCantidadActionPerformed(evt);
            }
        });
        VtxtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                VtxtCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(VtxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 60, 26));

        btComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btComprar.setBorder(null);
        btComprar.setBorderPainted(false);
        btComprar.setContentAreaFilled(false);
        btComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComprarActionPerformed(evt);
            }
        });
        getContentPane().add(btComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 130, 40));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("Busqueda");

        lblPrecio.setForeground(new java.awt.Color(51, 51, 51));
        lblPrecio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCantidad.setForeground(new java.awt.Color(51, 51, 51));
        lblCantidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNombre.setForeground(new java.awt.Color(51, 51, 51));
        lblNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Tipo");

        lblTipo.setForeground(new java.awt.Color(51, 51, 51));
        lblTipo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cantidad");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("$");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre producto");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(53, 53, 53))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                        .addComponent(lblCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 550, 190));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setName(""); // NOI18N

        jScrollPane2.setViewportView(VlistCantidad);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Cantidad");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre");

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("TOTAL A PAGAR:");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("IVA:");

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("SUB TOTAL");

        txtsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubActionPerformed(evt);
            }
        });

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(VlistNombre);

        jScrollPane3.setViewportView(VlistPrecio);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Precio");

        jScrollPane4.setViewportView(VlistTipo);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Tipo Producto");

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Total");

        jScrollPane5.setViewportView(VlistTotal);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel7)
                                .addGap(49, 49, 49)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 640, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VtxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VtxtNombreActionPerformed
    //  boton buscar 
    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        String nombreBuscar = VtxtNombre.getText();
        boolean bandera = false;
        int cont = 0;
        for (Producto p : Registro.prod) {
            //  Verificamos que el nombre a buscar este en el contendio
            if (p.getNombre().contains(nombreBuscar.toLowerCase())|| p.getNombre().contains(nombreBuscar.toUpperCase())) {
                bandera = true;
                lblNombre.setText(p.getNombre());
                lblCantidad.setText(String.valueOf(p.getCantidad()));
                lblPrecio.setText(String.valueOf(p.getPrecio()));
                lblTipo.setText(p.getTipoProducto());
                cont++;
                
                
            }
        }
        if (bandera == false){
            JOptionPane.showMessageDialog(null, "no existe producto");
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void VtxtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VtxtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VtxtCantidadActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed
    //  Metodo del boton comprar
    private void btComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComprarActionPerformed
        //  Iniciacion de variables
        String[] actualizado = new String[Registro.prod.size()];
        x = Integer.parseInt(VtxtCantidad.getText());
        y = Integer.parseInt(lblCantidad.getText());
        aux = lblNombre.getText();
         
        if (x > y) {
            JOptionPane.showMessageDialog(null, "No hay suficiente producto");
        } else{
            actual = y-x;
            lblCantidad.setText(String.valueOf(actual));
            
            //  Llamo al metodo para llenar la lista que corresponde al carrito
            llenar_listas(lblNombre.getText(), Integer.parseInt(VtxtCantidad.getText()), 
               Double.parseDouble(lblPrecio.getText()), lblTipo.getText());
            
            

            //  recorro array tipo objeto de producto y verifico para asi actualizar la cantidad
            String nombreBuscar = VtxtNombre.getText();
            int cont = 0;
            
            for (Producto p : Registro.prod) {
                //  Verificamos que el nombre a buscar este en el contendio
                if (p.getNombre().contains(nombreBuscar.toLowerCase())|| p.getNombre().contains(nombreBuscar.toUpperCase())) {
                    //  Lleno el objeto con la cantidad actualizada
                    
                    Registro.prodCantidad[cont] = String.valueOf(actual);
                }
                cont++;
            }
          VtxtNombre.setText("");
         VtxtCantidad.setText("");
        }      
    }//GEN-LAST:event_btComprarActionPerformed

    private void txtsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       PuntoVenta.menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VtxtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VtxtCantidadKeyTyped
        //  permite ingresar unicamente numeros
        char c = evt.getKeyChar();
        if(c<='0'||c>='9'){evt.consume();}
    }//GEN-LAST:event_VtxtCantidadKeyTyped

    private void VtxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VtxtNombreKeyTyped
        //  Para aceptar unicamente letras, mayusculas, etc...
        char c = evt.getKeyChar();
      if((c< 'a' || c>'z') && (c< 'A' || c>'Z')&& (c>' ')&&(c<'á'||c>'ú')&&
              (c<'Á'||c>'Ú')) evt.consume();
    }//GEN-LAST:event_VtxtNombreKeyTyped
    
    
    public static void actualizarStock(){

    }

//  Metodo para llenar listas y obtener calculos
    public static void llenar_listas(String nom, int cant, double pre, String tip){
        vNombre.addElement(nom);
        vCantidad.addElement(cant);
        vPrecio.addElement(pre);
        vTipo.addElement(tip);
        
        //  Calculos de valores iva, total, subtotal
        double toti = Integer.parseInt(VtxtCantidad.getText()) * Double.parseDouble(lblPrecio.getText());
        
        double n=0;
        double iva;
        double total;
        sum = sum + toti;
        txtsub.setText(String.valueOf(sum));
        iva = sum * 0.12;
        txtIva.setText(String.valueOf(iva));
        total = sum + iva;
        txtTotal.setText(String.valueOf(total));
        vTotal.addElement(toti);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JList<String> VlistCantidad;
    public static javax.swing.JList<String> VlistNombre;
    public static javax.swing.JList<String> VlistPrecio;
    public static javax.swing.JList<String> VlistTipo;
    public static javax.swing.JList<String> VlistTotal;
    public static java.awt.TextField VtxtCantidad;
    public static java.awt.TextField VtxtNombre;
    private javax.swing.JToggleButton btBuscar;
    private javax.swing.JToggleButton btComprar;
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JLabel lblCantidad;
    public static javax.swing.JLabel lblNombre;
    public static javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTipo;
    public static java.awt.TextField txtIva;
    public static java.awt.TextField txtTotal;
    public static java.awt.TextField txtsub;
    // End of variables declaration//GEN-END:variables
}

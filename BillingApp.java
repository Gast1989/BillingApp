
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class BillingApp extends JFrame {

    // Constructor de la Clase
    public BillingApp() {
        initComponents();
    }

    // método "initComponents()"
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNroCuenta = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtKwh = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFactura = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Factura de Luz");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Nro de cuenta ");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Nombre cliente");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Cantidad kWh");

        txtNroCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroCuentaActionPerformed(evt);
            }
        });

        txtFactura.setColumns(20);
        txtFactura.setRows(5);
        jScrollPane1.setViewportView(txtFactura);

        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Generar Factura");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(txtNroCuenta, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKwh))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jButton2)
                .addGap(164, 164, 164)
                .addComponent(jButton1)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtKwh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables para el método de Cacular
    String nroCuenta;
    double costoKwh, costoTotal;
    int consumoKwh;
    
    
    
    // método print
    public void print(){
        String nroCuenta = txtNroCuenta.getText();
        String nombreCliente = txtNombreCliente.getText();
        String kwhConsumo = txtKwh.getText();
        
        txtFactura.setText(txtFactura.getText() + "\n");
        txtFactura.setText(txtFactura.getText() + "           Factura Consumo de electricidad" + "\n");
        txtFactura.setText(txtFactura.getText() + "\n");
        txtFactura.setText(txtFactura.getText() + "     Nro. de cuenta: " + nroCuenta + "\n");
        txtFactura.setText(txtFactura.getText() + "\n");
        txtFactura.setText(txtFactura.getText() + "     Nombre del cliente: " + nombreCliente + "\n");
        txtFactura.setText(txtFactura.getText() + "\n");
        txtFactura.setText(txtFactura.getText() + "     Cantidad de Kwh consumidos: " + kwhConsumo + " Kwh" + "\n");
        txtFactura.setText(txtFactura.getText() + "\n");
        txtFactura.setText(txtFactura.getText() + "     Total a pagar: $" + costoTotal);
        txtFactura.setText(txtFactura.getText() + "\n");
        txtFactura.setText(txtFactura.getText() + "\n");
        txtFactura.setText(txtFactura.getText() + "    ********************************************");
        txtFactura.setText(txtFactura.getText() + "\n");
        txtFactura.setText(txtFactura.getText() + "\n");
        txtFactura.setText(txtFactura.getText() + "                   Gracias por su visita");
        txtFactura.setText(txtFactura.getText() + "\n");
        txtFactura.setText(txtFactura.getText() + "\n");
        txtFactura.setText(txtFactura.getText() + "    ********************************************");


    }
    
    
    // Funcionalidad boton CALCULAR
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        nroCuenta = txtNroCuenta.getText();
        consumoKwh = Integer.parseInt(txtKwh.getText());
        
        if(consumoKwh < 500){
            costoKwh = 1.00;
        }
        else if(consumoKwh >= 500 && consumoKwh < 600){
            costoKwh = 1.80;
        }else if(consumoKwh >= 600 && consumoKwh < 800){
            costoKwh = 2.80;
        }
        else{
            costoKwh = 3.00;
        }
        
        costoTotal = costoKwh * consumoKwh;
        
        print();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void txtNroCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroCuentaActionPerformed

    
    // Funcionalidad IMPRIMIR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            txtFactura.print();
        } catch (PrinterException ex) {
            Logger.getLogger(BillingApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // método MAIN
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BillingApp billingApp = new BillingApp();
                billingApp.setVisible(true); //el obj billingApp es de tipo JFrame ya que heredera de dicha Clase, por lo que hereda las funcionalidades de dicha Clase padre
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtFactura;
    private javax.swing.JTextField txtKwh;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNroCuenta;
    // End of variables declaration//GEN-END:variables
}

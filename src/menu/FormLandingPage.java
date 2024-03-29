package menu;

public class FormLandingPage extends javax.swing.JFrame {
    private String buttonEnable;

    public String getButtonEnable() {
        return buttonEnable;
    }

    public void setButtonEnable(String buttonEnable) {
        this.buttonEnable = buttonEnable;
    }

    public FormLandingPage() {
        initComponents();
//        this.buttonEnable = buttonEnable;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labelTBPersada = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        buttonRegis = new javax.swing.JButton();
        labeltbpersada = new javax.swing.JLabel();
        labeldeskripsi = new javax.swing.JLabel();
        labelldeskripsi2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setDoubleBuffered(false);

        labelTBPersada.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        labelTBPersada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTBPersada.setText("tb persada");
        labelTBPersada.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        buttonLogin.setBackground(new java.awt.Color(51, 204, 0));
        buttonLogin.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 1, 14)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(51, 255, 0));
        buttonLogin.setText("Login");
        buttonLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonLogin.setBorderPainted(false);
        buttonLogin.setContentAreaFilled(false);
        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonLogin.setDefaultCapable(false);
        buttonLogin.setFocusable(false);
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        buttonRegis.setBackground(new java.awt.Color(204, 204, 204));
        buttonRegis.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 1, 14)); // NOI18N
        buttonRegis.setForeground(new java.awt.Color(255, 51, 51));
        buttonRegis.setText("Registrasi");
        buttonRegis.setBorderPainted(false);
        buttonRegis.setContentAreaFilled(false);
        buttonRegis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonRegis.setFocusable(false);
        buttonRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisActionPerformed(evt);
            }
        });

        labeltbpersada.setFont(new java.awt.Font("Kozuka Mincho Pro R", 1, 18)); // NOI18N
        labeltbpersada.setForeground(new java.awt.Color(255, 255, 255));
        labeltbpersada.setText("                                    TB PERSADA");
        labeltbpersada.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labeltbpersada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelldeskripsi2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelldeskripsi2.setText("karena hanya di tujukan untuk Toko Bangunan agar mempermudah dalam mengelola barang.");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Sebuah platform yang akan di gunakan untuk mengelola data  barang khusus bahan bangunan ");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/unnamed (2).jpg"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(841, 841, 841)
                .addComponent(labeldeskripsi))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(labelTBPersada, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(buttonRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(259, 259, 259))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(labelldeskripsi2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labeltbpersada, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)))
                        .addGap(63, 63, 63))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLogin)
                    .addComponent(buttonRegis)
                    .addComponent(labelTBPersada, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labeltbpersada, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelldeskripsi2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(208, 208, 208)
                .addComponent(labeldeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        FormLogin login = new FormLogin();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void buttonRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisActionPerformed
       FormRegister regis = new FormRegister();
       regis.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_buttonRegisActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLandingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonRegis;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelTBPersada;
    private javax.swing.JLabel labeldeskripsi;
    private javax.swing.JLabel labelldeskripsi2;
    private javax.swing.JLabel labeltbpersada;
    // End of variables declaration//GEN-END:variables
}

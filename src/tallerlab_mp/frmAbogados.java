package tallerlab_mp;

public class frmAbogados extends javax.swing.JFrame {

    public frmAbogados() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jtxtNumHijos = new javax.swing.JTextField();
        jtxtAniosExperiencia = new javax.swing.JTextField();
        jtxtCantCasosApoyo = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtCantCasosCargo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxaMostrar = new javax.swing.JTextArea();
        jbtnMostrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jtxtNumHijos1 = new javax.swing.JTextField();
        jtxtAniosExperiencia1 = new javax.swing.JTextField();
        jtxtNombre1 = new javax.swing.JTextField();
        jtxtCantCasosCargo1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxaMostrar2 = new javax.swing.JTextArea();
        jbtnMostrar2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jtxtNumHijos2 = new javax.swing.JTextField();
        jtxtAniosExperiencia2 = new javax.swing.JTextField();
        jtxtNombre2 = new javax.swing.JTextField();
        jtxtCantCasosCargo2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxaMostrar3 = new javax.swing.JTextArea();
        jbtnMostrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxtNumHijos.setBackground(new java.awt.Color(255, 255, 255));
        jtxtNumHijos.setFont(new java.awt.Font("Victor Mono SemiBold", 1, 12)); // NOI18N
        jtxtNumHijos.setForeground(new java.awt.Color(0, 0, 0));
        jtxtNumHijos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)), "Num Hijos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jtxtNumHijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNumHijosActionPerformed(evt);
            }
        });

        jtxtAniosExperiencia.setBackground(new java.awt.Color(255, 255, 255));
        jtxtAniosExperiencia.setFont(new java.awt.Font("Victor Mono SemiBold", 1, 12)); // NOI18N
        jtxtAniosExperiencia.setForeground(new java.awt.Color(0, 0, 0));
        jtxtAniosExperiencia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)), "Anios Experiencia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jtxtCantCasosApoyo.setBackground(new java.awt.Color(255, 255, 255));
        jtxtCantCasosApoyo.setFont(new java.awt.Font("Victor Mono SemiBold", 1, 12)); // NOI18N
        jtxtCantCasosApoyo.setForeground(new java.awt.Color(0, 0, 0));
        jtxtCantCasosApoyo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)), "Cantidad de Casos de Apoyo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jtxtCantCasosApoyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCantCasosApoyoActionPerformed(evt);
            }
        });

        jtxtNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtxtNombre.setFont(new java.awt.Font("Victor Mono SemiBold", 1, 12)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(0, 0, 0));
        jtxtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)), "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
            }
        });

        jtxtCantCasosCargo.setBackground(new java.awt.Color(255, 255, 255));
        jtxtCantCasosCargo.setFont(new java.awt.Font("Victor Mono SemiBold", 1, 12)); // NOI18N
        jtxtCantCasosCargo.setForeground(new java.awt.Color(0, 0, 0));
        jtxtCantCasosCargo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)), "Cantidad de Casos A Cargo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jtxtCantCasosCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCantCasosCargoActionPerformed(evt);
            }
        });

        jtxaMostrar.setEditable(false);
        jtxaMostrar.setColumns(20);
        jtxaMostrar.setRows(5);
        jScrollPane1.setViewportView(jtxaMostrar);

        jbtnMostrar.setText("Mostrar");
        jbtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jtxtNumHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jtxtAniosExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtxtCantCasosApoyo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jtxtCantCasosCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNumHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtAniosExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCantCasosApoyo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtCantCasosCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Abogado Junior", jPanel1);

        jtxtNumHijos1.setBackground(new java.awt.Color(255, 255, 255));
        jtxtNumHijos1.setFont(new java.awt.Font("Victor Mono SemiBold", 1, 12)); // NOI18N
        jtxtNumHijos1.setForeground(new java.awt.Color(0, 0, 0));
        jtxtNumHijos1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)), "Num Hijos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jtxtNumHijos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNumHijos1ActionPerformed(evt);
            }
        });

        jtxtAniosExperiencia1.setBackground(new java.awt.Color(255, 255, 255));
        jtxtAniosExperiencia1.setFont(new java.awt.Font("Victor Mono SemiBold", 1, 12)); // NOI18N
        jtxtAniosExperiencia1.setForeground(new java.awt.Color(0, 0, 0));
        jtxtAniosExperiencia1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)), "Anios Experiencia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jtxtNombre1.setBackground(new java.awt.Color(255, 255, 255));
        jtxtNombre1.setFont(new java.awt.Font("Victor Mono SemiBold", 1, 12)); // NOI18N
        jtxtNombre1.setForeground(new java.awt.Color(0, 0, 0));
        jtxtNombre1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)), "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jtxtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombre1ActionPerformed(evt);
            }
        });

        jtxtCantCasosCargo1.setBackground(new java.awt.Color(255, 255, 255));
        jtxtCantCasosCargo1.setFont(new java.awt.Font("Victor Mono SemiBold", 1, 12)); // NOI18N
        jtxtCantCasosCargo1.setForeground(new java.awt.Color(0, 0, 0));
        jtxtCantCasosCargo1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)), "Cantidad de Casos A Cargo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jtxtCantCasosCargo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCantCasosCargo1ActionPerformed(evt);
            }
        });

        jtxaMostrar2.setEditable(false);
        jtxaMostrar2.setColumns(20);
        jtxaMostrar2.setRows(5);
        jScrollPane3.setViewportView(jtxaMostrar2);

        jbtnMostrar2.setText("Mostrar");
        jbtnMostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jtxtNumHijos1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jtxtAniosExperiencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtxtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnMostrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtxtCantCasosCargo1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNumHijos1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtAniosExperiencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jtxtCantCasosCargo1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnMostrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Abogado Senior", jPanel2);

        jtxtNumHijos2.setBackground(new java.awt.Color(255, 255, 255));
        jtxtNumHijos2.setFont(new java.awt.Font("Victor Mono SemiBold", 1, 12)); // NOI18N
        jtxtNumHijos2.setForeground(new java.awt.Color(0, 0, 0));
        jtxtNumHijos2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)), "Num Hijos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jtxtNumHijos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNumHijos2ActionPerformed(evt);
            }
        });

        jtxtAniosExperiencia2.setBackground(new java.awt.Color(255, 255, 255));
        jtxtAniosExperiencia2.setFont(new java.awt.Font("Victor Mono SemiBold", 1, 12)); // NOI18N
        jtxtAniosExperiencia2.setForeground(new java.awt.Color(0, 0, 0));
        jtxtAniosExperiencia2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)), "Anios Experiencia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jtxtNombre2.setBackground(new java.awt.Color(255, 255, 255));
        jtxtNombre2.setFont(new java.awt.Font("Victor Mono SemiBold", 1, 12)); // NOI18N
        jtxtNombre2.setForeground(new java.awt.Color(0, 0, 0));
        jtxtNombre2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)), "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jtxtNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombre2ActionPerformed(evt);
            }
        });

        jtxtCantCasosCargo2.setBackground(new java.awt.Color(255, 255, 255));
        jtxtCantCasosCargo2.setFont(new java.awt.Font("Victor Mono SemiBold", 1, 12)); // NOI18N
        jtxtCantCasosCargo2.setForeground(new java.awt.Color(0, 0, 0));
        jtxtCantCasosCargo2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)), "Cantidad de Casos A Cargo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jtxtCantCasosCargo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCantCasosCargo2ActionPerformed(evt);
            }
        });

        jtxaMostrar3.setEditable(false);
        jtxaMostrar3.setColumns(20);
        jtxaMostrar3.setRows(5);
        jScrollPane2.setViewportView(jtxaMostrar3);

        jbtnMostrar1.setText("Mostrar");
        jbtnMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jtxtNumHijos2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jtxtAniosExperiencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jtxtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnMostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtxtCantCasosCargo2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNumHijos2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtAniosExperiencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jtxtCantCasosCargo2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnMostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Abogado Socio", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNumHijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNumHijosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNumHijosActionPerformed

    private void jtxtCantCasosApoyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCantCasosApoyoActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCantCasosApoyoActionPerformed

    private void jtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreActionPerformed

    private void jtxtCantCasosCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCantCasosCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCantCasosCargoActionPerformed

    private void jtxtNumHijos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNumHijos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNumHijos2ActionPerformed

    private void jtxtNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombre2ActionPerformed

    private void jtxtCantCasosCargo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCantCasosCargo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCantCasosCargo2ActionPerformed

    private void jtxtNumHijos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNumHijos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNumHijos1ActionPerformed

    private void jtxtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombre1ActionPerformed

    private void jtxtCantCasosCargo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCantCasosCargo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCantCasosCargo1ActionPerformed

    Abogado al;


    private void jbtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarActionPerformed
        int casosApoyo = Integer.parseInt(jtxtCantCasosApoyo.getText());
        String nombre = jtxtNombre.getText();
        int NHijos = Integer.parseInt(jtxtNumHijos.getText());
        int experiencia = Integer.parseInt(jtxtAniosExperiencia.getText());
        int casosACargo = Integer.parseInt(jtxtCantCasosCargo.getText());

        al = new AbogadoJunior(casosApoyo, 200.0, "Junior", nombre, NHijos, experiencia, 2500, casosACargo, 500.0);

        jtxaMostrar.append(al.mostrar() + "\n");

    }//GEN-LAST:event_jbtnMostrarActionPerformed

    private void jbtnMostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrar2ActionPerformed
        String nombre = jtxtNombre1.getText();
        int NHijos = Integer.parseInt(jtxtNumHijos1.getText());
        int experiencia = Integer.parseInt(jtxtAniosExperiencia1.getText());
        int casosACargo = Integer.parseInt(jtxtCantCasosCargo1.getText());

        al = new AbogadoSenior("Senior", nombre, NHijos, experiencia, 2500, casosACargo, 500.0);

        jtxaMostrar2.append(al.mostrar() + "\n");
    }//GEN-LAST:event_jbtnMostrar2ActionPerformed

    private void jbtnMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrar1ActionPerformed
        String nombre = jtxtNombre2.getText();
        int NHijos = Integer.parseInt(jtxtNumHijos2.getText());
        int experiencia = Integer.parseInt(jtxtAniosExperiencia2.getText());
        int casosACargo = Integer.parseInt(jtxtCantCasosCargo2.getText());

        al = new AbogadoSocio("Socio", nombre, NHijos, experiencia, 2500, casosACargo, 500.0);

        jtxaMostrar3.append(al.mostrar() + "\n");

    }//GEN-LAST:event_jbtnMostrar1ActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAbogados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new frmAbogados().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnMostrar;
    private javax.swing.JButton jbtnMostrar1;
    private javax.swing.JButton jbtnMostrar2;
    private javax.swing.JTextArea jtxaMostrar;
    private javax.swing.JTextArea jtxaMostrar2;
    private javax.swing.JTextArea jtxaMostrar3;
    private javax.swing.JTextField jtxtAniosExperiencia;
    private javax.swing.JTextField jtxtAniosExperiencia1;
    private javax.swing.JTextField jtxtAniosExperiencia2;
    private javax.swing.JTextField jtxtCantCasosApoyo;
    private javax.swing.JTextField jtxtCantCasosCargo;
    private javax.swing.JTextField jtxtCantCasosCargo1;
    private javax.swing.JTextField jtxtCantCasosCargo2;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtNombre1;
    private javax.swing.JTextField jtxtNombre2;
    private javax.swing.JTextField jtxtNumHijos;
    private javax.swing.JTextField jtxtNumHijos1;
    private javax.swing.JTextField jtxtNumHijos2;
    // End of variables declaration//GEN-END:variables
}

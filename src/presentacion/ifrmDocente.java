/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import datos.ListaIngresosDocente;
import entidades.IngresoDocente;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ifrmDocente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifrmDocente
     */
    public ifrmDocente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panFondo = new javax.swing.JPanel();
        panDatos = new RoundedPanel();
        cmbAño = new javax.swing.JComboBox<>();
        txtEspecialidad = new javax.swing.JTextField();
        cmbDia = new javax.swing.JComboBox<>();
        txtDni = new javax.swing.JTextField();
        lblFechaRegistro = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        cmbMes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lblDepartamento = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        lblEspecialidad = new javax.swing.JLabel();
        sepNombres = new javax.swing.JSeparator();
        sepApellidos = new javax.swing.JSeparator();
        sepDni = new javax.swing.JSeparator();
        sepEdad = new javax.swing.JSeparator();
        sepDepartamento = new javax.swing.JSeparator();
        sepEspecialidad = new javax.swing.JSeparator();
        sepCodigo = new javax.swing.JSeparator();
        btnGuardar = new FlatButton("Guardar");
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        panFondo.setBackground(new java.awt.Color(255, 255, 255));

        panDatos.setBackground(new java.awt.Color(11, 55, 97));

        cmbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AÑO", " ", "2025", "2026", "2027", "2028", "2029", "2030 " }));
        cmbAño.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmbAñoPopupMenuWillBecomeVisible(evt);
            }
        });

        txtEspecialidad.setBackground(new java.awt.Color(11, 55, 97));
        txtEspecialidad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        txtEspecialidad.setBorder(null);

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIA", " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbDia.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmbDiaPopupMenuWillBecomeVisible(evt);
            }
        });

        txtDni.setBackground(new java.awt.Color(11, 55, 97));
        txtDni.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setBorder(null);
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        lblFechaRegistro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblFechaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaRegistro.setText("Fecha de Registro");

        lblCodigo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Codigo");

        txtApellidos.setBackground(new java.awt.Color(11, 55, 97));
        txtApellidos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidos.setBorder(null);

        txtEdad.setBackground(new java.awt.Color(11, 55, 97));
        txtEdad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(255, 255, 255));
        txtEdad.setBorder(null);

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombrado", "Contratado" }));
        cmbTipo.setSelectedIndex(-1);

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MES", " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cmbMes.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmbMesPopupMenuWillBecomeVisible(evt);
            }
        });
        cmbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad");

        lblDepartamento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        lblDepartamento.setText("Departamento");

        lblDni.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblDni.setForeground(new java.awt.Color(255, 255, 255));
        lblDni.setText("DNI");

        txtDepartamento.setBackground(new java.awt.Color(11, 55, 97));
        txtDepartamento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        txtDepartamento.setBorder(null);

        lblTipo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo");

        lblNombres.setBackground(new java.awt.Color(255, 255, 255));
        lblNombres.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres.setText("Nombres");

        lblApellidos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setText("Apellidos");

        txtCodigo.setBackground(new java.awt.Color(11, 55, 97));
        txtCodigo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(null);

        txtNombres.setBackground(new java.awt.Color(11, 55, 97));
        txtNombres.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(255, 255, 255));
        txtNombres.setBorder(null);

        lblEspecialidad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        lblEspecialidad.setText("Especialidad");

        javax.swing.GroupLayout panDatosLayout = new javax.swing.GroupLayout(panDatos);
        panDatos.setLayout(panDatosLayout);
        panDatosLayout.setHorizontalGroup(
            panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDatosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFechaRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sepCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(sepEspecialidad)
                    .addComponent(sepDepartamento)
                    .addComponent(sepEdad)
                    .addComponent(sepDni)
                    .addComponent(sepApellidos)
                    .addComponent(sepNombres)
                    .addGroup(panDatosLayout.createSequentialGroup()
                        .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(cmbAño, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombres)
                    .addComponent(txtApellidos)
                    .addComponent(txtDni)
                    .addComponent(txtEdad)
                    .addComponent(txtDepartamento)
                    .addComponent(txtEspecialidad)
                    .addComponent(txtCodigo))
                .addGap(30, 30, 30))
        );
        panDatosLayout.setVerticalGroup(
            panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDatosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panDatosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(sepNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(sepApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(sepDni, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(sepEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(sepDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(sepEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(sepCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAño, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        btnGuardar.setBackground(new java.awt.Color(11, 55, 97));
        btnGuardar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo-docentes.png"))); // NOI18N

        javax.swing.GroupLayout panFondoLayout = new javax.swing.GroupLayout(panFondo);
        panFondo.setLayout(panFondoLayout);
        panFondoLayout.setHorizontalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panFondoLayout.setVerticalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    // Ingreso de datos desde el formulario
        Object tipe; // Objeto temporal para guardar la opción seleccionada del ComboBox de tipo
        String nombres, apellidos, dni, edad, codigo, departamento, tipo, especialidad;
        int dia, mes, año, tipoInt;

    // Obtener valores de los campos de texto
        nombres = txtNombres.getText();
        apellidos = txtApellidos.getText();
        dni = txtDni.getText();
        edad = txtEdad.getText();        
        departamento = txtDepartamento.getText();
        especialidad = txtEspecialidad.getText();
        codigo = txtCodigo.getText();

    // Obtener selección del ComboBox de tipo (ej. Nombrado, Contratado, etc.)
        tipoInt = cmbTipo.getSelectedIndex();         // Índice seleccionado
        tipe = cmbTipo.getSelectedItem();             // Objeto seleccionado

    // Obtener fecha desde los ComboBox de día, mes y año
        dia = cmbDia.getSelectedIndex();              // Índice del día seleccionado
        mes = cmbMes.getSelectedIndex();              // Índice del mes seleccionado
        año = cmbAño.getSelectedIndex();              // Índice del año seleccionado

    // Validar que todos los campos obligatorios estén llenos
        if (nombres.isEmpty() || codigo.isEmpty() || apellidos.isEmpty() || dni.isEmpty()
                || departamento.isEmpty() || especialidad.isEmpty() || tipe == null) {

            JOptionPane.showMessageDialog(this, "⚠️ Por favor, complete todos los campos antes de guardar.");
            return; // Detener ejecución si falta algún dato
        } else {
            tipo = tipe.toString(); // Convertir el objeto seleccionado a String
        }

        // Validar DNI: solo números y 8 dígitos
        if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(this, "⚠️ El DNI debe contener exactamente 8 números.");
            txtDni.requestFocus();
            return;
        }
        try {
        int edadInt = Integer.parseInt(edad); // Intenta convertirla a entero

        // Verifica si la edad está en un rango válido
        if (edadInt <= 0 || edadInt > 100) {
            JOptionPane.showMessageDialog(this, "⚠️ Ingrese una edad válida entre 1 y 100.");
            txtEdad.requestFocus();
            return;
        }

        } catch (NumberFormatException e) {
            // Si no se puede convertir (por ejemplo, si hay letras), muestra mensaje
            JOptionPane.showMessageDialog(this, "⚠️ La edad debe ser un número entero válido.");
            txtEdad.requestFocus();
            return;
        }
        
        // Validar código: solo números y 10 dígitos
        if (!codigo.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(this, "⚠️ El código debe contener exactamente 10 números.");
            txtCodigo.requestFocus();
            return;
        }
        if (dia == 0 ||  mes == 0 ||  año == 0) {
    // Validar que se haya seleccionado una fecha válida (índice 0 normalmente es "Seleccione")
            JOptionPane.showMessageDialog(this, "⚠️ Por favor, seleccione una fecha válida.");
            return; // Detener si no se ha escogido correctamente la fecha
        }

    // Crear un objeto IngresoDocente con los datos ingresados
        IngresoDocente profesor = new IngresoDocente(
                tipo, // Tipo de contrato
                departamento, // Departamento
                codigo, // Código de docente
                especialidad, // Especialidad
                nombres, // Nombres
                apellidos, // Apellidos
                dni, // DNI
                edad, // Edad
                new GregorianCalendar(año, mes - 1, dia) // Fecha de ingreso (mes - 1 porque enero = 0)
        );

    // Guardar el nuevo docente en la lista
        ListaIngresosDocente listaProfesor = new ListaIngresosDocente();
        listaProfesor.agregarIngreso(profesor); // Agregar el nuevo ingreso a los registros


    // Confirmar al usuario y cerrar la ventana
        JOptionPane.showMessageDialog(this, "Docente Guardado Correctamente");
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void cmbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMesActionPerformed

    private void cmbDiaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbDiaPopupMenuWillBecomeVisible
     // Este método se ejecuta justo antes de que el menú desplegable (ComboBox) de días se abra
    if (cmbDia.getItemAt(0).equals("DIA")) {
        // Si el primer ítem del ComboBox aún es el texto de ayuda "DIA"
        cmbDia.removeItemAt(0);
        // Se elimina ese ítem para que no aparezca como opción seleccionable
    }
    }//GEN-LAST:event_cmbDiaPopupMenuWillBecomeVisible

    private void cmbMesPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbMesPopupMenuWillBecomeVisible
    // Este método se ejecuta justo antes de que el ComboBox 'cmbMes' (meses) despliegue su lista
    if (cmbMes.getItemAt(0).equals("MES")) {
        // Si el primer elemento del ComboBox es aún el texto de ayuda "MES"
        cmbMes.removeItemAt(0);
        // Elimina ese primer ítem para que no aparezca como opción seleccionable al usuario
    }
    }//GEN-LAST:event_cmbMesPopupMenuWillBecomeVisible

    private void cmbAñoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbAñoPopupMenuWillBecomeVisible
    if (cmbAño.getItemAt(0).equals("AÑO")) {
        // Verifica si el primer ítem del ComboBox de años es el texto guía "AÑO"
    cmbAño.removeItemAt(0);
        // Elimina ese ítem para que no sea seleccionable por el usuario
    }
    }//GEN-LAST:event_cmbAñoPopupMenuWillBecomeVisible


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbAño;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JLabel lblFechaRegistro;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel panDatos;
    private javax.swing.JPanel panFondo;
    private javax.swing.JSeparator sepApellidos;
    private javax.swing.JSeparator sepCodigo;
    private javax.swing.JSeparator sepDepartamento;
    private javax.swing.JSeparator sepDni;
    private javax.swing.JSeparator sepEdad;
    private javax.swing.JSeparator sepEspecialidad;
    private javax.swing.JSeparator sepNombres;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}

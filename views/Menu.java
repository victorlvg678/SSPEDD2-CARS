/*******************************************************************************
 *                                                                             *
 * Práctica 5 - Login                                                          *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: CARS(Car Automated Repair System)                                 *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210313_build_0)                             *
 * Nombre de Archivo: Menu.java                                                *
 * Fecha: 13/Abr/2021                                                          *
 * Materia: Seminario de solución de Problemas de Estructura de Datos II       *
 * NRC: 138619                                                                 *      
 * CVE: I5889                                                                  *
 * Sección: D21                                                                *
 * Profesor: Lupercio Coronel, Ramiro                                          *
 * Centro Universitario de Ciencias Exactas e Ingenierías                      *
 *                                                                             *
 ******************************************************************************/

// Paquete donde se incluye dicho archivo
package views;

// Parámetros que indican autor(es) de programa

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import models.Registro;
import models.Ventana;
import models.Usuario;

/**
 * @author Valle Guerra, Victor Leonardo 
 */

// Clase pública login que se extiende desde javax.swing.JFrame
public class Menu extends javax.swing.JFrame {

    /**
     * Parámetros a usar en clase
     * @param TamanoVentanaAAsignar
     * @param Registros
     */
    // |------------------------Atributos privados-----------------------------|
    private Ventana TamanoVentana;
    private Registro RegistrosVentana;
    private String ContrasenaTemp;
    private Boolean MostrandoContrasena;
    private Usuario SesionActiva;
    
    class Horas implements ActionListener{
    
        public void actionPerformed(ActionEvent e){
            Date HoraSistema = new Date();
            String PMAM = "hh:mm:ss a";
            SimpleDateFormat Formato = new SimpleDateFormat(PMAM);
            Calendar Hoy = Calendar.getInstance();
            TextoHora.setText(String.format(Formato.format(HoraSistema), Hoy));
        }
    }    
    
    // |------------------------Métodos privados-------------------------------|
    
    // |------------------------Atributos públicos-----------------------------|
    
    // |------------------------Métodos públicos-------------------------------|
    
    /**
     * Constructor de clase que inicia ventana
     */

    public Menu(Ventana TamanoVentanaAAsignar, Registro Registros, Usuario Sesion) 
    {
        initComponents();
        // Pasar argumentos de constructor a atributos
        TamanoVentana = TamanoVentanaAAsignar;
        RegistrosVentana = Registros;
        MostrandoContrasena = false;
        SesionActiva = Sesion;
        this.ImagenUsuario.setText(SesionActiva.getNombreCompleto());
        this.TextoBienvenidaUsuario.setText(SesionActiva.getUsername() + " a CARS");
        // Colar imagen de icono de programa
        ImageIcon Icono = new ImageIcon(getClass().getResource(
            "/content/images/logo/CARS-Logo-IcosahedronTransparenteSinTexto.png"));
        setIconImage(Icono.getImage());
        // Pasa tamaño de ventana
        setSize((int) TamanoVentana.getMaxAncho(), (int) TamanoVentana.getMaxAltura());
        // Coloca al centro de la pantalla la ventana
        setLocationRelativeTo(null);
        if(SesionActiva.getRol().equals("Usuario"))
        {
            BotonUsuarios.setEnabled(false);
            
        }
        // Fecha para el sistema
        Date FechaSistema = new Date();
        SimpleDateFormat Formato =new SimpleDateFormat("dd MMMMM YYYY");
        TextoFecha.setText(Formato.format(FechaSistema));
        // Actualizar hora del sistema
        Timer Tiempo = new Timer(100, new Menu.Horas());
        Tiempo.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelSuperiorIzquierdo = new javax.swing.JPanel();
        ImagenUsuario = new javax.swing.JLabel();
        ImagenLogo = new javax.swing.JLabel();
        PanelSuperior = new javax.swing.JPanel();
        PanelRuta = new javax.swing.JPanel();
        TextoRuta = new javax.swing.JLabel();
        PanelRutaContenido = new javax.swing.JPanel();
        TextoBienvenida = new javax.swing.JLabel();
        ImagenLogoIzquierda = new javax.swing.JLabel();
        PanelSuperiorDerecho = new javax.swing.JPanel();
        PanelFechaHora = new javax.swing.JPanel();
        TextoFecha = new javax.swing.JLabel();
        ImagenFecha = new javax.swing.JLabel();
        TextoHora = new javax.swing.JLabel();
        ImagenHora = new javax.swing.JLabel();
        PanelFechaHoraContenido = new javax.swing.JPanel();
        TextoBienvenidaUsuario = new javax.swing.JLabel();
        ImagenLogoDerecha = new javax.swing.JLabel();
        Panelzquierdo = new javax.swing.JPanel();
        PanelUsuarios = new javax.swing.JPanel();
        BotonUsuarios = new javax.swing.JButton();
        PanelClientes = new javax.swing.JPanel();
        BotonClientes = new javax.swing.JButton();
        PanelVehiculos = new javax.swing.JPanel();
        BotonVehiculos = new javax.swing.JButton();
        PanelReparaciones = new javax.swing.JPanel();
        BotonReparaciones = new javax.swing.JButton();
        PanelPiezas = new javax.swing.JPanel();
        BotonPiezas = new javax.swing.JButton();
        PanelCerrarSesion = new javax.swing.JPanel();
        BotonCerrarSesion = new javax.swing.JButton();
        PanelCentral = new javax.swing.JPanel();
        TextoCARS = new javax.swing.JLabel();
        TextoAprenda = new javax.swing.JLabel();
        ImagenSitioWeb = new javax.swing.JLabel();
        PanelDerecho = new javax.swing.JPanel();
        TextoSitioWeb = new javax.swing.JLabel();
        PanelnferiorIzquierdo = new javax.swing.JPanel();
        PanelInferior = new javax.swing.JPanel();
        PanelInferiorDerecho = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal | CARS");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(new java.awt.GridLayout(3, 3));

        PanelSuperiorIzquierdo.setBackground(new java.awt.Color(17, 84, 128));
        PanelSuperiorIzquierdo.setMaximumSize(new java.awt.Dimension(384, 216));

        ImagenUsuario.setForeground(new java.awt.Color(238, 238, 238));
        ImagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/images/menu/ImagenUsuario-EEEEEE-100x100.png"))); // NOI18N
        ImagenUsuario.setText("Usuario");
        ImagenUsuario.setToolTipText("<html><p><strong>Iniciar sesión</p></strong></html>");

        ImagenLogo.setBackground(new java.awt.Color(255, 255, 255));
        ImagenLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/images/logo/CARS-Logo2.png"))); // NOI18N
        ImagenLogo.setToolTipText("<html><p><strong>Car Automated Repair System</strong></p></html>");

        javax.swing.GroupLayout PanelSuperiorIzquierdoLayout = new javax.swing.GroupLayout(PanelSuperiorIzquierdo);
        PanelSuperiorIzquierdo.setLayout(PanelSuperiorIzquierdoLayout);
        PanelSuperiorIzquierdoLayout.setHorizontalGroup(
            PanelSuperiorIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImagenLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
            .addComponent(ImagenUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelSuperiorIzquierdoLayout.setVerticalGroup(
            PanelSuperiorIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorIzquierdoLayout.createSequentialGroup()
                .addComponent(ImagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImagenUsuario)
                .addContainerGap(474, Short.MAX_VALUE))
        );

        getContentPane().add(PanelSuperiorIzquierdo);

        PanelSuperior.setLayout(new java.awt.GridLayout(2, 1));

        PanelRuta.setBackground(new java.awt.Color(41, 128, 185));

        TextoRuta.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        TextoRuta.setForeground(new java.awt.Color(238, 238, 238));
        TextoRuta.setText("Menú Principal");

        javax.swing.GroupLayout PanelRutaLayout = new javax.swing.GroupLayout(PanelRuta);
        PanelRuta.setLayout(PanelRutaLayout);
        PanelRutaLayout.setHorizontalGroup(
            PanelRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRutaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(TextoRuta)
                .addContainerGap(455, Short.MAX_VALUE))
        );
        PanelRutaLayout.setVerticalGroup(
            PanelRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRutaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TextoRuta)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        PanelSuperior.add(PanelRuta);

        PanelRutaContenido.setBackground(new java.awt.Color(255, 255, 255));

        TextoBienvenida.setBackground(new java.awt.Color(255, 255, 255));
        TextoBienvenida.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TextoBienvenida.setText("Bienvenido");

        ImagenLogoIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/images/logo/CARS-Logo-SinTexto.png"))); // NOI18N

        javax.swing.GroupLayout PanelRutaContenidoLayout = new javax.swing.GroupLayout(PanelRutaContenido);
        PanelRutaContenido.setLayout(PanelRutaContenidoLayout);
        PanelRutaContenidoLayout.setHorizontalGroup(
            PanelRutaContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRutaContenidoLayout.createSequentialGroup()
                .addContainerGap(622, Short.MAX_VALUE)
                .addComponent(TextoBienvenida)
                .addContainerGap())
            .addGroup(PanelRutaContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelRutaContenidoLayout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(ImagenLogoIzquierda)
                    .addContainerGap(511, Short.MAX_VALUE)))
        );
        PanelRutaContenidoLayout.setVerticalGroup(
            PanelRutaContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRutaContenidoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(TextoBienvenida)
                .addContainerGap(263, Short.MAX_VALUE))
            .addGroup(PanelRutaContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelRutaContenidoLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(ImagenLogoIzquierda)
                    .addContainerGap(217, Short.MAX_VALUE)))
        );

        PanelSuperior.add(PanelRutaContenido);

        getContentPane().add(PanelSuperior);

        PanelSuperiorDerecho.setLayout(new java.awt.GridLayout(2, 1));

        PanelFechaHora.setBackground(new java.awt.Color(41, 128, 185));

        TextoFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TextoFecha.setForeground(new java.awt.Color(238, 238, 238));
        TextoFecha.setText("Fecha");

        ImagenFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/images/menu/Calendario-EEEEEE-24x24.png"))); // NOI18N

        TextoHora.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TextoHora.setForeground(new java.awt.Color(238, 238, 238));
        TextoHora.setText("Hora");

        ImagenHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/images/menu/Reloj-EEEEEE-24x24.png"))); // NOI18N

        javax.swing.GroupLayout PanelFechaHoraLayout = new javax.swing.GroupLayout(PanelFechaHora);
        PanelFechaHora.setLayout(PanelFechaHoraLayout);
        PanelFechaHoraLayout.setHorizontalGroup(
            PanelFechaHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFechaHoraLayout.createSequentialGroup()
                .addContainerGap(494, Short.MAX_VALUE)
                .addComponent(ImagenFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoFecha)
                .addGap(59, 59, 59)
                .addComponent(ImagenHora)
                .addGap(18, 18, 18)
                .addComponent(TextoHora)
                .addGap(27, 27, 27))
        );
        PanelFechaHoraLayout.setVerticalGroup(
            PanelFechaHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFechaHoraLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelFechaHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ImagenHora)
                    .addGroup(PanelFechaHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ImagenFecha)
                        .addComponent(TextoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(293, Short.MAX_VALUE))
        );

        PanelSuperiorDerecho.add(PanelFechaHora);

        PanelFechaHoraContenido.setBackground(new java.awt.Color(255, 255, 255));

        TextoBienvenidaUsuario.setBackground(new java.awt.Color(255, 255, 255));
        TextoBienvenidaUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TextoBienvenidaUsuario.setText("Usuario a CARS");

        ImagenLogoDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/images/logo/CARS-Logo-SinTexto.png"))); // NOI18N

        javax.swing.GroupLayout PanelFechaHoraContenidoLayout = new javax.swing.GroupLayout(PanelFechaHoraContenido);
        PanelFechaHoraContenido.setLayout(PanelFechaHoraContenidoLayout);
        PanelFechaHoraContenidoLayout.setHorizontalGroup(
            PanelFechaHoraContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFechaHoraContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextoBienvenidaUsuario)
                .addGap(49, 49, 49)
                .addComponent(ImagenLogoDerecha)
                .addContainerGap(432, Short.MAX_VALUE))
        );
        PanelFechaHoraContenidoLayout.setVerticalGroup(
            PanelFechaHoraContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFechaHoraContenidoLayout.createSequentialGroup()
                .addGroup(PanelFechaHoraContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFechaHoraContenidoLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(TextoBienvenidaUsuario))
                    .addGroup(PanelFechaHoraContenidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ImagenLogoDerecha)))
                .addContainerGap(227, Short.MAX_VALUE))
        );

        PanelSuperiorDerecho.add(PanelFechaHoraContenido);

        getContentPane().add(PanelSuperiorDerecho);

        Panelzquierdo.setMaximumSize(new java.awt.Dimension(384, 432));
        Panelzquierdo.setLayout(new java.awt.GridLayout(3, 2));

        PanelUsuarios.setBackground(new java.awt.Color(19, 140, 220));
        PanelUsuarios.setMaximumSize(new java.awt.Dimension(192, 128));
        PanelUsuarios.setPreferredSize(new java.awt.Dimension(192, 128));

        BotonUsuarios.setBackground(new java.awt.Color(19, 140, 220));
        BotonUsuarios.setForeground(new java.awt.Color(238, 238, 238));
        BotonUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/images/menu/Usuarios-EEEEEE-24x24.png"))); // NOI18N
        BotonUsuarios.setText("Usuarios");
        BotonUsuarios.setToolTipText("<html><p><strong>Usuarios</strong></p></html>");
        BotonUsuarios.setBorder(null);
        BotonUsuarios.setBorderPainted(false);
        BotonUsuarios.setContentAreaFilled(false);
        BotonUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonUsuarios.setFocusPainted(false);
        BotonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelUsuariosLayout = new javax.swing.GroupLayout(PanelUsuarios);
        PanelUsuarios.setLayout(PanelUsuariosLayout);
        PanelUsuariosLayout.setHorizontalGroup(
            PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuariosLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(BotonUsuarios)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        PanelUsuariosLayout.setVerticalGroup(
            PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonUsuarios)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        Panelzquierdo.add(PanelUsuarios);

        PanelClientes.setBackground(new java.awt.Color(19, 140, 220));
        PanelClientes.setMaximumSize(new java.awt.Dimension(192, 128));
        PanelClientes.setPreferredSize(new java.awt.Dimension(192, 128));

        BotonClientes.setBackground(new java.awt.Color(19, 140, 220));
        BotonClientes.setForeground(new java.awt.Color(238, 238, 238));
        BotonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/images/menu/Clientes-EEEEEE-24x24.png"))); // NOI18N
        BotonClientes.setText("Clientes");
        BotonClientes.setToolTipText("<html><p><strong>Clientes</strong></p></html>");
        BotonClientes.setBorder(null);
        BotonClientes.setBorderPainted(false);
        BotonClientes.setContentAreaFilled(false);
        BotonClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonClientes.setFocusPainted(false);
        BotonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelClientesLayout = new javax.swing.GroupLayout(PanelClientes);
        PanelClientes.setLayout(PanelClientesLayout);
        PanelClientesLayout.setHorizontalGroup(
            PanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClientesLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(BotonClientes)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        PanelClientesLayout.setVerticalGroup(
            PanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonClientes)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        Panelzquierdo.add(PanelClientes);

        PanelVehiculos.setBackground(new java.awt.Color(19, 140, 220));
        PanelVehiculos.setMaximumSize(new java.awt.Dimension(192, 128));
        PanelVehiculos.setPreferredSize(new java.awt.Dimension(192, 128));

        BotonVehiculos.setBackground(new java.awt.Color(19, 140, 220));
        BotonVehiculos.setForeground(new java.awt.Color(238, 238, 238));
        BotonVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/images/menu/Vehiculos-EEEEEE-24x24.png"))); // NOI18N
        BotonVehiculos.setText("Vehículos");
        BotonVehiculos.setToolTipText("<html><p><strong>Vehículos</strong></p></html>");
        BotonVehiculos.setBorder(null);
        BotonVehiculos.setBorderPainted(false);
        BotonVehiculos.setContentAreaFilled(false);
        BotonVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVehiculos.setFocusPainted(false);
        BotonVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVehiculosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelVehiculosLayout = new javax.swing.GroupLayout(PanelVehiculos);
        PanelVehiculos.setLayout(PanelVehiculosLayout);
        PanelVehiculosLayout.setHorizontalGroup(
            PanelVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVehiculosLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(BotonVehiculos)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        PanelVehiculosLayout.setVerticalGroup(
            PanelVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonVehiculos)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        Panelzquierdo.add(PanelVehiculos);

        PanelReparaciones.setBackground(new java.awt.Color(19, 140, 220));
        PanelReparaciones.setMaximumSize(new java.awt.Dimension(192, 128));
        PanelReparaciones.setPreferredSize(new java.awt.Dimension(192, 128));

        BotonReparaciones.setBackground(new java.awt.Color(19, 140, 220));
        BotonReparaciones.setForeground(new java.awt.Color(238, 238, 238));
        BotonReparaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/images/menu/Reparaciones-EEEEEE-24x24.png"))); // NOI18N
        BotonReparaciones.setText("Reparaciones");
        BotonReparaciones.setToolTipText("<html><p><strong>Reparaciones</strong></p></html>");
        BotonReparaciones.setBorder(null);
        BotonReparaciones.setBorderPainted(false);
        BotonReparaciones.setContentAreaFilled(false);
        BotonReparaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonReparaciones.setFocusPainted(false);
        BotonReparaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReparacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelReparacionesLayout = new javax.swing.GroupLayout(PanelReparaciones);
        PanelReparaciones.setLayout(PanelReparacionesLayout);
        PanelReparacionesLayout.setHorizontalGroup(
            PanelReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReparacionesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(BotonReparaciones)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        PanelReparacionesLayout.setVerticalGroup(
            PanelReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReparacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonReparaciones)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        Panelzquierdo.add(PanelReparaciones);

        PanelPiezas.setBackground(new java.awt.Color(19, 140, 220));
        PanelPiezas.setMaximumSize(new java.awt.Dimension(192, 128));
        PanelPiezas.setPreferredSize(new java.awt.Dimension(192, 128));

        BotonPiezas.setBackground(new java.awt.Color(19, 140, 220));
        BotonPiezas.setForeground(new java.awt.Color(238, 238, 238));
        BotonPiezas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/images/menu/Piezas-EEEEEE-24x24.png"))); // NOI18N
        BotonPiezas.setText("Piezas");
        BotonPiezas.setToolTipText("<html><p><strong>Piezas</strong></p></html>");
        BotonPiezas.setBorder(null);
        BotonPiezas.setBorderPainted(false);
        BotonPiezas.setContentAreaFilled(false);
        BotonPiezas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonPiezas.setFocusPainted(false);
        BotonPiezas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPiezasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPiezasLayout = new javax.swing.GroupLayout(PanelPiezas);
        PanelPiezas.setLayout(PanelPiezasLayout);
        PanelPiezasLayout.setHorizontalGroup(
            PanelPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
            .addGroup(PanelPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelPiezasLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(BotonPiezas)
                    .addContainerGap(249, Short.MAX_VALUE)))
        );
        PanelPiezasLayout.setVerticalGroup(
            PanelPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
            .addGroup(PanelPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelPiezasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BotonPiezas)
                    .addContainerGap(195, Short.MAX_VALUE)))
        );

        Panelzquierdo.add(PanelPiezas);

        PanelCerrarSesion.setBackground(new java.awt.Color(19, 140, 220));
        PanelCerrarSesion.setMaximumSize(new java.awt.Dimension(192, 128));
        PanelCerrarSesion.setPreferredSize(new java.awt.Dimension(192, 128));

        BotonCerrarSesion.setBackground(new java.awt.Color(19, 140, 220));
        BotonCerrarSesion.setForeground(new java.awt.Color(238, 238, 238));
        BotonCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/images/menu/CerrarSesion-EEEEEE-24x24.png"))); // NOI18N
        BotonCerrarSesion.setText("Cerrar Sesión");
        BotonCerrarSesion.setToolTipText("<html><p><strong>Cerrar sesión</strong></p></html>");
        BotonCerrarSesion.setBorder(null);
        BotonCerrarSesion.setBorderPainted(false);
        BotonCerrarSesion.setContentAreaFilled(false);
        BotonCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCerrarSesion.setFocusPainted(false);
        BotonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCerrarSesionLayout = new javax.swing.GroupLayout(PanelCerrarSesion);
        PanelCerrarSesion.setLayout(PanelCerrarSesionLayout);
        PanelCerrarSesionLayout.setHorizontalGroup(
            PanelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
            .addGroup(PanelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCerrarSesionLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(BotonCerrarSesion)
                    .addContainerGap(208, Short.MAX_VALUE)))
        );
        PanelCerrarSesionLayout.setVerticalGroup(
            PanelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
            .addGroup(PanelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCerrarSesionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BotonCerrarSesion)
                    .addContainerGap(195, Short.MAX_VALUE)))
        );

        Panelzquierdo.add(PanelCerrarSesion);

        getContentPane().add(Panelzquierdo);

        PanelCentral.setBackground(new java.awt.Color(255, 255, 255));

        TextoCARS.setBackground(new java.awt.Color(255, 255, 255));
        TextoCARS.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TextoCARS.setText("CARS");

        TextoAprenda.setText("Aprenda más acerca de CARS, comience dando click a alguna opción.");

        ImagenSitioWeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/images/menu/Web-115480-100x100.png"))); // NOI18N

        javax.swing.GroupLayout PanelCentralLayout = new javax.swing.GroupLayout(PanelCentral);
        PanelCentral.setLayout(PanelCentralLayout);
        PanelCentralLayout.setHorizontalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(TextoCARS))
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TextoAprenda))
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(ImagenSitioWeb)))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        PanelCentralLayout.setVerticalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TextoCARS)
                .addGap(18, 18, 18)
                .addComponent(TextoAprenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImagenSitioWeb)
                .addContainerGap(490, Short.MAX_VALUE))
        );

        getContentPane().add(PanelCentral);

        PanelDerecho.setBackground(new java.awt.Color(255, 255, 255));

        TextoSitioWeb.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TextoSitioWeb.setText("Visita nuestro sitio web para más información");

        javax.swing.GroupLayout PanelDerechoLayout = new javax.swing.GroupLayout(PanelDerecho);
        PanelDerecho.setLayout(PanelDerechoLayout);
        PanelDerechoLayout.setHorizontalGroup(
            PanelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDerechoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(TextoSitioWeb)
                .addContainerGap(393, Short.MAX_VALUE))
        );
        PanelDerechoLayout.setVerticalGroup(
            PanelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDerechoLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(TextoSitioWeb)
                .addContainerGap(530, Short.MAX_VALUE))
        );

        getContentPane().add(PanelDerecho);

        PanelnferiorIzquierdo.setBackground(new java.awt.Color(17, 84, 128));
        PanelnferiorIzquierdo.setMaximumSize(new java.awt.Dimension(384, 432));

        javax.swing.GroupLayout PanelnferiorIzquierdoLayout = new javax.swing.GroupLayout(PanelnferiorIzquierdo);
        PanelnferiorIzquierdo.setLayout(PanelnferiorIzquierdoLayout);
        PanelnferiorIzquierdoLayout.setHorizontalGroup(
            PanelnferiorIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );
        PanelnferiorIzquierdoLayout.setVerticalGroup(
            PanelnferiorIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );

        getContentPane().add(PanelnferiorIzquierdo);

        PanelInferior.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelInferiorLayout = new javax.swing.GroupLayout(PanelInferior);
        PanelInferior.setLayout(PanelInferiorLayout);
        PanelInferiorLayout.setHorizontalGroup(
            PanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );
        PanelInferiorLayout.setVerticalGroup(
            PanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );

        getContentPane().add(PanelInferior);

        PanelInferiorDerecho.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelInferiorDerechoLayout = new javax.swing.GroupLayout(PanelInferiorDerecho);
        PanelInferiorDerecho.setLayout(PanelInferiorDerechoLayout);
        PanelInferiorDerechoLayout.setHorizontalGroup(
            PanelInferiorDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );
        PanelInferiorDerechoLayout.setVerticalGroup(
            PanelInferiorDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );

        getContentPane().add(PanelInferiorDerecho);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonReparacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReparacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonReparacionesActionPerformed

    private void BotonVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVehiculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVehiculosActionPerformed

    private void BotonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonClientesActionPerformed

    private void BotonPiezasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPiezasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPiezasActionPerformed

    // Método para cuando se hace click en BotonCerrarSesion
    private void BotonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarSesionActionPerformed
        Color PanelActivo = new Color(59,143,255);
        Color PanelInactivo  = new Color(19,140,220);
        JPanel PanelesInactivos[] = {PanelClientes, PanelVehiculos, PanelReparaciones,
        PanelPiezas, PanelUsuarios};
        // Ciclo for para setear los paneles a colores inactivos
        for(JPanel Panel : PanelesInactivos)
        {
            Panel.setBackground(PanelInactivo);
            Panel.revalidate();
            Panel.repaint();
        }
        PanelCerrarSesion.setBackground(PanelActivo);
        PanelCerrarSesion.revalidate();
        PanelCerrarSesion.repaint();
        System.out.println("Cerrando Sesión " + SesionActiva.getUsername());
        Login LoginVentana = new Login(TamanoVentana, RegistrosVentana);
        LoginVentana.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonCerrarSesionActionPerformed

    // Método para cuando se da click en BotonUsuarios
    private void BotonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUsuariosActionPerformed
        // Reasignamos texto de ruta
        TextoRuta.setText("Usuarios");
        // Pintamos el panel para indicar opción actual
        Color PanelActivo = new Color(59,143,255);
        Color PanelInactivo  = new Color(19,140,220);
        JPanel PanelesInactivos[] = {PanelClientes, PanelVehiculos, PanelReparaciones,
        PanelPiezas, PanelCerrarSesion};
        // Ciclo for para setear los paneles a colores inactivos
        for(JPanel Panel : PanelesInactivos)
        {
            Panel.setBackground(PanelInactivo);
        }
        PanelUsuarios.setBackground(PanelActivo);
        // Obtenemos lista de objetos o paneles
        JPanel [] ListaPaneles = {PanelRutaContenido, PanelFechaHoraContenido,
        PanelCentral, PanelDerecho, PanelInferior,
        PanelInferiorDerecho};
        // Eliminamos todo de forma iterativa
        for(JPanel Panel : ListaPaneles)
        {
            // Obtenemos lista de componentes de dicho panel
            Component [] ListaComponentes = Panel.getComponents();
            // Iteramos entre todos los elementos del panel para eliminar todos
            // los componentes que ya no requirimos
            for(Component Componente : ListaComponentes)
            {
                Panel.remove(Componente);
            }
        }
        // |------------------Crear botones de forma iterativa-----------------|
        // Contador
        int Cont;
        Cont = 0;
        // Lista de strings para usar
        String Textos[] = {"Añadir", "Eliminar", "Editar", "Guardar", "Buscar"};
        String Nombres[] = {"Anadir", "Eliminar", "Editar", "Guardar", "Buscar"};
        String Imagenes[] = {"/content/images/menu/users/Anadir-115480-24x24.png",
        "/content/images/menu/users/Eliminar-115480-24x24.png",
        "/content/images/menu/users/Editar-115480-24x24.png",
        "/content/images/menu/users/Guardar-115480-24x24.png",
        "/content/images/menu/users/Buscar-115480-24x24.png"};
        String ImagenesOver[] = {"/content/images/menu/users/AnadirOver-2980b9-24x24.png",
        "/content/images/menu/users/EliminarOver-2980b9-24x24.png",
        "/content/images/menu/users/EditarOver-2980b9-24x24.png",
        "/content/images/menu/users/GuardarOver-2980b9-24x24.png",
        "/content/images/menu/users/BuscarOver-2980b9-24x24.png"};
        String ImagenesPressed[] = {"/content/images/menu/users/AnadirPressed-0b3653-24x24.png",
        "/content/images/menu/users/EliminarPressed-0b3653-24x24.png",
        "/content/images/menu/users/EditarPressed-0b3653-24x24.png",
        "/content/images/menu/users/GuardarPressed-0b3653-24x24.png",
        "/content/images/menu/users/BuscarPressed-0b3653-24x24.png"};
        // Creamos color para botones
        Color ColorBoton = new Color(17, 84, 128);
        // Creamos botones para funciones de Usuarios
        JButton BotonAnadirUsuarios = new JButton();
        JButton BotonEliminarUsuarios = new JButton();
        JButton BotonEditarUsuarios = new JButton();
        JButton BotonGuardarUsuarios = new JButton();
        JButton BotonBuscarUsuarios = new JButton();
        JButton Botones[] = {BotonAnadirUsuarios, BotonEliminarUsuarios,
        BotonEditarUsuarios, BotonGuardarUsuarios, BotonBuscarUsuarios};
        for(JButton Boton : Botones)
        {
            Boton.setName("Boton" + Nombres[Cont]);
            Boton.setBorderPainted(false);
            Boton.setBackground(Color.white);
            Boton.setContentAreaFilled(false);
            Boton.setFocusPainted(false);
            Boton.setForeground(ColorBoton);
            Boton.setBorder(null);
            Boton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            Boton.setHorizontalTextPosition(SwingConstants.CENTER);
            Boton.setVerticalTextPosition(SwingConstants.BOTTOM);
            Boton.setText(Textos[Cont]);
            Boton.setToolTipText("<html><p><strong>" + Textos[Cont] + " Usuario" +
                    "</strong></p></html>");
            ImageIcon Icono = new ImageIcon(getClass().getResource(
                Imagenes[Cont]));
            Boton.setIcon(Icono);
            Icono = new ImageIcon(getClass().getResource(
                ImagenesPressed[Cont]));
            Boton.setPressedIcon(Icono);
            Icono = new ImageIcon(getClass().getResource(
                ImagenesOver[Cont]));
            Boton.setRolloverIcon(Icono);
            Boton.setSelectedIcon(Icono);
            Boton.setSize(55, 40);
            Cont++;
        }
        // |------------------------Ubicaciones de botones---------------------|
        double AltoPanel, AnchoPanel, DivisionPanel;
        int x;
        AnchoPanel = PanelRutaContenido.getSize().getWidth(); 
        DivisionPanel = AnchoPanel / 3;
        DivisionPanel -= 100;
        AltoPanel = PanelRutaContenido.getSize().getHeight();
        AltoPanel -= 80;
        for(x = 0; x < 4; x++)
        {
            Botones[x].setLocation((int) DivisionPanel + (80 * (x + 1)), (int) AltoPanel);
            PanelRutaContenido.add(Botones[x]);
        }
        
        AnchoPanel = PanelFechaHoraContenido.getSize().getWidth(); 
        AltoPanel = PanelFechaHoraContenido.getSize().getHeight();
        AltoPanel -= 80;
        Botones[4].setLocation((int) AnchoPanel - 80, (int) AltoPanel);
        PanelFechaHoraContenido.add(Botones[4]);

        // |----------------------Texto----------------------------------------|
        // Para imagenes de campos
        ImageIcon Icono;
        // Texto para buscar por
        JLabel TextoBuscar = new JLabel();
        TextoBuscar.setForeground(Color.BLACK);
        TextoBuscar.setBackground(Color.WHITE);
        TextoBuscar.setName("TextoBuscar");
        TextoBuscar.setBorder(null);
        TextoBuscar.setToolTipText("<html><p><strong>Buscar usuario por</strong></p></html>");
        TextoBuscar.setText("Buscar usuario por");
        TextoBuscar.setSize(120, 20);
        TextoBuscar.setLocation((int) AnchoPanel - 380, (int) AltoPanel - 20);
        PanelFechaHoraContenido.add(TextoBuscar);
        
        // Panel Central
        double AltoPanelCentral, AnchoPanelCentral;
        
        AltoPanelCentral = PanelCentral.getSize().getHeight();
        AnchoPanelCentral = PanelCentral.getSize().getWidth();
        
        // Texto para campo ID
        JLabel TextoID = new JLabel();
        TextoID.setForeground(Color.BLACK);
        TextoID.setBackground(Color.WHITE);
        TextoID.setName("TextoID");
        TextoID.setBorder(null);
        TextoID.setToolTipText("<html><p><strong>ID</strong></p></html>");
        TextoID.setText("ID");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/NombreUsuario-BelizeHope-24x24.png"));
        TextoID.setIcon(Icono);
        TextoID.setSize(40, 20);
        TextoID.setLocation((int) AnchoPanelCentral - 380, 30);
        System.out.println();
        PanelCentral.add(TextoID);
        
        // Texto para campo Username
        JLabel TextoUsername = new JLabel();
        TextoUsername.setForeground(Color.BLACK);
        TextoUsername.setBackground(Color.WHITE);
        TextoUsername.setName("TextoUsername");
        TextoUsername.setBorder(null);
        TextoUsername.setToolTipText("<html><p><strong>ID</strong></p></html>");
        TextoUsername.setText("Username");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/NombreUsuario-BelizeHope-24x24.png"));
        TextoUsername.setIcon(Icono);
        TextoUsername.setSize(70, 20);
        TextoUsername.setLocation((int) AnchoPanelCentral - 380, 
                (int) TextoID.getLocation().getY() + 50);
        PanelCentral.add(TextoUsername);
        
        // |---------------------Combobox--------------------------------------|
        JComboBox ComboBuscar = new JComboBox();
        ComboBuscar.setName("ComboBuscar");
        ComboBuscar.addItem("ID");
        ComboBuscar.addItem("Nombre de Usuario");
        ComboBuscar.addItem("Nombre");
        ComboBuscar.addItem("Apellido Paterno");
        ComboBuscar.addItem("Apellido Materno");
        ComboBuscar.setSize(120, 20);
        ComboBuscar.setLocation((int) AnchoPanel - 380, (int) AltoPanel);
        PanelFechaHoraContenido.add(ComboBuscar);
        // |-------------------Campos de Texto---------------------------------|
        Color ColorNoEscrito = new Color(102, 102, 102);
        // Campo para búsqueda
        JTextField CampoBuscar = new JTextField();
        CampoBuscar.setName("CampoBuscar");
        CampoBuscar.setBorder(null);
        CampoBuscar.setText("Buscar Usuario");
        CampoBuscar.setBackground(Color.WHITE);
        CampoBuscar.setForeground(ColorNoEscrito);
        CampoBuscar.setSize(120, 20);
        CampoBuscar.setLocation((int) AnchoPanel - 200, (int) AltoPanel);
        PanelFechaHoraContenido.add(CampoBuscar);
        
        // Campo para ID
        JTextField CampoID = new JTextField();
        CampoID.setName("CampoID");
        CampoID.setBorder(null);
        CampoID.setText("ID");
        CampoID.setBackground(Color.WHITE);
        CampoID.setForeground(ColorNoEscrito);
        CampoID.setSize(120, 20);
        CampoID.setLocation((int) TextoID.getLocation().getX() + 
                (int) (TextoID.getSize().getWidth() + 20), 
                (int) TextoID.getLocation().getY());
        PanelCentral.add(CampoID);
        
        // Campo para Username
        JTextField CampoUsername = new JTextField();
        CampoUsername.setName("CampoUsername");
        CampoUsername.setBorder(null);
        CampoUsername.setText("Nombre de Usuario");
        CampoUsername.setBackground(Color.WHITE);
        CampoUsername.setForeground(ColorNoEscrito);
        CampoUsername.setSize(120, 20);
        CampoUsername.setLocation((int) AnchoPanelCentral - 300, 80);
        PanelCentral.add(CampoUsername);
        
        // |---------------------Separadores-----------------------------------|
        // Color para separador
        Color ColorSeparador = new Color(51, 51, 51);
        // Separador para CampoBuscar
        JSeparator SeparadorBuscar = new JSeparator();
        SeparadorBuscar.setName("SeparadorBuscar");
        SeparadorBuscar.setBorder(null);
        SeparadorBuscar.setBackground(Color.WHITE);
        SeparadorBuscar.setForeground(ColorSeparador);
        SeparadorBuscar.setSize(120, 15);
        SeparadorBuscar.setLocation((int) AnchoPanel - 200, (int) AltoPanel + 20);
        PanelFechaHoraContenido.add(SeparadorBuscar);
        
        // Separador para CampoID
        JSeparator SeparadorID = new JSeparator();
        SeparadorID.setName("SeparadorBuscar");
        SeparadorID.setBorder(null);
        SeparadorID.setBackground(Color.WHITE);
        SeparadorID.setForeground(ColorSeparador);
        SeparadorID.setSize(120, 15);
        SeparadorID.setLocation((int) CampoID.getLocation().getX(),
                (int) CampoID.getLocation().getY() + 20);
        PanelCentral.add(SeparadorID);
        
        // Separador para CampoUsername
        JSeparator SeparadorUsername = new JSeparator();
        SeparadorUsername.setName("SeparadorBuscar");
        SeparadorUsername.setBorder(null);
        SeparadorUsername.setBackground(Color.WHITE);
        SeparadorUsername.setForeground(ColorSeparador);
        SeparadorUsername.setSize(120, 15);
        SeparadorUsername.setLocation((int) AnchoPanelCentral - 300, 100);
        PanelCentral.add(SeparadorUsername);
        
        // |---------------------Funciones de botones--------------------------|
        // Añadir listener para acción en BotonAnadir
        Botones[0].addActionListener(new ActionListener() {
                // Override de listener para cuando se hace click
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println(e.getSource());
                }
            });
        
        // |----------------------Funciones de ComboBox------------------------|
        // Añadir listener para cuando se selecciona item de ComboBuscar
        ComboBuscar.addItemListener(new ItemListener(){
            // Override para itemStateChanged
            @Override
            public void itemStateChanged(ItemEvent e) 
            {
                String Seleccionado;
                Seleccionado = (String) ComboBuscar.getSelectedItem();
                System.out.println(Seleccionado);
            }
        });
        
        // |----------------------Funciones de campos--------------------------| 
        // |------------------------CampoBuscar--------------------------------|
        // Se añade listener para enfoque de CampoBuscar
        CampoBuscar.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoBuscar.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("Buscar Usuario") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoBuscar.setText("");
                    e.getComponent().setForeground(ColorEscribir);
                }
                else
                {
                    e.getComponent().setForeground(ColorEscribir);
                }
            }
            
            // Override para cuando se desenfoca
            @Override
            public void focusLost(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoBuscar.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("Buscar Usuario"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoBuscar.setText("Buscar Usuario");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoBuscar
        CampoBuscar.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = CampoBuscar.getText();
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("Buscar Usuario"))
                {
                    // Elimina contenido
                    CampoBuscar.setText("");
                }
                if(ColorActual != ColorEscrito)
                {
                    e.getComponent().setForeground(ColorEscrito);
                }
            }

            // Override para cuando se libera
            @Override
            public void mouseReleased(MouseEvent e) 
            {
                System.out.println("Mouse liberado de CampoBuscar");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoBuscar");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoBuscar");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoBuscar");
            }

        });
        // |------------------------CampoID------------------------------------|
        // Se añade listener para enfoque de CampoBuscar
        CampoID.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoID.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("ID") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoID.setText("");
                    e.getComponent().setForeground(ColorEscribir);
                }
                else
                {
                    e.getComponent().setForeground(ColorEscribir);
                }
            }
            
            // Override para cuando se desenfoca
            @Override
            public void focusLost(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoID.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("ID"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoID.setText("ID");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoBuscar
        CampoID.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = CampoID.getText();
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("ID"))
                {
                    // Elimina contenido
                    CampoID.setText("");
                }
                if(ColorActual != ColorEscrito)
                {
                    e.getComponent().setForeground(ColorEscrito);
                }
            }

            // Override para cuando se libera
            @Override
            public void mouseReleased(MouseEvent e) 
            {
                System.out.println("Mouse liberado de CampoBuscar");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoBuscar");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoBuscar");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoBuscar");
            }

        });
        
        // |-------------------------Refrescamos Paneles-----------------------|
        for(JPanel Panel : ListaPaneles)
        {
            // Revalidamos y refrescamos paneles
            Panel.revalidate();
            Panel.repaint();
        }
        for(JPanel Panel : PanelesInactivos)
        {
            Panel.revalidate();
            Panel.repaint();
        }
        PanelUsuarios.revalidate();
        PanelUsuarios.repaint();
    }//GEN-LAST:event_BotonUsuariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ventana TamanoVentana;
                Registro Registros;
                Registros = new Registro();
                TamanoVentana = new Ventana();
                Usuario UsuarioTemp = new Usuario();
                new Menu(TamanoVentana, Registros , UsuarioTemp).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrarSesion;
    private javax.swing.JButton BotonClientes;
    private javax.swing.JButton BotonPiezas;
    private javax.swing.JButton BotonReparaciones;
    private javax.swing.JButton BotonUsuarios;
    private javax.swing.JButton BotonVehiculos;
    private javax.swing.JLabel ImagenFecha;
    private javax.swing.JLabel ImagenHora;
    private javax.swing.JLabel ImagenLogo;
    private javax.swing.JLabel ImagenLogoDerecha;
    private javax.swing.JLabel ImagenLogoIzquierda;
    private javax.swing.JLabel ImagenSitioWeb;
    private javax.swing.JLabel ImagenUsuario;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JPanel PanelCerrarSesion;
    private javax.swing.JPanel PanelClientes;
    private javax.swing.JPanel PanelDerecho;
    private javax.swing.JPanel PanelFechaHora;
    private javax.swing.JPanel PanelFechaHoraContenido;
    private javax.swing.JPanel PanelInferior;
    private javax.swing.JPanel PanelInferiorDerecho;
    private javax.swing.JPanel PanelPiezas;
    private javax.swing.JPanel PanelReparaciones;
    private javax.swing.JPanel PanelRuta;
    private javax.swing.JPanel PanelRutaContenido;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JPanel PanelSuperiorDerecho;
    private javax.swing.JPanel PanelSuperiorIzquierdo;
    private javax.swing.JPanel PanelUsuarios;
    private javax.swing.JPanel PanelVehiculos;
    private javax.swing.JPanel PanelnferiorIzquierdo;
    private javax.swing.JPanel Panelzquierdo;
    private javax.swing.JLabel TextoAprenda;
    private javax.swing.JLabel TextoBienvenida;
    private javax.swing.JLabel TextoBienvenidaUsuario;
    private javax.swing.JLabel TextoCARS;
    private javax.swing.JLabel TextoFecha;
    private javax.swing.JLabel TextoHora;
    private javax.swing.JLabel TextoRuta;
    private javax.swing.JLabel TextoSitioWeb;
    // End of variables declaration//GEN-END:variables
}

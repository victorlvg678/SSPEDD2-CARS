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

import controllers.Hashing;
import controllers.RegistroCRUD;
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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
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
        // Reasignamos texto de ruta
        TextoRuta.setText("Clientes");
        // Pintamos el panel para indicar opción actual
        Color PanelActivo = new Color(59,143,255);
        Color PanelInactivo  = new Color(19,140,220);
        JPanel PanelesInactivos[] = {PanelUsuarios, PanelVehiculos, PanelReparaciones,
        PanelPiezas, PanelCerrarSesion};
        // Ciclo for para setear los paneles a colores inactivos
        for(JPanel Panel : PanelesInactivos)
        {
            Panel.setBackground(PanelInactivo);
        }
        PanelClientes.setBackground(PanelActivo);
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
        String Imagenes[] = {"/content/images/menu/clients/Anadir-115480-24x24.png",
        "/content/images/menu/clients/Eliminar-115480-24x24.png",
        "/content/images/menu/clients/Editar-115480-24x24.png",
        "/content/images/menu/clients/Guardar-115480-24x24.png",
        "/content/images/menu/clients/Buscar-115480-24x24.png"};
        String ImagenesOver[] = {"/content/images/menu/clients/AnadirOver-2980b9-24x24.png",
        "/content/images/menu/clients/EliminarOver-2980b9-24x24.png",
        "/content/images/menu/clients/EditarOver-2980b9-24x24.png",
        "/content/images/menu/clients/GuardarOver-2980b9-24x24.png",
        "/content/images/menu/clients/BuscarOver-2980b9-24x24.png"};
        String ImagenesPressed[] = {"/content/images/menu/clients/AnadirPressed-0b3653-24x24.png",
        "/content/images/menu/clients/EliminarPressed-0b3653-24x24.png",
        "/content/images/menu/clients/EditarPressed-0b3653-24x24.png",
        "/content/images/menu/clients/GuardarPressed-0b3653-24x24.png",
        "/content/images/menu/clients/BuscarPressed-0b3653-24x24.png"};
        // Creamos color para botones
        Color ColorBoton = new Color(17, 84, 128);
        // Creamos botones para funciones de Usuarios
        JButton BotonAnadirClientes = new JButton();
        JButton BotonEliminarClientes = new JButton();
        JButton BotonEditarClientes = new JButton();
        JButton BotonGuardarClientes = new JButton();
        JButton BotonBuscarClientes = new JButton();
        JButton Botones[] = {BotonAnadirClientes, BotonEliminarClientes,
        BotonEditarClientes, BotonGuardarClientes, BotonBuscarClientes};
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
            Boton.setToolTipText("<html><p><strong>" + Textos[Cont] + " Cliente" +
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

        // |-----------------------BotonReestablecer---------------------------|
        Color ColorReestablecer = new Color(41,128,185);
        JButton BotonReestablecer = new JButton();
        BotonReestablecer.setBorderPainted(true);
        BotonReestablecer.setBackground(ColorReestablecer);
        BotonReestablecer.setContentAreaFilled(true);
        BotonReestablecer.setFocusPainted(false);
        BotonReestablecer.setForeground(Color.WHITE);
        BotonReestablecer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        BotonReestablecer.setHorizontalTextPosition(SwingConstants.CENTER);
        BotonReestablecer.setVerticalTextPosition(SwingConstants.CENTER);
        BotonReestablecer.setText("Reestablecer");
        BotonReestablecer.setToolTipText("<html><p><strong>Reestablecer campos" +
                "</strong></p></html>");
        BotonReestablecer.setSize(120, 25);
        BotonReestablecer.setLocation((int) AnchoPanel - 380, 
                (int) AltoPanel + 30);
        PanelFechaHoraContenido.add(BotonReestablecer);
        // |----------------------Texto----------------------------------------|
        // Para imagenes de campos
        ImageIcon Icono;
        // Texto para buscar por
        JLabel TextoBuscar = new JLabel();
        TextoBuscar.setForeground(Color.BLACK);
        TextoBuscar.setBackground(Color.WHITE);
        TextoBuscar.setName("TextoBuscar");
        TextoBuscar.setBorder(null);
        TextoBuscar.setToolTipText("<html><p><strong>Buscar cliente por</strong></p></html>");
        TextoBuscar.setText("Buscar cliente por");
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
        TextoID.setText("ID:");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/NombreUsuario-BelizeHope-24x24.png"));
        TextoID.setIcon(Icono);
        TextoID.setSize(100, 24);
        TextoID.setLocation((int) AnchoPanelCentral - 380, 30);
        System.out.println();
        PanelCentral.add(TextoID);
        
        // Texto para campo Username
        JLabel TextoUsername = new JLabel();
        TextoUsername.setForeground(Color.BLACK);
        TextoUsername.setBackground(Color.WHITE);
        TextoUsername.setName("TextoUsername");
        TextoUsername.setBorder(null);
        TextoUsername.setToolTipText("<html><p><strong>Nombre de Usuario</strong></p></html>");
        TextoUsername.setText("Username:");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/NombreUsuario-BelizeHope-24x24.png"));
        TextoUsername.setIcon(Icono);
        TextoUsername.setSize(100, 24);
        TextoUsername.setLocation((int) AnchoPanelCentral - 380, 
                (int) TextoID.getLocation().getY() + 40);
        PanelCentral.add(TextoUsername);
        
        // Texto para campo Contraseña
        JLabel TextoContrasena = new JLabel();
        TextoContrasena.setForeground(Color.BLACK);
        TextoContrasena.setBackground(Color.WHITE);
        TextoContrasena.setName("TextoContrasena");
        TextoContrasena.setBorder(null);
        TextoContrasena.setToolTipText("<html><p><strong>Contraseña</strong></p></html>");
        TextoContrasena.setText("Contraseña:");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/Contrasena-24x24.png"));
        TextoContrasena.setIcon(Icono);
        TextoContrasena.setSize(100, 24);
        TextoContrasena.setLocation((int) AnchoPanelCentral - 380, 
                (int) TextoUsername.getLocation().getY() + 40);
        PanelCentral.add(TextoContrasena);
        
        // Texto para campo Rol
        JLabel TextoRol = new JLabel();
        TextoRol.setForeground(Color.BLACK);
        TextoRol.setBackground(Color.WHITE);
        TextoRol.setName("TextoRol");
        TextoRol.setBorder(null);
        TextoRol.setToolTipText("<html><p><strong>Rol</strong></p></html>");
        TextoRol.setText("Rol:");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/NombreUsuario-BelizeHope-24x24.png"));
        TextoRol.setIcon(Icono);
        TextoRol.setSize(100, 24);
        TextoRol.setLocation((int) AnchoPanelCentral - 380, 
                (int) TextoContrasena.getLocation().getY() + 40);
        PanelCentral.add(TextoRol);
        
        // Texto para campo Nombre
        JLabel TextoNombre = new JLabel();
        TextoNombre.setForeground(Color.BLACK);
        TextoNombre.setBackground(Color.WHITE);
        TextoNombre.setName("TextoNombre");
        TextoNombre.setBorder(null);
        TextoNombre.setToolTipText("<html><p><strong>Teléfono</strong></p></html>");
        TextoNombre.setText("Nombre(s):");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/Nombre-BelizeHope-24x24.png"));
        TextoNombre.setIcon(Icono);
        TextoNombre.setSize(135, 24);
        TextoNombre.setLocation((int) AnchoPanelCentral - 380, 30);
        PanelDerecho.add(TextoNombre);
        
        // Texto para campo Apellido Paterno
        JLabel TextoApellidoPaterno = new JLabel();
        TextoApellidoPaterno.setForeground(Color.BLACK);
        TextoApellidoPaterno.setBackground(Color.WHITE);
        TextoApellidoPaterno.setName("TextoApellidoPaterno");
        TextoApellidoPaterno.setBorder(null);
        TextoApellidoPaterno.setToolTipText("<html><p><strong>Apellido Paterno</strong></p></html>");
        TextoApellidoPaterno.setText("Apellido Paterno:");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/Nombre-BelizeHope-24x24.png"));
        TextoApellidoPaterno.setIcon(Icono);
        TextoApellidoPaterno.setSize(135, 24);
        TextoApellidoPaterno.setLocation((int) AnchoPanelCentral - 380,
                (int) TextoNombre.getLocation().getY() + 40);
        PanelDerecho.add(TextoApellidoPaterno);
        
        // Texto para campo Apellido Materno
        JLabel TextoApellidoMaterno = new JLabel();
        TextoApellidoMaterno.setForeground(Color.BLACK);
        TextoApellidoMaterno.setBackground(Color.WHITE);
        TextoApellidoMaterno.setName("TextoApellidoMaterno");
        TextoApellidoMaterno.setBorder(null);
        TextoApellidoMaterno.setToolTipText("<html><p><strong>Apellido Materno</strong></p></html>");
        TextoApellidoMaterno.setText("Apellido Materno:");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/Nombre-BelizeHope-24x24.png"));
        TextoApellidoMaterno.setIcon(Icono);
        TextoApellidoMaterno.setSize(135, 24);
        TextoApellidoMaterno.setLocation((int) AnchoPanelCentral - 380,
                (int) TextoApellidoPaterno.getLocation().getY() + 40);
        PanelDerecho.add(TextoApellidoMaterno);
        
        // Texto para campo Dirección
        JLabel TextoDireccion = new JLabel();
        TextoDireccion.setForeground(Color.BLACK);
        TextoDireccion.setBackground(Color.WHITE);
        TextoDireccion.setName("TextoDireccion");
        TextoDireccion.setBorder(null);
        TextoDireccion.setToolTipText("<html><p><strong>Dirección</strong></p></html>");
        TextoDireccion.setText("Dirección:");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/Direccion-BelizeHope-24x24.png"));
        TextoDireccion.setIcon(Icono);
        TextoDireccion.setSize(135, 24);
        TextoDireccion.setLocation((int) AnchoPanelCentral - 380,
                (int) TextoApellidoMaterno.getLocation().getY() + 40);
        PanelDerecho.add(TextoDireccion);
        
        // Texto para campo Teléfono
        JLabel TextoTelefono = new JLabel();
        TextoTelefono.setForeground(Color.BLACK);
        TextoTelefono.setBackground(Color.WHITE);
        TextoTelefono.setName("TextoTelefono");
        TextoTelefono.setBorder(null);
        TextoTelefono.setToolTipText("<html><p><strong>Teléfono</strong></p></html>");
        TextoTelefono.setText("Teléfono:");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/Telefono-BelizeHope-24x24.png"));
        TextoTelefono.setIcon(Icono);
        TextoTelefono.setSize(135, 24);
        TextoTelefono.setLocation((int) AnchoPanelCentral - 380, 
                (int) TextoDireccion.getLocation().getY() + 40);
        PanelDerecho.add(TextoTelefono);
        
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
                (int) (TextoID.getSize().getWidth() + 10), 
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
        CampoUsername.setLocation((int) TextoUsername.getLocation().getX() +
                (int) (TextoUsername.getSize().getWidth() + 10), 
                (int) TextoUsername.getLocation().getY());
        PanelCentral.add(CampoUsername);
        
        // Campo para contraseña
        JPasswordField CampoContrasena = new JPasswordField();
        CampoContrasena.setName("CampoContrasena");
        CampoContrasena.setBorder(null);
        CampoContrasena.setText("Contraseña");
        CampoContrasena.setBackground(Color.WHITE);
        CampoContrasena.setForeground(ColorNoEscrito);
        CampoContrasena.setSize(120, 20);
        CampoContrasena.setLocation((int) TextoContrasena.getLocation().getX() +
                (int) (TextoContrasena.getSize().getWidth() + 10), 
                (int) TextoContrasena.getLocation().getY());
        PanelCentral.add(CampoContrasena);
        
        // Campo para Rol
        JTextField CampoRol = new JTextField();
        CampoRol.setName("CampoRol");
        CampoRol.setBorder(null);
        CampoRol.setText("Rol");
        CampoRol.setBackground(Color.WHITE);
        CampoRol.setForeground(ColorNoEscrito);
        CampoRol.setSize(120, 20);
        CampoRol.setLocation((int) TextoRol.getLocation().getX() +
                (int) (TextoRol.getSize().getWidth() + 10), 
                (int) TextoRol.getLocation().getY());
        PanelCentral.add(CampoRol);
        
        // Campo para Nombre
        JTextField CampoNombre = new JTextField();
        CampoNombre.setName("CampoNombre");
        CampoNombre.setBorder(null);
        CampoNombre.setText("Nombre(s)");
        CampoNombre.setBackground(Color.WHITE);
        CampoNombre.setForeground(ColorNoEscrito);
        CampoNombre.setSize(120, 20);
        CampoNombre.setLocation((int) TextoNombre.getLocation().getX() +
                (int) (TextoNombre.getSize().getWidth() + 10), 
                (int) TextoNombre.getLocation().getY());
        PanelDerecho.add(CampoNombre);
        
        // Campo para Apellido Paterno
        JTextField CampoApellidoPaterno = new JTextField();
        CampoApellidoPaterno.setName("CampoApellidoPaterno");
        CampoApellidoPaterno.setBorder(null);
        CampoApellidoPaterno.setText("Apellido Paterno");
        CampoApellidoPaterno.setBackground(Color.WHITE);
        CampoApellidoPaterno.setForeground(ColorNoEscrito);
        CampoApellidoPaterno.setSize(120, 20);
        CampoApellidoPaterno.setLocation((int) TextoApellidoPaterno.getLocation().getX() +
                (int) (TextoApellidoPaterno.getSize().getWidth() + 10), 
                (int) TextoApellidoPaterno.getLocation().getY());
        PanelDerecho.add(CampoApellidoPaterno);
        
        // Campo para Apellido Materno
        JTextField CampoApellidoMaterno = new JTextField();
        CampoApellidoMaterno.setName("CampoApellidoMaterno");
        CampoApellidoMaterno.setBorder(null);
        CampoApellidoMaterno.setText("Apellido Materno");
        CampoApellidoMaterno.setBackground(Color.WHITE);
        CampoApellidoMaterno.setForeground(ColorNoEscrito);
        CampoApellidoMaterno.setSize(120, 20);
        CampoApellidoMaterno.setLocation((int) TextoApellidoMaterno.getLocation().getX() +
                (int) (TextoApellidoMaterno.getSize().getWidth() + 10), 
                (int) TextoApellidoMaterno.getLocation().getY());
        PanelDerecho.add(CampoApellidoMaterno);
        
        // Campo para Dirección
        JTextField CampoDireccion = new JTextField();
        CampoDireccion.setName("CampoDireccion");
        CampoDireccion.setBorder(null);
        CampoDireccion.setText("Dirección");
        CampoDireccion.setBackground(Color.WHITE);
        CampoDireccion.setForeground(ColorNoEscrito);
        CampoDireccion.setSize(120, 20);
        CampoDireccion.setLocation((int) TextoDireccion.getLocation().getX() +
                (int) (TextoDireccion.getSize().getWidth() + 10), 
                (int) TextoDireccion.getLocation().getY());
        PanelDerecho.add(CampoDireccion);
        
        // Campo para Teléfono
        JTextField CampoTelefono = new JTextField();
        CampoTelefono.setName("CampoTelefono");
        CampoTelefono.setBorder(null);
        CampoTelefono.setText("Teléfono");
        CampoTelefono.setBackground(Color.WHITE);
        CampoTelefono.setForeground(ColorNoEscrito);
        CampoTelefono.setSize(120, 20);
        CampoTelefono.setLocation((int) TextoTelefono.getLocation().getX() +
                (int) (TextoTelefono.getSize().getWidth() + 10), 
                (int) TextoTelefono.getLocation().getY());
        PanelDerecho.add(CampoTelefono);
        
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
        SeparadorUsername.setName("SeparadorUsername");
        SeparadorUsername.setBorder(null);
        SeparadorUsername.setBackground(Color.WHITE);
        SeparadorUsername.setForeground(ColorSeparador);
        SeparadorUsername.setSize(120, 15);
        SeparadorUsername.setLocation((int) CampoUsername.getLocation().getX(), 
                (int) CampoUsername.getLocation().getY() + 20);
        PanelCentral.add(SeparadorUsername);
        
        // Separador para CampoContrasena
        JSeparator SeparadorContrasena = new JSeparator();
        SeparadorContrasena.setName("SeparadorContrasena");
        SeparadorContrasena.setBorder(null);
        SeparadorContrasena.setBackground(Color.WHITE);
        SeparadorContrasena.setForeground(ColorSeparador);
        SeparadorContrasena.setSize(120, 15);
        SeparadorContrasena.setLocation((int) CampoContrasena.getLocation().getX(), 
                (int) CampoContrasena.getLocation().getY() + 20);
        PanelCentral.add(SeparadorContrasena);
        
        // Separador para CampoRol
        JSeparator SeparadorRol = new JSeparator();
        SeparadorRol.setName("SeparadorRol");
        SeparadorRol.setBorder(null);
        SeparadorRol.setBackground(Color.WHITE);
        SeparadorRol.setForeground(ColorSeparador);
        SeparadorRol.setSize(120, 15);
        SeparadorRol.setLocation((int) CampoRol.getLocation().getX(), 
                (int) CampoRol.getLocation().getY() + 20);
        PanelCentral.add(SeparadorRol);
        
        // Separador para CampoNombre
        JSeparator SeparadorNombre = new JSeparator();
        SeparadorNombre.setName("SeparadorNombre");
        SeparadorNombre.setBorder(null);
        SeparadorNombre.setBackground(Color.WHITE);
        SeparadorNombre.setForeground(ColorSeparador);
        SeparadorNombre.setSize(120, 15);
        SeparadorNombre.setLocation((int) CampoNombre.getLocation().getX(), 
                (int) CampoNombre.getLocation().getY() + 20);
        PanelDerecho.add(SeparadorNombre);
        
        // Separador para CampoApellidoPaterno
        JSeparator SeparadorApellidoPaterno = new JSeparator();
        SeparadorApellidoPaterno.setName("SeparadorApellidoPaterno");
        SeparadorApellidoPaterno.setBorder(null);
        SeparadorApellidoPaterno.setBackground(Color.WHITE);
        SeparadorApellidoPaterno.setForeground(ColorSeparador);
        SeparadorApellidoPaterno.setSize(120, 15);
        SeparadorApellidoPaterno.setLocation((int) CampoApellidoPaterno.getLocation().getX(), 
                (int) CampoApellidoPaterno.getLocation().getY() + 20);
        PanelDerecho.add(SeparadorApellidoPaterno);
        
        // Separador para CampoApellidoMaterno
        JSeparator SeparadorApellidoMaterno = new JSeparator();
        SeparadorApellidoMaterno.setName("SeparadorApellidoMaterno");
        SeparadorApellidoMaterno.setBorder(null);
        SeparadorApellidoMaterno.setBackground(Color.WHITE);
        SeparadorApellidoMaterno.setForeground(ColorSeparador);
        SeparadorApellidoMaterno.setSize(120, 15);
        SeparadorApellidoMaterno.setLocation((int) CampoApellidoMaterno.getLocation().getX(), 
                (int) CampoApellidoMaterno.getLocation().getY() + 20);
        PanelDerecho.add(SeparadorApellidoMaterno);
        
        // Separador para CampoDireccion
        JSeparator SeparadorDireccion = new JSeparator();
        SeparadorDireccion.setName("SeparadorDireccion");
        SeparadorDireccion.setBorder(null);
        SeparadorDireccion.setBackground(Color.WHITE);
        SeparadorDireccion.setForeground(ColorSeparador);
        SeparadorDireccion.setSize(120, 15);
        SeparadorDireccion.setLocation((int) CampoDireccion.getLocation().getX(), 
                (int) CampoDireccion.getLocation().getY() + 20);
        PanelDerecho.add(SeparadorDireccion);
        
        // Separador para CampoTelefono
        JSeparator SeparadorTelefono = new JSeparator();
        SeparadorTelefono.setName("SeparadorTelefono");
        SeparadorTelefono.setBorder(null);
        SeparadorTelefono.setBackground(Color.WHITE);
        SeparadorTelefono.setForeground(ColorSeparador);
        SeparadorTelefono.setSize(120, 15);
        SeparadorTelefono.setLocation((int) CampoTelefono.getLocation().getX(), 
                (int) CampoTelefono.getLocation().getY() + 20);
        PanelDerecho.add(SeparadorTelefono);
        
        // |---------------------Funciones de botones--------------------------|
        // Boton para Reestablecer campos
        BotonReestablecer.addActionListener(new ActionListener(){
            // Override de listener para cuando se hace click
            @Override
            public void actionPerformed(ActionEvent e)
            {
                CampoID.setText("ID");
                CampoID.setForeground(ColorNoEscrito);
                CampoUsername.setText("Nombre de Usuario");
                CampoUsername.setForeground(ColorNoEscrito);
                CampoContrasena.setText("Contraseña");
                CampoContrasena.setForeground(ColorNoEscrito);
                CampoRol.setText("Rol");
                CampoRol.setForeground(ColorNoEscrito);
                CampoNombre.setText("Nombre(s)");
                CampoNombre.setForeground(ColorNoEscrito);
                CampoApellidoPaterno.setText("Apellido Paterno");
                CampoApellidoPaterno.setForeground(ColorNoEscrito);
                CampoApellidoMaterno.setText("Apellido Materno");
                CampoApellidoMaterno.setForeground(ColorNoEscrito);
                CampoDireccion.setText("Dirección");
                CampoDireccion.setForeground(ColorNoEscrito);
                CampoTelefono.setText("Teléfono");
                CampoTelefono.setForeground(ColorNoEscrito);
            }
        });
        
        // Añadir listener para acción en BotonAnadir
        Botones[0].addActionListener(new ActionListener() {
                // Override de listener para cuando se hace click
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    Usuario UsuarioTemp;
                    String ID, IDAAsignar, Username, Contrasena, Rol, Nombre, AP, AM,
                            Direccion, Telefono;
                    Boolean Registrable;
                    IDAAsignar = "-1";
                    Registrable = true;
                    UsuarioTemp = new Usuario();
                    // Obtenemos valores de campos
                    ID = CampoID.getText();
                    Username = CampoUsername.getText();
                    Contrasena = String.valueOf(CampoContrasena.getPassword());
                    Rol = CampoRol.getText();
                    Nombre = CampoNombre.getText();
                    AP = CampoApellidoPaterno.getText();
                    AM = CampoApellidoMaterno.getText();
                    Direccion = CampoDireccion.getText();
                    Telefono = CampoTelefono.getText();
                   
                    if(Username.equals("Nombre de Usuario") ||
                            Username.equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
                    }
                    else
                    {
                        if(Contrasena.equals("Contraseña") ||
                                Contrasena.equals(""))
                        {
                            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
                        }
                        else
                        {
                            if(Rol.equals("Rol") || Rol.equals(""))
                            {
                                JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
                            }
                            else
                            {
                                if(Nombre.equals("Nombre(s)") ||
                                        Nombre.equals(""))
                                {
                                    JOptionPane.showMessageDialog(null, 
                                            "Faltan campos por llenar");
                                }
                                else
                                {
                                    if(AP.equals("Apellido Paterno") ||
                                            AP.equals(""))
                                    {
                                        JOptionPane.showMessageDialog(null, 
                                                "Faltan campos por llenar");
                                    }
                                    else
                                    {
                                        if(AM.equals("Apellido Materno") ||
                                                AM.equals(""))
                                        {
                                            JOptionPane.showMessageDialog(null, 
                                                    "Faltan campos por llenar");
                                        }
                                        else
                                        {
                                            if(Direccion.equals("Dirección") ||
                                                    Direccion.equals(""))
                                            {
                                                JOptionPane.showMessageDialog(null, 
                                                        "Faltan campos por llenar");
                                            }
                                            else
                                            {
                                                if(Telefono.equals("Teléfono") ||
                                                        Telefono.equals(""))
                                                {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Faltan campo por llenar");
                                                }
                                                else
                                                {
                                                    if(ID.equals("ID") ||
                                                                    ID.equals(""))
                                                    {
                                                        int x, Mayor;
                                                        Mayor = 0;
                                                        for(x = 0; x < RegistrosVentana.getTamanoUsuarios(); x++)
                                                        {
                                                            if(Mayor < Integer.parseInt(RegistrosVentana.getUsuario(x).getID()))
                                                            {
                                                                Mayor = Integer.parseInt(RegistrosVentana.getUsuario(x).getID());
                                                            }
                                                            if(Username.equals(RegistrosVentana.getUsuario(x).getUsername()))
                                                            {
                                                                Registrable = false;
                                                            }
                                                        }
                                                        IDAAsignar = String.valueOf(Mayor + 1);
                                                    }
                                                    else
                                                    {
                                                        int x;
                                                        for(x = 0; x < RegistrosVentana.getTamanoUsuarios(); x++)
                                                        {
                                                            if(ID.equals(RegistrosVentana.getUsuario(x).getID()))
                                                            {
                                                                JOptionPane.showMessageDialog(null, 
                                                                        "El ID " + ID +" ya está registrado");
                                                                Registrable = false;
                                                            }
                                                            else
                                                            {
                                                                if(Username.equals(RegistrosVentana.getUsuario(x).getUsername()))
                                                                {
                                                                   JOptionPane.showMessageDialog(null, 
                                                                            "El nombre de usuario " +
                                                                            Username + " ya está registrado");
                                                                    Registrable = false;
                                                                }
                                                            }
                                                        }
                                                        if(Registrable)
                                                        {
                                                            IDAAsignar = ID;
                                                        }
                                                    }
                                                    if(Registrable)
                                                    {
                                                        UsuarioTemp.setID(IDAAsignar);
                                                        UsuarioTemp.setUsername(Username);
                                                        UsuarioTemp.setContrasena(Hashing.Hash(Contrasena));
                                                        if(Rol.equals("Admin"))
                                                        {
                                                            UsuarioTemp.setRol("Admin");
                                                        }
                                                        else
                                                        {
                                                            UsuarioTemp.setRol("Usuario");
                                                        }
                                                        UsuarioTemp.setNombre(Nombre);
                                                        UsuarioTemp.setApellidoPaterno(AP);
                                                        UsuarioTemp.setApellidoMaterno(AM);
                                                        UsuarioTemp.setDireccion(Direccion);
                                                        UsuarioTemp.setTelefono(Telefono);
                                                        RegistrosVentana.InsertarUsuarios(UsuarioTemp);
                                                        CampoID.setText("ID");
                                                        CampoID.setForeground(ColorNoEscrito);
                                                        CampoUsername.setText("Nombre de Usuario");
                                                        CampoUsername.setForeground(ColorNoEscrito);
                                                        CampoContrasena.setText("Contraseña");
                                                        CampoContrasena.setForeground(ColorNoEscrito);
                                                        CampoRol.setText("Rol");
                                                        CampoRol.setForeground(ColorNoEscrito);
                                                        CampoNombre.setText("Nombre(s)");
                                                        CampoNombre.setForeground(ColorNoEscrito);
                                                        CampoApellidoPaterno.setText("Apellido Paterno");
                                                        CampoApellidoPaterno.setForeground(ColorNoEscrito);
                                                        CampoApellidoMaterno.setText("Apellido Materno");
                                                        CampoApellidoMaterno.setForeground(ColorNoEscrito);
                                                        CampoDireccion.setText("Dirección");
                                                        CampoDireccion.setForeground(ColorNoEscrito);
                                                        CampoTelefono.setText("Teléfono");
                                                        CampoTelefono.setForeground(ColorNoEscrito);
                                                        JOptionPane.showMessageDialog(null, "Se ha registrado " +
                                                                Username + " con éxito");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    
                };
            });
        
        // Añadir listener para acción en eliminar
        Botones[1].addActionListener(new ActionListener() {
                // Override de listener para cuando se hace click
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    Usuario UsuarioTemp;
                    String ID, Username;
                    Boolean Eliminable;
                    int Eliminar;
                    Eliminar = -1;
                    Eliminable = false;
                    UsuarioTemp = new Usuario();
                    // Obtenemos valores de campos
                    ID = CampoID.getText();
                    Username = CampoUsername.getText();
                   
                    
                    if((Username.equals("Nombre de Usuario") || Username.equals("")) &&
                            (ID.equals("ID") || ID.equals("")))
                    {
                        JOptionPane.showMessageDialog(null, "Indique el ID o nombre de usuario");
                    }
                    else
                    {
                        int x;
                        for(x = 0; x < RegistrosVentana.getTamanoUsuarios(); x++)
                        {
                            if(ID.equals(RegistrosVentana.getUsuario(x).getID()) ||
                                    Username.equals(RegistrosVentana.getUsuario(x).getUsername()))
                            {
                                Eliminable = true;
                                Eliminar = x;
                            }
                        }
                        if(Eliminable)
                        {
                            CampoID.setText("ID");
                            CampoID.setForeground(ColorNoEscrito);
                            CampoUsername.setText("Nombre de Usuario");
                            CampoUsername.setForeground(ColorNoEscrito);
                            CampoContrasena.setText("Contraseña");
                            CampoContrasena.setForeground(ColorNoEscrito);
                            CampoRol.setText("Rol");
                            CampoRol.setForeground(ColorNoEscrito);
                            CampoNombre.setText("Nombre(s)");
                            CampoNombre.setForeground(ColorNoEscrito);
                            CampoApellidoPaterno.setText("Apellido Paterno");
                            CampoApellidoPaterno.setForeground(ColorNoEscrito);
                            CampoApellidoMaterno.setText("Apellido Materno");
                            CampoApellidoMaterno.setForeground(ColorNoEscrito);
                            CampoDireccion.setText("Dirección");
                            CampoDireccion.setForeground(ColorNoEscrito);
                            CampoTelefono.setText("Teléfono");
                            CampoTelefono.setForeground(ColorNoEscrito);
                            if(Eliminar != -1)
                            {
                                int Respuesta;
                                UsuarioTemp = RegistrosVentana.getUsuario(Eliminar);
                                Respuesta = JOptionPane.showConfirmDialog(null, 
                                        "¿Seguro que desea eliminar al usuario " +
                                        UsuarioTemp.getUsername());
                                if(Respuesta == 0)
                                {
                                    RegistrosVentana.EliminarUsuarios(UsuarioTemp);
                                    JOptionPane.showMessageDialog(null, "Se ha eliminado " +
                                        UsuarioTemp.getUsername() + " con éxito");
                                }
                            }
                        }
                        else
                        {
                            if(!Username.equals("Nombre de Usuario") &&
                                    !Username.equals(""))
                            {
                                JOptionPane.showMessageDialog(null, "No se encontró el usuario " +
                                        Username);
                            }
                            else
                            {
                                if(!ID.equals("ID") &&
                                    !ID.equals(""))
                                {
                                    JOptionPane.showMessageDialog(null, "No se encontró el usuario con ID " +
                                            ID);
                                }
                            }
                        }
                    }
                }
        });
        
        // Añadir listener para acción en editar
        Botones[2].addActionListener(new ActionListener() {
                // Override de listener para cuando se hace click
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    System.out.println("");
                }
        });
        
        // Añadir listener para acción en guardar
        Botones[3].addActionListener(new ActionListener() {
                // Override de listener para cuando se hace click
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    RegistroCRUD RegistroGuardar = new RegistroCRUD();
                    RegistroGuardar.Guardar(RegistrosVentana);
                    JOptionPane.showMessageDialog(null, "Se han guardado los registros con éxito");
                }
        });
        
        // Añadir listener para acción en buscar
        Botones[4].addActionListener(new ActionListener() {
                // Override de listener para cuando se hace click
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    String Buscar;
                    Usuario UsuarioTemp;
                    UsuarioTemp = new Usuario();
                    Boolean Encontrado;
                    Color ColorEscribir = new Color(51, 51, 51);
                    Encontrado = false;
                    int BuscarPor, x, Indice;
                    Indice = -1;
                    Buscar = CampoBuscar.getText();
                    //if()
                    BuscarPor = ComboBuscar.getSelectedIndex();
                    if(Buscar.equals("Buscar Usuario") || Buscar.equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "No se ha indicado que valor buscar");
                    }
                    else
                    {
                        switch(BuscarPor)
                        {
                            case 0 :
                            {
                                for(x = 0; x < RegistrosVentana.getTamanoUsuarios(); x++)
                                {
                                    if(Buscar.equals(RegistrosVentana.getUsuario(x).getID()))
                                    {
                                        Encontrado = true;
                                        Indice = x;
                                    }
                                }
                                break;
                            }
                            
                            case 1 :
                            {
                                for(x = 0; x < RegistrosVentana.getTamanoUsuarios(); x++)
                                {
                                    if(Buscar.equals(RegistrosVentana.getUsuario(x).getUsername()))
                                    {
                                        Encontrado = true;
                                        Indice = x;
                                    }
                                }
                                break;
                            }
                            
                            case 2 :
                            {
                                for(x = 0; x < RegistrosVentana.getTamanoUsuarios(); x++)
                                {
                                    if(Buscar.equals(RegistrosVentana.getUsuario(x).getNombre()))
                                    {
                                        Encontrado = true;
                                        Indice = x;
                                    }
                                }
                                break;
                            }
                            
                            case 3 :
                            {
                                for(x = 0; x < RegistrosVentana.getTamanoUsuarios(); x++)
                                {
                                    if(Buscar.equals(RegistrosVentana.getUsuario(x).getApellidoPaterno()))
                                    {
                                        Encontrado = true;
                                        Indice = x;
                                    }
                                }
                                break;
                            }
                            
                            case 4 :
                            {
                                for(x = 0; x < RegistrosVentana.getTamanoUsuarios(); x++)
                                {
                                    if(Buscar.equals(RegistrosVentana.getUsuario(x).getApellidoMaterno()))
                                    {
                                        Encontrado = true;
                                        Indice = x;
                                    }
                                }
                                break;
                            }
                        }
                        if(Encontrado && Indice > -1)
                        {
                            UsuarioTemp = RegistrosVentana.getUsuario(Indice);
                            CampoID.setText(UsuarioTemp.getID());
                            CampoID.setForeground(ColorEscribir);
                            CampoUsername.setText(UsuarioTemp.getUsername());
                            CampoUsername.setForeground(ColorEscribir);
                            CampoContrasena.setText(UsuarioTemp.getContrasena());
                            CampoContrasena.setForeground(ColorEscribir);
                            CampoRol.setText(UsuarioTemp.getRol());
                            CampoRol.setForeground(ColorEscribir);
                            CampoNombre.setText(UsuarioTemp.getNombre());
                            CampoNombre.setForeground(ColorEscribir);
                            CampoApellidoPaterno.setText(UsuarioTemp.getApellidoPaterno());
                            CampoApellidoPaterno.setForeground(ColorEscribir);
                            CampoApellidoMaterno.setText(UsuarioTemp.getApellidoMaterno());
                            CampoApellidoMaterno.setForeground(ColorEscribir);
                            CampoDireccion.setText(UsuarioTemp.getDireccion());
                            CampoDireccion.setForeground(ColorEscribir);
                            CampoTelefono.setText(UsuarioTemp.getTelefono());
                            CampoTelefono.setForeground(ColorEscribir);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "No se encontró ningún usuario con el valor " +
                                    Buscar);
                        }
                    }
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
                System.out.println("Mouse liberado de CampoID");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoID");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoID");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoID");
            }

        });
        
        // |------------------------CampoUsername------------------------------|
        // Se añade listener para enfoque de CampoUsername
        CampoUsername.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoUsername.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("Nombre de Usuario") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoUsername.setText("");
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
                String Contenido = CampoUsername.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("Nombre de Usuario"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoUsername.setText("Nombre de Usuario");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoUsername
        CampoUsername.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = CampoUsername.getText();
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("Nombre de Usuario"))
                {
                    // Elimina contenido
                    CampoUsername.setText("");
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
                System.out.println("Mouse liberado de CampoUsername");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoUsername");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoUsername");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoUsername");
            }

        });
        
        // |------------------------CampoContrasena----------------------------|
        // Se añade listener para enfoque de CampoContrasena
        CampoContrasena.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = String.valueOf(CampoContrasena.getPassword());
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("Contraseña") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoContrasena.setText("");
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
                String Contenido = String.valueOf(CampoContrasena.getPassword());
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("Contraseña"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoContrasena.setText("Contraseña");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoContrasena
        CampoContrasena.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = String.valueOf(CampoContrasena.getPassword());
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("Contraseña"))
                {
                    // Elimina contenido
                    CampoContrasena.setText("");
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
                System.out.println("Mouse liberado de CampoContrasena");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoContrasena");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoContrasena");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoContrasena");
            }

        });
        
        // |------------------------CampoRol-----------------------------------|
        // Se añade listener para enfoque de CampoRol
        CampoRol.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoRol.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("Rol") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoRol.setText("");
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
                String Contenido = CampoRol.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("Rol"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoRol.setText("Rol");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoRol
        CampoRol.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = CampoRol.getText();
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("Rol"))
                {
                    // Elimina contenido
                    CampoRol.setText("");
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
                System.out.println("Mouse liberado de CampoRol");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoRol");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoRol");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoRol");
            }

        });
        
        // |------------------------CampoNombre--------------------------------|
        // Se añade listener para enfoque de CampoNombre
        CampoNombre.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoNombre.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("Nombre(s)") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoNombre.setText("");
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
                String Contenido = CampoNombre.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("Nombre(s)"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoNombre.setText("Nombre(s)");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoNombre
        CampoNombre.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = CampoNombre.getText();
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("Nombre(s)"))
                {
                    // Elimina contenido
                    CampoNombre.setText("");
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
                System.out.println("Mouse liberado de CampoNombre");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoNombre");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoNombre");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoNombre");
            }

        });
        
        // |------------------CampoApellidoPaterno-----------------------------|
        // Se añade listener para enfoque de CampoApellidoPaterno
        CampoApellidoPaterno.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoApellidoPaterno.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("Apellido Paterno") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoApellidoPaterno.setText("");
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
                String Contenido = CampoApellidoPaterno.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("Apellido Paterno"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoApellidoPaterno.setText("Apellido Paterno");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoApellidoPaterno
        CampoApellidoPaterno.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = CampoApellidoPaterno.getText();
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("Apellido Paterno"))
                {
                    // Elimina contenido
                    CampoApellidoPaterno.setText("");
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
                System.out.println("Mouse liberado de CampoApellidoPaterno");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoApellidoPaterno");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoApellidoPaterno");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoApellidoPaterno");
            }

        });
        
        // |------------------CampoApellidoMaterno-----------------------------|
        // Se añade listener para enfoque de CampoApellidoMaterno
        CampoApellidoMaterno.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoApellidoMaterno.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("Apellido Materno") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoApellidoMaterno.setText("");
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
                String Contenido = CampoApellidoMaterno.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("Apellido Materno"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoApellidoMaterno.setText("Apellido Materno");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoApellidoMaterno
        CampoApellidoMaterno.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = CampoApellidoMaterno.getText();
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("Apellido Materno"))
                {
                    // Elimina contenido
                    CampoApellidoMaterno.setText("");
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
                System.out.println("Mouse liberado de CampoApellidoMaterno");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoApellidoMaterno");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoApellidoMaterno");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoApellidoMaterno");
            }

        });
        
        // |------------------------CampoDireccion-----------------------------|
        // Se añade listener para enfoque de CampoDireccion
        CampoDireccion.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoDireccion.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("Dirección") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoDireccion.setText("");
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
                String Contenido = CampoDireccion.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("Dirección"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoDireccion.setText("Dirección");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoDireccion
        CampoDireccion.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = CampoDireccion.getText();
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("Dirección"))
                {
                    // Elimina contenido
                    CampoDireccion.setText("");
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
                System.out.println("Mouse liberado de CampoDireccion");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoDireccion");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoDireccion");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoDireccion");
            }

        });
        
        // |------------------------CampoTelefono------------------------------|
        // Se añade listener para enfoque de CampoTelefono
        CampoTelefono.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoTelefono.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("Teléfono") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoTelefono.setText("");
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
                String Contenido = CampoTelefono.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("Teléfono"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoTelefono.setText("Teléfono");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoTelefono
        CampoTelefono.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = CampoTelefono.getText();
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("Teléfono"))
                {
                    // Elimina contenido
                    CampoTelefono.setText("");
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
                System.out.println("Mouse liberado de CampoTelefono");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoTelefono");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoTelefono");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoTelefono");
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
        ContrasenaTemp = "";
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

        // |-----------------------BotonReestablecer---------------------------|
        Color ColorReestablecer = new Color(41,128,185);
        JButton BotonReestablecer = new JButton();
        BotonReestablecer.setBorderPainted(true);
        BotonReestablecer.setBackground(ColorReestablecer);
        BotonReestablecer.setContentAreaFilled(true);
        BotonReestablecer.setFocusPainted(false);
        BotonReestablecer.setForeground(Color.WHITE);
        BotonReestablecer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        BotonReestablecer.setHorizontalTextPosition(SwingConstants.CENTER);
        BotonReestablecer.setVerticalTextPosition(SwingConstants.CENTER);
        BotonReestablecer.setText("Reestablecer");
        BotonReestablecer.setToolTipText("<html><p><strong>Reestablecer campos" +
                "</strong></p></html>");
        BotonReestablecer.setSize(120, 25);
        BotonReestablecer.setLocation((int) AnchoPanel - 380, 
                (int) AltoPanel + 30);
        PanelFechaHoraContenido.add(BotonReestablecer);
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
        TextoID.setText("ID:");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/NombreUsuario-BelizeHope-24x24.png"));
        TextoID.setIcon(Icono);
        TextoID.setSize(100, 24);
        TextoID.setLocation((int) AnchoPanelCentral - 380, 30);
        System.out.println();
        PanelCentral.add(TextoID);
        
        // Texto para campo Username
        JLabel TextoUsername = new JLabel();
        TextoUsername.setForeground(Color.BLACK);
        TextoUsername.setBackground(Color.WHITE);
        TextoUsername.setName("TextoUsername");
        TextoUsername.setBorder(null);
        TextoUsername.setToolTipText("<html><p><strong>Nombre de Usuario</strong></p></html>");
        TextoUsername.setText("Username:");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/NombreUsuario-BelizeHope-24x24.png"));
        TextoUsername.setIcon(Icono);
        TextoUsername.setSize(100, 24);
        TextoUsername.setLocation((int) AnchoPanelCentral - 380, 
                (int) TextoID.getLocation().getY() + 40);
        PanelCentral.add(TextoUsername);
        
        // Texto para campo Contraseña
        JLabel TextoContrasena = new JLabel();
        TextoContrasena.setForeground(Color.BLACK);
        TextoContrasena.setBackground(Color.WHITE);
        TextoContrasena.setName("TextoContrasena");
        TextoContrasena.setBorder(null);
        TextoContrasena.setToolTipText("<html><p><strong>Contraseña</strong></p></html>");
        TextoContrasena.setText("Contraseña:");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/Contrasena-24x24.png"));
        TextoContrasena.setIcon(Icono);
        TextoContrasena.setSize(100, 24);
        TextoContrasena.setLocation((int) AnchoPanelCentral - 380, 
                (int) TextoUsername.getLocation().getY() + 40);
        PanelCentral.add(TextoContrasena);
        
        // Texto para campo Rol
        JLabel TextoRol = new JLabel();
        TextoRol.setForeground(Color.BLACK);
        TextoRol.setBackground(Color.WHITE);
        TextoRol.setName("TextoRol");
        TextoRol.setBorder(null);
        TextoRol.setToolTipText("<html><p><strong>Rol</strong></p></html>");
        TextoRol.setText("Rol:");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/NombreUsuario-BelizeHope-24x24.png"));
        TextoRol.setIcon(Icono);
        TextoRol.setSize(100, 24);
        TextoRol.setLocation((int) AnchoPanelCentral - 380, 
                (int) TextoContrasena.getLocation().getY() + 40);
        PanelCentral.add(TextoRol);
        
        // Texto para campo Nombre
        JLabel TextoNombre = new JLabel();
        TextoNombre.setForeground(Color.BLACK);
        TextoNombre.setBackground(Color.WHITE);
        TextoNombre.setName("TextoNombre");
        TextoNombre.setBorder(null);
        TextoNombre.setToolTipText("<html><p><strong>Teléfono</strong></p></html>");
        TextoNombre.setText("Nombre(s):");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/Nombre-BelizeHope-24x24.png"));
        TextoNombre.setIcon(Icono);
        TextoNombre.setSize(135, 24);
        TextoNombre.setLocation((int) AnchoPanelCentral - 380, 30);
        PanelDerecho.add(TextoNombre);
        
        // Texto para campo Apellido Paterno
        JLabel TextoApellidoPaterno = new JLabel();
        TextoApellidoPaterno.setForeground(Color.BLACK);
        TextoApellidoPaterno.setBackground(Color.WHITE);
        TextoApellidoPaterno.setName("TextoApellidoPaterno");
        TextoApellidoPaterno.setBorder(null);
        TextoApellidoPaterno.setToolTipText("<html><p><strong>Apellido Paterno</strong></p></html>");
        TextoApellidoPaterno.setText("Apellido Paterno:");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/Nombre-BelizeHope-24x24.png"));
        TextoApellidoPaterno.setIcon(Icono);
        TextoApellidoPaterno.setSize(135, 24);
        TextoApellidoPaterno.setLocation((int) AnchoPanelCentral - 380,
                (int) TextoNombre.getLocation().getY() + 40);
        PanelDerecho.add(TextoApellidoPaterno);
        
        // Texto para campo Apellido Materno
        JLabel TextoApellidoMaterno = new JLabel();
        TextoApellidoMaterno.setForeground(Color.BLACK);
        TextoApellidoMaterno.setBackground(Color.WHITE);
        TextoApellidoMaterno.setName("TextoApellidoMaterno");
        TextoApellidoMaterno.setBorder(null);
        TextoApellidoMaterno.setToolTipText("<html><p><strong>Apellido Materno</strong></p></html>");
        TextoApellidoMaterno.setText("Apellido Materno:");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/Nombre-BelizeHope-24x24.png"));
        TextoApellidoMaterno.setIcon(Icono);
        TextoApellidoMaterno.setSize(135, 24);
        TextoApellidoMaterno.setLocation((int) AnchoPanelCentral - 380,
                (int) TextoApellidoPaterno.getLocation().getY() + 40);
        PanelDerecho.add(TextoApellidoMaterno);
        
        // Texto para campo Dirección
        JLabel TextoDireccion = new JLabel();
        TextoDireccion.setForeground(Color.BLACK);
        TextoDireccion.setBackground(Color.WHITE);
        TextoDireccion.setName("TextoDireccion");
        TextoDireccion.setBorder(null);
        TextoDireccion.setToolTipText("<html><p><strong>Dirección</strong></p></html>");
        TextoDireccion.setText("Dirección:");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/Direccion-BelizeHope-24x24.png"));
        TextoDireccion.setIcon(Icono);
        TextoDireccion.setSize(135, 24);
        TextoDireccion.setLocation((int) AnchoPanelCentral - 380,
                (int) TextoApellidoMaterno.getLocation().getY() + 40);
        PanelDerecho.add(TextoDireccion);
        
        // Texto para campo Teléfono
        JLabel TextoTelefono = new JLabel();
        TextoTelefono.setForeground(Color.BLACK);
        TextoTelefono.setBackground(Color.WHITE);
        TextoTelefono.setName("TextoTelefono");
        TextoTelefono.setBorder(null);
        TextoTelefono.setToolTipText("<html><p><strong>Teléfono</strong></p></html>");
        TextoTelefono.setText("Teléfono:");
        Icono = new ImageIcon(getClass().getResource(
                "/content/images/signup/Telefono-BelizeHope-24x24.png"));
        TextoTelefono.setIcon(Icono);
        TextoTelefono.setSize(135, 24);
        TextoTelefono.setLocation((int) AnchoPanelCentral - 380, 
                (int) TextoDireccion.getLocation().getY() + 40);
        PanelDerecho.add(TextoTelefono);
        
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
                (int) (TextoID.getSize().getWidth() + 10), 
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
        CampoUsername.setLocation((int) TextoUsername.getLocation().getX() +
                (int) (TextoUsername.getSize().getWidth() + 10), 
                (int) TextoUsername.getLocation().getY());
        PanelCentral.add(CampoUsername);
        
        // Campo para contraseña
        JPasswordField CampoContrasena = new JPasswordField();
        CampoContrasena.setName("CampoContrasena");
        CampoContrasena.setBorder(null);
        CampoContrasena.setText("Contraseña");
        CampoContrasena.setBackground(Color.WHITE);
        CampoContrasena.setForeground(ColorNoEscrito);
        CampoContrasena.setSize(120, 20);
        CampoContrasena.setLocation((int) TextoContrasena.getLocation().getX() +
                (int) (TextoContrasena.getSize().getWidth() + 10), 
                (int) TextoContrasena.getLocation().getY());
        PanelCentral.add(CampoContrasena);
        
        // Campo para Rol
        JTextField CampoRol = new JTextField();
        CampoRol.setName("CampoRol");
        CampoRol.setBorder(null);
        CampoRol.setText("Rol");
        CampoRol.setBackground(Color.WHITE);
        CampoRol.setForeground(ColorNoEscrito);
        CampoRol.setSize(120, 20);
        CampoRol.setLocation((int) TextoRol.getLocation().getX() +
                (int) (TextoRol.getSize().getWidth() + 10), 
                (int) TextoRol.getLocation().getY());
        PanelCentral.add(CampoRol);
        
        // Campo para Nombre
        JTextField CampoNombre = new JTextField();
        CampoNombre.setName("CampoNombre");
        CampoNombre.setBorder(null);
        CampoNombre.setText("Nombre(s)");
        CampoNombre.setBackground(Color.WHITE);
        CampoNombre.setForeground(ColorNoEscrito);
        CampoNombre.setSize(120, 20);
        CampoNombre.setLocation((int) TextoNombre.getLocation().getX() +
                (int) (TextoNombre.getSize().getWidth() + 10), 
                (int) TextoNombre.getLocation().getY());
        PanelDerecho.add(CampoNombre);
        
        // Campo para Apellido Paterno
        JTextField CampoApellidoPaterno = new JTextField();
        CampoApellidoPaterno.setName("CampoApellidoPaterno");
        CampoApellidoPaterno.setBorder(null);
        CampoApellidoPaterno.setText("Apellido Paterno");
        CampoApellidoPaterno.setBackground(Color.WHITE);
        CampoApellidoPaterno.setForeground(ColorNoEscrito);
        CampoApellidoPaterno.setSize(120, 20);
        CampoApellidoPaterno.setLocation((int) TextoApellidoPaterno.getLocation().getX() +
                (int) (TextoApellidoPaterno.getSize().getWidth() + 10), 
                (int) TextoApellidoPaterno.getLocation().getY());
        PanelDerecho.add(CampoApellidoPaterno);
        
        // Campo para Apellido Materno
        JTextField CampoApellidoMaterno = new JTextField();
        CampoApellidoMaterno.setName("CampoApellidoMaterno");
        CampoApellidoMaterno.setBorder(null);
        CampoApellidoMaterno.setText("Apellido Materno");
        CampoApellidoMaterno.setBackground(Color.WHITE);
        CampoApellidoMaterno.setForeground(ColorNoEscrito);
        CampoApellidoMaterno.setSize(120, 20);
        CampoApellidoMaterno.setLocation((int) TextoApellidoMaterno.getLocation().getX() +
                (int) (TextoApellidoMaterno.getSize().getWidth() + 10), 
                (int) TextoApellidoMaterno.getLocation().getY());
        PanelDerecho.add(CampoApellidoMaterno);
        
        // Campo para Dirección
        JTextField CampoDireccion = new JTextField();
        CampoDireccion.setName("CampoDireccion");
        CampoDireccion.setBorder(null);
        CampoDireccion.setText("Dirección");
        CampoDireccion.setBackground(Color.WHITE);
        CampoDireccion.setForeground(ColorNoEscrito);
        CampoDireccion.setSize(120, 20);
        CampoDireccion.setLocation((int) TextoDireccion.getLocation().getX() +
                (int) (TextoDireccion.getSize().getWidth() + 10), 
                (int) TextoDireccion.getLocation().getY());
        PanelDerecho.add(CampoDireccion);
        
        // Campo para Teléfono
        JTextField CampoTelefono = new JTextField();
        CampoTelefono.setName("CampoTelefono");
        CampoTelefono.setBorder(null);
        CampoTelefono.setText("Teléfono");
        CampoTelefono.setBackground(Color.WHITE);
        CampoTelefono.setForeground(ColorNoEscrito);
        CampoTelefono.setSize(120, 20);
        CampoTelefono.setLocation((int) TextoTelefono.getLocation().getX() +
                (int) (TextoTelefono.getSize().getWidth() + 10), 
                (int) TextoTelefono.getLocation().getY());
        PanelDerecho.add(CampoTelefono);
        
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
        SeparadorUsername.setName("SeparadorUsername");
        SeparadorUsername.setBorder(null);
        SeparadorUsername.setBackground(Color.WHITE);
        SeparadorUsername.setForeground(ColorSeparador);
        SeparadorUsername.setSize(120, 15);
        SeparadorUsername.setLocation((int) CampoUsername.getLocation().getX(), 
                (int) CampoUsername.getLocation().getY() + 20);
        PanelCentral.add(SeparadorUsername);
        
        // Separador para CampoContrasena
        JSeparator SeparadorContrasena = new JSeparator();
        SeparadorContrasena.setName("SeparadorContrasena");
        SeparadorContrasena.setBorder(null);
        SeparadorContrasena.setBackground(Color.WHITE);
        SeparadorContrasena.setForeground(ColorSeparador);
        SeparadorContrasena.setSize(120, 15);
        SeparadorContrasena.setLocation((int) CampoContrasena.getLocation().getX(), 
                (int) CampoContrasena.getLocation().getY() + 20);
        PanelCentral.add(SeparadorContrasena);
        
        // Separador para CampoRol
        JSeparator SeparadorRol = new JSeparator();
        SeparadorRol.setName("SeparadorRol");
        SeparadorRol.setBorder(null);
        SeparadorRol.setBackground(Color.WHITE);
        SeparadorRol.setForeground(ColorSeparador);
        SeparadorRol.setSize(120, 15);
        SeparadorRol.setLocation((int) CampoRol.getLocation().getX(), 
                (int) CampoRol.getLocation().getY() + 20);
        PanelCentral.add(SeparadorRol);
        
        // Separador para CampoNombre
        JSeparator SeparadorNombre = new JSeparator();
        SeparadorNombre.setName("SeparadorNombre");
        SeparadorNombre.setBorder(null);
        SeparadorNombre.setBackground(Color.WHITE);
        SeparadorNombre.setForeground(ColorSeparador);
        SeparadorNombre.setSize(120, 15);
        SeparadorNombre.setLocation((int) CampoNombre.getLocation().getX(), 
                (int) CampoNombre.getLocation().getY() + 20);
        PanelDerecho.add(SeparadorNombre);
        
        // Separador para CampoApellidoPaterno
        JSeparator SeparadorApellidoPaterno = new JSeparator();
        SeparadorApellidoPaterno.setName("SeparadorApellidoPaterno");
        SeparadorApellidoPaterno.setBorder(null);
        SeparadorApellidoPaterno.setBackground(Color.WHITE);
        SeparadorApellidoPaterno.setForeground(ColorSeparador);
        SeparadorApellidoPaterno.setSize(120, 15);
        SeparadorApellidoPaterno.setLocation((int) CampoApellidoPaterno.getLocation().getX(), 
                (int) CampoApellidoPaterno.getLocation().getY() + 20);
        PanelDerecho.add(SeparadorApellidoPaterno);
        
        // Separador para CampoApellidoMaterno
        JSeparator SeparadorApellidoMaterno = new JSeparator();
        SeparadorApellidoMaterno.setName("SeparadorApellidoMaterno");
        SeparadorApellidoMaterno.setBorder(null);
        SeparadorApellidoMaterno.setBackground(Color.WHITE);
        SeparadorApellidoMaterno.setForeground(ColorSeparador);
        SeparadorApellidoMaterno.setSize(120, 15);
        SeparadorApellidoMaterno.setLocation((int) CampoApellidoMaterno.getLocation().getX(), 
                (int) CampoApellidoMaterno.getLocation().getY() + 20);
        PanelDerecho.add(SeparadorApellidoMaterno);
        
        // Separador para CampoDireccion
        JSeparator SeparadorDireccion = new JSeparator();
        SeparadorDireccion.setName("SeparadorDireccion");
        SeparadorDireccion.setBorder(null);
        SeparadorDireccion.setBackground(Color.WHITE);
        SeparadorDireccion.setForeground(ColorSeparador);
        SeparadorDireccion.setSize(120, 15);
        SeparadorDireccion.setLocation((int) CampoDireccion.getLocation().getX(), 
                (int) CampoDireccion.getLocation().getY() + 20);
        PanelDerecho.add(SeparadorDireccion);
        
        // Separador para CampoTelefono
        JSeparator SeparadorTelefono = new JSeparator();
        SeparadorTelefono.setName("SeparadorTelefono");
        SeparadorTelefono.setBorder(null);
        SeparadorTelefono.setBackground(Color.WHITE);
        SeparadorTelefono.setForeground(ColorSeparador);
        SeparadorTelefono.setSize(120, 15);
        SeparadorTelefono.setLocation((int) CampoTelefono.getLocation().getX(), 
                (int) CampoTelefono.getLocation().getY() + 20);
        PanelDerecho.add(SeparadorTelefono);
        
        // |---------------------Funciones de botones--------------------------|
        // Boton para Reestablecer campos
        BotonReestablecer.addActionListener(new ActionListener(){
            // Override de listener para cuando se hace click
            @Override
            public void actionPerformed(ActionEvent e)
            {
                CampoID.setText("ID");
                CampoID.setForeground(ColorNoEscrito);
                CampoUsername.setText("Nombre de Usuario");
                CampoUsername.setForeground(ColorNoEscrito);
                CampoContrasena.setText("Contraseña");
                CampoContrasena.setForeground(ColorNoEscrito);
                CampoRol.setText("Rol");
                CampoRol.setForeground(ColorNoEscrito);
                CampoNombre.setText("Nombre(s)");
                CampoNombre.setForeground(ColorNoEscrito);
                CampoApellidoPaterno.setText("Apellido Paterno");
                CampoApellidoPaterno.setForeground(ColorNoEscrito);
                CampoApellidoMaterno.setText("Apellido Materno");
                CampoApellidoMaterno.setForeground(ColorNoEscrito);
                CampoDireccion.setText("Dirección");
                CampoDireccion.setForeground(ColorNoEscrito);
                CampoTelefono.setText("Teléfono");
                CampoTelefono.setForeground(ColorNoEscrito);
            }
        });
        
        // Añadir listener para acción en BotonAnadir
        Botones[0].addActionListener(new ActionListener() {
                // Override de listener para cuando se hace click
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    Usuario UsuarioTemp;
                    String ID, IDAAsignar, Username, Contrasena, Rol, Nombre, AP, AM,
                            Direccion, Telefono;
                    Boolean Registrable;
                    IDAAsignar = "-1";
                    Registrable = true;
                    UsuarioTemp = new Usuario();
                    // Obtenemos valores de campos
                    ID = CampoID.getText();
                    Username = CampoUsername.getText();
                    Contrasena = String.valueOf(CampoContrasena.getPassword());
                    Rol = CampoRol.getText();
                    Nombre = CampoNombre.getText();
                    AP = CampoApellidoPaterno.getText();
                    AM = CampoApellidoMaterno.getText();
                    Direccion = CampoDireccion.getText();
                    Telefono = CampoTelefono.getText();
                   
                    if(Username.equals("Nombre de Usuario") ||
                            Username.equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
                    }
                    else
                    {
                        if(Contrasena.equals("Contraseña") ||
                                Contrasena.equals(""))
                        {
                            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
                        }
                        else
                        {
                            if(Rol.equals("Rol") || Rol.equals(""))
                            {
                                JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
                            }
                            else
                            {
                                if(Nombre.equals("Nombre(s)") ||
                                        Nombre.equals(""))
                                {
                                    JOptionPane.showMessageDialog(null, 
                                            "Faltan campos por llenar");
                                }
                                else
                                {
                                    if(AP.equals("Apellido Paterno") ||
                                            AP.equals(""))
                                    {
                                        JOptionPane.showMessageDialog(null, 
                                                "Faltan campos por llenar");
                                    }
                                    else
                                    {
                                        if(AM.equals("Apellido Materno") ||
                                                AM.equals(""))
                                        {
                                            JOptionPane.showMessageDialog(null, 
                                                    "Faltan campos por llenar");
                                        }
                                        else
                                        {
                                            if(Direccion.equals("Dirección") ||
                                                    Direccion.equals(""))
                                            {
                                                JOptionPane.showMessageDialog(null, 
                                                        "Faltan campos por llenar");
                                            }
                                            else
                                            {
                                                if(Telefono.equals("Teléfono") ||
                                                        Telefono.equals(""))
                                                {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Faltan campo por llenar");
                                                }
                                                else
                                                {
                                                    if(ID.equals("ID") ||
                                                                    ID.equals(""))
                                                    {
                                                        int x, Mayor;
                                                        Mayor = 0;
                                                        for(x = 0; x < RegistrosVentana.getTamanoUsuarios(); x++)
                                                        {
                                                            if(Mayor < Integer.parseInt(RegistrosVentana.getUsuario(x).getID()))
                                                            {
                                                                Mayor = Integer.parseInt(RegistrosVentana.getUsuario(x).getID());
                                                            }
                                                            if(Username.equals(RegistrosVentana.getUsuario(x).getUsername()))
                                                            {
                                                                Registrable = false;
                                                            }
                                                        }
                                                        IDAAsignar = String.valueOf(Mayor + 1);
                                                    }
                                                    else
                                                    {
                                                        int x;
                                                        for(x = 0; x < RegistrosVentana.getTamanoUsuarios(); x++)
                                                        {
                                                            if(ID.equals(RegistrosVentana.getUsuario(x).getID()))
                                                            {
                                                                JOptionPane.showMessageDialog(null, 
                                                                        "El ID " + ID +" ya está registrado");
                                                                Registrable = false;
                                                            }
                                                            else
                                                            {
                                                                if(Username.equals(RegistrosVentana.getUsuario(x).getUsername()))
                                                                {
                                                                   JOptionPane.showMessageDialog(null, 
                                                                            "El nombre de usuario " +
                                                                            Username + " ya está registrado");
                                                                    Registrable = false;
                                                                }
                                                            }
                                                        }
                                                        if(Registrable)
                                                        {
                                                            IDAAsignar = ID;
                                                        }
                                                    }
                                                    if(Registrable)
                                                    {
                                                        UsuarioTemp.setID(IDAAsignar);
                                                        UsuarioTemp.setUsername(Username);
                                                        UsuarioTemp.setContrasena(Hashing.Hash(Contrasena));
                                                        if(Rol.equals("Admin"))
                                                        {
                                                            UsuarioTemp.setRol("Admin");
                                                        }
                                                        else
                                                        {
                                                            UsuarioTemp.setRol("Usuario");
                                                        }
                                                        UsuarioTemp.setNombre(Nombre);
                                                        UsuarioTemp.setApellidoPaterno(AP);
                                                        UsuarioTemp.setApellidoMaterno(AM);
                                                        UsuarioTemp.setDireccion(Direccion);
                                                        UsuarioTemp.setTelefono(Telefono);
                                                        RegistrosVentana.InsertarUsuarios(UsuarioTemp);
                                                        CampoID.setText("ID");
                                                        CampoID.setForeground(ColorNoEscrito);
                                                        CampoUsername.setText("Nombre de Usuario");
                                                        CampoUsername.setForeground(ColorNoEscrito);
                                                        CampoContrasena.setText("Contraseña");
                                                        CampoContrasena.setForeground(ColorNoEscrito);
                                                        CampoRol.setText("Rol");
                                                        CampoRol.setForeground(ColorNoEscrito);
                                                        CampoNombre.setText("Nombre(s)");
                                                        CampoNombre.setForeground(ColorNoEscrito);
                                                        CampoApellidoPaterno.setText("Apellido Paterno");
                                                        CampoApellidoPaterno.setForeground(ColorNoEscrito);
                                                        CampoApellidoMaterno.setText("Apellido Materno");
                                                        CampoApellidoMaterno.setForeground(ColorNoEscrito);
                                                        CampoDireccion.setText("Dirección");
                                                        CampoDireccion.setForeground(ColorNoEscrito);
                                                        CampoTelefono.setText("Teléfono");
                                                        CampoTelefono.setForeground(ColorNoEscrito);
                                                        JOptionPane.showMessageDialog(null, "Se ha registrado " +
                                                                Username + " con éxito");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    
                };
            });
        
        // Añadir listener para acción en eliminar
        Botones[1].addActionListener(new ActionListener() {
                // Override de listener para cuando se hace click
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    Usuario UsuarioTemp;
                    String ID, Username;
                    Boolean Eliminable;
                    int Eliminar;
                    Eliminar = -1;
                    Eliminable = false;
                    UsuarioTemp = new Usuario();
                    // Obtenemos valores de campos
                    ID = CampoID.getText();
                    Username = CampoUsername.getText();
                   
                    
                    if((Username.equals("Nombre de Usuario") || Username.equals("")) &&
                            (ID.equals("ID") || ID.equals("")))
                    {
                        JOptionPane.showMessageDialog(null, "Indique el ID o nombre de usuario");
                    }
                    else
                    {
                        int x;
                        for(x = 0; x < RegistrosVentana.getTamanoUsuarios(); x++)
                        {
                            if(ID.equals(RegistrosVentana.getUsuario(x).getID()) ||
                                    Username.equals(RegistrosVentana.getUsuario(x).getUsername()))
                            {
                                Eliminable = true;
                                Eliminar = x;
                            }
                        }
                        if(Eliminable)
                        {
                            CampoID.setText("ID");
                            CampoID.setForeground(ColorNoEscrito);
                            CampoUsername.setText("Nombre de Usuario");
                            CampoUsername.setForeground(ColorNoEscrito);
                            CampoContrasena.setText("Contraseña");
                            CampoContrasena.setForeground(ColorNoEscrito);
                            CampoRol.setText("Rol");
                            CampoRol.setForeground(ColorNoEscrito);
                            CampoNombre.setText("Nombre(s)");
                            CampoNombre.setForeground(ColorNoEscrito);
                            CampoApellidoPaterno.setText("Apellido Paterno");
                            CampoApellidoPaterno.setForeground(ColorNoEscrito);
                            CampoApellidoMaterno.setText("Apellido Materno");
                            CampoApellidoMaterno.setForeground(ColorNoEscrito);
                            CampoDireccion.setText("Dirección");
                            CampoDireccion.setForeground(ColorNoEscrito);
                            CampoTelefono.setText("Teléfono");
                            CampoTelefono.setForeground(ColorNoEscrito);
                            if(Eliminar != -1)
                            {
                                int Respuesta;
                                UsuarioTemp = RegistrosVentana.getUsuario(Eliminar);
                                Respuesta = JOptionPane.showConfirmDialog(null, 
                                        "¿Seguro que desea eliminar al usuario " +
                                        UsuarioTemp.getUsername());
                                if(Respuesta == 0)
                                {
                                    RegistrosVentana.EliminarUsuarios(UsuarioTemp);
                                    JOptionPane.showMessageDialog(null, "Se ha eliminado " +
                                        UsuarioTemp.getUsername() + " con éxito");
                                }
                            }
                        }
                        else
                        {
                            if(!Username.equals("Nombre de Usuario") &&
                                    !Username.equals(""))
                            {
                                JOptionPane.showMessageDialog(null, "No se encontró el usuario " +
                                        Username);
                            }
                            else
                            {
                                if(!ID.equals("ID") &&
                                    !ID.equals(""))
                                {
                                    JOptionPane.showMessageDialog(null, "No se encontró el usuario con ID " +
                                            ID);
                                }
                            }
                        }
                    }
                }
        });
        
        // Añadir listener para acción en editar
        Botones[2].addActionListener(new ActionListener() {
                // Override de listener para cuando se hace click
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    System.out.println("");
                }
        });
        
        // Añadir listener para acción en guardar
        Botones[3].addActionListener(new ActionListener() {
                // Override de listener para cuando se hace click
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    RegistroCRUD RegistroGuardar = new RegistroCRUD();
                    RegistroGuardar.Guardar(RegistrosVentana);
                    JOptionPane.showMessageDialog(null, "Se han guardado los registros con éxito");
                }
        });
        
        // Añadir listener para acción en buscar
        Botones[4].addActionListener(new ActionListener() {
                // Override de listener para cuando se hace click
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    String Buscar;
                    Usuario UsuarioTemp;
                    UsuarioTemp = new Usuario();
                    Boolean Encontrado;
                    Color ColorEscribir = new Color(51, 51, 51);
                    Encontrado = false;
                    int BuscarPor, x, Indice;
                    Indice = -1;
                    Buscar = CampoBuscar.getText();
                    //if()
                    BuscarPor = ComboBuscar.getSelectedIndex();
                    if(Buscar.equals("Buscar Usuario") || Buscar.equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "No se ha indicado que valor buscar");
                    }
                    else
                    {
                        switch(BuscarPor)
                        {
                            case 0 :
                            {
                                for(x = 0; x < RegistrosVentana.getTamanoUsuarios(); x++)
                                {
                                    if(Buscar.equals(RegistrosVentana.getUsuario(x).getID()))
                                    {
                                        Encontrado = true;
                                        Indice = x;
                                    }
                                }
                                break;
                            }
                            
                            case 1 :
                            {
                                for(x = 0; x < RegistrosVentana.getTamanoUsuarios(); x++)
                                {
                                    if(Buscar.equals(RegistrosVentana.getUsuario(x).getUsername()))
                                    {
                                        Encontrado = true;
                                        Indice = x;
                                    }
                                }
                                break;
                            }
                            
                            case 2 :
                            {
                                for(x = 0; x < RegistrosVentana.getTamanoUsuarios(); x++)
                                {
                                    if(Buscar.equals(RegistrosVentana.getUsuario(x).getNombre()))
                                    {
                                        Encontrado = true;
                                        Indice = x;
                                    }
                                }
                                break;
                            }
                            
                            case 3 :
                            {
                                for(x = 0; x < RegistrosVentana.getTamanoUsuarios(); x++)
                                {
                                    if(Buscar.equals(RegistrosVentana.getUsuario(x).getApellidoPaterno()))
                                    {
                                        Encontrado = true;
                                        Indice = x;
                                    }
                                }
                                break;
                            }
                            
                            case 4 :
                            {
                                for(x = 0; x < RegistrosVentana.getTamanoUsuarios(); x++)
                                {
                                    if(Buscar.equals(RegistrosVentana.getUsuario(x).getApellidoMaterno()))
                                    {
                                        Encontrado = true;
                                        Indice = x;
                                    }
                                }
                                break;
                            }
                        }
                        if(Encontrado && Indice > -1)
                        {
                            UsuarioTemp = RegistrosVentana.getUsuario(Indice);
                            CampoID.setText(UsuarioTemp.getID());
                            CampoID.setForeground(ColorEscribir);
                            CampoUsername.setText(UsuarioTemp.getUsername());
                            CampoUsername.setForeground(ColorEscribir);
                            CampoContrasena.setText(UsuarioTemp.getContrasena());
                            CampoContrasena.setForeground(ColorEscribir);
                            CampoRol.setText(UsuarioTemp.getRol());
                            CampoRol.setForeground(ColorEscribir);
                            CampoNombre.setText(UsuarioTemp.getNombre());
                            CampoNombre.setForeground(ColorEscribir);
                            CampoApellidoPaterno.setText(UsuarioTemp.getApellidoPaterno());
                            CampoApellidoPaterno.setForeground(ColorEscribir);
                            CampoApellidoMaterno.setText(UsuarioTemp.getApellidoMaterno());
                            CampoApellidoMaterno.setForeground(ColorEscribir);
                            CampoDireccion.setText(UsuarioTemp.getDireccion());
                            CampoDireccion.setForeground(ColorEscribir);
                            CampoTelefono.setText(UsuarioTemp.getTelefono());
                            CampoTelefono.setForeground(ColorEscribir);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "No se encontró ningún usuario con el valor " +
                                    Buscar);
                        }
                    }
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
                System.out.println("Mouse liberado de CampoID");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoID");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoID");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoID");
            }

        });
        
        // |------------------------CampoUsername------------------------------|
        // Se añade listener para enfoque de CampoUsername
        CampoUsername.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoUsername.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("Nombre de Usuario") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoUsername.setText("");
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
                String Contenido = CampoUsername.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("Nombre de Usuario"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoUsername.setText("Nombre de Usuario");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoUsername
        CampoUsername.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = CampoUsername.getText();
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("Nombre de Usuario"))
                {
                    // Elimina contenido
                    CampoUsername.setText("");
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
                System.out.println("Mouse liberado de CampoUsername");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoUsername");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoUsername");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoUsername");
            }

        });
        
        // |------------------------CampoContrasena----------------------------|
        // Se añade listener para enfoque de CampoContrasena
        CampoContrasena.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = String.valueOf(CampoContrasena.getPassword());
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("Contraseña") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoContrasena.setText("");
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
                String Contenido = String.valueOf(CampoContrasena.getPassword());
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("Contraseña"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoContrasena.setText("Contraseña");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoContrasena
        CampoContrasena.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = String.valueOf(CampoContrasena.getPassword());
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("Contraseña"))
                {
                    // Elimina contenido
                    CampoContrasena.setText("");
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
                System.out.println("Mouse liberado de CampoContrasena");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoContrasena");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoContrasena");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoContrasena");
            }

        });
        
        // |------------------------CampoRol-----------------------------------|
        // Se añade listener para enfoque de CampoRol
        CampoRol.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoRol.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("Rol") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoRol.setText("");
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
                String Contenido = CampoRol.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("Rol"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoRol.setText("Rol");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoRol
        CampoRol.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = CampoRol.getText();
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("Rol"))
                {
                    // Elimina contenido
                    CampoRol.setText("");
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
                System.out.println("Mouse liberado de CampoRol");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoRol");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoRol");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoRol");
            }

        });
        
        // |------------------------CampoNombre--------------------------------|
        // Se añade listener para enfoque de CampoNombre
        CampoNombre.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoNombre.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("Nombre(s)") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoNombre.setText("");
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
                String Contenido = CampoNombre.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("Nombre(s)"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoNombre.setText("Nombre(s)");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoNombre
        CampoNombre.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = CampoNombre.getText();
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("Nombre(s)"))
                {
                    // Elimina contenido
                    CampoNombre.setText("");
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
                System.out.println("Mouse liberado de CampoNombre");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoNombre");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoNombre");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoNombre");
            }

        });
        
        // |------------------CampoApellidoPaterno-----------------------------|
        // Se añade listener para enfoque de CampoApellidoPaterno
        CampoApellidoPaterno.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoApellidoPaterno.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("Apellido Paterno") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoApellidoPaterno.setText("");
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
                String Contenido = CampoApellidoPaterno.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("Apellido Paterno"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoApellidoPaterno.setText("Apellido Paterno");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoApellidoPaterno
        CampoApellidoPaterno.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = CampoApellidoPaterno.getText();
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("Apellido Paterno"))
                {
                    // Elimina contenido
                    CampoApellidoPaterno.setText("");
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
                System.out.println("Mouse liberado de CampoApellidoPaterno");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoApellidoPaterno");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoApellidoPaterno");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoApellidoPaterno");
            }

        });
        
        // |------------------CampoApellidoMaterno-----------------------------|
        // Se añade listener para enfoque de CampoApellidoMaterno
        CampoApellidoMaterno.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoApellidoMaterno.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("Apellido Materno") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoApellidoMaterno.setText("");
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
                String Contenido = CampoApellidoMaterno.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("Apellido Materno"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoApellidoMaterno.setText("Apellido Materno");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoApellidoMaterno
        CampoApellidoMaterno.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = CampoApellidoMaterno.getText();
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("Apellido Materno"))
                {
                    // Elimina contenido
                    CampoApellidoMaterno.setText("");
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
                System.out.println("Mouse liberado de CampoApellidoMaterno");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoApellidoMaterno");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoApellidoMaterno");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoApellidoMaterno");
            }

        });
        
        // |------------------------CampoDireccion-----------------------------|
        // Se añade listener para enfoque de CampoDireccion
        CampoDireccion.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoDireccion.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("Dirección") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoDireccion.setText("");
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
                String Contenido = CampoDireccion.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("Dirección"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoDireccion.setText("Dirección");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoDireccion
        CampoDireccion.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = CampoDireccion.getText();
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("Dirección"))
                {
                    // Elimina contenido
                    CampoDireccion.setText("");
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
                System.out.println("Mouse liberado de CampoDireccion");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoDireccion");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoDireccion");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoDireccion");
            }

        });
        
        // |------------------------CampoTelefono------------------------------|
        // Se añade listener para enfoque de CampoTelefono
        CampoTelefono.addFocusListener(new FocusListener(){
            // Override para cuando se enfoca
            @Override
            public void focusGained(FocusEvent e)
            {
                // Obtiene contenido de campo
                String Contenido = CampoTelefono.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(Contenido.equals("Teléfono") && 
                        (ColorActual == ColorNoEscrito))
                {
                    // Limpiamos contenido
                    CampoTelefono.setText("");
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
                String Contenido = CampoTelefono.getText();
                // Obtiene color de campo
                Color ColorActual = e.getComponent().getForeground();
                // Color cuando no se ha escrito nada
                Color ColorNoEscrito = new Color(102, 102, 102);
                // Color cuando se va a escribir algo
                Color ColorEscribir = new Color(51, 51, 51);
                // Verifica contenido y color de campo son los predeterminados
                if(!Contenido.equals("Teléfono"))
                {  
                    if(Contenido.equals(""))
                    {
                        CampoTelefono.setText("Teléfono");
                        if(ColorActual != ColorNoEscrito)
                        {
                            e.getComponent().setForeground(ColorNoEscrito);
                        }
                    }
                }
            }
        });
        
        // Listener para mouse en CampoTelefono
        CampoTelefono.addMouseListener(new MouseListener(){
            // Override para cuando se presiona
            @Override
            public void mousePressed(MouseEvent e) 
            {
                // Obtener contenido
                String Contenido = CampoTelefono.getText();
                Color ColorActual = e.getComponent().getForeground();
                Color ColorEscrito = new Color(51, 51, 51);
                // Verifica si no tiene nada seteado aún
                if(Contenido.equals("Teléfono"))
                {
                    // Elimina contenido
                    CampoTelefono.setText("");
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
                System.out.println("Mouse liberado de CampoTelefono");
            }

            // Override para cuando se coloca sobre
            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse ha ingresado en CampoTelefono");
            }

            // Override para cuando el mouse deja de estar sobre
            @Override
            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse ha salido de CampoTelefono");
            }

            // Override para cuando se hace click
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Se ha hecho click en CampoTelefono");
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

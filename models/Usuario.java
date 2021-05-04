/*******************************************************************************
 *                                                                             *
 * Práctica 5 - Login                                                          *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: CARS(Car Automated Repair System)                                 *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210313_build_0)                             *
 * Nombre de Archivo: Usuario.java                                             *
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
package models;

// Parámetros que indican autor(es) de programa
/**
 * @author Valle Guerra, Victor Leonardo 
 */
// Clase principal de Archivo
public class Usuario 
{
    // |------------------------Atributos privados-----------------------------|
    private String ID;
    private String Username;
    private String Contrasena;
    private String Rol;
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String Correo;
    private String Direccion;
    private String Telefono;
    
    // |------------------------Métodos privados-------------------------------|
    
    // |------------------------Atributos públicos-----------------------------|
        
    // |------------------------Métodos públicos-------------------------------|
    
    // Constructor de clase
    public Usuario()
    {
        ID = "0";
        Username = "john.doe";
        Contrasena = "john.doe";
        Rol = "Usuario";
        Nombre = "John";
        ApellidoPaterno = "Doe";
        ApellidoMaterno = "Doe";
        Correo = "ejemplo@correo.com";
        Direccion = "Blvd. Gral. Marcelino García Barragán 1421, Olímpica," + 
        "44430 Guadalajara, Jal.";
        Telefono = "+52 (33)33-33-33";
    }
    
    // Constructor copia de clase
    public Usuario(Usuario UsuarioACopiar)
    {
        ID = UsuarioACopiar.ID;
        Username = UsuarioACopiar.Username;
        Contrasena = UsuarioACopiar.Contrasena;
        Rol = UsuarioACopiar.Rol;
        Nombre = UsuarioACopiar.Nombre;
        ApellidoPaterno = UsuarioACopiar.ApellidoPaterno;
        ApellidoMaterno = UsuarioACopiar.ApellidoMaterno;
        Correo = UsuarioACopiar.Correo;
        Direccion = UsuarioACopiar.Direccion;
        Telefono = UsuarioACopiar.Telefono;
    }
    
    // |-----------------------------Getters-----------------------------------|
    // Getter para atributo ID
    public String getID()
    {
        return ID;
    }
    
    // Getter para atributo Username
    public String getUsername()
    {
        return Username;
    }
    
    // Getter para atributo Contrasena
    public String getContrasena()
    {
        return Contrasena;
    }
    
    // Getter para atributo Rol
    public String getRol()
    {
        return Rol;
    }
    
    // Getter para atributo Nombre
    public String getNombre()
    {
        return Nombre;
    }
    
    // Getter para atributo ApellidoPaterno
    public String getApellidoPaterno()
    {
        return ApellidoPaterno;
    }
    
    // Getter para atributo ApellidoMaterno
    public String getApellidoMaterno()
    {
        return ApellidoMaterno;
    }
    
    // Getter para obtener nombre completo
    public String getNombreCompleto()
    {
        return Nombre + " " + ApellidoPaterno + " " + ApellidoMaterno;
    }
    
    // Getter para atributo Correo
    public String getCorreo()
    {
        return Correo;
    }
    
    // Getter para atributo Direccion
    public String getDireccion()
    {
        return Direccion;
    }
    
    // Getter para atributo Telefono
    public String getTelefono()
    {
        return Telefono;
    }
    
    // |-----------------------------Setters-----------------------------------|
    // Setter para atributo ID
    public void setID(String IDAAsignar)
    {
        ID = IDAAsignar;
    }
    
    // Setter para atributo Username
    public void setUsername(String UsernameAAsignar)
    {
        Username = UsernameAAsignar;
    }
    
    // Setter para atributo Contrasena
    public void setContrasena(String ContrasenaAAsignar)
    {
        Contrasena = ContrasenaAAsignar;
    }
    
    // Setter para atributo Rol
    public void setRol(String RolAAsignar)
    {
        Rol = RolAAsignar;
    }
    
    // Setter para atributo Nombre
    public void setNombre(String NombreAAsignar)
    {
        Nombre = NombreAAsignar;
    }
    
    // Setter para atributo ApellidoPaterno
    public void setApellidoPaterno(String ApellidoPaternoAAsignar)
    {
        ApellidoPaterno = ApellidoPaternoAAsignar;
    }
    
    // Setter para atributo ApellidoMaterno
    public void setApellidoMaterno(String ApellidoMaternoAAsignar)
    {
        ApellidoMaterno = ApellidoMaternoAAsignar;
    }
    
    // Setter para atributo Correo
    public void setCorreo(String CorreoAAsignar)
    {
        Correo = CorreoAAsignar;
    }
    
    // Setter para atributo Direccion
    public void setDireccion(String DireccionAAsignar)
    {
        Direccion = DireccionAAsignar;
    }
    
    // Setter para atributo Telefono
    public void setTelefono(String TelefonoAAsignar)
    {
        Telefono = TelefonoAAsignar;
    }
}

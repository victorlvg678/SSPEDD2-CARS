/*******************************************************************************
 *                                                                             *
 * Práctica 5 - Login                                                          *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: CARS(Car Automated Repair System)                                 *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210313_build_0)                             *
 * Nombre de Archivo: RegistroCRUD.java                                        *
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
package controllers;
// Archivos a importar para usar dentro de clase
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import models.Cliente;
import models.Pieza;
import models.Reparacion;
import models.Usuario;
import models.Vehiculo;
import models.Registro;
import views.Menu;

// Parámetros que indican autor(es) de programa
/**
 * @author Valle Guerra, Victor Leonardo 
 */

// Clase principal de Archivo
public class RegistroCRUD 
{
    // Atributos privados
    private String RegistroTemp;
    private String URLTemp;
    // |------------------------Métodos públicos-------------------------------|
    
    // Constructor de clase
    public RegistroCRUD()
    {
        RegistroTemp = System.getenv("USERPROFILE") + 
                "\\AppData\\Local\\Temp\\RegistroTemp.json";
        URLTemp = "https://raw.githubusercontent.com/victorlvg678/SSPEDD2-CARS/master/RegistroTemp.json";
    }
    
    // Constructor copia de clase
    public RegistroCRUD(RegistroCRUD RegistroCRUDOriginal)
    {
        RegistroTemp = RegistroCRUDOriginal.RegistroTemp;
        URLTemp = RegistroCRUDOriginal.URLTemp;
    }
    
    // |---------------------------Setters-------------------------------------|
    // Setter para atributo RegistroTemp
    public void setRegistroTemp(String RegistroTempAAsignar)
    {
        RegistroTemp = RegistroTempAAsignar;
    }
    
    // Setter para atributo URL
    public void setURL(String URLAAsignar)
    {
        URLTemp = URLAAsignar;
    }
    
    // |---------------------------Getters-------------------------------------|
    // Getter para atributo RegistroTemp
    public String getRegistroTemp()
    {
        return RegistroTemp;
    }
    
    // Getter para atributo URL
    public String getURL()
    {
        return URLTemp;
    }
    
    // |--------------------------Guardar---------------------------------------|
    // Método para añadir usuario a archivo temporal
    public void Guardar(Registro RegistroAGuardar)
    {
        // Intenta el siguiente bloque de instrucciones
        try{
            // Para recorrer registros
            int x;
            File ArchivoTemporal = new File(RegistroTemp);
            if(ArchivoTemporal.exists())
            {
                if(ArchivoTemporal.delete())
                {
                    System.out.println("Se ha eliminado " + ArchivoTemporal.getName());
                }
                else
                {
                    System.out.println("Ocurrió un problema al intentar eliminar " + 
                            ArchivoTemporal.getName());
                }
                if(ArchivoTemporal.createNewFile())
                {
                    System.out.println("Se ha creado " + ArchivoTemporal.getName());
                }
                else
                {
                    System.out.println("Ocurrió un problema al intenetar crear " + 
                            ArchivoTemporal.getName());
                }
            }
            else
            {
                if(ArchivoTemporal.createNewFile())
                {
                    System.out.println("Se ha creado " + ArchivoTemporal.getName());
                }
                else
                {
                    System.out.println("Ocurrió un problema al intenetar crear " + 
                            ArchivoTemporal.getName());
                }
            }
            // Creamos un outputstream para el archivo
            FileOutputStream FOS = new FileOutputStream(RegistroTemp, true);
            // Creamos un escritor para el outputstream en UTF-8
            OutputStreamWriter OSW = new OutputStreamWriter(FOS, StandardCharsets.UTF_8);
            // Creamos un buffer para el escritor
            BufferedWriter Writer = new BufferedWriter(OSW);
            Writer.append("{");
            Writer.newLine();
            Writer.append("\t\"Usuarios\":{");
            Writer.newLine();
            if(RegistroAGuardar.getTamanoUsuarios() > 0)
            {
                for(x = 0; x < RegistroAGuardar.getTamanoUsuarios(); x++)
                {
                    Writer.append("\t\t\"" + String.valueOf(x) + "\":{");
                    Writer.newLine();
                    Writer.append("\t\t\t\"IDUsuario\":\"" + 
                            RegistroAGuardar.getUsuario(x).getID() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Username\":\"" + 
                            RegistroAGuardar.getUsuario(x).getUsername() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Contraseña\":\"" + 
                            RegistroAGuardar.getUsuario(x).getContrasena() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Rol\":\"" + 
                            RegistroAGuardar.getUsuario(x).getRol() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Nombre\":\"" + 
                            RegistroAGuardar.getUsuario(x).getNombre() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Apellido Paterno\":\"" + 
                            RegistroAGuardar.getUsuario(x).getApellidoPaterno() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Apellido Materno\":\"" + 
                            RegistroAGuardar.getUsuario(x).getApellidoMaterno() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Dirección\":\"" + 
                            RegistroAGuardar.getUsuario(x).getDireccion() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Teléfono\":" + 
                            RegistroAGuardar.getUsuario(x).getTelefono() + "\"");
                    Writer.newLine();
                    if(x < RegistroAGuardar.getTamanoUsuarios() - 1)
                    {
                        Writer.append("\t\t},");
                        Writer.newLine();
                    }
                    else
                    {
                        Writer.append("\t\t}");
                        Writer.newLine();
                    }
                }
            }
            else
            {
                Writer.append("\t\t\"0\":{");
                Writer.newLine();
                Writer.append("\t\t\t\"IDUsuario\":\"\",");
                Writer.newLine();
                Writer.append("\t\t\t\"Username\":\"\",");
                Writer.newLine();
                Writer.append("\t\t\t\"Contraseña\":\"\",");
                Writer.newLine();
                Writer.append("\t\t\t\"Rol\":\"\",");
                Writer.newLine();
                Writer.append("\t\t\t\"Nombre\":\"\",");
                Writer.newLine();
                Writer.append("\t\t\t\"Apellido Paterno\":\"\",");
                Writer.newLine();
                Writer.append("\t\t\t\"Apellido Materno\":\"\",");
                Writer.newLine();
                Writer.append("\t\t\t\"Dirección\":\"\",");
                Writer.newLine();
                Writer.append("\t\t\t\"Teléfono\":\"\"");
                Writer.newLine();
                Writer.append("\t\t}");
                Writer.newLine();
            }
            Writer.append("\t},");
            Writer.newLine();
            Writer.append("\t\"Clientes\":{");
            Writer.newLine();
            if(RegistroAGuardar.getTamanoClientes() > 0)
            {
                for(x = 0; x < RegistroAGuardar.getTamanoClientes(); x++)
                {
                    Writer.append("\t\t\"" + String.valueOf(x) + "\":{");
                    Writer.newLine();
                    Writer.append("\t\t\t\"IDCliente\":\"" + 
                            RegistroAGuardar.getCliente(x).getID() + "\",");
                    Writer.newLine();
                    
                    Writer.append("\t\t\t\"Nombre\":\"" + 
                            RegistroAGuardar.getCliente(x).getNombre() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Apellido Paterno\":\"" + 
                            RegistroAGuardar.getCliente(x).getApellidoPaterno() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Apellido Materno\":\"" + 
                            RegistroAGuardar.getCliente(x).getApellidoMaterno() + "\"");
                    Writer.newLine();
                    if(x < RegistroAGuardar.getTamanoClientes() - 1)
                    {
                        Writer.append("\t\t},");
                        Writer.newLine();
                    }
                    else
                    {
                        Writer.append("\t\t}");
                        Writer.newLine();
                    }
                }
            }
            else
            {
                Writer.append("\t\t\"0\":{");
                Writer.newLine();
                Writer.append("\t\t\t\"IDCliente\":\"\",");
                Writer.newLine();
                Writer.append("\t\t\t\"Nombre\":\"\",");
                Writer.newLine();
                Writer.append("\t\t\t\"Apellido Paterno\":\"\",");
                Writer.newLine();
                Writer.append("\t\t\t\"Apellido Materno\":\"\"");
                Writer.newLine();
                Writer.append("\t\t}");
                Writer.newLine();
            }
            Writer.append("\t},");
            Writer.newLine();
            Writer.append("\t\"Vehículos\":{");
            Writer.newLine();
            if(RegistroAGuardar.getTamanoVehiculos() > 0)
            {
                for(x = 0; x < RegistroAGuardar.getTamanoVehiculos(); x++)
                {
                    Writer.append("\t\t\"" + String.valueOf(x) + "\":{");
                    Writer.newLine();
                    Writer.append("\t\t\t\"IDVehículo\":\"" + 
                            RegistroAGuardar.getVehiculo(x).getID() + "\",");
                    Writer.newLine();
                    
                    Writer.append("\t\t\t\"Matrícula\":\"" + 
                            RegistroAGuardar.getVehiculo(x).getMatricula() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Marca\":\"" + 
                            RegistroAGuardar.getVehiculo(x).getMarca() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Modelo\":\"" + 
                            RegistroAGuardar.getVehiculo(x).getModelo() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Año\":\"" + 
                            RegistroAGuardar.getVehiculo(x).getAnio() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"IDClienteVehículo\":\"" + 
                            RegistroAGuardar.getVehiculo(x).getIDClienteVehiculo() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Fecha\":\"" + 
                            RegistroAGuardar.getVehiculo(x).getFecha() + "\"");
                    Writer.newLine();
                    if(x < RegistroAGuardar.getTamanoVehiculos() - 1)
                    {
                        Writer.append("\t\t},");
                        Writer.newLine();
                    }
                    else
                    {
                        Writer.append("\t\t}");
                        Writer.newLine();
                    }
                }
            }
            else
            {
                Writer.append("\t\t\"0\":{");
                Writer.newLine();
                Writer.append("\t\t\t\"IDVehículo\":\"\",");
                Writer.newLine();
                Writer.append("\t\t\t\"Matrícula\":\"\",");
                Writer.newLine();
                Writer.append("\t\t\t\"Marca\":\"\",");
                Writer.newLine();
                Writer.append("\t\t\t\"Modelo\":\"\",");
                Writer.newLine();
                Writer.append("\t\t\t\"Año\":\"\",");
                Writer.newLine();
                Writer.append("\t\t\t\"IDClienteVehículo\":\"\",");
                Writer.newLine();
                Writer.append("\t\t\t\"Fecha\":\"\"");
                Writer.newLine();
                Writer.append("\t\t}");
                Writer.newLine();
            }
            Writer.append("\t},");
            Writer.newLine();
            Writer.append("\t\"Reparación\":{");
            Writer.newLine();
            if(RegistroAGuardar.getTamanoReparaciones() > 0)
            {
                for(x = 0; x < RegistroAGuardar.getTamanoReparaciones(); x++)
                {
                    Writer.append("\t\t\"" + String.valueOf(x) + "\":{");
                    Writer.newLine();
                    Writer.append("\t\t\t\"IDReparación\":\"" + 
                            RegistroAGuardar.getReparacion(x).getID() + "\",");
                    Writer.newLine();
                    
                    Writer.append("\t\t\t\"Fecha de Entrada\":\"" + 
                            RegistroAGuardar.getReparacion(x).getFechaEntrada() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Fecha de Salida\":\"" + 
                            RegistroAGuardar.getReparacion(x).getFechaSalida() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Falla\":\"" + 
                            RegistroAGuardar.getReparacion(x).getFalla() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"IDVehículoReparación\":\"" + 
                            RegistroAGuardar.getReparacion(x).getIDVehiculoReparacion() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"IDPiezaReparación\":\"" + 
                            RegistroAGuardar.getReparacion(x).getIDPiezaReparacion() + "\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Cantidad de Pieza\":\"" + 
                            RegistroAGuardar.getReparacion(x).getCantidadPiezas() + "\"");
                    Writer.newLine();
                    if(x < RegistroAGuardar.getTamanoReparaciones() - 1)
                    {
                        Writer.append("\t\t},");
                        Writer.newLine();
                    }
                    else
                    {
                        Writer.append("\t\t}");
                        Writer.newLine();
                    }
                }
            }
            else
            {
                Writer.append("\t\t\"0\":{");
                    Writer.newLine();
                    Writer.append("\t\t\t\"IDReparación\":\"\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Fecha de Entrada\":\"\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Fecha de Salida\":\"\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Falla\":\"\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"IDVehículoReparación\":\"\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"IDPiezaReparación\":\"\",");
                    Writer.newLine();
                    Writer.append("\t\t\t\"Cantidad de Pieza\":\"\"");
                    Writer.newLine();
                Writer.append("\t\t}");
                Writer.newLine();
            }
            Writer.append("\t},");
            // Cerrar todo
            Writer.close();
            OSW.close();
            FOS.close();
        } catch (IOException ex){
            // Define e
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // |-----------------------Cargar------------------------------------------|
    public Registro Cargar()
    {
        // Instanciar Registro
        Registro RegistroCargado = new Registro();
        // Instanciar JSONParser
        JSONParser jsonparser = new JSONParser();
        File ArchivoTemporal = new File(RegistroTemp);
        if(!ArchivoTemporal.exists())
        {
            try {
                URL URLDescarga = new URL(URLTemp);
                FileUtils.copyURLToFile(URLDescarga, ArchivoTemporal);
            } 
            catch (MalformedURLException ex) 
            {
                Logger.getLogger(RegistroCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (IOException ex) 
            {
                Logger.getLogger(RegistroCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        RegistroCargado.InsertarListaUsuarios(jsonparser.getClaveUsuario(RegistroTemp));
        RegistroCargado.InsertarListaClientes(jsonparser.getClaveClientes(RegistroTemp));
        RegistroCargado.InsertarListaVehiculos(jsonparser.getClaveVehiculos(RegistroTemp));
        RegistroCargado.InsertarListaReparaciones(jsonparser.getClaveReparaciones(RegistroTemp));
        RegistroCargado.InsertarListaPiezas(jsonparser.getClavePiezas(RegistroTemp));
        return RegistroCargado;
    }
}

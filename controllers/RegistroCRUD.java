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
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import models.Cliente;
import models.Pieza;
import models.Reparacion;
import models.Usuario;
import models.Vehiculo;
import models.Registro;

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
    public void Guardar()
    {
        System.out.println("");
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

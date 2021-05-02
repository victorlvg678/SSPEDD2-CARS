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
    // |------------------------Métodos públicos-------------------------------|
    
    // Constructor de clase
    public RegistroCRUD()
    {
        RegistroTemp = System.getenv("USERPROFILE") + 
                "\\AppData\\Local\\Temp\\RegistroTemp.json";
    }
    
    // Constructor copia de clase
    public RegistroCRUD(RegistroCRUD RegistroCRUDOriginal)
    {
        RegistroTemp = RegistroCRUDOriginal.RegistroTemp;
    }
    
    // |---------------------------Setters-------------------------------------|
    // Setter para atributo RegistroTemp
    public void setRegistroTemp(String RegistroTempAAsignar)
    {
        RegistroTemp = RegistroTempAAsignar;
    }
    
    // |---------------------------Getters-------------------------------------|
    // Getter para atributo RegistroTemp
    public String getRegistroTemp()
    {
        return RegistroTemp;
    }
    
    // |--------------------------Añadir---------------------------------------|
    // Método para añadir usuario a archivo temporal
    public void AnadirUsuario(Usuario UsuarioAAnadir)
    {
        
    }
    
    // Método para añadir cliente a archivo temporal
    public void AnadirCliente(Cliente ClienteAAnadir)
    {
        
    }
    
    // Método para añadir vehículo a archivo temporal
    public void AnadirVehiculo(Vehiculo VehiculoAAnadir)
    {
    
    }
    
    // Método para añadir reparación a archivo temporal
    public void AnadirReparacion(Reparacion ReparacionAAnadir)
    {
    
    }
    
    // Método para añadir pieza a archivo temporal
    public void AnadirPieza(Pieza PiezaAAnadir)
    {
    
    }
 
    // |--------------------------Eliminar-------------------------------------|
    // Método para eliminar usuario de archivo temporal
    public void EliminarUsuario(Usuario UsuarioAEliminar)
    {
    
    }
    
    // Método para eliminar cliente de archivo temoporal
    public void EliminarCliente(Cliente ClienteAEliminar)
    {
        
    }
    
    // Método para eliminar vehículo de archivo temporal
    public void EliminarVehiculo(Vehiculo VehiculoAEliminar)
    {
    
    }
    
    // Método para eliminar reparación de archivo temporal
    public void EliminarReparacion(Reparacion ReparacionAEliminar)
    {
        
    }
    
    // Método para eliminar pieza de archivo temporal
    public void EliminarPieza(Pieza PiezaAEliminar)
    {
    
    }
    
    // |-----------------------Cargar------------------------------------------|
    public void Cargar(Registro RegistroACargar)
    {
        
    }
}

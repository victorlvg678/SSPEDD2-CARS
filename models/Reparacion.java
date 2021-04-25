/*******************************************************************************
 *                                                                             *
 * Práctica 5 - Login                                                          *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: CARS(Car Automated Repair System)                                 *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210313_build_0)                             *
 * Nombre de Archivo: Reparacion.java                                          *
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
public class Reparacion 
{
    // |------------------------Atributos privados-----------------------------|
    private String ID;
    private String FechaEntrada;
    private String FechaSalida;
    private String Falla;
    private String IDVehiculoReparacion;
    private String IDPiezaReparacion;
    private String CantidadPiezas;
    
    // |------------------------Métodos privados-------------------------------|
    
    // |------------------------Atributos públicos-----------------------------|
        
    // |------------------------Métodos públicos-------------------------------|
    
    // Constructor de clase
    public void Reparacion()
    {
        ID = "0";
        FechaEntrada = "13/04/2021";
        FechaSalida = "14/04/2021";
        Falla = "Balatas";
        IDVehiculoReparacion = "0";
        IDPiezaReparacion = "0";
        CantidadPiezas = "1";
    }
    
    // Constructor copia de clase
    public void Reparacion(Reparacion ReparacionACopiar)
    {
        ID = ReparacionACopiar.ID;
        FechaEntrada = ReparacionACopiar.FechaEntrada;
        FechaSalida = ReparacionACopiar.FechaSalida;
        Falla = ReparacionACopiar.Falla;
        IDVehiculoReparacion = ReparacionACopiar.IDVehiculoReparacion;
        IDPiezaReparacion = ReparacionACopiar.IDPiezaReparacion;
        CantidadPiezas = ReparacionACopiar.CantidadPiezas;
    }
    
    // |-----------------------------Getters-----------------------------------|
    // Getter para atributo ID
    public String getID()
    {
        return ID;
    }
    
    // Getter para atributo FechaEntrada
    public String getFechaEntrada()
    {
        return FechaEntrada;
    }
    
    // Getter para atributo FechaSalida
    public String getFechaSalida()
    {
        return FechaSalida;
    }
    
    // Getter para atributo Falla
    public String getFalla()
    {
        return Falla;
    }
    
    // Getter para atributo IDVehiculoReparacion
    public String getIDVehiculoReparacion()
    {
        return IDVehiculoReparacion;
    }
    
    // Getter para atributo IDPiezaReparacion
    public String getIDPiezaReparacion()
    {
        return IDPiezaReparacion;
    }
    
    // Getter para atributo CantidadPiezas
    public String getCantidadPiezas()
    {
        return CantidadPiezas;
    }
    
    // |-----------------------------Setters-----------------------------------|
    // Setter para atributo ID
    public void setID(String IDAAsignar)
    {
        ID = IDAAsignar;
    }
    
    // Setter para atributo FechaEntrada
    public void setFechaEntrada(String FechaEntradaAAsignar)
    {
        FechaEntrada = FechaEntradaAAsignar;
    }
    
    // Setter para atributo FechaSalida
    public void setFechaSalida(String FechaSalidaAAsignar)
    {
        FechaSalida = FechaSalidaAAsignar;
    }
    
    // Setter para atributo Falla
    public void setFalla(String FallaAAsignar)
    {
        Falla = FallaAAsignar;
    }    
    
    // Setter para atributo IDVehiculoReparacion
    public void setIDVehiculoReparacion(String IDVehiculoReparacionAAsignar)
    {
        IDVehiculoReparacion = IDVehiculoReparacionAAsignar;
    }
    
    // Setter para atributo IDPiezaReparacion
    public void setIDPiezaReparacion(String IDPiezaReparacionAAsignar)
    {
        IDPiezaReparacion = IDPiezaReparacionAAsignar;
    }
    
    // Setter para atributo CantidadPiezas
    public void setCantidadPiezas(String CantidadPiezasAAsignar)
    {
        CantidadPiezas = CantidadPiezasAAsignar;
    }
}

/*******************************************************************************
 *                                                                             *
 * Práctica 5 - Login                                                          *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: CARS(Car Automated Repair System)                                 *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210313_build_0)                             *
 * Nombre de Archivo: Vehiculo.java                                             *
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
public class Vehiculo 
{
    // |------------------------Atributos privados-----------------------------|
    private String ID;
    private String Matricula;
    private String Marca;
    private String Modelo;
    private String Anio;
    private String IDClienteVehiculo;
    private String Fecha;
    
    // |------------------------Métodos privados-------------------------------|
    
    // |------------------------Atributos públicos-----------------------------|
        
    // |------------------------Métodos públicos-------------------------------|
    
    // Constructor de clase
    public void Vehiculo()
    {
        ID = "0";
        Matricula = "JDS-8080";
        Marca = "Car";
        Modelo = "Hatchback";
        Anio = "2021";
        IDClienteVehiculo = "0";
        Fecha = "13/04/2021";
    }
    
    // Constructor copia de clase
    public void Vehiculo(Vehiculo VehiculoACopiar)
    {
        ID = VehiculoACopiar.ID;
        Matricula = VehiculoACopiar.Matricula;
        Marca = VehiculoACopiar.Marca;
        Modelo = VehiculoACopiar.Modelo;
        Anio = VehiculoACopiar.Anio;
        IDClienteVehiculo = VehiculoACopiar.IDClienteVehiculo;
        Fecha = VehiculoACopiar.Fecha;
    }
    
    // |-----------------------------Getters-----------------------------------|
    // Getter para atributo ID
    public String getID()
    {
        return ID;
    }
    
    // Getter para atributo Matricula
    public String getMatricula()
    {
        return Matricula;
    }
    
    // Getter para atributo Marca
    public String getMarca()
    {
        return Marca;
    }
    
    // Getter para atributo Modelo
    public String getModelo()
    {
        return Modelo;
    }
    
    // Getter para atributo Anio
    public String getAnio()
    {
        return Anio;
    }
    
    // Getter para atributo IDClienteVehiculo
    public String getIDClienteVehiculo()
    {
        return IDClienteVehiculo;
    }
    
    // Getter para atributo Fecha
    public String getFecha()
    {
        return Fecha;
    }
    
    // |-----------------------------Setters-----------------------------------|
    // Setter para atributo ID
    public void setID(String IDAAsignar)
    {
        ID = IDAAsignar;
    }
    
    // Setter para atributo Matricula
    public void setMatricula(String MatriculaAAsignar)
    {
        Matricula = MatriculaAAsignar;
    }
    
    // Setter para atributo Marca
    public void setMarca(String MarcaAAsignar)
    {
        Marca = MarcaAAsignar;
    }
    
    // Setter para atributo Modelo
    public void setModelo(String ModeloAAsignar)
    {
        Modelo = ModeloAAsignar;
    }    
    
    // Setter para atributo Anio
    public void setAnio(String AnioAAsignar)
    {
        Anio = AnioAAsignar;
    }
    
    // Setter para atributo IDClienteVehiculo
    public void setIDClienteVehiculo(String IDClienteVehiculoAAsignar)
    {
        IDClienteVehiculo = IDClienteVehiculoAAsignar;
    }
    
    // Setter para atributo Fecha
    public void setFecha(String FechaAAsignar)
    {
        Fecha = FechaAAsignar;
    }
}

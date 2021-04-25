/*******************************************************************************
 *                                                                             *
 * Práctica 5 - Login                                                          *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: CARS(Car Automated Repair System)                                 *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210313_build_0)                             *
 * Nombre de Archivo: Cliente.java                                             *
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
public class Cliente 
{
    // |------------------------Atributos privados-----------------------------|
    private String ID;
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    
    // |------------------------Métodos privados-------------------------------|
    
    // |------------------------Atributos públicos-----------------------------|
        
    // |------------------------Métodos públicos-------------------------------|
    
    // Constructor de clase
    public void Cliente()
    {
        ID = "0";
        Nombre = "John";
        ApellidoPaterno = "Doe";
        ApellidoMaterno = "Doe";
    }
    
    // Constructor copia de clase
    public void Cliente(Cliente ClienteACopiar)
    {
        ID = ClienteACopiar.ID;
        Nombre = ClienteACopiar.Nombre;
        ApellidoPaterno = ClienteACopiar.ApellidoPaterno;
        ApellidoMaterno = ClienteACopiar.ApellidoMaterno;
    }
    
    // |-----------------------------Getters-----------------------------------|
    // Getter para atributo ID
    public String getID()
    {
        return ID;
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
    
    // |-----------------------------Setters-----------------------------------|
    // Setter para atributo ID
    public void setID(String IDAAsignar)
    {
        ID = IDAAsignar;
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
}

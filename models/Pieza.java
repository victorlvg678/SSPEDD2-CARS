/*******************************************************************************
 *                                                                             *
 * Práctica 5 - Login                                                          *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: CARS(Car Automated Repair System)                                 *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210313_build_0)                             *
 * Nombre de Archivo: Pieza.java                                               *
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
public class Pieza 
{
    // |------------------------Atributos privados-----------------------------|
    private String ID;
    private String Nombre;
    private String Marca;
    private String Costo;
    private String Descripcion;
    private String Stock;
    
    // |------------------------Métodos privados-------------------------------|
    
    // |------------------------Atributos públicos-----------------------------|
        
    // |------------------------Métodos públicos-------------------------------|
    
    // Constructor de clase
    public void Pieza()
    {
        ID = "0";
        Nombre = "Balatas";
        Marca = "ACDelco";
        Costo = "873";
        Descripcion = "Balatas para Chevy 2001 de Marca ACDelco";
        Stock = "1";
    }
    
    // Constructor copia de clase
    public void Pieza(Pieza PiezaACopiar)
    {
        ID = PiezaACopiar.ID;
        Nombre = PiezaACopiar.Nombre;
        Marca = PiezaACopiar.Marca;
        Costo = PiezaACopiar.Costo;
        Descripcion = PiezaACopiar.Descripcion;
        Stock = PiezaACopiar.Stock;
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
    
    // Getter para atributo Marca
    public String getMarca()
    {
        return Marca;
    }
    
    // Getter para atributo Costo
    public String getCosto()
    {
        return Costo;
    }
    
    // Getter para atributo Descripcion
    public String getDescripcion()
    {
        return Descripcion;
    }
    
    // Getter para atributo Stock
    public String getStock()
    {
        return Stock;
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
    
    // Setter para atributo Marca
    public void setMarca(String MarcaAAsignar)
    {
        Marca = MarcaAAsignar;
    }
    
    // Setter para atributo Costo
    public void setCosto(String CostoAAsignar)
    {
        Costo = CostoAAsignar;
    }    
    
    // Setter para atributo Descripcion
    public void setDescripcion(String DescripcionAAsignar)
    {
        Descripcion = DescripcionAAsignar;
    }
    
    // Setter para atributo Stock
    public void setStock(String StockAAsignar)
    {
        Stock = StockAAsignar;
    }
}

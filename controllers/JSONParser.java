/*******************************************************************************
 *                                                                             *
 * Práctica 5 - Login                                                          *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: CARS(Car Automated Repair System)                                 *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210313_build_0)                             *
 * Nombre de Archivo: JSONParser.java                                          *
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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Usuario;
import models.Cliente;
import models.Vehiculo;
import models.Reparacion;
import models.Pieza;


// Parámetros que indican autor(es) de programa
/**
 * @author Valle Guerra, Victor Leonardo 
 */

// Clase principal de Archivo
public class JSONParser 
{
    // |--------------------Atributos privados---------------------------------|
    
    // |--------------------Métodos privados-----------------------------------|
    // Método para verificar si el número es entero
    private boolean esEntero(String StringAEvaluar){
        // Variable temporal de prueba
        int Test;
        // Variable para regresar estado booleano
        boolean Entero;
        Entero = false;
        // Intentamos realizar conversión
        try{
            Test = Integer.parseInt(StringAEvaluar);
            Entero = true;
        }catch(Exception e){
            System.out.println("Ocurrió un error : " + e);
        }
        return Entero;
    }
    // |--------------------Métodos públicos-----------------------------------|
    
    
    public static void getClave(String ClaveBuscar, String Archivo)
    {
        try{
            // Creamos un inputstream para el archivo
            FileInputStream FIS = new FileInputStream(new File(Archivo));
            // Creamos un lector de dicho inputstream en UTF-8
            InputStreamReader ISR = new InputStreamReader(FIS, StandardCharsets.UTF_8);
            // Y creamos un buffer para el lector
            BufferedReader Reader = new BufferedReader(ISR);
            // Creamos string temporal
            String StrTemp;
            StrTemp = Reader.readLine();
            while (StrTemp != null){
                if(StrTemp.contains("    "))
                {
                    StrTemp = StrTemp.substring(5, StrTemp.length() - 1);
                    System.out.println(StrTemp);
                    StrTemp = StrTemp.substring(0, ClaveBuscar.length());
                    System.out.println(StrTemp);
                    if(StrTemp.equals(ClaveBuscar) && ClaveBuscar.equals("Usuarios"))
                    {
                        System.out.println(StrTemp);
                        StrTemp = Reader.readLine();
                        System.out.println(StrTemp);
                    }
                }
                StrTemp = Reader.readLine();
            }
            // Cerrar todo
            Reader.close();
            ISR.close();
            FIS.close();
        } catch (IOException ex){
            // Imprimir excepción
            System.out.println("Problema al intentar acceder al archivo"
                    + Archivo);
            System.out.println("General I/O exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}

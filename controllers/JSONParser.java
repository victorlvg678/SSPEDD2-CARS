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
import java.util.ArrayList;
import models.Usuario;
import models.Cliente;
import models.Vehiculo;
import models.Reparacion;
import models.Pieza;
import models.Registro;


// Parámetros que indican autor(es) de programa
/**
 * @author Valle Guerra, Victor Leonardo 
 */

// Clase principal de Archivo
public class JSONParser 
{
    // |--------------------Atributos privados---------------------------------|
    private ArrayList<String> Registros;
    private ArrayList<String> ClavesUsuarios;
    private ArrayList<String> ClavesClientes;
    private ArrayList<String> ClavesVehiculos;
    private ArrayList<String> ClavesReparaciones;
    private ArrayList<String> ClavesPiezas;
    private String IdentacionRegistro20;
    private String IdentacionNoRegistro20;
    private String IdentacionClave20;
    private String IdentacionRegistro09;
    private String IdentacionNoRegistro09;
    private String IdentacionClave09;
    private String FinalRegistro20;
    private String FinalRegistro09;
    private String FinalNoRegistro20;
    private String FinalNoRegistro09;
    
    
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
    // Constructor de clase
    public JSONParser()
    {
        Registros = new ArrayList<>();
        ClavesUsuarios = new ArrayList<>();
        ClavesClientes = new ArrayList<>();
        ClavesVehiculos = new ArrayList<>();
        ClavesReparaciones = new ArrayList<>();
        ClavesPiezas = new ArrayList<>();
        // Agregando campos/claves de Registros
        Registros.add("Usuarios");
        Registros.add("Clientes");
        Registros.add("Vehículos");
        Registros.add("Reparación");
        Registros.add("Piezas");
        // Agregando campos/claves de Usuarios
        ClavesUsuarios.add("IDUsuario");
        ClavesUsuarios.add("Username");
        ClavesUsuarios.add("Contraseña");
        ClavesUsuarios.add("Rol");
        ClavesUsuarios.add("Nombre");
        ClavesUsuarios.add("Apellido Paterno");
        ClavesUsuarios.add("Apellido Materno");
        ClavesUsuarios.add("Dirección");
        ClavesUsuarios.add("Teléfono");
        // Agregando campos/claves de Clientes
        ClavesClientes.add("IDCliente");
        ClavesClientes.add("Nombre");
        ClavesClientes.add("Apellido Paterno");
        ClavesClientes.add("Apellido Materno");
        // Agregando campos/claves de Vehículos
        ClavesVehiculos.add("IDVehículo");
        ClavesVehiculos.add("Matrícula");
        ClavesVehiculos.add("Marca");
        ClavesVehiculos.add("Modelo");
        ClavesVehiculos.add("Año");
        ClavesVehiculos.add("IDClienteVehiculo");
        ClavesVehiculos.add("Fecha");
        // Agregando campos/claves de Reparación
        ClavesReparaciones.add("IDReparación");
        ClavesReparaciones.add("Fecha de Entrada");
        ClavesReparaciones.add("Fecha de Salida");
        ClavesReparaciones.add("Falla");
        ClavesReparaciones.add("IDVehículoReparación");
        ClavesReparaciones.add("IDPiezaReparación");
        ClavesReparaciones.add("Cantidad de Piezas");
        // Agregando campos/claves de Piezas
        ClavesPiezas.add("IDPieza");
        ClavesPiezas.add("Nombre");
        ClavesPiezas.add("Marca");
        ClavesPiezas.add("Costo");
        ClavesPiezas.add("Descripción");
        ClavesPiezas.add("Stock");
        IdentacionRegistro20 = "    ";
        IdentacionNoRegistro20 = "        ";
        IdentacionClave20 = "            ";
        IdentacionRegistro09 = "\t";
        IdentacionNoRegistro09 = "\t\t";
        IdentacionClave09 = "\t\t\t";
        FinalRegistro20 = "    }";
        FinalRegistro09 = "\t}";
        FinalNoRegistro20 = "        }";
        FinalNoRegistro09 = "\t\t}";
    }
    
    // Constructor copia de clase
    public JSONParser(JSONParser JSONParserOriginal)
    {
        Registros = new ArrayList<>(JSONParserOriginal.Registros);
        ClavesUsuarios = new ArrayList<>(JSONParserOriginal.ClavesUsuarios);
        ClavesClientes = new ArrayList<>(JSONParserOriginal.ClavesClientes);
        ClavesVehiculos = new ArrayList<>(JSONParserOriginal.ClavesVehiculos);
        ClavesReparaciones = new ArrayList<>(JSONParserOriginal.ClavesReparaciones);
        ClavesPiezas = new ArrayList<>(JSONParserOriginal.ClavesPiezas);
    }
    
    // Método para analizar y obtener los usuarios desde un archivo
    public ArrayList<Usuario> getClaveUsuario(String Archivo)
    {
        // Instanciar Registro
        ArrayList<Usuario> RegistroUsuarios = new ArrayList<>();
        String ClaveBuscar = "Usuarios";
        Usuario UsuarioTemp = new Usuario();
        Boolean RegistroEncontrado, Registrando;
        RegistroEncontrado = false;
        Registrando = true;
        int x;
        try{
            // Creamos un inputstream para el archivo
            FileInputStream FIS = new FileInputStream(new File(Archivo));
            // Creamos un lector de dicho inputstream en UTF-8
            InputStreamReader ISR = new InputStreamReader(FIS, StandardCharsets.UTF_8);
            // Y creamos un buffer para el lector
            BufferedReader Reader = new BufferedReader(ISR);
            // Creamos string temporal
            String StrTemp, Clave, Valor;
            // Contador para registro
            int NoRegistro;
            NoRegistro = Registros.indexOf(ClaveBuscar);
            StrTemp = Reader.readLine();
            while (StrTemp != null){
                if(StrTemp.contains(FinalRegistro20) || 
                        StrTemp.contains(FinalRegistro09))
                {
                    StrTemp = Reader.readLine();
                }
                else
                {
                    if(StrTemp.contains(FinalNoRegistro20) ||
                            StrTemp.contains(FinalNoRegistro09))
                    {
                        StrTemp = Reader.readLine();
                    }
                    else
                    {
                        if(StrTemp.contains(IdentacionRegistro20) ||
                            StrTemp.contains(IdentacionRegistro09))
                        {
                            StrTemp = StrTemp.substring(StrTemp.indexOf('\"') + 1, 
                                    StrTemp.lastIndexOf('\"'));
                            if(StrTemp.equals(ClaveBuscar)|| RegistroEncontrado)
                            {
                                
                                if(Registros.contains(StrTemp) || RegistroEncontrado)
                                {
                                    RegistroEncontrado = true;
                                    StrTemp = Reader.readLine();
                                    if(StrTemp.contains(IdentacionNoRegistro20) ||
                                            StrTemp.contains(IdentacionNoRegistro09))
                                    {   
                                        while(Registrando)
                                        {
                                            
                                            if(StrTemp.contains("\""))
                                            {
                                                StrTemp = StrTemp.substring(StrTemp.indexOf('\"') + 1, 
                                                StrTemp.length() - 1);
                                                StrTemp = StrTemp.substring(0, StrTemp.indexOf('\"'));
                                            }
                                            if(esEntero(StrTemp))
                                            {
                                                StrTemp = Reader.readLine();
                                                if(StrTemp.contains(IdentacionClave20) ||
                                                        StrTemp.contains(IdentacionClave09))
                                                {
                                                    for(x = 0; x < ClavesUsuarios.size(); x++)
                                                    {
                                                        Clave = StrTemp.substring(StrTemp.indexOf('\"') + 1, 
                                                                StrTemp.indexOf(':'));
                                                        Clave = Clave.substring(0, Clave.indexOf('\"'));
                                                        if(StrTemp.indexOf(',') != -1)
                                                        {
                                                            Valor = StrTemp.substring(StrTemp.indexOf(":") + 1, 
                                                            StrTemp.lastIndexOf(','));
                                                        }
                                                        else
                                                        {
                                                            Valor = StrTemp.substring(StrTemp.indexOf(":") + 1, 
                                                            StrTemp.lastIndexOf('\"'));
                                                        }
                                                        if(Valor.lastIndexOf('\"') > 0)
                                                        {
                                                            Valor = Valor.substring(Valor.indexOf('\"') + 1,
                                                            Valor.lastIndexOf('\"'));
                                                        }
                                                        else
                                                        {
                                                           Valor = Valor.substring(Valor.indexOf('\"'),
                                                            Valor.length());
                                                        }
                                                        switch(x)
                                                        {
                                                            case 0:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                UsuarioTemp.setID(Valor);
                                                                break;
                                                            }
                                                            case 1:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                UsuarioTemp.setUsername(Valor);
                                                                break;
                                                            }
                                                            case 2:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                UsuarioTemp.setContrasena(Valor);
                                                                break;
                                                            }
                                                            case 3:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                UsuarioTemp.setRol(Valor);
                                                                break;
                                                            }
                                                            case 4:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                UsuarioTemp.setNombre(Valor);
                                                                break;
                                                            }
                                                            case 5:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                UsuarioTemp.setApellidoPaterno(Valor);
                                                                break;
                                                            }
                                                            case 6:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                UsuarioTemp.setApellidoMaterno(Valor);
                                                                break;
                                                            }
                                                            case 7:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                UsuarioTemp.setDireccion(Valor);
                                                                break;
                                                            }
                                                            case 8:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                UsuarioTemp.setTelefono(Valor);
                                                                break;
                                                            }
                                                        }
                                                        StrTemp = Reader.readLine();
                                                    }
                                                    RegistroUsuarios.add(UsuarioTemp);
                                                    UsuarioTemp = new Usuario();
                                                    StrTemp = Reader.readLine();
                                                }
                                            }
                                            else
                                            {
                                                if(StrTemp.equals(FinalRegistro20) ||
                                                        StrTemp.equals(FinalRegistro09))
                                                {
                                                    Registrando = false;
                                                }
                                                else
                                                {
                                                    if(StrTemp.equals(FinalNoRegistro20) ||
                                                            StrTemp.equals(FinalNoRegistro09))
                                                    {
                                                        StrTemp = Reader.readLine();
                                                    }
                                                    else
                                                    {
                                                        Registrando = false;
                                                    }
                                                }
                                            }
                                        }
                                        
                                    }
                                }
                            }
                            else
                            {
                                if(StrTemp.equals(Registros.get(NoRegistro + 1)))
                                {
                                    System.out.println("Llegamos a otro registro");
                                    RegistroEncontrado = false;
                                    StrTemp = null;
                                }
                            }
                        }
                    }
                }
                if(StrTemp != null)
                {   
                    StrTemp = Reader.readLine();
                }
                
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
        return RegistroUsuarios;
    }
    
    // Método para obtener los clientes desde un archivo
    public ArrayList<Cliente> getClaveClientes(String Archivo)
    {
        // Instanciar Registro
        ArrayList<Cliente> RegistroClientes = new ArrayList<>();
        String ClaveBuscar = "Clientes";
        Cliente ClienteTemp = new Cliente();
        Boolean RegistroEncontrado, Registrando;
        RegistroEncontrado = false;
        Registrando = true;
        int x;
        try{
            // Creamos un inputstream para el archivo
            FileInputStream FIS = new FileInputStream(new File(Archivo));
            // Creamos un lector de dicho inputstream en UTF-8
            InputStreamReader ISR = new InputStreamReader(FIS, StandardCharsets.UTF_8);
            // Y creamos un buffer para el lector
            BufferedReader Reader = new BufferedReader(ISR);
            // Creamos string temporal
            String StrTemp, Clave, Valor;
            // Contador para registro
            int NoRegistro;
            NoRegistro = Registros.indexOf(ClaveBuscar);
            StrTemp = Reader.readLine();
            while (StrTemp != null){
                if(StrTemp.contains(FinalRegistro20) || 
                        StrTemp.contains(FinalRegistro09))
                {
                    StrTemp = Reader.readLine();
                }
                else
                {
                    if(StrTemp.contains(FinalNoRegistro20) ||
                            StrTemp.contains(FinalNoRegistro09))
                    {
                        StrTemp = Reader.readLine();
                    }
                    else
                    {
                        if(StrTemp.contains(IdentacionRegistro20) ||
                            StrTemp.contains(IdentacionRegistro09))
                        {
                            StrTemp = StrTemp.substring(StrTemp.indexOf('\"') + 1, 
                                    StrTemp.lastIndexOf('\"'));
                            if(StrTemp.equals(ClaveBuscar) || RegistroEncontrado)
                            {
                                if(Registros.contains(StrTemp) || RegistroEncontrado)
                                {
                                    RegistroEncontrado = true;
                                    StrTemp = Reader.readLine();
                                    if(StrTemp.contains(IdentacionNoRegistro20) ||
                                            StrTemp.contains(IdentacionNoRegistro09))
                                    {
                                        while(Registrando)
                                        {
                                            
                                            if(StrTemp.contains("\""))
                                            {
                                                StrTemp = StrTemp.substring(StrTemp.indexOf('\"') + 1, 
                                                StrTemp.length() - 1);
                                                StrTemp = StrTemp.substring(0, StrTemp.indexOf('\"'));
                                            }
                                            if(esEntero(StrTemp))
                                            {
                                                StrTemp = Reader.readLine();
                                                if(StrTemp.contains(IdentacionClave20) ||
                                                        StrTemp.contains(IdentacionClave09))
                                                {
                                                    for(x = 0; x < ClavesClientes.size(); x++)
                                                    {
                                                        Clave = StrTemp.substring(StrTemp.indexOf('\"') + 1, 
                                                                StrTemp.indexOf(':'));
                                                        Clave = Clave.substring(0, Clave.indexOf('\"'));
                                                        if(StrTemp.indexOf(',') != -1)
                                                        {
                                                            Valor = StrTemp.substring(StrTemp.indexOf(":") + 1, 
                                                            StrTemp.lastIndexOf(','));
                                                        }
                                                        else
                                                        {
                                                            Valor = StrTemp.substring(StrTemp.indexOf(":") + 1, 
                                                            StrTemp.lastIndexOf('\"'));
                                                        }
                                                        if(Valor.lastIndexOf('\"') > 0)
                                                        {
                                                            Valor = Valor.substring(Valor.indexOf('\"') + 1,
                                                            Valor.lastIndexOf('\"'));
                                                        }
                                                        else
                                                        {
                                                           Valor = Valor.substring(Valor.indexOf('\"'),
                                                            Valor.length());
                                                        }
                                                        switch(x)
                                                        {
                                                            case 0:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                ClienteTemp.setID(Valor);
                                                                break;
                                                            }
                                                            case 1:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                ClienteTemp.setNombre(Valor);
                                                                break;
                                                            }
                                                            case 2:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                ClienteTemp.setApellidoPaterno(Valor);
                                                                break;
                                                            }
                                                            case 3:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                ClienteTemp.setApellidoMaterno(Valor);
                                                                break;
                                                            }
                                                        }
                                                        StrTemp = Reader.readLine();
                                                    }
                                                    RegistroClientes.add(ClienteTemp);
                                                    ClienteTemp = new Cliente();
                                                    StrTemp = Reader.readLine();
                                                }
                                            }
                                            else
                                            {
                                                if(StrTemp.equals(FinalRegistro20) ||
                                                        StrTemp.equals(FinalRegistro09))
                                                {
                                                    Registrando = false;
                                                }
                                                else
                                                {
                                                    if(StrTemp.equals(FinalNoRegistro20) ||
                                                            StrTemp.equals(FinalNoRegistro09))
                                                    {
                                                        StrTemp = Reader.readLine();
                                                    }
                                                    else
                                                    {
                                                        Registrando = false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else
                            {
                                if(StrTemp.equals(Registros.get(NoRegistro + 1)))
                                {
                                    System.out.println("Llegamos a otro registro");
                                    RegistroEncontrado = false;
                                    StrTemp = null;
                                }
                            }
                        }
                    }
                }
                if(StrTemp != null)
                {   
                    StrTemp = Reader.readLine();
                }
                
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
        return RegistroClientes;
    }
    
    // Método para obtener los vehículos desde un archivo
    public ArrayList<Vehiculo> getClaveVehiculos(String Archivo)
    {
        // Instanciar Registro
        ArrayList<Vehiculo> RegistroVehiculos = new ArrayList<>();
        String ClaveBuscar = "Vehículos";
        Vehiculo VehiculoTemp = new Vehiculo();
        Boolean RegistroEncontrado, Registrando;
        RegistroEncontrado = false;
        Registrando = true;
        int x;
        try{
            // Creamos un inputstream para el archivo
            FileInputStream FIS = new FileInputStream(new File(Archivo));
            // Creamos un lector de dicho inputstream en UTF-8
            InputStreamReader ISR = new InputStreamReader(FIS, StandardCharsets.UTF_8);
            // Y creamos un buffer para el lector
            BufferedReader Reader = new BufferedReader(ISR);
            // Creamos string temporal
            String StrTemp, Clave, Valor;
            // Contador para registro
            int NoRegistro;
            NoRegistro = Registros.indexOf(ClaveBuscar);
            StrTemp = Reader.readLine();
            while (StrTemp != null){
                if(StrTemp.contains(FinalRegistro20) || 
                        StrTemp.contains(FinalRegistro09))
                {
                    StrTemp = Reader.readLine();
                }
                else
                {
                    if(StrTemp.contains(FinalNoRegistro20) ||
                            StrTemp.contains(FinalNoRegistro09))
                    {
                        StrTemp = Reader.readLine();
                    }
                    else
                    {
                        if(StrTemp.contains(IdentacionRegistro20) ||
                            StrTemp.contains(IdentacionRegistro09))
                        {
                            StrTemp = StrTemp.substring(StrTemp.indexOf('\"') + 1, 
                                    StrTemp.lastIndexOf('\"'));
                            if(StrTemp.equals(ClaveBuscar) || RegistroEncontrado)
                            {
                                if(Registros.contains(StrTemp) || RegistroEncontrado)
                                {
                                    RegistroEncontrado = true;
                                    StrTemp = Reader.readLine();
                                    if(StrTemp.contains(IdentacionNoRegistro20) ||
                                            StrTemp.contains(IdentacionNoRegistro09))
                                    {
                                        while(Registrando)
                                        {
                                            
                                            if(StrTemp.contains("\""))
                                            {
                                                StrTemp = StrTemp.substring(StrTemp.indexOf('\"') + 1, 
                                                StrTemp.length() - 1);
                                                StrTemp = StrTemp.substring(0, StrTemp.indexOf('\"'));
                                            }
                                            if(esEntero(StrTemp))
                                            {
                                                StrTemp = Reader.readLine();
                                                if(StrTemp.contains(IdentacionClave20) ||
                                                        StrTemp.contains(IdentacionClave09))
                                                {
                                                    for(x = 0; x < ClavesVehiculos.size(); x++)
                                                    {
                                                        Clave = StrTemp.substring(StrTemp.indexOf('\"') + 1, 
                                                                StrTemp.indexOf(':'));
                                                        Clave = Clave.substring(0, Clave.indexOf('\"'));
                                                        if(StrTemp.indexOf(',') != -1)
                                                        {
                                                            Valor = StrTemp.substring(StrTemp.indexOf(":") + 1, 
                                                            StrTemp.lastIndexOf(','));
                                                        }
                                                        else
                                                        {
                                                            Valor = StrTemp.substring(StrTemp.indexOf(":") + 1, 
                                                            StrTemp.lastIndexOf('\"'));
                                                        }
                                                        if(Valor.lastIndexOf('\"') > 0)
                                                        {
                                                            Valor = Valor.substring(Valor.indexOf('\"') + 1,
                                                            Valor.lastIndexOf('\"'));
                                                        }
                                                        else
                                                        {
                                                           Valor = Valor.substring(Valor.indexOf('\"'),
                                                            Valor.length());
                                                        }
                                                        switch(x)
                                                        {
                                                            case 0:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                VehiculoTemp.setID(Valor);
                                                                break;
                                                            }
                                                            case 1:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                VehiculoTemp.setMatricula(Valor);
                                                                break;
                                                            }
                                                            case 2:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                VehiculoTemp.setMarca(Valor);
                                                                break;
                                                            }
                                                            case 3:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                VehiculoTemp.setModelo(Valor);
                                                                break;
                                                            }
                                                            case 4:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                VehiculoTemp.setAnio(Valor);
                                                                break;
                                                            }
                                                            case 5:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                VehiculoTemp.setIDClienteVehiculo(Valor);
                                                                break;
                                                            }
                                                            case 6:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                VehiculoTemp.setFecha(Valor);
                                                                break;
                                                            }
                                                        }
                                                        StrTemp = Reader.readLine();
                                                    }
                                                    RegistroVehiculos.add(VehiculoTemp);
                                                    VehiculoTemp = new Vehiculo();
                                                    StrTemp = Reader.readLine();
                                                }
                                            }
                                            else
                                            {
                                                if(StrTemp.equals(FinalRegistro20) ||
                                                        StrTemp.equals(FinalRegistro09))
                                                {
                                                    Registrando = false;
                                                }
                                                else
                                                {
                                                    if(StrTemp.equals(FinalNoRegistro20) ||
                                                            StrTemp.equals(FinalNoRegistro09))
                                                    {
                                                        StrTemp = Reader.readLine();
                                                    }
                                                    else
                                                    {
                                                        Registrando = false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else
                            {
                                if(StrTemp.equals(Registros.get(NoRegistro + 1)))
                                {
                                    System.out.println("Llegamos a otro registro");
                                    RegistroEncontrado = false;
                                    StrTemp = null;
                                }
                            }
                        }
                    }
                }
                if(StrTemp != null)
                {   
                    StrTemp = Reader.readLine();
                }
                
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
        return RegistroVehiculos;
    }
    
    // Método para obtener las reparaciones desde un archivo
    public ArrayList<Reparacion> getClaveReparaciones(String Archivo)
    {
        // Instanciar Registro
        ArrayList<Reparacion> RegistroReparaciones = new ArrayList<>();
        String ClaveBuscar = "Reparación";
        Reparacion ReparacionTemp = new Reparacion();
        Boolean RegistroEncontrado, Registrando;
        RegistroEncontrado = false;
        Registrando = true;
        int x;
        try{
            // Creamos un inputstream para el archivo
            FileInputStream FIS = new FileInputStream(new File(Archivo));
            // Creamos un lector de dicho inputstream en UTF-8
            InputStreamReader ISR = new InputStreamReader(FIS, StandardCharsets.UTF_8);
            // Y creamos un buffer para el lector
            BufferedReader Reader = new BufferedReader(ISR);
            // Creamos string temporal
            String StrTemp, Clave, Valor;
            // Contador para registro
            int NoRegistro;
            NoRegistro = Registros.indexOf(ClaveBuscar);
            StrTemp = Reader.readLine();
            while (StrTemp != null){
                if(StrTemp.contains(FinalRegistro20) || 
                        StrTemp.contains(FinalRegistro09))
                {
                    StrTemp = Reader.readLine();
                }
                else
                {
                    if(StrTemp.contains(FinalNoRegistro20) ||
                            StrTemp.contains(FinalNoRegistro09))
                    {
                        StrTemp = Reader.readLine();
                    }
                    else
                    {
                        if(StrTemp.contains(IdentacionRegistro20) ||
                            StrTemp.contains(IdentacionRegistro09))
                        {
                            StrTemp = StrTemp.substring(StrTemp.indexOf('\"') + 1, 
                                    StrTemp.lastIndexOf('\"'));
                            if(StrTemp.equals(ClaveBuscar) || RegistroEncontrado)
                            {
                                if(Registros.contains(StrTemp) || RegistroEncontrado)
                                {
                                    RegistroEncontrado = true;
                                    StrTemp = Reader.readLine();
                                    if(StrTemp.contains(IdentacionNoRegistro20) ||
                                            StrTemp.contains(IdentacionNoRegistro09))
                                    {
                                        while(Registrando)
                                        {
                                            
                                            if(StrTemp.contains("\""))
                                            {
                                                StrTemp = StrTemp.substring(StrTemp.indexOf('\"') + 1, 
                                                StrTemp.length() - 1);
                                                StrTemp = StrTemp.substring(0, StrTemp.indexOf('\"'));
                                            }
                                            if(esEntero(StrTemp))
                                            {
                                                StrTemp = Reader.readLine();
                                                if(StrTemp.contains(IdentacionClave20) ||
                                                        StrTemp.contains(IdentacionClave09))
                                                {
                                                    for(x = 0; x < ClavesReparaciones.size(); x++)
                                                    {
                                                        Clave = StrTemp.substring(StrTemp.indexOf('\"') + 1, 
                                                                StrTemp.indexOf(':'));
                                                        Clave = Clave.substring(0, Clave.indexOf('\"'));
                                                        if(StrTemp.indexOf(',') != -1)
                                                        {
                                                            Valor = StrTemp.substring(StrTemp.indexOf(":") + 1, 
                                                            StrTemp.lastIndexOf(','));
                                                        }
                                                        else
                                                        {
                                                            Valor = StrTemp.substring(StrTemp.indexOf(":") + 1, 
                                                            StrTemp.lastIndexOf('\"'));
                                                        }
                                                        if(Valor.lastIndexOf('\"') > 0)
                                                        {
                                                            Valor = Valor.substring(Valor.indexOf('\"') + 1,
                                                            Valor.lastIndexOf('\"'));
                                                        }
                                                        else
                                                        {
                                                           Valor = Valor.substring(Valor.indexOf('\"'),
                                                            Valor.length());
                                                        }
                                                        switch(x)
                                                        {
                                                            case 0:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                ReparacionTemp.setID(Valor);
                                                                break;
                                                            }
                                                            case 1:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                ReparacionTemp.setFechaEntrada(Valor);
                                                                break;
                                                            }
                                                            case 2:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                ReparacionTemp.setFechaSalida(Valor);
                                                                break;
                                                            }
                                                            case 3:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                ReparacionTemp.setFalla(Valor);
                                                                break;
                                                            }
                                                            case 4:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                ReparacionTemp.setIDVehiculoReparacion(Valor);
                                                                break;
                                                            }
                                                            case 5:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                ReparacionTemp.setIDPiezaReparacion(Valor);
                                                                break;
                                                            }
                                                            case 6:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                ReparacionTemp.setCantidadPiezas(Valor);
                                                                break;
                                                            }
                                                        }
                                                        StrTemp = Reader.readLine();
                                                    }
                                                    RegistroReparaciones.add(ReparacionTemp);
                                                    ReparacionTemp = new Reparacion();
                                                    StrTemp = Reader.readLine();
                                                }
                                            }
                                            else
                                            {
                                                if(StrTemp.equals(FinalRegistro20) ||
                                                        StrTemp.equals(FinalRegistro09))
                                                {
                                                    Registrando = false;
                                                }
                                                else
                                                {
                                                    if(StrTemp.equals(FinalNoRegistro20) ||
                                                            StrTemp.equals(FinalNoRegistro09))
                                                    {
                                                        StrTemp = Reader.readLine();
                                                    }
                                                    else
                                                    {
                                                        Registrando = false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else
                            {
                                if(StrTemp.equals(Registros.get(NoRegistro + 1)))
                                {
                                    System.out.println("Llegamos a otro registro");
                                    RegistroEncontrado = false;
                                    StrTemp = null;
                                }
                            }
                        }
                    }
                }
                if(StrTemp != null)
                {   
                    StrTemp = Reader.readLine();
                }
                
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
        return RegistroReparaciones;
    }
    
    // Método para obtener las piezas desde un archivo
    public ArrayList<Pieza> getClavePiezas(String Archivo)
    {
        // Instanciar Registro
        ArrayList<Pieza> RegistroPiezas = new ArrayList<>();
        String ClaveBuscar = "Piezas";
        Pieza PiezaTemp = new Pieza();
        Boolean RegistroEncontrado, Registrando;
        RegistroEncontrado = false;
        Registrando = true;
        int x;
        try{
            // Creamos un inputstream para el archivo
            FileInputStream FIS = new FileInputStream(new File(Archivo));
            // Creamos un lector de dicho inputstream en UTF-8
            InputStreamReader ISR = new InputStreamReader(FIS, StandardCharsets.UTF_8);
            // Y creamos un buffer para el lector
            BufferedReader Reader = new BufferedReader(ISR);
            // Creamos string temporal
            String StrTemp, Clave, Valor;
            // Contador para registro
            int NoRegistro;
            NoRegistro = Registros.indexOf(ClaveBuscar);
            StrTemp = Reader.readLine();
            while (StrTemp != null){
                if(StrTemp.contains(FinalRegistro20) || 
                        StrTemp.contains(FinalRegistro09))
                {
                    StrTemp = Reader.readLine();
                }
                else
                {
                    if(StrTemp.contains(FinalNoRegistro20) ||
                            StrTemp.contains(FinalNoRegistro09))
                    {
                        StrTemp = Reader.readLine();
                    }
                    else
                    {
                        if(StrTemp.contains(IdentacionRegistro20) ||
                            StrTemp.contains(IdentacionRegistro09))
                        {
                            StrTemp = StrTemp.substring(StrTemp.indexOf('\"') + 1, 
                                    StrTemp.lastIndexOf('\"'));
                            if(StrTemp.equals(ClaveBuscar) || RegistroEncontrado)
                            {
                                if(Registros.contains(StrTemp) || RegistroEncontrado)
                                {
                                    RegistroEncontrado = true;
                                    StrTemp = Reader.readLine();
                                    if(StrTemp.contains(IdentacionNoRegistro20) ||
                                            StrTemp.contains(IdentacionNoRegistro09))
                                    {
                                        while(Registrando)
                                        {
                                            
                                            if(StrTemp.contains("\""))
                                            {
                                                StrTemp = StrTemp.substring(StrTemp.indexOf('\"') + 1, 
                                                StrTemp.length() - 1);
                                                StrTemp = StrTemp.substring(0, StrTemp.indexOf('\"'));
                                            }
                                            if(esEntero(StrTemp))
                                            {
                                                StrTemp = Reader.readLine();
                                                if(StrTemp.contains(IdentacionClave20) ||
                                                        StrTemp.contains(IdentacionClave09))
                                                {
                                                    for(x = 0; x < ClavesPiezas.size(); x++)
                                                    {
                                                        Clave = StrTemp.substring(StrTemp.indexOf('\"') + 1, 
                                                                StrTemp.indexOf(':'));
                                                        Clave = Clave.substring(0, Clave.indexOf('\"'));
                                                        if(StrTemp.indexOf(',') != -1)
                                                        {
                                                            Valor = StrTemp.substring(StrTemp.indexOf(":") + 1, 
                                                            StrTemp.lastIndexOf(','));
                                                        }
                                                        else
                                                        {
                                                            Valor = StrTemp.substring(StrTemp.indexOf(":") + 1, 
                                                            StrTemp.lastIndexOf('\"'));
                                                        }
                                                        if(Valor.lastIndexOf('\"') > 0)
                                                        {
                                                            Valor = Valor.substring(Valor.indexOf('\"') + 1,
                                                            Valor.lastIndexOf('\"'));
                                                        }
                                                        else
                                                        {
                                                           Valor = Valor.substring(Valor.indexOf('\"'),
                                                            Valor.length());
                                                        }
                                                        switch(x)
                                                        {
                                                            case 0:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                PiezaTemp.setID(Valor);
                                                                break;
                                                            }
                                                            case 1:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                PiezaTemp.setNombre(Valor);
                                                                break;
                                                            }
                                                            case 2:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                PiezaTemp.setMarca(Valor);
                                                                break;
                                                            }
                                                            case 3:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                PiezaTemp.setCosto(Valor);
                                                                break;
                                                            }
                                                            case 4:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                PiezaTemp.setDescripcion(Valor);
                                                                break;
                                                            }
                                                            case 5:
                                                            {
                                                                System.out.println("Registrado dato \"" + 
                                                                        Clave + "\":\"" + Valor + '\"');
                                                                PiezaTemp.setStock(Valor);
                                                                break;
                                                            }
                                                        }
                                                        StrTemp = Reader.readLine();
                                                    }
                                                    RegistroPiezas.add(PiezaTemp);
                                                    PiezaTemp = new Pieza();
                                                    StrTemp = Reader.readLine();
                                                }
                                            }
                                            else
                                            {
                                                if(StrTemp.equals(FinalRegistro20) ||
                                                        StrTemp.equals(FinalRegistro09))
                                                {
                                                    Registrando = false;
                                                }
                                                else
                                                {
                                                    if(StrTemp.equals(FinalNoRegistro20) ||
                                                            StrTemp.equals(FinalNoRegistro09))
                                                    {
                                                        StrTemp = Reader.readLine();
                                                    }
                                                    else
                                                    {
                                                        Registrando = false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else
                            {
                                if(StrTemp.equals("}"))
                                {
                                    System.out.println("Llegamos al final");
                                    RegistroEncontrado = false;
                                    StrTemp = null;
                                }
                            }
                        }
                    }
                }
                if(StrTemp != null)
                {   
                    StrTemp = Reader.readLine();
                }
                
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
        return RegistroPiezas;
    }
}

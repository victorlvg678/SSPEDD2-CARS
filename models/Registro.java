/*******************************************************************************
 *                                                                             *
 * Práctica 5 - Login                                                          *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: CARS(Car Automated Repair System)                                 *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210313_build_0)                             *
 * Nombre de Archivo: Registro.java                                            *
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
// Librerías a usar para arreglos
import java.util.ArrayList;
import java.util.Collections;

// Parámetros que indican autor(es) de programa
/**
 * @author Valle Guerra, Victor Leonardo 
 */
// Clase principal de Archivo
public class Registro 
{
    // |------------------------Atributos privados-----------------------------|
    private ArrayList<Usuario> RegistroUsuarios;
    private ArrayList<Cliente> RegistroClientes;
    private ArrayList<Vehiculo> RegistroVehiculos;
    private ArrayList<Reparacion> RegistroReparaciones;
    private ArrayList<Pieza> RegistroPiezas;
    
    
    // |------------------------Métodos privados-------------------------------|
    
    // |------------------------Atributos públicos-----------------------------|
        
    // |------------------------Métodos públicos-------------------------------|
    
    // Constructor de clase
    public void Registro()
    {
        RegistroUsuarios = new ArrayList<>();
        RegistroClientes = new ArrayList<>();
        RegistroVehiculos = new ArrayList<>();
        RegistroReparaciones = new ArrayList<>();
        RegistroPiezas = new ArrayList<>();
    }
    
    // Constructor copia de clase
    public void Registro(Registro RegistroACopiar)
    {
        Collections.copy(RegistroUsuarios, RegistroACopiar.RegistroUsuarios);
        Collections.copy(RegistroClientes, RegistroACopiar.RegistroClientes);
        Collections.copy(RegistroVehiculos, RegistroACopiar.RegistroVehiculos);
        Collections.copy(RegistroReparaciones, RegistroACopiar.RegistroReparaciones);
        Collections.copy(RegistroPiezas, RegistroACopiar.RegistroPiezas);
    }
    
    // |--------------------------Anular---------------------------------------|
    // Método AnulaTodo
    public void AnulaTodo()
    {
        RegistroUsuarios.clear();
        RegistroClientes.clear();
        RegistroVehiculos.clear();
        RegistroReparaciones.clear();
        RegistroPiezas.clear();
    }
    
    // Método AnulaRegistroUsuarios
    public void AnulaRegistroUsuarios()
    {
        RegistroUsuarios.clear();
    }
    
    // Método AnulaRegistroClientes
    public void AnulaRegistroClientes()
    {
        RegistroClientes.clear();
    }
    
    // Método AnulaRegistroVehiculos
    public void AnulaRegistroVehiculos()
    {
        RegistroVehiculos.clear();
    }
    
    // Método AnulaRegistroReparaciones
    public void AnulaRegistroReparaciones()
    {
        RegistroReparaciones.clear();
    }
    
    // Método AnulaRegistroPiezas
    public void AnulaRegistroPiezas()
    {
        RegistroPiezas.clear();
    }
    
    // |------------------------Insertar---------------------------------------|
    
    // Método InsertarUsuarios
    public void InsertarUsuarios(Usuario UsuarioAAsignar)
    {
        RegistroUsuarios.add(UsuarioAAsignar);
    }
    
    // Método InsertarUsuarios con posición
    public void InsertarUsuarios(int Posicion, Usuario UsuarioAAsignar)
    {
        RegistroUsuarios.add(Posicion, UsuarioAAsignar);
    }
    
    // Método InsertarClientes
    public void InsertarClientes(Cliente ClienteAAsignar)
    {
        RegistroClientes.add(ClienteAAsignar);
    }
    
    // Método InsertarClientes con posición
    public void InsertarClientes(int Posicion, Cliente ClienteAAsignar)
    {
        RegistroClientes.add(Posicion, ClienteAAsignar);
    }
    
    // Método InsertarVehiculos
    public void InsertarVehiculos(Vehiculo VehiculoAAsignar)
    {
        RegistroVehiculos.add(VehiculoAAsignar);
    }
    
    // Método InsertarVehiculos con posición
    public void InsertarVehiculos(int Posicion, Vehiculo VehiculoAAsignar)
    {
        RegistroVehiculos.add(Posicion, VehiculoAAsignar);
    }
    
    // Método InsertarReparaciones
    public void InsertarReparaciones(Reparacion ReparacionAAsignar)
    {
        RegistroReparaciones.add(ReparacionAAsignar);
    }
    
    // Método InsertarReparaciones con posición
    public void InsertarReparaciones(int Posicion, Reparacion ReparacionAAsignar)
    {
        RegistroReparaciones.add(Posicion, ReparacionAAsignar);
    }
    
    // Método InsertarPiezas
    public void InsertarPiezas(Pieza PiezaAAsignar)
    {
        RegistroPiezas.add(PiezaAAsignar);
    }
    
    // Método InsertarPiezas con posición
    public void InsertarPiezas(int Posicion, Pieza PiezaAAsignar)
    {
        RegistroPiezas.add(Posicion, PiezaAAsignar);
    }
    
    // |------------------------Eliminar---------------------------------------|
    // Método EliminarUsuarios por objeto
    public boolean EliminarUsuarios(Usuario UsuarioAEliminar)
    {
        return RegistroUsuarios.remove(UsuarioAEliminar);
    }
    
    // Método EliminarUsuarios por posición
    public Usuario EliminarUsuarios(int Posicion)
    {
        return RegistroUsuarios.remove(Posicion);
    }
    
    // Método EliminarClientes por objeto
    public boolean EliminarClientes(Cliente ClienteAEliminar)
    {
        return RegistroClientes.remove(ClienteAEliminar);
    }
    
    // Método EliminarClientes por posición
    public Cliente EliminarClientes(int Posicion)
    {
        return RegistroClientes.remove(Posicion);
    }
    
    // Método EliminarVehiculos por objeto
    public boolean EliminarVehiculos(Vehiculo VehiculoAEliminar)
    {
        return RegistroVehiculos.remove(VehiculoAEliminar);
    }
    
    // Método EliminarVehiculos por posición
    public Vehiculo EliminarVehiculos(int Posicion)
    {
        return RegistroVehiculos.remove(Posicion);
    }
    
    // Método EliminarReparaciones por objeto
    public boolean EliminarReparaciones(Reparacion ReparacionAEliminar)
    {
        return RegistroReparaciones.remove(ReparacionAEliminar);
    }
    
    // Método EliminarReparaciones por posición
    public Reparacion EliminarReparaciones(int Posicion)
    {
        return RegistroReparaciones.remove(Posicion);
    }
    
    // Método EliminarPiezas por objeto
    public boolean EliminarPiezas(Pieza PiezaAEliminar)
    {
        return RegistroPiezas.remove(PiezaAEliminar);
    }
    
    // Método EliminarPiezas por posición
    public Pieza EliminarPiezas(int Posicion)
    {
        return RegistroPiezas.remove(Posicion);
    }
    
    // |-----------------------------Vacio-------------------------------------|
    // Método VacioUsuarios
    public boolean VacioUsuarios()
    {
        return RegistroUsuarios.isEmpty();
    }
    
    // Método VacioClientes
    public boolean VacioClientes()
    {
        return RegistroClientes.isEmpty();
    }
    
    // Método VacioVehiculos
    public boolean VacioVehiculos()
    {
        return RegistroVehiculos.isEmpty();
    }
    
    // Método VacioReparaciones
    public boolean VacioReparaciones()
    {
        return RegistroReparaciones.isEmpty();
    }
    
    // Método VacioPiezas
    public boolean VacioPiezas()
    {
        return RegistroPiezas.isEmpty();
    }
    
    // Método VacioRegistro
    public boolean VacioRegistro()
    {
        if(RegistroUsuarios.isEmpty() && RegistroClientes.isEmpty() &&
            RegistroVehiculos.isEmpty() && RegistroReparaciones.isEmpty() &&
            RegistroPiezas.isEmpty())
        {
            return true;
        }
        return false;
    }
    
    // |-----------------------------Tamano------------------------------------|
    // Método getTamanoUsuarios
    public int getTamanoUsuarios()
    {
        return RegistroUsuarios.size();
    }

    // Método getTamanoClientes
    public int getTamanoClientes()
    {
        return RegistroClientes.size();
    }
    
    // Método getTamanoVehiculos
    public int getTamanoVehiculos()
    {
        return RegistroVehiculos.size();
    }
    
    // Método getTamanoReparaciones
    public int getTamanoReparaciones()
    {
        return RegistroReparaciones.size();
    }
    
    // Método getTamanoPiezas
    public int getTamanoPiezas()
    {
        return RegistroPiezas.size();
    }
    
    // Método getTamanoRegistro
    public int getTamanoRegistro()
    {
        int Usuarios, Clientes, Vehiculos, Reparaciones, Piezas;
        Usuarios = RegistroUsuarios.size();
        Clientes = RegistroClientes.size();
        Vehiculos = RegistroVehiculos.size();
        Reparaciones = RegistroReparaciones.size();
        Piezas = RegistroPiezas.size();
        if((Usuarios == Clientes) && (Usuarios == Vehiculos) && 
            (Usuarios == Reparaciones) && (Usuarios == Piezas))
        {
            return Usuarios;
        }
        else
        {
            return -1;
        }
    
    }
    // |-----------------------------Buscar------------------------------------|
    // Método BuscarUsuarios
    public int BuscarUsuarios(Usuario UsuarioABuscar)
    {
        return RegistroUsuarios.indexOf(UsuarioABuscar);
    }
    
    // Método BuscarClientes
    public int BuscarClientes(Cliente ClienteABuscar)
    {
        return RegistroClientes.indexOf(ClienteABuscar);
    }
    
    // Método BuscarVehiculos
    public int BuscarVehiculos(Vehiculo VehiculoABuscar)
    {
        return RegistroVehiculos.indexOf(VehiculoABuscar);
    }
    
    // Método BuscarReparaciones
    public int BuscarReparaciones(Reparacion ReparacionABuscar)
    {
        return RegistroReparaciones.indexOf(ReparacionABuscar);
    }
    
    // Método BuscarPiezas
    public int BuscarPiezas(Pieza PiezaABuscar)
    {
        return RegistroPiezas.indexOf(PiezaABuscar);
    }
    
    
    // |-----------------------------Getters-----------------------------------|
    // Getter para RegistroUsuarios por posición
    public Usuario getUsuario(int Posicion)
    {
        return RegistroUsuarios.get(Posicion);
    }
    
    // Getter para RegistroClientes por posición
    public Cliente getCliente(int Posicion)
    {
        return RegistroClientes.get(Posicion);
    }
    
    // Getter para RegistroVehiculos por posición
    public Vehiculo getVehiculo(int Posicion)
    {
        return RegistroVehiculos.get(Posicion);
    }
    
    // Getter para RegistroReparaciones por posición
    public Reparacion getReparacion(int Posicion)
    {
        return RegistroReparaciones.get(Posicion);
    }
    
    // Getter para RegistroPiezas por posición
    public Pieza getPiezas(int Posicion)
    {
        return RegistroPiezas.get(Posicion);
    }
    
    // |-----------------------------Setters-----------------------------------|
    // Setter para atributo RegistroUsuarios por posición
    public Usuario setUsuario(int Posicion, Usuario UsuarioAAsignar)
    {
        return RegistroUsuarios.set(Posicion, UsuarioAAsignar);
    }
    
    // Setter para atributo RegistroClientes por posición
    public Cliente setCliente(int Posicion, Cliente ClienteAAsignar)
    {
        return RegistroClientes.set(Posicion, ClienteAAsignar);
    }
    
    // Setter para atributo RegistroVehiculos por posición
    public Vehiculo setVehiculo(int Posicion, Vehiculo VehiculoAAsignar)
    {
        return RegistroVehiculos.set(Posicion, VehiculoAAsignar);
    }
    
    // Setter para atributo RegistroReparaciones por posición
    public Reparacion setReparacion(int Posicion, Reparacion ReparacionAAsignar)
    {
       return RegistroReparaciones.set(Posicion, ReparacionAAsignar);
    }
    
    // Setter para atributo RegistroPiezas por posición
    public Pieza setPieza(int Posicion, Pieza PiezaAAsignar)
    {
        return RegistroPiezas.set(Posicion, PiezaAAsignar);
    }
}

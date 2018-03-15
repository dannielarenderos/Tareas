/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datospersonales;

/**
 *
 * @author DanniR
 */
public class datos{
    
    String nombre;
    String apellido;
    String DUI;
    String correo;
    int cel;
    String cumple;
    String nacionalidad;
    String estadoCivil;
    String carrera;
    String genero;
    String municipio; 
    
    
    
    public datos(String nombre, String apellido, String cumple, String nacionalidad, String DUI, int cel, String correo, String estadoCivil, String carrera, String genero, String municipio)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DUI = DUI;
        this.correo = correo;
        this.cumple = cumple;
        this.cel =  cel;
        this.nacionalidad = nacionalidad;
        this.estadoCivil = estadoCivil;
        this.carrera = carrera;
        this.genero = genero;
        this.municipio = municipio;
                
    }   


    public void printear()
    {
        System.out.println("NOMBRE: " + nombre + " " + apellido);
        System.out.println("DUI: " + DUI);
        System.out.println("CORREO: " + correo);
        System.out.println("FECHA DE NACIMIENTO: " + cumple);
        System.out.println("CELULAR: " + cel);
        System.out.println("NACIONALIDAD: " + nacionalidad);
        System.out.println("DIRECCIÒN: " + municipio);
        System.out.println("GÈNERO: " + genero);
        System.out.println("ESTADO CIVIL: " + estadoCivil);
        System.out.println("CARRERA: " + carrera);


    }
        
}

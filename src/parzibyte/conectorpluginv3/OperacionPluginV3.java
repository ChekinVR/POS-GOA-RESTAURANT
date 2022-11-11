/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parzibyte.conectorpluginv3;

import java.util.ArrayList;

/**
 *
 * @author parzibyte
 */
public class OperacionPluginV3 {
    
    
    public String nombre;
    public ArrayList<Object> argumentos;

    public OperacionPluginV3(String nombre, ArrayList<Object> argumentos) {
        this.nombre = nombre;
        this.argumentos = argumentos;
    }
}

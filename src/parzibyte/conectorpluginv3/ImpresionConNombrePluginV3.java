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
public class ImpresionConNombrePluginV3 {

    public ArrayList<OperacionPluginV3> operaciones;
    public String nombreImpresora;

    public ImpresionConNombrePluginV3(ArrayList<OperacionPluginV3> operaciones, String nombreImpresora) {
        this.operaciones = operaciones;
        this.nombreImpresora = nombreImpresora;
    }
}

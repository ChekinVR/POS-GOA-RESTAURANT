/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parzibyte.conectorpluginv3;

import java.io.IOException;

/**
 *
 * @author parzibyte
 */
public class Main {

    public static void main(String[] args) {

        try {
            String[] impresoras = ConectorPluginV3.obtenerImpresoras();
            System.out.println("Lista de impresoras:");
            for (String impresora : impresoras) {
                System.out.printf("'%s'\n", impresora);
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Error obteniendo impresoras: " + e.getMessage());
        }
       

        String amongUsComoCadena = "000001111000\n000010000100\n000100011110\n000100100001\n011100100001\n010100100001\n010100100001\n010100011110\n010100000010\n011100000010\n000100111010\n000100101010\n000111101110\n000000000000\n000000000000\n000000000000\n111010101110\n100010101000\n111010101110\n001010100010\n111011101110\n000000000000\n000000000000\n000000000000";

        ConectorPluginV3 conectorPluginV3 = new ConectorPluginV3();
        conectorPluginV3.Iniciar()
                .DeshabilitarElModoDeCaracteresChinos()
                .EstablecerAlineacion(ConectorPluginV3.ALINEACION_CENTRO)
                .DescargarImagenDeInternetEImprimir("http://assets.stickpng.com/thumbs/587e32259686194a55adab73.png", 0,
                        216)
                .Feed(1)
                .EscribirTexto("Parzibyte's blog\n")
                .EscribirTexto("Blog de un programador\n")
                .TextoSegunPaginaDeCodigos(2, "cp850", "Teléfono: 123456798\n")
                .EscribirTexto("Fecha y hora: " + "29/9/2022")
                .Feed(1)
                .EstablecerAlineacion(ConectorPluginV3.ALINEACION_IZQUIERDA)
                .EscribirTexto("____________________\n")
                .TextoSegunPaginaDeCodigos(2, "cp850", "Venta de plugin para impresoras versión 3\n")
                .EstablecerAlineacion(ConectorPluginV3.ALINEACION_DERECHA)
                .EscribirTexto("$25\n")
                .EscribirTexto("____________________\n")
                .EscribirTexto("TOTAL: $25\n")
                .EscribirTexto("____________________\n")
                .EstablecerAlineacion(ConectorPluginV3.ALINEACION_CENTRO)
                .HabilitarCaracteresPersonalizados()
                .DefinirCaracterPersonalizado("$", amongUsComoCadena)
                .EscribirTexto("En lugar del simbolo de pesos debe aparecer un among us\n")
                .EscribirTexto("TOTAL: $25\n")
                .EstablecerEnfatizado(true)
                .EstablecerTamanoFuente(1, 1)
                .TextoSegunPaginaDeCodigos(2, "cp850", "¡Gracias por su compra!\n")
                .Feed(1)
                .ImprimirCodigoQr("https://parzibyte.me/blog", 160, ConectorPluginV3.RECUPERACION_QR_MEJOR,
                        ConectorPluginV3.TAMANO_IMAGEN_NORMAL)
                .Feed(1)
                .ImprimirCodigoDeBarrasCode128("parzibyte.me", 80, 192, ConectorPluginV3.TAMANO_IMAGEN_NORMAL)
                .Feed(1)
                .EstablecerTamanoFuente(1, 1)
                .EscribirTexto("parzibyte.me\n")
                .Feed(3)
                .Corte(1)
                .Pulso(48, 60, 120);
        try {
            conectorPluginV3.imprimirEn("ZJ-58");
            System.out.println("Impreso correctamente");
        } catch (Exception e) {
            System.out.println("Error imprimiendo: " + e.getMessage());
        }

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package parzibyte.conectorpluginv3;

import com.fasterxml.jackson.jr.ob.JSON;
import java.io.IOException;
import java.util.ArrayList;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.lang.String;

/**
 *
 * @author parzibyte
 */
public class ConectorPluginV3 {

    public static String URL_PLUGIN_POR_DEFECTO = "http://localhost:8000";
    public static float TAMANO_IMAGEN_NORMAL = 0;
    public static float TAMANO_IMAGEN_DOBLE_ANCHO = 1;
    public static float TAMANO_IMAGEN_DOBLE_ALTO = 2;
    public static float TAMANO_IMAGEN_DOBLE_ANCHO_Y_ALTO = 3;
    public static float ALINEACION_IZQUIERDA = 0;
    public static float ALINEACION_CENTRO = 1;
    public static float ALINEACION_DERECHA = 2;
    public static float RECUPERACION_QR_BAJA = 0;
    public static float RECUPERACION_QR_MEDIA = 1;
    public static float RECUPERACION_QR_ALTA = 2;
    public static float RECUPERACION_QR_MEJOR = 3;

    public ArrayList<OperacionPluginV3> operaciones;
    public String urlPlugin;

    public ConectorPluginV3(String urlPlugin) {
        this.operaciones = new ArrayList<>();
        this.urlPlugin = urlPlugin;
    }

    public ConectorPluginV3() {
        this.urlPlugin = URL_PLUGIN_POR_DEFECTO;
        this.operaciones = new ArrayList<>();
    }

    private void agregarOperacion(OperacionPluginV3 operacion) {
        this.operaciones.add(operacion);
    }

    public ConectorPluginV3 CargarImagenLocalEImprimir(String ruta, float tamano, float maximoAncho) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(ruta);
        argumentos.add(tamano);
        argumentos.add(maximoAncho);
        this.agregarOperacion(new OperacionPluginV3("CargarImagenLocalEImprimir", argumentos));
        return this;
    }

    public ConectorPluginV3 Corte(float lineas) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(lineas);
        this.agregarOperacion(new OperacionPluginV3("Corte", argumentos));
        return this;
    }

    public ConectorPluginV3 CorteParcial() {
        ArrayList<Object> argumentos = new ArrayList<>();
        this.agregarOperacion(new OperacionPluginV3("CorteParcial", argumentos));
        return this;
    }

    public ConectorPluginV3 DefinirCaracterPersonalizado(String caracterRemplazoComoCadena, String matrizComoCadena) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(caracterRemplazoComoCadena);
        argumentos.add(matrizComoCadena);
        this.agregarOperacion(new OperacionPluginV3("DefinirCaracterPersonalizado", argumentos));
        return this;
    }

    public ConectorPluginV3 DescargarImagenDeInternetEImprimir(String urlImagen, float tamano, float maximoAncho) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(urlImagen);
        argumentos.add(tamano);
        argumentos.add(maximoAncho);
        this.agregarOperacion(new OperacionPluginV3("DescargarImagenDeInternetEImprimir", argumentos));
        return this;
    }

    public ConectorPluginV3 DeshabilitarCaracteresPersonalizados() {
        ArrayList<Object> argumentos = new ArrayList<>();
        this.agregarOperacion(new OperacionPluginV3("DeshabilitarCaracteresPersonalizados", argumentos));
        return this;
    }

    public ConectorPluginV3 DeshabilitarElModoDeCaracteresChinos() {
        ArrayList<Object> argumentos = new ArrayList<>();
        this.agregarOperacion(new OperacionPluginV3("DeshabilitarElModoDeCaracteresChinos", argumentos));
        return this;
    }

    public ConectorPluginV3 EscribirTexto(String texto) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(texto);
        this.agregarOperacion(new OperacionPluginV3("EscribirTexto", argumentos));
        return this;
    }

    public ConectorPluginV3 EstablecerAlineacion(float alineacion) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(alineacion);
        this.agregarOperacion(new OperacionPluginV3("EstablecerAlineacion", argumentos));
        return this;
    }

    public ConectorPluginV3 EstablecerEnfatizado(boolean enfatizado) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(enfatizado);
        this.agregarOperacion(new OperacionPluginV3("EstablecerEnfatizado", argumentos));
        return this;
    }

    public ConectorPluginV3 EstablecerFuente(float fuente) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(fuente);
        this.agregarOperacion(new OperacionPluginV3("EstablecerFuente", argumentos));
        return this;
    }

    public ConectorPluginV3 EstablecerImpresionAlReves(boolean alReves) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(alReves);
        this.agregarOperacion(new OperacionPluginV3("EstablecerImpresionAlReves", argumentos));
        return this;
    }

    public ConectorPluginV3 EstablecerImpresionBlancoYNegroInversa(boolean invertir) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(invertir);
        this.agregarOperacion(new OperacionPluginV3("EstablecerImpresionBlancoYNegroInversa", argumentos));
        return this;
    }

    public ConectorPluginV3 EstablecerRotacionDe90Grados(boolean rotar) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(rotar);
        this.agregarOperacion(new OperacionPluginV3("EstablecerRotacionDe90Grados", argumentos));
        return this;
    }

    public ConectorPluginV3 EstablecerSubrayado(boolean subrayado) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(subrayado);
        this.agregarOperacion(new OperacionPluginV3("EstablecerSubrayado", argumentos));
        return this;
    }

    public ConectorPluginV3 EstablecerTamanoFuente(float multiplicadorAncho, float multiplicadorAlto) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(multiplicadorAncho);
        argumentos.add(multiplicadorAlto);
        this.agregarOperacion(new OperacionPluginV3("EstablecerTamañoFuente", argumentos));
        return this;
    }

    public ConectorPluginV3 Feed(float lineas) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(lineas);
        this.agregarOperacion(new OperacionPluginV3("Feed", argumentos));
        return this;
    }

    public ConectorPluginV3 HabilitarCaracteresPersonalizados() {
        ArrayList<Object> argumentos = new ArrayList<>();
        this.agregarOperacion(new OperacionPluginV3("HabilitarCaracteresPersonalizados", argumentos));
        return this;
    }

    public ConectorPluginV3 HabilitarElModoDeCaracteresChinos() {
        ArrayList<Object> argumentos = new ArrayList<>();
        this.agregarOperacion(new OperacionPluginV3("HabilitarElModoDeCaracteresChinos", argumentos));
        return this;
    }

    public ConectorPluginV3 ImprimirCodigoDeBarrasCodabar(String contenido, float alto, float ancho,
            float tamanoImagen) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(contenido);
        argumentos.add(alto);
        argumentos.add(ancho);
        argumentos.add(tamanoImagen);
        this.agregarOperacion(new OperacionPluginV3("ImprimirCodigoDeBarrasCodabar", argumentos));
        return this;
    }

    public ConectorPluginV3 ImprimirCodigoDeBarrasCode128(String contenido, float alto, float ancho,
            float tamanoImagen) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(contenido);
        argumentos.add(alto);
        argumentos.add(ancho);
        argumentos.add(tamanoImagen);
        this.agregarOperacion(new OperacionPluginV3("ImprimirCodigoDeBarrasCode128", argumentos));
        return this;
    }

    public ConectorPluginV3 ImprimirCodigoDeBarrasCode39(String contenido, boolean incluirSumaDeVerificacion,
            boolean modoAsciiCompleto, float alto, float ancho, float tamanoImagen) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(contenido);
        argumentos.add(incluirSumaDeVerificacion);
        argumentos.add(modoAsciiCompleto);
        argumentos.add(alto);
        argumentos.add(ancho);
        argumentos.add(tamanoImagen);
        this.agregarOperacion(new OperacionPluginV3("ImprimirCodigoDeBarrasCode39", argumentos));
        return this;
    }

    public ConectorPluginV3 ImprimirCodigoDeBarrasCode93(String contenido, float alto, float ancho,
            float tamanoImagen) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(contenido);
        argumentos.add(alto);
        argumentos.add(ancho);
        argumentos.add(tamanoImagen);
        this.agregarOperacion(new OperacionPluginV3("ImprimirCodigoDeBarrasCode93", argumentos));
        return this;
    }

    public ConectorPluginV3 ImprimirCodigoDeBarrasEan(String contenido, float alto, float ancho,
            float tamanoImagen) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(contenido);
        argumentos.add(alto);
        argumentos.add(ancho);
        argumentos.add(tamanoImagen);
        this.agregarOperacion(new OperacionPluginV3("ImprimirCodigoDeBarrasEan", argumentos));
        return this;
    }

    public ConectorPluginV3 ImprimirCodigoDeBarrasEan8(String contenido, float alto, float ancho,
            float tamanoImagen) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(contenido);
        argumentos.add(alto);
        argumentos.add(ancho);
        argumentos.add(tamanoImagen);
        this.agregarOperacion(new OperacionPluginV3("ImprimirCodigoDeBarrasEan8", argumentos));
        return this;
    }

    public ConectorPluginV3 ImprimirCodigoDeBarrasPdf417(String contenido, float nivelSeguridad, float alto,
            float ancho, float tamanoImagen) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(contenido);
        argumentos.add(nivelSeguridad);
        argumentos.add(alto);
        argumentos.add(ancho);
        argumentos.add(tamanoImagen);
        this.agregarOperacion(new OperacionPluginV3("ImprimirCodigoDeBarrasPdf417", argumentos));
        return this;
    }

    public ConectorPluginV3 ImprimirCodigoDeBarrasTwoOfFiveITF(String contenido, boolean intercalado, float alto,
            float ancho, float tamanoImagen) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(contenido);
        argumentos.add(intercalado);
        argumentos.add(alto);
        argumentos.add(ancho);
        argumentos.add(tamanoImagen);
        this.agregarOperacion(new OperacionPluginV3("ImprimirCodigoDeBarrasTwoOfFiveITF", argumentos));
        return this;
    }

    public ConectorPluginV3 ImprimirCodigoDeBarrasUpcA(String contenido, float alto, float ancho,
            float tamanoImagen) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(contenido);
        argumentos.add(alto);
        argumentos.add(ancho);
        argumentos.add(tamanoImagen);
        this.agregarOperacion(new OperacionPluginV3("ImprimirCodigoDeBarrasUpcA", argumentos));
        return this;
    }

    public ConectorPluginV3 ImprimirCodigoDeBarrasUpcE(String contenido, float alto, float ancho,
            float tamanoImagen) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(contenido);
        argumentos.add(alto);
        argumentos.add(ancho);
        argumentos.add(tamanoImagen);
        this.agregarOperacion(new OperacionPluginV3("ImprimirCodigoDeBarrasUpcE", argumentos));
        return this;
    }

    public ConectorPluginV3 ImprimirCodigoQr(String contenido, float anchoMaximo, float nivelRecuperacion,
            float tamanoImagen) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(contenido);
        argumentos.add(anchoMaximo);
        argumentos.add(nivelRecuperacion);
        argumentos.add(tamanoImagen);
        this.agregarOperacion(new OperacionPluginV3("ImprimirCodigoQr", argumentos));
        return this;
    }

    public ConectorPluginV3 ImprimirImagenEnBase64(String imagenCodificadaEnBase64, float tamano, float maximoAncho) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(imagenCodificadaEnBase64);
        argumentos.add(tamano);
        argumentos.add(maximoAncho);
        this.agregarOperacion(new OperacionPluginV3("ImprimirImagenEnBase64", argumentos));
        return this;
    }

    public ConectorPluginV3 Iniciar() {
        ArrayList<Object> argumentos = new ArrayList<>();
        this.agregarOperacion(new OperacionPluginV3("Iniciar", argumentos));
        return this;
    }

    public ConectorPluginV3 Pulso(float pin, float tiempoEncendido, float tiempoApagado) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(pin);
        argumentos.add(tiempoEncendido);
        argumentos.add(tiempoApagado);
        this.agregarOperacion(new OperacionPluginV3("Pulso", argumentos));
        return this;
    }

    public ConectorPluginV3 TextoSegunPaginaDeCodigos(float numeroPagina, String pagina, String texto) {
        ArrayList<Object> argumentos = new ArrayList<>();
        argumentos.add(numeroPagina);
        argumentos.add(pagina);
        argumentos.add(texto);
        this.agregarOperacion(new OperacionPluginV3("TextoSegunPaginaDeCodigos", argumentos));
        return this;
    }

    public boolean imprimirEn(String impresora) throws Exception, IOException, InterruptedException {
        ImpresionConNombrePluginV3 impresionConNombre = new ImpresionConNombrePluginV3(this.operaciones, impresora);
        String postEndpoint = this.urlPlugin + "/imprimir";
        String inputJson = JSON.std.asString(impresionConNombre);
        var request = HttpRequest.newBuilder().uri(URI.create(postEndpoint)).header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(inputJson)).build();
        var client = HttpClient.newHttpClient();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new Exception("código de respuesta distinto a 200. Verifique que el plugin se está ejecutando");
        }
        String respuesta = response.body();
        if (respuesta.equals("true\n")) {
            return true;
        } else {
            throw new Exception("petición ok pero error en el servidor: " + respuesta);
        }
    }

    public static String[] obtenerImpresoras(String urlPlugin) throws InterruptedException, IOException {
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(urlPlugin + "/impresoras"))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body().replace("[", "").replace("]", "").replace("\n", "").replace("\"", "").split(",");
    }

    public static String[] obtenerImpresoras() throws InterruptedException, IOException {
        return obtenerImpresoras(URL_PLUGIN_POR_DEFECTO);
    }

}

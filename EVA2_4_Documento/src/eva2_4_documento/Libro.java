/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_4_documento;

/**
 *
 * @author invitado
 */
public class Libro extends Documento {
    private String genero;
    private int fecha_publicacion;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(int fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }
}

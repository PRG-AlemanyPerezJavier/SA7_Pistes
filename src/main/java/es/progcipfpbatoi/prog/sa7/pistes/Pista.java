
package es.progcipfpbatoi.prog.sa7.pistes;

import java.util.Objects;

public class Pista {
    private int id;
    private String descripcion;
    private Categorias categoria;
    private int confiabilidad;
    private String fecha;

    //constructor
    public Pista(int id, String descripcion, Categorias categoria, int confiabilidad, String fecha) {
        this.id = id;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.confiabilidad = confiabilidad;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pista{" + "id=" + id + ", descripcion=" + descripcion + ", categoria=" + categoria + ", confiabilidad=" + confiabilidad + ", fecha=" + fecha + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pista other = (Pista) obj;
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false; //falta comparar solo el 80% del contenido
        }
        return Objects.equals(this.categoria, other.categoria);
    }
    
    
}

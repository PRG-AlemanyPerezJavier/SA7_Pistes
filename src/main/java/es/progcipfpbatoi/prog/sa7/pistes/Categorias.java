package es.progcipfpbatoi.prog.sa7.pistes;

/**
 *
 * @author jalpe
 */
public enum Categorias {
    GOBIERNO, TECNOLOGIA, MISTERIO, CORRUPCION;
    
    public static Categorias fromString(String texto) {
        for (Categorias c : Categorias.values()) {
            if (c.name().equalsIgnoreCase(texto)) {
                return c;
            }
        }
        return null;
    }
}

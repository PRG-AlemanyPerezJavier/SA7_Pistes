package es.progcipfpbatoi.prog.sa7.pistes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class GestorPistas {

    ArrayList<Pista> listaPistas = new ArrayList<>();
    HashSet<Pista> listaPistasArchivadas = new HashSet<>();

    HashMap<String, ArrayList<Pista>> investigaciones = new HashMap<>();

    public GestorPistas() {
        // Inicializamos las estructuras
        this.listaPistas = new ArrayList<>();
        this.listaPistasArchivadas = new HashSet<>();
        this.investigaciones = new HashMap<>();

        // Metodo para cargar datos random
        cargarDatosDePrueba();
    }

    private void cargarDatosDePrueba() {

        Pista p1 = new Pista(1, "Huella dactilar", Categorias.MISTERIO, 8, "2023-10-25");
        Pista p2 = new Pista(2, "Testimonio clave", Categorias.GOBIERNO, 6, "2023-10-26");
        Pista p3 = new Pista(3, "Grabación CCTV", Categorias.TECNOLOGIA, 9, "2023-10-27");

        // Añadir a la lista (acepta repetidos)
        listaPistas.add(p1);
        listaPistas.add(p1); 

        // Añadir al conjunto (no permite repetidos)
        listaPistasArchivadas.add(p1);
        listaPistasArchivadas.add(p2);

        // Añadir al diccionario por investigación
        String idCaso = "Operación Alpha";
        investigaciones.put(idCaso, new ArrayList<>());
        investigaciones.get(idCaso).add(p1);
        investigaciones.get(idCaso).add(p3);
    }
    
    public void anadirPista() {
        System.out.print("Ingresa la descripcion de la pista: ");
        Scanner kb = new Scanner(System.in);
        String descripcion = kb.nextLine();
        
    }
}

package cat.vidalibarraquer.dam;

import java.util.Scanner; //Import no utilitzat (Code Smell)

public class GestioNotes {
    // Falten constructors, getters i setters (S'utilitzaran assistents)
    private String nomAlumne;
    private double[] llistaNotes;

    public static void main(String[] args) {
        // Codi mal indentat per provar Indent Reinbow i l'autoformatat
        double[] notesAlumne = { 7.5, 4.0, 9.2, 3.5, 6.8 };
        int totalAssignatures = 5;

        System.out.println("SISTEMA DE GESTIÓ DE NOTES");

        // Error de sintaxi inicial (falta un punt i coma o parèntesi per a Error)
        double mitjana = calcularMitjana(notesAlumne);

        System.out.println("La mitjana calculada és: " + mitjana);

        if (mitjana >= 5.0) {
            System.out.println("Estat: APROVAT");
        } else {
            System.out.println("Estat: SUSPÈS");
        }
    }

    public static double calcularMitjana(double[] notes) {
        double suma = 0;
        // BUG LÒGIC: Condició 'i <= v.length' provocarà ArrayIndexOutOfBoundsEx
        for (int i = 0; i < notes.length; i++) {
            suma += notes[i];
        }
        return suma / notes.length;
    }

    public String getNomAlumne() {
        return nomAlumne;
    }

    public void setNomAlumne(String nomAlumne) {
        this.nomAlumne = nomAlumne;
    }

    public double[] getLlistaNotes() {
        return llistaNotes;
    }

    public void setLlistaNotes(double[] llistaNotes) {
        this.llistaNotes = llistaNotes;
    }
}
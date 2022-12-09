package epsi.biblio.entites;

import java.util.List;
import java.util.ArrayList;

public class Emprunteur {
    private final String numero, prenom, nom, ville;
    private final List<Livre> emprunts = new ArrayList<Livre>();
    
    public Emprunteur(String numero, String prenom, String nom, String ville) {
        this.numero = numero;
        this.prenom = prenom;
        this.nom    = nom;
        this.ville  = ville;
    }
    public String getNumero() {
        return this.numero;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public String getNom() {
        return this.nom;
    }
    public String getVille() {
        return this.ville;
    }
    public void emprunter(Livre l) {
        this.emprunts.add(l);
    }
    public int getNombreEmprunts() {
        return this.emprunts.size();
    }
    public Iterable<Livre> getLivres() {
        return this.emprunts;
    }
}

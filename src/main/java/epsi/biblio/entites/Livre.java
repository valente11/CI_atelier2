package epsi.biblio.entites;

public class Livre {
    private String isbn, titre;

    public Livre(String isbn, String titre) {
        this.isbn = isbn;
        this.titre = titre;        
    }
    public String getIsbn() {
        return this.isbn;
    }
    public String getTitre() {
        return this.titre;
    }
}

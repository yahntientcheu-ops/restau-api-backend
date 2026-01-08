package fr.restau.model;

public class Categorie {
    private long id;
    private String nom;
    private String iconeUrl;
    public Categorie() {}

    public Categorie(long id, String nom, String iconeUrl) {
        this.id = id;
        this.nom = nom;
        this.iconeUrl = iconeUrl;
    }

    // Getters et Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getIconeUrl() { return iconeUrl; }
    public void setIconeUrl(String iconeUrl) { this.iconeUrl = iconeUrl; }
}

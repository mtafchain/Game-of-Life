package JeuDeLaVie;

public class Cellule {
    private String cellule;

    /**
     * Etat peut prendre 1 pour une cellule vivante, 0 pour une cellule morte, " " pour une cellule inexistante
     * @param etat
     */

    public Cellule(String etat) {
        this.cellule = etat;
    }

    public String getCellule() {
        return cellule;
    }

    public void setCellule(String etat) {
        this.cellule = etat;
    }
    
}

package JeuDeLaVie;

public class Plateau {
    private Cellule[][] plateau;

    public Plateau() {
        this.plateau = new Cellule[5][5];
    }

    public Cellule[][] add(int ligne, int colonne, Cellule cellule) {
        plateau[ligne][colonne] = cellule;
        return plateau;
    }

    public String celluleVivante(int ligne, int colonne, String etat) { // doit renvoyer une cellule et non un tableau
                                                                         // de cellule
        int celluleVoisin = 0;

        if ((ligne - 1 > 0 && ligne - 1 < ligne) && (colonne - 1 > 0 && colonne - 1 < colonne)) {
            if (plateau[ligne - 1][colonne - 1].getCellule() == "1") {
                celluleVoisin += 1;
            }
        }
        if (ligne - 1 > 0 && ligne - 1 < ligne) {
            if (plateau[ligne - 1][colonne].getCellule() == "1") {
                celluleVoisin += 1;
            }
        }
        if ((ligne - 1 > 0 && ligne - 1 < ligne) && (colonne + 1 < colonne && colonne + 1 > 0)) {
            if (plateau[ligne - 1][colonne + 1].getCellule() == "1") {
                celluleVoisin += 1;
            }
        }
        if (colonne - 1 > 0 && colonne - 1 > colonne) {
            if (plateau[ligne][colonne - 1].getCellule() == "1") {
                celluleVoisin += 1;
            }
        }
        if (colonne + 1 < colonne && colonne + 1 > 0) {
            if (plateau[ligne][colonne + 1].getCellule() == "1") {
                celluleVoisin += 1;
            }
        }
        if ((ligne + 1 < ligne && ligne + 1 > 0) && (colonne - 1 > colonne && colonne - 1 > 0)) {
            if (plateau[ligne + 1][colonne - 1].getCellule() == "1") {
                celluleVoisin += 1;
            }
        }
        if ((ligne + 1 < ligne && ligne + 1 > 0)) {
            if (plateau[ligne + 1][colonne].getCellule() == "1") {
                celluleVoisin += 1;
            }
        }
        if ((ligne + 1 < ligne && ligne + 1 > 0) && (colonne + 1 > 0 && colonne + 1 < colonne)) {
            if (plateau[ligne + 1][colonne + 1].getCellule() == "1") {
                celluleVoisin += 1;
            }
        }
        System.out.println(celluleVoisin);
        if (celluleVoisin == 3 && etat == " ") {
            Cellule naissanceCellule = new Cellule("1");
            return naissanceCellule.getCellule();
        } else if ((celluleVoisin == 2 || celluleVoisin == 3)
                && etat == "1") {
            plateau[ligne][colonne].setCellule("1");
            return "";
        }
        plateau[ligne][colonne].setCellule(" ");
        return "";
    }

    public void boucleTableau() {
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau[i].length; j++) {
                celluleVivante(i, j, plateau[i][j].getCellule());
            }
        }
    }

    @Override
    public String toString() {
        String resultat = "";
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau[i].length; j++) {
                String aide = plateau[i][j].getCellule();
                resultat += aide;
            }
            resultat += "\n";
        }
        return resultat;
    }

    public static void main(String[] args) {
        Plateau plateau = new Plateau();
        Cellule cellule = new Cellule("1");
        Cellule cellule2 = new Cellule(" ");
        Cellule cellule3 = new Cellule(" ");
        Cellule cellule4 = new Cellule("1");
        Cellule cellule5 = new Cellule(" ");
        Cellule cellule6 = new Cellule("1");

        plateau.add(0, 0, cellule6);
        plateau.add(0, 1, cellule5);
        plateau.add(0, 2, cellule4);
        plateau.add(0, 3, cellule3);
        plateau.add(0, 4, cellule2);

        plateau.add(1, 0, cellule);
        plateau.add(1, 1, cellule6);
        plateau.add(1, 2, cellule6);
        plateau.add(1, 3, cellule6);
        plateau.add(1, 4, cellule6);

        plateau.add(2, 0, cellule);
        plateau.add(2, 1, cellule6);
        plateau.add(2, 2, cellule6);
        plateau.add(2, 3, cellule6);
        plateau.add(2, 4, cellule6);

        plateau.add(3, 0, cellule);
        plateau.add(3, 1, cellule6);
        plateau.add(3, 2, cellule6);
        plateau.add(3, 3, cellule6);
        plateau.add(3, 4, cellule6);

        plateau.add(4, 0, cellule);
        plateau.add(4, 1, cellule6);
        plateau.add(4, 2, cellule6);
        plateau.add(4, 3, cellule6);
        plateau.add(4, 4, cellule6);

        plateau.boucleTableau();
        System.out.println(plateau.toString());

    }
}

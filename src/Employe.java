import java.util.Objects;

public class Employe implements Comparable<Employe>{
    int identifiant;
    String nom;
    String prenom;
    String nomDepartement;
    int grade;

    public Employe() {

    }
    public Employe(int identifiant, String nom, String prenom, String nomDepartement, int grade) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe employe)) return false;
        return getIdentifiant() == employe.getIdentifiant() && Objects.equals(getNom(), employe.getNom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdentifiant(), getNom());
    }

    @Override
    public String toString() {
        return "Employe{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Employe o) {

        return this.identifiant-o.getIdentifiant();
    }
}

import java.util.Objects;

public class Departement {
    int id;
    String nomdepartement;
    int nbremploye;


    public Departement(int id, String nomdepartement, int nbremploye) {
        this.id = id;
        this.nomdepartement = nomdepartement;
        this.nbremploye = nbremploye;
    }

    public Departement() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomdepartement() {
        return nomdepartement;
    }

    public void setNomdepartement(String nomdepartement) {
        this.nomdepartement = nomdepartement;
    }

    public int getNbremploye() {
        return nbremploye;
    }

    public void setNbremploye(int nbremploye) {
        this.nbremploye = nbremploye;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomdepartement='" + nomdepartement + '\'' +
                ", nbremploye=" + nbremploye +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement that)) return false;
        return getId() == that.getId() && Objects.equals(getNomdepartement(), that.getNomdepartement());
    }


}

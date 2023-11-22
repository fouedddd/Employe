import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement{



    Set<Departement> hash = new HashSet<>();
    @Override
    public void ajouterDepartement(Object o) {
        hash.add((Departement) o);

    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for(Departement departement:hash){
            if(departement.getNomdepartement().equals(nom)){
                return true;
            }
        }


        return false;
    }

    @Override
    public boolean rechercherDepartement(Object o) {
        hash.contains((Departement) o);
        return false;
    }

    @Override
    public void supprimerDepartement(Object o) {
        hash.remove((Departement) o);

    }

    @Override
    public void displayDepartement() {
        System.out.println(hash.toString());

    }

    @Override
    public TreeSet trierDepartementById() {


        Comparator<Departement> DepartementComparator= new Comparator<Departement>() {
            @Override
            public int compare(Departement o1, Departement o2) {
                return o1.getId()-(o2.getId());
            }
        };
        return null;
    }

}

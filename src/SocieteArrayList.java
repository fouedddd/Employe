import java.util.*;

public class SocieteArrayList implements IGestion{
    List <Employe> employes=new ArrayList<>();
    @Override
    public void ajouterEmploye(Object o) {
        employes.add((Employe) o);

    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(Employe employe:employes){
            if(employe.getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Object o) {
      employes.contains(o);
        return false;
    }

    @Override
    public void supprimerEmploye(Object o) {
        employes.remove(o);

    }

    @Override
    public void displayEmploye() {
        System.out.printf(employes.toString());

    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);

    }


    @Override
    public void trierEmployeParNomDépartementEtGrade() {

        Comparator<Employe> employeComparator= new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getNom().compareTo(o2.getNom());
            }
        };

        Comparator<Employe> gradeComparator= new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getGrade() - o2.grade;
            }
        };
        Collections.sort(employes,employeComparator.thenComparing(gradeComparator));

    }

}

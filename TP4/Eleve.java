public class Eleve extends Personne {

    protected String section;
    protected int nbj =0;

    public Eleve(String n, String p, int a, String s,int nb) {
        super(n, p, a);
        this.section= s;
        this.nbj=nb;
        
    }
    public void afficher()
{
System.out.println("Nom :"+nom+" prenom : "+prenom+" age : "+age+"Section"+section+"nombre de jour d'absence"+nbj);
}
public int IncAbsence()
{

    return nbj+=nbj;
    
    
}
    
}


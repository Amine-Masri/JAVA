public class Prof extends Personne
{
    protected String matiere;
public Prof(String n, String p, int a, String m) {
        super(n, p, a);
        this.matiere = m;
    }
    public void afficher()
{
System.out.println("Nom :"+nom+" prenom : "+prenom+" age : "+age+"Matiére"+matiere);
}
}
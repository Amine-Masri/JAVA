public class Test
{
static public void main(String[] args)
{
Personne p0 = new Personne("Ben Mahmoud","Karim",25);
p0.afficher();
Prof p1 = new Prof("Romdhane","Ali",40,"informatique");
p1.afficher();
Eleve p2 = new Eleve("Youssef","Samira",20," 2 BTS Developpeur ", 2);
p2.afficher();
p2.IncAbsence();
p2.IncAbsence();
p2.afficher();
}
}
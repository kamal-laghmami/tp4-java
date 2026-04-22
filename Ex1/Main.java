package Ex1;

public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("laghmami", "kamal", 20, "1ème année id", 20);

        System.out.println(e1.sePresenter());
        System.out.println("Majeur: " + e1.estMajeur());

        System.out.println("Le profil de L'etudiant: ");
        e1.afficherProfil();
    }
}
public class Main {
    public static void main(String[] args) {
        // Création d'un compte courant
        CheckingAccount checking = new CheckingAccount();
        checking.account = "CC-001";
        checking.balance = 1500.0;

        // Création d'un compte d'épargne
        SavingsAccount savings = new SavingsAccount();
        savings.account = "CE-001";
        savings.balance = 5000.0;

        // Création d'un certificat de dépôt
        COD cod = new COD();
        cod.account = "COD-001";
        cod.balance = 10000.0;

        // Affichage des informations
        System.out.println("Compte courant : " + checking.account + ", solde : " + checking.balance);
        System.out.println("Compte épargne : " + savings.account + ", solde : " + savings.balance);
        System.out.println("COD : " + cod.account + ", solde : " + cod.balance);
    }
}
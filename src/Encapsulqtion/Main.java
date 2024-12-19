package Encapsulqtion;

public class Main {
    public static void main(String[] args) {
        Employe emp = new Employe();
        emp.setNom("Jean Dupont");
        emp.setAge(30);
        System.out.println(emp);

        System.out.println("Nom de l'employé : " + emp.getNom());
        System.out.println("Âge de l'employé : " + emp.getAge());
    }
}

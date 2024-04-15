package PRIMEIRO_BIMESTRE.lists.Lista6.lista6;

public class Gerente extends Endereco {

    String name;
    int age;
    Loja store;
    float baseSalary;
    float[] receivedSalary = { 2000f, 2350f, 2237f };

    public Gerente(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.baseSalary = salary;
    }

    public void presentation() {
        System.out.println("Ola, sou o(a) gerente(a) ".concat(name)
                .concat(" tenho " + age + " anos e trabalho na loja " + this.store.popularName));
    }

    public void calculateAverage() {
        double average = 0;
        for (double value : receivedSalary) {
            average += value;
        }

        System.out.println("A media de salarios: " + (average / 3));
    }

    public void calculateBonus() {
        double bonus = 0;
        bonus = baseSalary * 0.35;
        System.out.println("O bonus salarial: " + bonus);
    }
}

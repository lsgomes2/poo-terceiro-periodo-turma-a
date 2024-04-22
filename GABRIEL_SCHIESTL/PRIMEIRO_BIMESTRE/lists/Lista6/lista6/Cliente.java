package PRIMEIRO_BIMESTRE.lists.Lista6.lista6;

public class Cliente extends Endereco {
    String name;
    Integer age;

    public Cliente(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void presentation() {
        System.out.println("Ola, sou o(a) ".concat(name)
                .concat(" e tenho ") + age + " anos");
    }
}

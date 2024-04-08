package primeirobimestre.Exemplos;

public class Professor {

    String nome;

    String materia;


    public void apresentarsea() {

        String msg = "Olá! Sou o Professor(a) "
            .concat(nome)
            .concat(" e vou lecionar ")
            .concat(materia);

        System.out.println(msg);
    }
  








}
package primeirobimestre.aulasete.java;

import java.util.Scanner;

public class aulasete {
    
    public static void main(String[] args) {
        Ninja ninjaUm = new Ninja()
        Ninja ninjaDois = new Ninja()

        ninjaUm.nome = "Naruto";
        ninjaUm.aldeia = "Folha";
        ninjaUm.cla = "Uzumaki";
        ninjaUm.idade = 16;
        ninjaUm.equipamento = "Shuriken";
        ninjaUm.nomeJutso = "Rasengan";

        ninjaUm.nome = "Goku";
        ninjaUm.aldeia = "Sayajin";
        ninjaUm.cla = "Super";
        ninjaUm.idade = 30;
        ninjaUm.equipamento = "Ki";
        ninjaUm.nomeJutso = "Kaioken";

        ninjaUm.apresentarse();
        ninjaUm.realizarJutso();

        ninjaDois.apresentarse();
        ninjaDois.realizarJutso();

   }



}

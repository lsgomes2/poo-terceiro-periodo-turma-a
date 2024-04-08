package trabalho_5_flores;

public class Vendendor {

    String Name,City , Street, Neighborhood,Loja;
    int Age;
    Float Salario_bas,Bonus;
    

    public Vendendor(String Name, int Age, String City,
    String Neighborhood, String Street, Float Salario_bas, String Loja) {

        this.Age=Age;
        this.City=City;
        this.Loja=Loja;
        this.Name=Name;
        this.Neighborhood=Neighborhood;
        this.Salario_bas=Salario_bas;
        this.Street=Street;
        this.Bonus=Bonus;
        
    }

    void apresentarSe(){

        System.out.println("Nome: "+Name+"\nIdade: "+Age+"\nLoja:"+Loja+"\nSalario: "+Salario_bas+"\nBonus salarial: "+calcularBonus()+"\n\n\n");

    }

    float calcularBonus(){
        this.Bonus=Salario_bas*0.2f;
        return this.Bonus;
    }


    
}

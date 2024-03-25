import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CalculadoraDeVendas3 {

    static List<Venda> registrosDeVendas = new ArrayList<>();
    static Map<Integer, Double> vendasPorDia = new HashMap<>();
    static Map<Integer, Double> vendasPorMes = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    enum MenuOption {
        REGISTRAR_VENDA(1), EXIBIR_REGISTROS(2), EXIBIR_TOTAL_VENDAS(3), SAIR(4);

        final int option;

        MenuOption(int option) {
            this.option = option;
        }

        static MenuOption fromInt(int option) {
            for (MenuOption mo : MenuOption.values()) {
                if (mo.option == option) {
                    return mo;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1 - Registrar Venda");
            System.out.println("2 - Exibir Registros de Vendas");
            System.out.println("3 - Exibir Quantidade Total de Vendas por Dia e Mês");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            MenuOption selectedOption = MenuOption.fromInt(opcao);

            if (selectedOption == null) {
                System.out.println("Opção inválida! Por favor, tente novamente.");
                continue;
            }

            switch (selectedOption) {
                case REGISTRAR_VENDA:
                    registrarVenda();
                    break;
                case EXIBIR_REGISTROS:
                    exibirRegistrosDeVendas();
                    break;
                case EXIBIR_TOTAL_VENDAS:
                    exibirQuantidadeTotalDeVendasPorDiaEMes();
                    break;
                case SAIR:
                    continuar = false;
                    break;
            }
        }

        System.out.println("Obrigado por usar a calculadora. Até mais!");
        scanner.close();
    }

    private static void registrarVenda() {
        // Implemente a lógica para registrar uma venda aqui, seguindo a estrutura anterior.
        // Certifique-se de validar as entradas do usuário.
    }

    private static void exibirRegistrosDeVendas() {
        // Implemente a lógica para exibir os registros de vendas aqui.
    }

    private static void exibirQuantidadeTotalDeVendasPorDiaEMes() {
        // Implemente a lógica para exibir as vendas totais por dia e mês aqui.
    }

    // Implemente a classe Venda e qualquer outra funcionalidade necessária aqui.
}

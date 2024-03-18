
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atv2 {
    private static List<Sale> sales = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n[1] - Calcular preço total");
            System.out.println("[2] - Calcular troco");
            System.out.println("[3] - Histórico de vendas");
            System.out.println("[4] - Sair");
            System.out.print("Digite sua escolha: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Digite a quantidade de plantas: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Digite o preço por unidade: ");
                    double pricePerUnit = scanner.nextDouble();
                    double totalPrice = applySpecialDiscount(quantity, pricePerUnit);
                    System.out.printf("O preço total é: %.2f\n", totalPrice);
                    recordSale(quantity, totalPrice);
                    break;
                case 2:
                    System.out.print("Digite o valor pago pelo cliente: ");
                    double amountPaid = scanner.nextDouble();
                    System.out.print("Digite o custo total da compra: ");
                    double totalCost = scanner.nextDouble();
                    double change = calculateChange(amountPaid, totalCost);
                    System.out.printf("O troco é: %.2f\n", change);
                    break;
                case 3:
                    displaySalesHistory();
                    break;
                case 4:
                    System.out.println("Saindo do aplicativo...");
                    break;
                default:
                    System.out.println("Escolha inválida. Por favor, tente novamente.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static double applySpecialDiscount(int quantity, double pricePerUnit) {
        if (quantity >= 10) {
            double discount = pricePerUnit * 0.05;
            return quantity * (pricePerUnit - discount);
        } else {
            return calculateTotalPrice(quantity, pricePerUnit);
        }
    }

    public static double calculateTotalPrice(int quantity, double pricePerUnit) {
        return quantity * pricePerUnit;
    }

    public static double calculateChange(double amountPaid, double totalCost) {
        return amountPaid - totalCost;
    }

    public static void recordSale(int quantity, double totalPrice) {
        Sale sale = new Sale(quantity, totalPrice);
        sales.add(sale);
        System.out.println("Venda registrada com sucesso:");
        System.out.println("Quantidade de plantas: " + quantity);
        System.out.printf("Preço total: %.2f\n", totalPrice);
    }

    public static void displaySalesHistory() {
        System.out.println("Histórico de vendas:");
        for (Sale sale : sales) {
            System.out.println("Quantidade de plantas: " + sale.getQuantity());
            System.out.printf("Preço total: %.2f\n", sale.getTotalPrice());
            System.out.println("-------------------------");
        }
    }

    static class Sale {
        private int quantity;
        private double totalPrice;

        public Sale(int quantity, double totalPrice) {
            this.quantity = quantity;
            this.totalPrice = totalPrice;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getTotalPrice() {
            return totalPrice;
        }
    }
}

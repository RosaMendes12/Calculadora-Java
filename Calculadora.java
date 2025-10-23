import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String opc = "S";

            while (opc.equalsIgnoreCase("S")) {
                int valor1 = 0;
                int valor2 = 0;

                try {
                    // Escolher operação
                    System.out.println("=== Calculadora ===");
                    System.out.println("Escolha a operação:");
                    System.out.println("1 - Soma");
                    System.out.println("2 - Subtração");
                    System.out.println("3 - Multiplicação");
                    System.out.println("4 - Divisão");
                    System.out.print("Digite o número da operação: ");
                    int operacao = scanner.nextInt();

                    System.out.print("Digite o valor 1: ");
                    valor1 = scanner.nextInt();

                    System.out.print("Digite o valor 2: ");
                    valor2 = scanner.nextInt();

                    double resultado = 0;

                    switch (operacao) {
                        case 1:
                            resultado = valor1 + valor2;
                            System.out.printf("A soma de %d e %d é %.2f%n", valor1, valor2, resultado);
                            break;
                        case 2:
                            resultado = valor1 - valor2;
                            System.out.printf("A subtração de %d por %d é %.2f%n", valor1, valor2, resultado);
                            break;
                        case 3:
                            resultado = valor1 * valor2;
                            System.out.printf("A multiplicação de %d por %d é %.2f%n", valor1, valor2, resultado);
                            break;
                        case 4:
                            if (valor2 == 0) {
                                System.out.println("Erro: divisão por zero não é permitida.");
                            } else {
                                resultado = (double) valor1 / valor2;
                                System.out.printf("A divisão de %d por %d é %.2f%n", valor1, valor2, resultado);
                            }
                            break;
                        default:
                            System.out.println("Opção inválida. Escolha de 1 a 4.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Erro: digite apenas números inteiros.");
                    scanner.nextLine(); // limpa o buffer
                    continue;
                }

                System.out.print("\nDeseja realizar outra operação? (s para sim): ");
                opc = scanner.next();
                System.out.println();
            }

            System.out.println("Encerrando o programa.");
            scanner.close();
        }
    }
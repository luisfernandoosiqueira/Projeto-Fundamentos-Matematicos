package application;

import entities.Vetor;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Variável criada para ser usado no Menu
        int opcao;

        // Cria duas listas. Uma lista para os vetores de dois elementos e outra lista para vetores de 3 elementos.
        List<Vetor> vetor2 = new ArrayList<>();
        List<Vetor> vetor3 = new ArrayList<>();

        // Tratamento de exceções
        try {

            // Loop principal do programa. Executa repetidamente até que o usuário escolha sair (opção 10).
            do {
                // Apresentação do menu de opções para o usuário.
                System.out.println("\nMenu - Escolha uma opção:");
                System.out.println("1. Adicionar vetor de 2 elementos");
                System.out.println("2. Adicionar vetor de 3 elementos");
                System.out.println("3. Remover vetor de 2 elementos");
                System.out.println("4. Remover vetor de 3 elementos");
                System.out.println("5. Calcular Magnitude - Vetores no Plano");
                System.out.println("6. Calcular Produto Escalar entre dois vetores");
                System.out.println("7. Calcular ângulo entre dois vetores");
                System.out.println("8. Determinar o vetor ortogonal a um dado vetor");
                System.out.println("9. Calcular produto vetorial entre dois vetores");
                System.out.println("10. Sair");

                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt(); // Captura a opção escolhida pelo usuário.
                sc.nextLine();

                // Estrutura switch para tratar a opção escolhida pelo usuário.
                switch (opcao) {

                    // O usuário irá adicionar um vetor na lista de dois elementos. Será instanciado um obejto a cada repetição
                    case 1:

                        System.out.println("Digite as coordenadas:");

                        System.out.print("X: ");
                        double x2 = sc.nextDouble();

                        System.out.print("Y: ");
                        double y2 = sc.nextDouble();
                        
                        double z = 0;
                        
                        // instancia o objeto e adiciona na lista de dois elementos
                        vetor2.add(new Vetor(x2, y2, z));

                        break;

                    // O usuário irá adicionar um vetor na lista de três elementos. Será instanciado um objeto a cada repetição
                    case 2:

                        System.out.println("Digite as coordenadas:");

                        System.out.print("X: ");
                        double x3 = sc.nextDouble();

                        System.out.print("Y: ");
                        double y3 = sc.nextDouble();

                        System.out.print("Z: ");
                        double z3 = sc.nextDouble();

                        // instancia o objeto e adiciona na lista de três elementos
                        vetor3.add(new Vetor(x3, y3, z3));

                        break;

                    // O usuário irá remover um vetor da lista com três elementos   
                    case 3:

                        // Imprimindo a lista de vetores com dois elementos
                        System.out.println();
                        System.out.println("Lista de vetores com dois elementos");

                        for (int i = 0; i < vetor2.size(); i++) {
                            System.out.println((i + 1) + " - "
                                    + "("
                                    + vetor2.get(i).getX()
                                    + ", "
                                    + vetor2.get(i).getY() + ");");
                        }

                        System.out.println();

                        // O usuário irá escolher o vetor a ser removido de acordo com a lista apresentada
                        System.out.println();
                        System.out.println("Escolha qual vetor deseja remover:");

                        int remove2 = sc.nextInt();
                        remove2 = remove2 - 1;

                        // remove o vetor selecionado
                        vetor2.remove(remove2);

                        break;

                    // O usuário irá remover um vetor da lista com três elementos     
                    case 4:

                        // Imprimindo a lista de vetores com três elementos
                        System.out.println();
                        System.out.println("Lista de vetores com três elementos");

                        for (int i = 0; i < vetor3.size(); i++) {
                            System.out.println((i + 1) + " - "
                                    + "("
                                    + vetor3.get(i).getX()
                                    + ", "
                                    + vetor3.get(i).getY()
                                    + ", "
                                    + vetor3.get(i).getZ() + ");");
                        }

                        System.out.println();

                        // O usuário irá escolher o vetor a ser removido de acordo com a lista apresentada
                        System.out.println("Escolha qual vetor deseja remover:");

                        int remove3 = sc.nextInt();
                        remove3 = remove3 - 1;

                        // remove o vetor selecionado
                        vetor2.remove(remove3);

                        break;

                    // Será calculado a magnitudde. A lista será apresentda para escolha dos vetores   
                    case 5:

                        // Imprimindo a lista de vetores com dois elementos
                                                System.out.println();
                        System.out.println("Lista de vetores com dois elementos");

                        for (int i = 0; i < vetor2.size(); i++) {
                            System.out.println((i + 1) + " - "
                                    + "("
                                    + vetor2.get(i).getX()
                                    + ", "
                                    + vetor2.get(i).getY() + ");");
                        }

                        
                        System.out.print("Escolha o primeiro vetor: ");
                        
                        int vt1 = sc.nextInt();
                                                System.out.print("Escolha o segundo vetor: ");
                        int vt2 = sc.nextInt();
                        
                        System.out.println();
                        
                        System.out.println(Vetor.calcularMagnitude(vetor2.get(vt1 - 1), vetor2.get(vt2 -1)));;
                        
                        break;

                    // Será calculado o produto escalar entre dois vetores. A lista será apresentada para escolha dos vetores  
                    case 6:

                        break;

                    // Será calculado o ângulo entre dois vetores. A lista será apresentada para escolha dos vetores  
                    case 7:

                        break;

                    // Será calculado o vetor ortogonal a um dado vetor. A lista será apresentada para escolha dos vetores    
                    case 8:

                        break;

                    // Será calculado o produto vetorial entre dois vetores. A lista será apresentada para escolha dos vetores 
                    case 9:

                        break;

                    // Mensagem de saída do programa.
                    case 10:

                        System.out.println("Saindo...");
                        break;

                    // Mensagem para opção inválida.
                    default:
                        System.out.println("Opção inválida!");

                }

            } while (opcao != 10); // Condição para continuar no loop. O programa termina quando o usuário escolhe a opção 10.

        } catch (InputMismatchException e) {
            System.out.println("Erro: Informe somente números.");
        } 
        
        catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: Escolha somente items da lista.");
        }

        sc.close();
    }

}

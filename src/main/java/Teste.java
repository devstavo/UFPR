import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        // Requisito 2.b e 3.d: Instanciar 5 veículos em um array
        // Cardinalidade: Teste (1) -> Veiculo (5)
        Veiculo[] frota = new Veiculo[5];
        
        // Objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Laço de repetição para instanciar e preencher os dados dos 5 veículos (Requisito 3.f)
        for (int i = 0; i < 5; i++) {
            System.out.println("\n=============================================");
            System.out.println("ENTRADA DE DADOS - VEÍCULO " + (i + 1) + " de 5");
            System.out.println("=============================================");
            
            // 1. Instancia o objeto Veiculo (Requisito 3.c)
            frota[i] = new Veiculo(); 
            
            // 2. Entrada de dados do Veículo
            System.out.print("Digite a Placa: ");
            frota[i].setPlaca(scanner.nextLine());

            System.out.print("Digite a Marca: ");
            frota[i].setMarca(scanner.nextLine());

            System.out.print("Digite o Modelo: ");
            frota[i].setModelo(scanner.nextLine());
            
            System.out.print("Digite a Cor: ");
            frota[i].setCor(scanner.nextLine());
            
            // Tratamento de entrada para numerais (Requisito 3.f)
            float velocMax = 0.0f;
            System.out.print("Digite a Velocidade Máxima (float): ");
            while (true) {
                try {
                    velocMax = Float.parseFloat(scanner.nextLine());
                    frota[i].setVelocMax(velocMax);
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Valor inválido. Digite um número real (float): ");
                }
            }

            int qtdRodas = 0;
            System.out.print("Digite a Quantidade de Rodas (int): ");
            while (true) {
                try {
                    qtdRodas = Integer.parseInt(scanner.nextLine());
                    frota[i].setQtdRodas(qtdRodas);
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Valor inválido. Digite um número inteiro: ");
                }
            }
            
            // 3. Entrada de dados do Motor (Requisito 2.c e 3.e)
            // Acesso aos atributos do Motor APENAS por meio do objeto Veiculo.
            System.out.println("\n** Dados do Motor **");

            int qtdPist = 0;
            System.out.print("Digite a Quantidade de Pistões (int): ");
            while (true) {
                try {
                    qtdPist = Integer.parseInt(scanner.nextLine());
                    // Chama o getter do Veiculo para obter o objeto Motor, e em seguida chama o setter do Motor
                    frota[i].getMotor().setQtdPist(qtdPist); 
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Valor inválido. Digite um número inteiro: ");
                }
            }
            
            int potencia = 0;
            System.out.print("Digite a Potência (int): ");
            while (true) {
                try {
                    potencia = Integer.parseInt(scanner.nextLine());
                    // Chama o getter do Veiculo para obter o objeto Motor, e em seguida chama o setter do Motor
                    frota[i].getMotor().setPotencia(potencia); 
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Valor inválido. Digite um número inteiro: ");
                }
            }
        }

        // Fim da entrada de dados
        scanner.close();

        // Impressão dos dados dos 5 veículos (Requisito 3.c)
        System.out.println("\n\n********************************************************");
        System.out.println("RELATÓRIO FINAL: VEÍCULOS E MOTORES CADASTRADOS");
        System.out.println("********************************************************");
        
        // Laço de repetição para percorrer e imprimir os dados
        for (int i = 0; i < frota.length; i++) {
            System.out.println("DADOS DO VEÍCULO " + (i + 1));
            // Chamada ao método de impressão que exibe Veiculo E Motor
            frota[i].imprimirDadosVeiculo(); 
        }
    }
}
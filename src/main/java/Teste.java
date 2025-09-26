import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        // 2.b e 3.d
        // Teste (1) -> Veiculo (5)
        Veiculo[] frota = new Veiculo[5];
        
        //entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Laço de repetição para instanciar (Requisito 3.f)
        for (int i = 0; i < 5; i++) {
        
            System.out.println("ENTRADA DE DADOS - VEÍCULO " + (i + 1) + " de 5");
        
            
            //  Instancia o objeto Veiculo (Requisito 3.c)
            frota[i] = new Veiculo(); 
            
            // Entrada de dados do Veículo
            System.out.print("Digite a Placa: ");
            frota[i].setPlaca(scanner.nextLine());

            System.out.print("Digite a Marca: ");
            frota[i].setMarca(scanner.nextLine());

            System.out.print("Digite o Modelo: ");
            frota[i].setModelo(scanner.nextLine());
            
            System.out.print("Digite a Cor: ");
            frota[i].setCor(scanner.nextLine());
            
            // Tratamento de entrada (Requisito 3.f)
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
            
            // 3. Entrada dados do Motor (Requisito 2.c e 3.e)
            // Acesso ao atributo do Motor pormeio do objeto Veiculo.
            System.out.println("\n Dados do Motor ");

            int qtdPist = 0;
            System.out.print("Digite a Quantidade de Pistões (int): ");
            while (true) {
                try {
                    qtdPist = Integer.parseInt(scanner.nextLine());
                    // Chama o getter do Veiculo e Motor
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
                    // Chama o getter do Veiculo
                    frota[i].getMotor().setPotencia(potencia); 
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Valor inválido. Digite um número inteiro: ");
                }
            }
        }

        // Fim da entrada
        scanner.close();

        // Impressão dos dados (Requisito 3.c)
        System.out.println("RELATÓRIO: VEÍCULOS E MOTORES CADASTRADOS");

        // Laço de repetição
        for (int i = 0; i < frota.length; i++) {
            System.out.println("DADOS DO VEÍCULO " + (i + 1));
            // Chamada ao método de impressão
            frota[i].imprimirDadosVeiculo(); 
        }
    }
}
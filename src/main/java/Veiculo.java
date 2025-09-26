public class Veiculo {
    // Atributos privados conforme o diagrama
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocMax; // Numeral (float)
    private int qtdRodas; // Numeral (int)

    // Atributo de Composição (Veiculo POSSUI Motor - Requisitos 2.c, 2.d e 3.e)
    private Motor motor;

    // Construtor Default (Requisito 2.a e 3.b)
    public Veiculo() {
        // Atributos numerais iniciam com 0
        this.velocMax = 0.0f;
        this.qtdRodas = 0;
        
        // Atributos literais iniciam com espaço em branco (“ “)
        this.placa = " ";
        this.marca = " ";
        this.modelo = " ";
        this.cor = " ";
        
        // Instancia o objeto motor (garantindo que o Veiculo está completo e evitando NullPointerException)
        // O motor será inicializado com seus valores default (0, 0)
        this.motor = new Motor(); 
    }

    // Métodos Getters e Setters (Requisito 3.a)
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    // Getter para o objeto Motor (Essencial para o Requisito 2.c)
    public Motor getMotor() {
        return motor;
    }

    // Setter para o objeto Motor (Opcional)
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    // Método auxiliar para impressão (Requisito: Novos métodos podem ser criados)
    public void imprimirDadosVeiculo() {
        System.out.println("\n--------------------------------------");
        System.out.println("### DADOS DO VEÍCULO:");
        System.out.println("Placa: " + this.placa);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Velocidade Máxima: " + this.velocMax + " km/h");
        System.out.println("Quantidade de Rodas: " + this.qtdRodas);
        
        // Chama o método do objeto Motor (Composição)
        if (this.motor != null) {
            this.motor.imprimirDadosMotor();
        } else {
            System.out.println("O veículo não possui motor.");
        }
        System.out.println("--------------------------------------");
    }
}
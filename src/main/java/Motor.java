public class Motor {
    // Atributos privados conforme o diagrama
    private int qtdPist;
    private int potencia;

    // Construtor Default (Requisito 2.a e 3.b)
    public Motor() {
        // Atributos numerais iniciam com 0
        this.qtdPist = 0;
        this.potencia = 0;
        // Não há atributos literais nesta classe, então o requisito para String/char não se aplica aqui.
    }

    // Métodos Getters e Setters (Requisito 3.a)
    public int getQtdPist() {
        return qtdPist;
    }

    public void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    // Método auxiliar para impressão (Requisito: Novos métodos podem ser criados)
    public void imprimirDadosMotor() {
        System.out.println("--- Dados do Motor ---");
        System.out.println("Quantidade de Pistões: " + this.qtdPist);
        System.out.println("Potência (cv): " + this.potencia);
    }
}
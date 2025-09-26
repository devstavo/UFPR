public class Motor {
    // Atributo
    private int qtdPist;
    private int potencia;

    //Default (Requisito 2.a e 3.b)
    public Motor() {
        // Atributos numerais
        this.qtdPist = 0;
        this.potencia = 0;
       
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

    // Método auxiliar (Requisito: Novos métodos podem ser criados)
    public void imprimirDadosMotor() {
        System.out.println("--- Dados do Motor ---");
        System.out.println("Quantidade de Pistões: " + this.qtdPist);
        System.out.println("Potência (cv): " + this.potencia);
    }
}
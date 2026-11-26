public class Registro {

    private String tipoVeiculo;
    private double velocidade;
    private String status;

    public Registro(String tipoVeiculo, double velocidade, String status) {
        this.tipoVeiculo = tipoVeiculo;
        this.velocidade = velocidade;
        this.status = status;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public String getStatus() {
        return status;
    }
}
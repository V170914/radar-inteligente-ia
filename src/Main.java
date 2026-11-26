public class Main {

    public static void main(String[] args) {

        SpeedCalculator calculadora = new SpeedCalculator();

        double velocidade = calculadora.calculate(100, 5);

        System.out.println("Velocidade calculada: " + velocidade);

        Registro registro = new Registro(
                "CARRO",
                velocidade,
                "MULTADO"
        );

        RegistroCSV csv = new RegistroCSV();

        csv.salvar(registro);

        System.out.println("Registro salvo!");
    }
}
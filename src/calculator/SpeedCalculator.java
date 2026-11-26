package calculator;

public class SpeedCalculator {

    public double calculate(double distance, double time) {

        if (time <= 0) {
            throw new IllegalArgumentException("Tempo inválido");
        }

        return (distance / time) * 3.6;
    }
}
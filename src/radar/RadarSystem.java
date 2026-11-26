package radar;

import calculator.SpeedCalculator;
import detector.LineCrossingDetector;
import detector.VehicleDetector;

public class RadarSystem {

    private VehicleDetector detector;
    private LineCrossingDetector crossingDetector;
    private SpeedCalculator calculator;

    public RadarSystem() {

        detector =
                new VehicleDetector();

        crossingDetector =
                new LineCrossingDetector();

        calculator =
                new SpeedCalculator();
    }

    public void start() throws Exception {

        System.out.println();
        System.out.println("=================================");
        System.out.println(" RADAR INTELIGENTE ");
        System.out.println("=================================");

        Vehicle vehicle =
                detector.detectVehicle();

        System.out.println();
        System.out.println("IA identificou:");

        System.out.println(
                "Tipo: "
                        + vehicle.getType()
        );

        System.out.println(
                "Placa: "
                        + vehicle.getPlate()
        );

        Thread.sleep(2000);

        crossingDetector.crossLineA();

        Thread.sleep(3000);

        crossingDetector.crossLineB();

        double time =
                crossingDetector
                        .getElapsedSeconds();

        double speed =
                calculator.calculate(
                        50,
                        time
                );

        System.out.println();
        System.out.println(
                "Tempo percorrido: "
                        + time
                        + " segundos"
        );

        System.out.println(
                "Velocidade calculada: "
                        + speed
                        + " km/h"
        );

        if(speed > 60) {

            System.out.println(
                    "⚠ MULTA POR EXCESSO DE VELOCIDADE"
            );

        } else {

            System.out.println(
                    "✓ Dentro do limite permitido"
            );
        }
    }
}

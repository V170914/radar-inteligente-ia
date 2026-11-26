package detector;

public class LineCrossingDetector {

    private long lineATime;
    private long lineBTime;

    public void crossLineA() {

        lineATime = System.currentTimeMillis();

        System.out.println(
                "[LINHA A] Veículo detectado"
        );
    }

    public void crossLineB() {

        lineBTime = System.currentTimeMillis();

        System.out.println(
                "[LINHA B] Veículo detectado"
        );
    }

    public double getElapsedSeconds() {

        return (lineBTime - lineATime)
                / 1000.0;
    }
}
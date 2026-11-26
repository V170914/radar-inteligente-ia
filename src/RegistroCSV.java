import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RegistroCSV {

    public void salvar(Registro registro) {

        File pasta = new File("registros");

        if (!pasta.exists()) {
            pasta.mkdirs();
        }
        try (FileWriter writer =
                     new FileWriter("registros.csv", true)) {

            writer.write(
                    registro.getTipoVeiculo()
                            + ","
                            + registro.getVelocidade()
                            + ","
                            + registro.getStatus()
                            + "\n"
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
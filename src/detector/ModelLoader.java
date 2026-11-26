package detector;

public class ModelLoader {

    private String modelPath;

    public ModelLoader(String modelPath) {
        this.modelPath = modelPath;
    }

    public void loadModel() {

        System.out.println(
                "Modelo carregado: "
                        + modelPath
        );
    }
}
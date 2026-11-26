package detector;

public class Detection {

    private String objectType;
    private double confidence;

    public Detection(String objectType, double confidence) {
        this.objectType = objectType;
        this.confidence = confidence;
    }

    public String getObjectType() {
        return objectType;
    }

    public double getConfidence() {
        return confidence;
    }

    @Override
    public String toString() {
        return objectType + " (" + confidence + ")";
    }
}
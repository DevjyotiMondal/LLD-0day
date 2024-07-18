package items;

public class CD implements LibraryItem{

    String title;
    public String uniqueId;
    private double value;
    private String artist;

    public CD(double value, String title, String uniqueId, String artist) {
        this.value = value;
        this.title = title;
        this.uniqueId = uniqueId;
        this.artist = artist;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getUniqueId() {
        return this.uniqueId;
    }

    @Override
    public double calculateLateFee(int days) {
        return days * 20;
    }

    @Override
    public double getValue() {
        return this.getValue();
    }
}

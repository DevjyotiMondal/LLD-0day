package items;

public class DVD implements LibraryItem {
    String title;
    public String uniqueId;
    private double value;
    private String artist;

    public DVD(String title, String artist, double value, String uniqueId) {
        this.title = title;
        this.artist = artist;
        this.value = value;
        this.uniqueId = uniqueId;
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
        return days * 30;
    }

    @Override
    public double getValue() {
        return this.value;
    }
}

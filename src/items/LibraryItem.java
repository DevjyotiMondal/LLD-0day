package items;

import main.LateFeeCalculatable;

public interface LibraryItem extends LateFeeCalculatable {
    String getTitle();
    String getUniqueId();

    double getValue();
}

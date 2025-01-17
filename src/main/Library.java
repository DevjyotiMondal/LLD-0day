package main;

import items.LibraryItem;

public class Library {
    private LibraryItem[] items;

    public Library(LibraryItem[] items) {
        this.items = items;
    }

    public double calculateTotalValue(){
        double totalValue=0;
        for(LibraryItem item:items)
        {
            totalValue+=item.getValue();
        }
        return totalValue;
    }
}

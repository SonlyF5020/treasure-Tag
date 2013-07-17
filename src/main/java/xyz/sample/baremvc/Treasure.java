package xyz.sample.baremvc;

public class Treasure {
    private String chinaTreasure;
    private String americanTreasure;
    private String indiaTreasure;
    private int clichedTimes;

    public Treasure() {
        this.chinaTreasure = "apple";
        this.americanTreasure = "iphone";
        this.indiaTreasure = "onion";
        this.clichedTimes = 0;
    }

    public String getTreasure(String countryName) {
        String result = "nothing";
        if (countryName.equalsIgnoreCase("china")) {
            result = chinaTreasure;
            chinaTreasure = "nothing";

        }
        if (countryName.equalsIgnoreCase("american")) {
            result = americanTreasure;
            americanTreasure = "nothing";
        }
        if (countryName.equalsIgnoreCase("india")) {
            result = indiaTreasure;
            indiaTreasure = "nothing";
        }
        clichedTimes++;
        return result;
    }

    public boolean isCleared() {
        return (chinaTreasure == "nothing") && (americanTreasure == "nothing") && (indiaTreasure == "nothing");
    }

    public int getScore() {
        return 300 / clichedTimes;
    }

    public void reset() {
        this.chinaTreasure = "apple";
        this.americanTreasure = "iphone";
        this.indiaTreasure = "onion";
        this.clichedTimes = 0;
    }
}

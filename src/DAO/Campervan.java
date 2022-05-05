package DAO;

public class Campervan {

    int camperID, currentKM, lowSeasonPrice, highSeasonPrice, noOfBeds;
    String type, heating, kitchen, description;
    Boolean TV;

    public Campervan(int camperID, int currentKM, int lowSeasonPrice, int highSeasonPrice, int noOfBeds, String type, String heating, String kitchen, String description, Boolean TV) {
        this.camperID = camperID;
        this.currentKM = currentKM;
        this.lowSeasonPrice = lowSeasonPrice;
        this.highSeasonPrice = highSeasonPrice;
        this.noOfBeds = noOfBeds;
        this.type = type;
        this.heating = heating;
        this.kitchen = kitchen;
        this.description = description;
        this.TV = TV;
    }

    public int getCamperID() {
        return camperID;
    }

    public void setCamperID(int camperID) {
        this.camperID = camperID;
    }

    public int getCurrentKM() {
        return currentKM;
    }

    public void setCurrentKM(int currentKM) {
        this.currentKM = currentKM;
    }

    public int getLowSeasonPrice() {
        return lowSeasonPrice;
    }

    public void setLowSeasonPrice(int lowSeasonPrice) {
        this.lowSeasonPrice = lowSeasonPrice;
    }

    public int getHighSeasonPrice() {
        return highSeasonPrice;
    }

    public void setHighSeasonPrice(int highSeasonPrice) {
        this.highSeasonPrice = highSeasonPrice;
    }

    public int getNoOfBeds() {
        return noOfBeds;
    }

    public void setNoOfBeds(int noOfBeds) {
        this.noOfBeds = noOfBeds;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHeating() {
        return heating;
    }

    public void setHeating(String heating) {
        this.heating = heating;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getTV() {
        return TV;
    }

    public void setTV(Boolean TV) {
        this.TV = TV;
    }
}

package Demo;

import java.util.Arrays;

public class Shop extends ReviewClass {
    String name;
    String description;
    String numberOfSigns;
    double Stars;


    public Shop(String name, String description, String numberOfSigns,double Stars) {
        super(body, author, star);
        this.name = name;
        this.description = description;
        this.numberOfSigns=numberOfSigns;
    }

    public String getNumberOfSigns() {
        return numberOfSigns;
    }

    public void setNumberOfSigns(String numberOfSigns) {
        this.numberOfSigns = numberOfSigns;
    }

    public double getStars() {
        return Stars;
    }

    public void setStars(double stars) {
        Stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfSigns='" + numberOfSigns + '\'' +
                ", Stars=" + Stars +
                '}';
    }
}

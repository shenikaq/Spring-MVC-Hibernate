package web.model;

import java.util.Objects;

public class Car {
    public String model;
    private int series;
    private String user;
    private int year;

    public Car(String model, int series, String user, int year) {
        this.model = model;
        this.series = series;
        this.user = user;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", user='" + user + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return getYear() == car.getYear() && Objects.equals(getModel(), car.getModel()) && Objects.equals(getSeries(), car.getSeries()) && Objects.equals(getUser(), car.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getSeries(), getUser(), getYear());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

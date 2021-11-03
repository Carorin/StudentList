package karolinah.CarList.object;

public class Car {


    private int id;
    private String carBrand;
    private String carModel;
    private int yearOfProduction;

    public int getId() {
        return id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setId(int id) {
        this.id=id;
    }

    public void setCarBrand(String name) {
        String carBrands = new String();
        this.carBrand = carBrands;
    }

    public void setCarModel(String carModel) {
        String carModels = new String();
        this.carModel = carModels;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carModel='" + carModel + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
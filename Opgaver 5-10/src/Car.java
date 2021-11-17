public class Car {
        private String Make;
        private String Model;
        private int Year;
        private String BodyStyle;
        private String Driver;

    public Car (String MakeX, String ModelX, int YearX, String BodyStyleX, String DriverX) {
            Make = MakeX;
            Model = ModelX;
            Year = YearX;
            BodyStyle = BodyStyleX;
            Driver = DriverX;

        }
    @Override
    public String toString() {
        return "Car{" +
                "Make='" + Make + '\'' +
                ", Model=" + Model +
                ", Year=" + Year +
                ", BodyStyle='" + BodyStyle + '\'' +
                '}';
    }
    public String getDriver() {
        return Driver;
    }

    public void setDriver(String newD) {
        this.Driver= newD;

    }

    public void setDriver(Driver d1) {
    }
}





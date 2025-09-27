package LW_03;

public class Temperature {
    private double celsius;

    // No-arg constructor
    public Temperature() {
        this.celsius = 0.0;
    }

    // Parameterized constructor (celsius)
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Accessor: return temperature in Celsius
    public double toCelsius() {
        return celsius;
    }

    // Accessor: return temperature in Fahrenheit
    public double toFahrenheit() {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    // Mutator: set temp by Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Mutator: set temp by Fahrenheit (convert and store in celsius)
    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}

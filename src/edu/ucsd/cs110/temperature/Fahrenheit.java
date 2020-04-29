package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float val = this.getValue();
        val = val - 32;
        val = val * 5;
        val = val / 9;
        return new Celsius(val);
    }

    @Override
    public Temperature toFahrenheit() {
        float val = this.getValue();
        return new Fahrenheit(val);
    }

    public String toString()
    {

        return "" + this.getValue() + " F";
    }
}
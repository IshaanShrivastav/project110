package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float val = this.getValue();
        return new Celsius(val);
    }

    @Override
    public Temperature toFahrenheit() {
        float val = this.getValue();
        val = val / 5;
        val = val * 9;
        val = val + 32;
        return new Fahrenheit(val);
    }

    public String toString()
    {
        // TODO: Complete this method
        return "" + this.getValue() + " C";
    }
}
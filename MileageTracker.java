/**
 * This class models a mileage tracker for a car.
 *
 * @author gcschmit
 * @version 20sep2021
 */
public class MileageTracker
{
    /*
     * 2. Define the instance variables (store the object's attributes):
     */






    
    /*
     * 3. Define the constructor(s):
     */
    
    
    
    
    
    
    
    
    /*
     * 1. Define methods by specifying:
     *      the visibility (e.g., public, private)
     *      the return type (e.g., void, double)
     *      the method name (e.g., incrementMilesDriven, getMilesDriven)
     *      the parameters and their types (e.g., miles of type double)
     */
    
    /**
     * Increments the number of miles that the car has driven.
     * 
     * @param miles the additional distance, in miles, this car has driven
     */
    public void incrementMilesDriven(double miles)
    {
        
    }
    
    /**
     * Returns the total number of miles driven.
     * 
     * @return the total number of miles driven
     */
    public double getMilesDriven()
    {
        return 0.0;
    }
    
    
    
    /**
     * Increment the number of gallons of fuel that this car has consumed
     * 
     * @param gallons    the additional fuel, in gallons, this car has consumed
     */
    public void incrementFuelConsumed(double gallons)
    {
        this.fuelConsumed += gallons;
    }
    
    /**
     * Returns the total number of gallons of fuel consumed
     * 
     * @return the total number of gallons of fuel consumed
     */
    public double getFuelConsumed()
    {
        return this.fuelConsumed;
    }
    
    
    /**
     * Returns the current mileage, in miles per gallon
     * 
     * @return the current mileage, in miles per gallon
     */
    public double getMileage()
    {
        double mileage = this.fuelConsumed / this.milesDriven;
        return mileage;
    }
    
    /**
     * Returns the vehicle identification (VIN) of this car.
     * 
     * @return the vehicle identification (VIN) of this car
     */
    public String getVIN()
    {
        return this.vin;
    }
    
    /**
     * Sets the vehicle identification (VIN) of this car.
     * 
     * @param vin    the vehicle identification (VIN) of this car
     */
    public void setVIN(String vin)
    {
        vin = vin;
    }
}







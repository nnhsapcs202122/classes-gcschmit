/**
 * This class models a mileage tracker for a car.
 *
 * @author 
 * @version 
 */
public class MileageTracker
{
    /*
     * 2. Define the instance variables (store the object's attributes):
     *      specify the visibility (e.g., private)
     *          public: accessible by any code in any class
     *          private: only accessible by methods in this class
     *      specify the type (e.g., double, String)
     *      specify the name (e.g., milesDriven, vin)
     *      
     *  Instance variables differ from local variables in the following ways:
     *      scoped to the class (accessible in all methods of the class;
     *          lifetime is the same as the object)
     *      automatically initialized to a default value (0, false, null)
     *      best practice is not to immediately initialize instance variables
     */
    private double milesDriven;     // in units of miles
    private double fuelConsumed;    // in units of gallons
    private String vin;     // vehicle identification
    
    /*
     * 3. Define the constructor(s):
     *      responsible for initializing newly created objects
     *      invoked automatically via the new operator
     *      name of the constructor must match the name of the class
     *      has no return type (not even void)
     *      multiple construcotrs may be defined for a class
     *      one constructor may call another constructor (with restrictions)
     */
    
    /**
     * Default constructor for MileageTracker class.
     *      Initializes this object's miles driven and fuel constumed to 0.0 and
     *          the VIN to null.
     */
    public MileageTracker()
    {
        /*
         * The "this" reserved word references the current object
         *      (like "self" in Python).
         *  Its usage is encouraged but not always required.
         */
        this.milesDriven = 0.0;
        this.fuelConsumed = 0.0;
        this.vin = null;
    }
    
    /**
     * Constructs a new MileageTracker object with the specified
     *      miles driven and fuel consumed values.
     *      
     *  @param initialMilesDriven the number of miles already driven
     *  @param initialFuelConsumed the number of gallons of fuel already consumed
     */
    public MileageTracker(double initialMilesDriven, double initialFuelConsumed)
    {
        this.milesDriven = initialMilesDriven;
        this.fuelConsumed = initialFuelConsumed;
        this.vin = null;
    }
    
    /*
     * 1. Define methods by specifying:
     */
    /**
     * Increment the number of miles that the car has driven.
     * 
     * @param miles the additional distance, in miles, this car has driven
     */
    public void incrementMilesDriven(double miles)
    {
        //this.milesDriven = this.milesDriven + miles;
        this.milesDriven += miles;
    }
    
    /**
     * Returns the total number of miles driven.
     * 
     * @return the total number of miles driven
     */
    public double getMilesDriven()
    {
        return this.milesDriven;
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
        double mileage = this.milesDriven / this.fuelConsumed;
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
    public void setVIN(String newVIN)
    {
        /*
         * If the parameter was named vin, it would "shadow" the
         *      instance variable vin.
         *      
         *  Local and parameter variables "shadow" instance variables
         *      of the same name. In this code, vin would refer to the
         *      parameter and not the instance variable.
         *      
         *  To refer explicitly to an instance variable, use "this".
         *  
         *  Better practice: avoid this issue by giving local, parameter,
         *      and instance variables unique names!
         */
        
        // bad
        vin = vin;
        
        // good
        this.vin = vin;
        
        // better
        this.vin = newVIN;
    }
    
    public String toString()
    {
        String str = "[VIN: " + this.getVIN() +
                "; miles driven: " + this.getMilesDriven() + " miles" +
                "; fuel consumed: " + this.getFuelConsumed() + " gallons" +
                "; mileage: " + this.getMileage() + " mpg]";
                
        return str;
    }
    
    public static void main(String[] args)
    {
        MileageTracker tracker = new MileageTracker(100.0, 4.0);
        System.out.println(tracker);
    }
}







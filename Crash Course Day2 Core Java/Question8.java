public class Question8 {
    
    /*
    // Interface representing a vehicle
    interface Vehicle {
        void drive();
    }

    // Abstract class representing a car
    abstract class Car implements Vehicle {
        // Implementation of the drive method
        @Override
        public void drive() {
            System.out.println("Car is driving");
        }
        
        // Abstract method to get fuel type
        abstract void fuelType();
    }

    // Subclass representing an electric car
    class ElectricCar extends Car {
        // Specific implementation of fuelType for electric car
        @Override
        void fuelType() {
            System.out.println("Fuel type: Electric");
        }
    }

    // Subclass representing a gas car
    class GasCar extends Car {
        // Specific implementation of fuelType for gas car
        @Override
        void fuelType() {
            System.out.println("Fuel type: Gasoline");
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Creating an electric car
            ElectricCar electricCar = new ElectricCar();
            electricCar.drive();
            electricCar.fuelType(); // Output: Fuel type: Electric
            
            System.out.println();
            
            // Creating a gas car
            GasCar gasCar = new GasCar();
            gasCar.drive();
            gasCar.fuelType(); // Output: Fuel type: Gasoline
        }
    }



    
Certainly! Below is the implementation of the interface Vehicle, an abstract class Car that implements Vehicle, and subclasses ElectricCar and GasCar:

java
Copy code
// Interface representing a vehicle
interface Vehicle {
    void drive();
}

// Abstract class representing a car
abstract class Car implements Vehicle {
    // Implementation of the drive method
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
    
    // Abstract method to get fuel type
    abstract void fuelType();
}

// Subclass representing an electric car
class ElectricCar extends Car {
    // Specific implementation of fuelType for electric car
    @Override
    void fuelType() {
        System.out.println("Fuel type: Electric");
    }
}

// Subclass representing a gas car
class GasCar extends Car {
    // Specific implementation of fuelType for gas car
    @Override
    void fuelType() {
        System.out.println("Fuel type: Gasoline");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an electric car
        ElectricCar electricCar = new ElectricCar();
        electricCar.drive();
        electricCar.fuelType(); // Output: Fuel type: Electric
        
        System.out.println();
        
        // Creating a gas car
        GasCar gasCar = new GasCar();
        gasCar.drive();
        gasCar.fuelType(); // Output: Fuel type: Gasoline
    }
}



Explanation:

The Vehicle interface declares a method drive().

The abstract class Car implements the Vehicle interface and provides an implementation for the drive() method. It also declares an abstract method fuelType(), which subclasses must implement.

The ElectricCar and GasCar subclasses extend Car and provide specific implementations for the fuelType() method. Each subclass defines its own fuel type.

In the main() method, we create instances of ElectricCar and GasCar, demonstrating how abstraction allows us to define common behavior in the superclass while still allowing subclasses to provide their own specific implementations. This structure allows for code reuse and flexibility in handling different types of cars while enforcing consistency through abstraction.
     */
}

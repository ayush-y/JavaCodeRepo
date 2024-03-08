package PackagesPrctice.CarOverride;

public class Car extends Vehicle{
    @Override
    public void service(){ //Run time polymorphism
        super.service();
        System.out.println("Car is getting serviced...");
    }

}

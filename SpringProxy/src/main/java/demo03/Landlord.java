package demo03;

//房东
public class Landlord implements RentHouse {
    @Override
    public void rentHouse() {
        System.out.println("房东出租房子");
    }
}

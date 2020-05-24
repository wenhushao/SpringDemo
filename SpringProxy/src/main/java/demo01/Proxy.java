package demo01;

public class Proxy implements RentHouse {
    private Landlord landlord;

    public Proxy() {

    }

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    @Override
    public void rentHouse() {
        landlord.rentHouse();
        seeHouse();
    }

    //看房
    public void seeHouse() {
        System.out.println("中介带看房");
    }
}

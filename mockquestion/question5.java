package mockquestion;

public class question5 {
    public static void main(String[] args) {
        NetworkDevice router = new Router("Operational", true);
        NetworkDevice switchDevice = new Switch("Down", false);

        System.out.println("Router status: " + router.getStatus());
        System.out.println("Router available: " + router.isAvailable());

        System.out.println("Switch status: " + switchDevice.getStatus());
        System.out.println("Switch available: " + switchDevice.isAvailable());
    }
    
}
// question 5

interface NetworkDevice {
    String getStatus();
    boolean isAvailable();
}

class Router implements NetworkDevice {
    private String status;
    private boolean available;

    public Router(String status, boolean available) {
        this.status = status;
        this.available = available;
    }
    @Override
    public String getStatus() {
        return status;
    }
    @Override
    public boolean isAvailable() {
        return available;
    }
}
class Switch implements NetworkDevice {
    private String status;
    private boolean available;
    public Switch(String status, boolean available) {
        this.status = status;
        this.available = available;
    }
    @Override
    public String getStatus() {
        return status;
    }
    @Override
    public boolean isAvailable() {
        return available;
    }
}

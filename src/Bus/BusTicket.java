package Bus;

public class BusTicket {
    public  String  busName;
    public int busNo;
    public String busDestination;
    public String busStartPoint;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BusTicket{");
        sb.append("busName='").append(busName).append('\'');
        sb.append(", busNo=").append(busNo);
        sb.append(", busDestination='").append(busDestination).append('\'');
        sb.append(", busStartPoint='").append(busStartPoint).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[]args){
        BusTicket   busTicket =  new BusTicket();
        busTicket.busName ="RTC";
        busTicket.busNo =1234;
        busTicket.busDestination ="miyapur";
        busTicket.busStartPoint ="lbnager";
        System.out.println(busTicket);

    }

}

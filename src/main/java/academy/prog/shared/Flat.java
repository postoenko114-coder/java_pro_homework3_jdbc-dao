package academy.prog.shared;

public class Flat {
    @Id

    private int id;

    private String district;
    private String address;
    private int area;
    private int countRooms;
    private int price;

    public Flat() {
    }

    public Flat( String district, String address, int area, int countRooms, int price) {
        this.id = id;
        this.district = district;
        this.address = address;
        this.area = area;
        this.countRooms = countRooms;
        this.price = price;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getDistrict() {return district;}
    public void setDistrict(String district) {this.district = district;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    public int getArea() {return area;}
    public void setArea(int area) {this.area = area;}
    public int getCountRooms() {return countRooms;}
    public void setCountRooms(int countRooms) {this.countRooms = countRooms;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    @Override
    public String toString() {
        return "Flat{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", district='" + district + '\'' +
                ", area=" + area +
                ", countRooms=" + countRooms +
                ", price=" + price +
                '}';
    }
}

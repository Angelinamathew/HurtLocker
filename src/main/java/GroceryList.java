import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GroceryList {
    private String name;
    private Double price;
    private String type;
    private Date Expiration;
    private final DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyy") ;

    public GroceryList() {
    }

    public GroceryList(String name, Double price, String type, Date expiration) {
        this.name = name;
        this.price = price;
        this.type = type;
        Expiration = expiration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setExpiration(Date expiration) {
        Expiration = expiration;
    }

    @Override
    public String toString() {
        return "GroceryList{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", Expiration=" + Expiration +
                ", dateFormat=" + dateFormat +
                '}';
    }
}

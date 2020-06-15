import java.util.ArrayList;
import java.util.List;

public class Shopping {

    List<Product> products = new ArrayList<>();


    public void addProduct2List(Product product){
        products.add(product);
    }

    public void orderProducts(){
        for(Product product : products){
            product.order();
        }
    }

}

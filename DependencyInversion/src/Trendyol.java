import java.awt.print.Book;

public class Trendyol {

    public static void main(String args[]){

        Shopping shopping = new Shopping();
        shopping.addProduct2List(new Clothes("B1623C4"));
        shopping.addProduct2List(new Electronic("A14C23F47"));
        shopping.addProduct2List(new Books("H21F47L"));

        shopping.orderProducts();

    }


}

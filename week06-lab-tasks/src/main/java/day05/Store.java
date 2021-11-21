package day05;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products=new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<ProductWithPiece> numberOfProductsByType(){
        List<ProductWithPiece> result=new ArrayList<>();
        for(Product product:products){
            if(containsProduct(product,result)){

            }else{
                result.add(new ProductWithPiece(product.getType()));
            }
        }
        return result;
    }

    private boolean containsProduct(Product product, List<ProductWithPiece> productWithPiece){
        for(ProductWithPiece pwp:productWithPiece){
            if(product.getType()==pwp.getType()){
                pwp.incrementCount();
                return true;
            }
        }
        return false;
    }
}

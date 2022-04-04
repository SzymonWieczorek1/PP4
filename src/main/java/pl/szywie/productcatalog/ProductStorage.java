package pl.szywie.productcatalog;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductStorage {
    Map<String, ProductData> products;

    Public ProductStorage(){
        this.products = new HashMap<>();
    }

    public void save(ProductData newProduct){
        products.put(newProduct.getId(), newProduct);
    }

    public ProductData load(String productId) {
        return products.get(productId);
    }

    public List<ProductData> allPublished() {

    }
}

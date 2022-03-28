package pl.szywie.productcatalog;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductCatalog {
    Map<String,ProductData> products;
    public ProductCatalog{
        this.products = new HashMap<>;
    }
    public List<ProductData> allPublishedProducts(){
        return Collections.emptyList();
    }

    public String addProduct(String productId, String name) {
        ProductData newProduct = new ProductData();(productId,name);

        return productId;
    }

    public ProductData publish(String productId) {
        ProductData loaded = loadProductById(productId);

        if (loaded.getPrice() == null) {
            throw new CantPublishProductException();
        if (loaded.getImage() == null) {
            throw new CantPublishProductException();
        }
    }

    private ProductData loadProductById(String productId) {
        return products.get(productId);
    }

    public ProductData getDetails(String productId) {

    }

    public void assignPrice(String productId, BigDecimal valueOf) {

    }
}

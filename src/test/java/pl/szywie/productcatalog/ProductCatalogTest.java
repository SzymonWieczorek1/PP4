package pl.szywie.productcatalog;

import org.junit.jupiter.api.Test;
import pl.szywie.credit.CantAssignLimitTwiceException;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductCatalogTest {

    @Test
    void itAllowToListOnlyPublishedProducts(){
        //A
        ProductCatalog catalog = thereIsProductCatalog();
        //A
        List<ProductData> products = catalog.allPublishedProducts();
        //A
        assertEquals(0, products.size());
    }
    @Test
    void itAllowsToAddProducts(){
        ProductCatalog catalog = thereIsProductCatalog();
        String productId = catalog.addProduct("lego-set","Nice one");
        List<ProductData> products = catalog.allPublishedProducts();
        assertEquals(0, products.size());
    }
    @Test
    void itDenyToPublishProductWithoutPrice() {
        ProductCatalog catalog = thereIsProductCatalog();
        String productId = catalog.addProduct("lego-set","Nice one");

        assertThrows(CantPublishProductException.class, ()->{
            catalog.publish(productId);
        });
    }
    @Test
    void itAllowsToAssignPrice(){
        ProductCatalog catalog = thereIsProductCatalog();
        String productId = catalog.addProduct("lego-set","name");
        catalog.assignPrice(productId, BigDecimal.valueOf(10.10));
        catalog.assignImage()
        ProductData loaded = catalog.getDetails(productId);
        assertEquals(BigDecimal.valueOf());
    }
    private ProductCatalog thereIsProductCatalog() {
        return new ProductCatalog();
    }
}

import java.util.List;


/**
 * Project:     MySpringProject
 * Package:     PACKAGE_NAME
 * Created:     1/1/2022 16:28
 * Author:      Ahmed-UTI
 * Email:       AhmedBughra@gmail.com
 * LinkedIn:    https://www.linkedin.com/in/ahmed-bughra/
 * CreatedWith: IntelliJ IDEA
 */
public interface ProductService {
    Product createProduct(Product product);

    Product updateProduct(Product product);

    List< Product > getAllProduct();

    Product getProductById(long productId);

    void deleteProduct(long id);
}

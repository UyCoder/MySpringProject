/**
 * Project:     MySpringProject
 * Package:     PACKAGE_NAME
 * Created:     1/1/2022 16:26
 * Author:      Ahmed-UTI
 * Email:       AhmedBughra@gmail.com
 * LinkedIn:    https://www.linkedin.com/in/ahmed-bughra/
 * CreatedWith: IntelliJ IDEA
 */

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}

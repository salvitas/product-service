package io.stoks.services.products.api;

import io.stoks.services.products.model.Product;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * [Class description.]
 *
 * @author <a href="mailto:salva@backbase.com">salva</a>
 * @since 19/05/2018
 */
@RestController
public class Api {

    private List<Product> products;


    protected Logger logger = LoggerFactory.getLogger(Api.class);

    public Api() {
        products = new ArrayList<>();
        products.add(new Product("111111"));
        products.add(new Product("222222"));
        products.add(new Product("333333"));
        products.add(new Product("444444"));
        products.add(new Product("555555"));
        products.add(new Product("666666"));
        products.add(new Product("777777"));
    }


    @RequestMapping("/products")
    public List<Product> findAll() {
        logger.info("Product.findAll()");
        return products;
    }
}

package io.stoks.services.products.model;

/**
 * [Class description.]
 *
 * @author <a href="mailto:salva@backbase.com">salva</a>
 * @since 19/05/2018
 */
public class Product {

    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

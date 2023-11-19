package com.gfg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    //     private static final Logger logger = LoggerFactory.getLogger(MyService.class);

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    /*  @Autowired
        private ProductService productService;
    */
    /**
     * Si vous n'avez pas besoin de modifier la valeur de productService après son initialisation,
     * le faire final est une bonne pratique qui peut améliorer la sécurité, la maintenabilité et
     * les performances de votre code.

     * En résumé, la déclaration du champ productService comme final est une bonne idée si :

     * Vous n'avez pas besoin de modifier la valeur du champ après son initialisation.
     * Vous souhaitez protéger l'intégrité des données du champ.
     * Vous souhaitez améliorer les performances du code.
     */
    private final ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product>  productService(){
        return productService.productService();
    }

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product){
        logger.info("Data created {}:", product);
        return productService.addProduct(product);
    }
}

package SpringSeminar4.HomeWork4.controllers;

import SpringSeminar4.HomeWork4.models.Product;
import SpringSeminar4.HomeWork4.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class ProductController {
    ProductService productService;
    @GetMapping("/products")
    public String getProducts(Model model){
        model.addAttribute("products", productService.getProducts());
        return "products";
    }

    @PostMapping("/products")
    public String addProduct(Product p, Model model){
        productService.addProduct(p);
        model.addAttribute("products", productService.getProducts());
        return "products";
    }
}

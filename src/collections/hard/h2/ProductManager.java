package collections.hard.h2;

import collections.hard.h1.Product;

import java.util.*;

public class ProductManager {
    private Map<String, List<Product>> products;

    public ProductManager(){
        products = new HashMap<>();
        products.put("Smartphones", new ArrayList<>());
        products.put("Smartwatches", new ArrayList<>());
    }

    public void addProduct(String category, Product product){
        products.get(category).add(product);
    }

    public void sortByName(String category){
        Collections.sort(products.get(category), Comparator.comparing(Product::getBrandname));
    }

    public void sortByPrice(String category){
        Collections.sort(products.get(category), Comparator.comparing(Product::getPrice));
    }

    public List<Product> getProducts(String category){
        return products.get(category);
    }
}

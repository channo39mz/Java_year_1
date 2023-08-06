package pack7a;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private Map<String, Product> productList;
    private Map<String, Integer> priceList;

    public Catalog() {
        productList = new HashMap<>();
        priceList = new HashMap<>();
    }

    public void add(Product product, int price) {
        if (!(productList.containsKey(product.getpName()))){
            priceList.put(product.getpName(), price);
            productList.put(product.getpName(), product);
        }
    }

    public void showCatalog() {
        System.out.println(priceList);
        for (String i : priceList.keySet()) {
            System.out.printf(""+i+ " @ "+ getPrice(i) +'\n');
          }
        // System.out.println(productList);
    }

    public Map<String, Product> getProductList() {//*
        return productList;//*
    }//*
    public Map<String, Integer> getPriceList() {//*
        return priceList;//*
    }//*
    public int getPrice(String productName) {
        return priceList.get(productName);
    }

    public Product getProduct(String productName) {
        return productList.get(productName);
    }
}

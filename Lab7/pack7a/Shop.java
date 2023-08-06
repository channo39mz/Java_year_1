package pack7a;

import java.util.ArrayList;
import java.util.Map;

public class Shop {
    private String name;
    private Catalog catalog = new Catalog();
    private ArrayList<Basket> ordersToday = new ArrayList<>();
    public static ArrayList<Integer> alldasket = new ArrayList<Integer>();

    public Shop(String n) {
        name = n;
        catalog.add(new Drink("mix veggies", "refreshing"), 22);
        catalog.add(new Drink("lactasoy", "less hungry"), 15);
        catalog.add(new Noodles("mama", "classic"), 9);
        catalog.add(new Noodles("korean", "i can afford"), 33);
        // duplicate won't update
        catalog.add(new Noodles("mama", "duplicate"), 11);
        showCatalog();
    }

    private void showCatalog() {     //*
        catalog.showCatalog();//*
    }

    public Basket newCustomerArrives() {//*
        
        Basket j = new Basket();//*
        return j;//*
    }

    public LineItem generateLineItem(String pName, int q) { // add to UML
        LineItem Litem = new LineItem( catalog.getProduct(pName) , q, catalog.getPrice(pName));//*
        return Litem;//*
    }

    public LineItem generateBuyNowItem(String pName) {//*
        LineItem L2item = new LineItem(catalog.getProduct(pName), 1, catalog.getPrice(pName));//*
        return L2item;//*
    }

    public void getPayment(Basket b) {//*
        System.out.println("I am cashier");//*
        b.printInvoice();//*
    }

    public void dailySalesReport() {//*
        int num = 0;//*
        int sum = 0;//*
        for(int i : alldasket){//*
            num++;//*
            System.out.printf("Oder number %d basket = %d\n" , num , i );//*
            sum += i;//*
        }//*
        System.out.printf("GrandTotal = %d" , sum);//*
    }

}

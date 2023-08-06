package pack7a;

import java.util.ArrayList;

public class Basket {
    private ArrayList<LineItem> items = new ArrayList<>();

    public void showItemsInBasket() {
        System.out.println("This basket contains");//*
        for(LineItem l : items){//*
            System.out.println(l);//*
        }//*
    }

    public void putInBasket(LineItem item) {
        this.items.add(item);
    }

    public void printInvoice() {
        System.out.println("invoice header");
        int sum = 0;
        for (LineItem line : items) {
            System.out
                    .println(line.getProduct().getpName() + " x " + line.getQuantity() + " " + line.calculateAmount());
            sum += line.calculateAmount();
        }
        System.out.println("Total is " + sum + "******");
        Shop.alldasket.add(sum);//*
    }

    public void buyNow(LineItem item) {//*
        System.out.println("invoice header");//*
        int sum = 0;//*
        System.out.println(item.getProduct().getpName() + " x " + item.getQuantity() + " " + item.calculateAmount());//*
        sum += item.calculateAmount();//*
        System.out.println("Total is " + sum + "******");//*
        Shop.alldasket.add(sum);//*
    }
}

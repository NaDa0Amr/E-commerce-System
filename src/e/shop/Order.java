/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.shop;

/**
 *
 * @author Nada
 */
public class Order {
    private int  custmorId;
    private int orderId;
    private Product [] products;
    private float totalPrice;

    public Order(int custmorId, int orderId, Product[] products, float totalPrice) {
        this.custmorId = Math.abs(custmorId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = Math.abs(totalPrice);
    }
    
    
    public String printOrderInfo(){
       
        
        StringBuilder message = new StringBuilder();
        message.append("Here's your order's summary:\n");
        message.append("Order Id: ").append(orderId).append("\n");
        message.append("Customer Id: ").append(custmorId).append("\n");
        message.append("Products:\n");

        for (Product p : products) {
            if(p !=null)
            message.append(p.getName()).append(" - $").append(p.getPrice()).append("\n");
        }
        message.append("Total price: $").append(totalPrice).append("\n");
        
       return message.toString();
    }
}

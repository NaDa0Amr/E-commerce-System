/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.shop;

/**
 *
 * @author Nada
 */
public class Cart {
    private int customerId;
    private int nProducts;
    private Product []products;
    
    
    public Cart(int nProducts,int customerId) {
        this.customerId = Math.abs(customerId);
        this.products = new Product[Math.abs(nProducts)];
       
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }
    public void addProduct(Product obj){
        
            products[nProducts++]=obj;
        
    }
    
    public void removeProduct(int productId){
       for(int i=0;i<nProducts;i++){
          if(products[i] != null && products[i].getProductId()==productId){
              products[i]=null;
              return;
          }
               
       }
    
    }
    
    public float  calculatePrice(){
        float sum=0;
      for(int i=0;i<nProducts;i++)
          if(products[i] != null)
          sum+= products[i].getPrice();
          return sum;
       }
    public Order placeOrder(){
     Order order1=new Order(customerId,1, products,calculatePrice()); 
     return order1;
      
  }
    
    
}

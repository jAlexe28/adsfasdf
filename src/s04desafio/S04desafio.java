package s04desafio;
import java.util.Scanner ;
public class S04desafio {

 public static void main (String[] arg){
    System.out.println ("Bienvenido a la aplicación Total Factura") ;
    System.out.println () ;
    Scanner sc = new Scanner (System.in) ;
    
    // Primer producto 
    System.out.print ("Nombre del primer producto:   ");
    
    System.out.print ("Ingrese cantidad del primer producto:    ") ; 
    double cantidad1 = sc.nextDouble () ; 
    System.out.print ("Ingrese precio:    ") ; 
    double precio1 = sc.nextDouble () ; 
    double subtotal1 = cantidad1  * precio1 ;
    double impuesto1 = subtotal1 * 0.18;
    double total1 = subtotal1 + impuesto1  ; 
      System.out.println () ;
      
    // Segundo Producto 
    System.out.print ("Nombre del segundo producto:   ");
    System.out.print ("Ingrese cantidad del segundo producto:    ") ; 
    double cantidad2 = sc.nextDouble () ; 
    System.out.print ("Ingrese precio:    ") ; 
    double precio2 = sc.nextDouble () ; 
    double subtotal2 = cantidad2  * precio2 ;
    double impuesto2 = subtotal2 * 0.18;
    double total2 = subtotal2 + impuesto2  ; 
      System.out.println () ;
      
    // Tercer Producto
    System.out.print ("Nombre del tercer producto:   ");
    System.out.print ("Ingrese cantidad del tercer producto:    ") ; 
    double cantidad3 = sc.nextDouble () ; 
    System.out.print ("Ingrese precio:    ") ; 
    double precio3 = sc.nextDouble () ; 
    double subtotal3 = cantidad3  * precio3 ;
    double impuesto3 = subtotal3 * 0.18;
    double total3 = subtotal3 + impuesto3  ; 
    
    double totalFinal = total1 + total2 + total3 ; 
    
      System.out.println () ;
      
    String mensaje = "Total Factura:   " +totalFinal + "\n" ; 
    System.out.println (mensaje) ; 
      System.out.println (nomprod) ;
    }
    }



package quiz1sistemas;

import java.util.Scanner;

import org.checkerframework.checker.units.qual.radians;

public class App {


    public static void main(String[] args) {
        
        // datos de entrada 
        // combos 1 , combos 2 , combos 3
        //sillas 
        Scanner sc = new Scanner(System.in);
        System.out.println("Que combo desea: 1.Combo #1: Hamburguesa y Perro caliente – Valor $ 40.000, 2.Combo #2: Crispetas con dos Gaseosas – Valor $ 30.000 , 3.Combo #3: Dos Perros calientes con Dos Gaseosas – Valor $ 42.000");
        int comboElegido = sc.nextInt();
            sc.nextLine();


        System.out.println("ingresa cantidad del combo: ");
        int cantidadCombo = sc.nextInt();
        sc.nextLine();
        

        System.out.println("Que puesto desea comprar, G: General-Valor $10.000 ó V: VIP-valor $15.000");             
        String asientoElegido = sc.nextLine();
        sc.nextLine();



        System.out.println("ingrese la cantidad de boletas a comprar :");
        int  cantidadBoleta = sc.nextInt();
        sc.nextLine();   


        
    }

    /*  Implemente una funcion llamada calcularValorBoleta que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            - Un entero que representa la cantidad de boletas compradas
        * Retorna:
            - Un entero representando el valor total de las boletas
    */
    public static int calcularValorBoleta(String asientoElegido, int cantidadBoleta){
        try {
            int totalValorBoletas = 0;
            switch (asientoElegido) {
                case "V":

                    totalValorBoletas = 15000 * cantidadBoleta;
                    return totalValorBoletas;
                    
                    
                    case "G":
                    
                        totalValorBoletas = 10000 * cantidadBoleta;
                        return totalValorBoletas;
                       
                
                    default:
                    System.out.println(" error, no ingresó ninguna de las opciones ");
                            break;

            }
            
        } catch (Exception e) {
            return -1;
        }
    }

    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularValorNetoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el numero de combo selecciondo
            - Un entero representando la cantidad de combos comprados
        * Retorna:
            - Un entero representando el valor neto del combo
    */
    //------------------------------------------------------------------
    public static int calcularValorNetoCombo(int comboElegido, int cantidadCombo){
        try {
            int valorCombo = 0;
            switch (comboElegido) {
                case 1:
                    valorCombo = 40000 * cantidadCombo;
                    return valorCombo;
                    
                    case 2:
                    valorCombo = 30000 * cantidadCombo;
                    return valorCombo;
                    
                    case 3:
                    valorCombo = 42000 * cantidadCombo;
                    return valorCombo;


            
                default:
                System.out.println("no ingresaste ninguna opcion del combo ");
                    break;
            }
        } catch (Exception e) {
        return -1;
        }

    }


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularDescuentoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            - Un entero representando el valor neto del combo
        * Retorna:
            - Un entero representando el valor del descuento
    */
    //------------------------------------------------------------------
    
    

    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularValorFactura que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor neto del combo
            - Un entero representando el valor de las boletas
            - Un entero representando el valor del descuento del combo
        * Retorna:
            - Un entero representando el valor total de la factura
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------
}

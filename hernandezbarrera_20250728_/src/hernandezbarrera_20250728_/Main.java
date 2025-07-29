/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandezbarrera_20250728_;

/**
 *
 * @author UFG
 */
public class Main {
    
    public static String nombres = "Caelum Silas";
    public static String apellidos = "Hernández Barrera";
    public static int anio_nacimiento = 2000;
    public static int mes_nacimiento = 11;
    public static float estatura = 1.63f;
    public static float peso= 160.0f;
    public static char genero= 'm';
    public static String estado_familiar= "casado con la universidad";
    public static double salario_mensual= 100.0d;
    
    
    
    
    /**cd
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double imc = 0.0d;
        float tasa_kg = 0.453592f; // equivalentre de lb a kg
        int dias_laborales = 10; // al mes
        int horas_laborales= 4; // al día
        
        // conversión de lb a kg
        
        float peso_kg = Main.peso * tasa_kg;
        float estatura_al_cuadrado= estatura *   estatura;
        
        //Calcular IMC
        
        imc = peso_kg / estatura_al_cuadrado;
        
        // Calcular salario diario
        
        double salario_diario= salario_mensual / dias_laborales;
        
        //calcular salario por hora
        double salario_hora = salario_diario/horas_laborales;
        
       // Salida de datos
       
       System.out.println("Saludos " + nombres+ " " + apellidos);
       System.out.println("Su peso en libras es: "+ peso+ ". En Kilogramos es: "+ peso_kg);
       System.out.println("Su Índice de Masa COrporal es: " + imc);
       System.out.println("Su salario mensual es: "+salario_mensual);
       System.out.println("Su salario diario es: "+ salario_diario);
       System.out.println("Su salario por hora es: "+salario_hora);
    }
    
}


package boletin10;

import javax.swing.JOptionPane;

public class Boletin102 {
    int diferencia;
     public void xogo(){
       int r= (int) (Math.random() * (51 - 1)) + 1;
         JOptionPane.showMessageDialog(null,"O número do ordenador está posto");
         String b= JOptionPane.showInputDialog("Poña o número de intentos que quera ter");
          int y=Integer.parseInt(b);
      
          for(int w=1;w<=y;w++){
                String z= JOptionPane.showInputDialog("XOGADOR \n Adiviñe o número");
            int u=Integer.parseInt(z);
            diferencia=Math.abs(r-u);
                       
            if(r==u){            
          JOptionPane.showMessageDialog(null,"Acertáches \n intento "+w);  
          break;
       }
            else{
                if(diferencia>20){
                   System.out.println("moi lonxe");
                }
                if(10<=diferencia&&diferencia<=20){
                   System.out.println("lonxe");
                }
                if(5<diferencia&&diferencia<10){
                   System.out.println("preto");
                }
               if(diferencia<=5){
                  System.out.println("moi preto"); 
               }
            }
       }
       }
          
          public static void main(String[] args) {
         Boletin102 b= new Boletin102();
         b.xogo();
    }
    
}

//2- Programa o exercicio  anterior para xogar contra o ordenador . 
//Para eso, o ordenador xenera un número aleatorio, entre 1 e 50 ,.
//Este programa dará as seguintes pistas sobre lonxe que esté de adivinar o número :
//Se a distancia entre o número a adivinar e o tecleado é maior de 20  “ moi lonxe “
//Entre 10 e 20 , ambos incluidos,  lonxe
//Maior de 10 e menor de 5  preto
//Menor ou igual de 5  moi preto .    
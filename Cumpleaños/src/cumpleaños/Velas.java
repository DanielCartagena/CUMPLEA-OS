
package cumpleaños;
import java.util.Random;
import java.util.Scanner;

public class Velas {
    Scanner sc=new Scanner(System.in);
    Random r = new Random();
   
    int anios, Vmayor=-1000,ct=0;
    int []TamVela= new int[100]; 
  
    public void CAnios(){
        anios=sc.nextInt();
    }
    public void GeneradorTVelas(){
        for (int i = 0; i < anios; i++) {
            TamVela[i]=r.nextInt(anios)+1;;
        }
        DeterVelas();
    }
    public void DeterVelas(){
        for (int i = 0; i < anios; i++) {
            if (TamVela[i]>=Vmayor) {
                Vmayor=TamVela[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            if (TamVela[i]==Vmayor) {
                ct++;
            }
        }
    }
    public void imprimir(){
        for (int i = 0; i < anios; i++) {
            System.out.println("Tamaño vela "+(i+1)+":"+TamVela[i]);
        } 
        System.out.println("LA CANTIDAD DE VELAS A QUE SE APAGAN ES: "+ct);
    }
}


package cumpleaños;

// @author DANIEL ALEXANDER CARTAGENA FERNANDEZ  -  1803690
public class Cumpleaños {

    public static void main(String[] args) {
       Velas v=new Velas();
       System.out.println("\t\tPROGRAMA QUE DETERMIAN CUANTAS VELAS SE APAGARAN.");
       System.out.println("INGRESE LOS AÑOS QUE CUMPLE LA PERSONA.");
       v.CAnios();;
       v.GeneradorTVelas();
       v.imprimir();
    }
    
}

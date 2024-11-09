import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean errada=false;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        final String S_Id="Id?:";
        final String S_Edat="Edat?:";
        final String S_Tipus_Venda="tipus de venda?:";
        final String S_Import="import de la compra?:";
        final String S_Telefon="telèfon de contacte?:";
        System.out.println(S_Id);
        int Id= sc.nextInt();
        while(Id<111 || Id>999) {
            System.out.println(S_Id);
            Id= sc.nextInt();
            errada=true;
        }
        System.out.println(S_Edat);
        int Edat= sc.nextInt();
        while(Edat<14 || Edat>120) {
            System.out.println(S_Edat);
            Edat= sc.nextInt();
            errada=true;
        }
        System.out.println(S_Tipus_Venda);
        int Tipus_Venda= sc.nextInt();
        while(Tipus_Venda<0 || Tipus_Venda>3) {
            System.out.println(S_Tipus_Venda);
            Tipus_Venda= sc.nextInt();
            errada=true;
        }
        System.out.println(S_Import);
        int Import= sc.nextInt();
        while(Import < 0 || Import >1000) {
            System.out.println(S_Import);
            Import= sc.nextInt();
            errada=true;
        }
        System.out.println(S_Telefon);
        int Telefon= sc.nextInt();
        while(Telefon<111111111 || Telefon>999999999) {
            System.out.println(S_Telefon);
            Telefon= sc.nextInt();
            errada=true;
        }
        String tipoVenta;

        switch (Tipus_Venda) {
            case 0:
                tipoVenta = "Venta lliure";
                break;
            case 1:
                tipoVenta = "Pensionista";
                break;
            case 2:
                tipoVenta = "Carnet jove";
                break;
            case 3:
                tipoVenta = "Soci";
                break;
            default:
                tipoVenta = "Opción inválida";
                break;
        }
        System.out.println("Id   " + "Edat   " + "Tipus_Venda   " + "Import   " + "Telefon");
        System.out.println(Id + "   " + Edat + "   " + tipoVenta + "   " + Import+ "   " + Telefon);
        if(errada==true){
            System.out.println("Ha habido errores");
        }else{
            System.out.println("No ha habido errores");
        }
    }
}
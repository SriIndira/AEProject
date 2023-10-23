
import java.util.Scanner; 

class formulaProg {
    public static void main(String[] args){
        System.out.println(" Enter Config Type >>>>n 1.FixedBias, 2.Emitter Bias  ");
        formulaProg exe = new formulaProg();
        Scanner input = new Scanner(System.in);
        int type = input.nextInt();
        switch(type){
            case 1:
                exe.fixedBias();
                break;
            case 2:
                exe.emitterbias();
                break;

        }
    }

    private void fixedBias(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Values For....");
        System.out.println("Enter Voltage CC >>> ");
        int Vcc = input.nextInt();
        System.out.println("Enter Voltage BE >>> ");
        int Vbe = input.nextInt();
        System.out.println("Enter Rb>>> ");
        int Rb = input.nextInt();
        System.out.println("Enter Rc>>> ");
        int Rc = input.nextInt();
        System.out.println("Enter Beta >>> ");
        int Beta = input.nextInt();
        int Ib = (Vcc-Vbe)/Rb;
        int Ic = (Beta+1)*Ib;
        int Vce = Vcc-(Ic*Rc);
        System.out.println("Value of Ib...."+Ib);
        System.out.println("Value of Ic...."+Ic);
        System.out.println("Value of Vce...."+Vce);
    }
    private void emitterbias(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Values For....");
        System.out.println("Enter Voltage CC >>> ");
        int Vcc = input.nextInt();
        System.out.println("Enter Voltage BE >>> ");
        int Vbe = input.nextInt();
        System.out.println("Enter Rb>>> ");
        int Rb = input.nextInt();
        System.out.println("Enter Re>>> ");
        int Re = input.nextInt();
        System.out.println("Enter Rc>>> ");
        int Rc = input.nextInt();
        System.out.println("Enter Beta >>> ");
        int Beta = input.nextInt();
        int Ib = (Vcc-Vbe)/(Rb+(Beta+1)*Re);
        int Ic = (Beta+1)*Ib;
        int Ri = (Beta+1)*Re;
        int Vce = Vcc-(Ic*(Rc+Re));
        System.out.println("Value of Ib...."+Ib);
        System.out.println("Value of Ic...."+Ic);
        System.out.println("Value of Ri...."+Ri);
        System.out.println("Value of Vce...."+Vce);
    }
}
 
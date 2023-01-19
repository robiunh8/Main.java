public class Main {
    public static void main(String[] args) {

        System.out.println("-----Exercitiul 1-----");
         printrobi();
        int a= 10, b=10,c=30,d=5, e=-5,f=8,g=6,h=(55+9),i=9,j=20,k=-3,l=5,m=8,n=5,o=15,p=3,q=2,r=8,s=3;
        System.out.println(operatia1(a,b));
        System.out.println(operatia2(c,d));
        System.out.println(operatia3(e,f,g));
        System.out.println(operatia4(h,i));
        System.out.println(operatia5(j,k,l,m));
        System.out.println(operatia6(n,o,p,q,r,s));

        System.out.println("-----Exercitiul 2-----");
        int numar1=10;
        int numar2=50;
        System.out.println("Rezultatul adunarii este: " +adunare(numar1,numar2));
        System.out.println("Rezultatul scaderii este: "+scadere(numar1,numar2));
        System.out.println("Rezultatul impartirii este: "+impartire(numar1,numar2));
        System.out.println("Rezultatul inmultirii este: "+inmultire(numar1,numar2));

        System.out.println("-----Exercitiul 3-----");
liniaunu();
liniadoi();
liniatrei();
liniapatru();

System.out.println("-----Exercitiul 4-----");
int unu=5;
int doi=10;
int trei=15;
System.out.println("Media numerelor 5, 10 si 15 este: " + medialanumere(unu,doi,trei));

        System.out.println("-----Exercitiul 5-----");
robotlinie1();
robotlinie2();
robotlinie3();
robotlinie4();
robotlinie5();

        System.out.println("-----Exercitiul 6-----");
        int remainder1=30;
        int remainder2=7;
        System.out.println("Restul impartirii este: "+remainder(remainder1,remainder2));

        System.out.println("-----Exercitiul 7-----");
int temperaturafarenheit= 86;
        System.out.println("86 grade Farenheit convertite sunt: "+TEMPERATURA((temperaturafarenheit - 32) * 5/9)+ " " +
                "grade " + "Celsius");

        System.out.println("-----Exercitiul 8-----");
float inches=60;
System.out.println(inchtometer((float) (inches/39.37)));

    }


////////////// ex1
    public static void printrobi(){
        System.out.println("Hello \nRobi");
    }
public static int operatia1(int A,int B){
int op1=A+B;
    return op1;
}
public static int operatia2(int C, int D ){
int op2= C / D;
return op2;
}
public static int operatia3(int E, int F, int G ) {
    int op3 = E + F * G;
    return op3;
}
public static int operatia4(int H,int I){
int op4= H % I;
return op4;
}
public static float operatia5(float J, float K, float L, float M){
float op5= J +K * L / M;
return op5;
}
public static int operatia6(int N,int O,int P ,int Q ,int R,int S){
    int op6= N + O / P * Q - R % S;
    return op6;
}

////////////////// ex 2
public static int adunare(int numar1, int numar2){
        int rezultat= numar1 + numar2;
                return rezultat;
}
    public static int scadere(int numar1, int numar2){
        int rezultat= numar1 - numar2;
        return rezultat;
    }
    public static float impartire(float numar1, float numar2){
        float rezultat= numar1 / numar2;
        return rezultat;
    }
    public static int inmultire(int numar1, int numar2){
        int rezultat= numar1 * numar2;
        return rezultat;
    }

//////////////// ex3
    public static void liniaunu(){
        System.out.println("   J    a    V     V  a     ");
    }
    public static void liniadoi(){
        System.out.println("   J   a a    V   V  a a    ");
    }
    public static void liniatrei(){
        System.out.println("J  J  aaaaa    V V  aaaaa   ");
    }
    public static void liniapatru(){
        System.out.println(" JJ  a     a    V  a     a ");
    }

////////////////// ex4
    public static int medialanumere(int unu, int doi, int trei){
        int i= 3;
        int media =( unu+  doi+  trei) / 3;
        return media;
    }
//////////////ex 5
    public static void robotlinie1(){
        System.out.println("  +\" \" \" \" \"+");
    }
    public static void robotlinie2(){
        System.out.println("[ |  o   o  | ]");
    }
    public static void robotlinie3(){
        System.out.println("  |    ^    |");
    }
    public static void robotlinie4(){
        System.out.println("  |   '_'   |");
    }
    public static void robotlinie5(){
        System.out.println("  +_ _ _ _ _+");
    }

////////////////ex 6
public static int remainder(int remainder1,int remainder2){
        int restulimpartirii= remainder1 % remainder2;
        return restulimpartirii;
}

///////////////////ex 7
public static int TEMPERATURA(int tempF){
    int temperaturafinala= tempF;
    return temperaturafinala;
}

/////////////////ex 8
public static float inchtometer(float inches){
    float inchtometer=inches;
            return inchtometer;
}


}

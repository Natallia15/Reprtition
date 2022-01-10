import java.util.Random;

public class Question {
    public static void main(String[] args) {

        String str = "один";
        switch (str) {
            case "один":
                System.out.println("one");
                break;
        }
//        default:
//        System.out.println("ошибка");
        int u = 0;
        String str1 = "while";
        switch (str1) {
            case "while":
                int n1=0;
                int n2 = 1;
                //
                while (u < 21) {
                    int n3 = n1 + n2;
                    System.out.println(n3);
                    n1=n2;
                    n2=n3;
                    u++;
                }
                break;
        }

        int [][][][][] array = new int [2][2][2][2][2];
        for (int i = 0; i< array.length; i++){
            for (int i2 = 0; i2< array[i].length; i2++){
                for (int i3 = 0; i3< array[i][i2].length; i3++){
                    for (int i4 = 0; i4< array[i][i2][i3].length; i4++){
                        for (int i5 = 0; i4< array[i][i2][i3][i4].length; i5++)
                       // array[i][i2][i3][i4][i5] = new Random(nextInt(20));
                        System.out.println(array[i][i2][i3][i4][5]);
                    }
                }
            }
        }


    }
}

/*
        int i = 15;
        boolean b = true;
        long l = 12222;
        float f = 1.5f;
        double d = 2.5;
        char ch = 169;
        char ch2 = 'a';
        byte by = 127;
        short sh = 1233;

        int a = 3;
        int c = 5;
        int k1 = 0;
        int k2 = 7;
        double k3 = 9;
        int k4 = 9;
        int k5 = 13;
        int k6 = 0;
        int k7 = 0;

        k1 += a;
        k2 *= a;
        k3 /=a;
        k4 -=a;
        k5 %= c;
        k6 =++a;
        k7 = a++;
        System.out.println(k1+" ,"+k2+" ,"+k3+" ,"+k4+" ,"+k5+" ,"+k6+" ,"+k7);

        int w = 5;

        if (w>7) {
            System.out.println("больше 7");
        }
        if (w>3){
            System.out.println("больше 3");
            }
        if ( w>3 && w<7){
            System.out.println("от 3 до 7");
        }
    }





    }*/





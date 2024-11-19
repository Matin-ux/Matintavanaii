import java.util.*;

public class main {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      
      String nam1 , nam2 , nam3 , nam4 , nam5 , nam6 , nam7 , nam8 , nam9 , nam10;
      int num1 , num2 , num3 , num4 , num5 , num6 , num7 , num8 , num9 , num10 , str1;
      boolean c1 , c2 , c3 , c4 , c5 , c6 , c7 , c8 , c9 , c10;
      str1 = 5700000;
      
      nam1 = sc.nextLine();
      nam2 = sc.nextLine();
      nam3 = sc.nextLine();
      nam4 = sc.nextLine();
      nam5 = sc.nextLine();
      nam6 = sc.nextLine();
      nam7 = sc.nextLine();
      nam8 = sc.nextLine();
      nam9 = sc.nextLine();
      nam10 = sc.nextLine();
      num1 = sc.nextInt();
      num2 = sc.nextInt();
      num3 = sc.nextInt();
      num4 = sc.nextInt();
      num5 = sc.nextInt();
      num6 = sc.nextInt();
      num7 = sc.nextInt();
      num8 = sc.nextInt();
      num9 = sc.nextInt();
      num10 = sc.nextInt();
      
      if (num1 >= str1) {
        c1 = true;
      } else {
        c1 = false;
      } if (num2 >= str1) {
        c2 = true;
      } else {
        c2 = false;
      } if (num3 >= str1) {
        c3 = true;
      } else {
        c3 = false;
      } if (num4 >= str1) {
        c4 = true;
      } else {
        c4 = false;
      } if (num5 >= str1) {
        c5 = true;
      } else {
        c5 = false;
      } if (num6 >= str1) {
        c6 = true;
      } else {
        c6 = false;
      } if (num7 >= str1) {
        c7 = true;
      } else {
        c7 = false;
      } if (num8 >= str1) {
        c8 = true;
      } else {
        c8 = false;
      } if (num9 >= str1) {
        c9 = true;
      } else {
        c9 = false;
      } if (num10 >= str1) {
        c10 = true;
      } else {
        c10 = false;
      }

      
      System.out.print("1- " + nam1 + " Length : " + nam1.length() + " ");
      if (c1) {
        System.out.println("increase : true ");
        System.out.println("income : " + (num1*1.0165));
      } else {
        System.out.println("increase : false ");
        System.out.println("income : " + num1);
      }
      
      System.out.print("2- " + nam2 + " Length : " + nam2.length() + " ");
      if (c2) {
      System.out.print("increase : true ");
      System.out.println("income : " + (num2*1.0165));
      } else {
      System.out.print("increase : false ");
      System.out.println("income : " + num2);
  }

      System.out.print("3- " + nam3 + " Length : " + nam3.length() + " ");
      if (c3) {
      System.out.print("increase : true ");
      System.out.println("income : " + (num3*1.0165));
      } else {
      System.out.print("increase : false ");
      System.out.println("income : " + num3);
      }

      System.out.print("4- " + nam4 + " Length : " + nam4.length() + " ");
      if (c4) {
      System.out.print("increase : true ");
      System.out.println("income : " + (num4*1.0165));
      } else {
      System.out.print("increase : false ");
      System.out.println("income : " + num4);
      }

      System.out.print("5- " + nam5 + " Length : " + nam5.length() + " ");
      if (c5) {
      System.out.print("increase : true ");
      System.out.println("income : " + (num5*1.0165));
      } else {
      System.out.print("increase : false ");
      System.out.println("income : " + num5);
      }
      
      System.out.print("6- " + nam6 + " Length : " + nam6.length() + " ");
      if (c6) {
      System.out.print("increase : true ");
      System.out.println("income : " + (num6*1.0165));
      } else {
      System.out.print("increase : false ");
      System.out.println("income : " + num6);
      }
      
System.out.print("7- " + nam7 + " Length : " + nam7.length() + " ");
      if (c7) {
      System.out.print("increase : true ");
      System.out.println("income : " + (num7*1.0165));
      } else {
      System.out.print("increase : false ");
      System.out.println("income : " + num7);
      }
      
      System.out.print("8- " + nam8 + " Length : " + nam8.length() + " ");
      if (c8) {
      System.out.print("increase : true ");
      System.out.println("income : " + (num8*1.0165));
      } else {
      System.out.print("increase : false ");
      System.out.println("income : " + num8);
      }
      
      System.out.print("9- " + nam9 + " Length : " + nam9.length() + " ");
      if (c9) {
      System.out.print("increase : true ");
      System.out.println("income : " + (num9*1.0165));
      } else {
      System.out.print("increase : false ");
      System.out.println("income : " + num9);
      }
      
      System.out.print("10- " + nam10 + " Length : " + nam10.length() + " ");
      if (c10) {
      System.out.print("increase : true ");
      System.out.println("income : " + (num10*1.0165));
      } else {
      System.out.print("increase : false ");
      System.out.println("income : " + num10);
}


}
}

package org.example;
// Alman Matematikçilerden 1891 yılında  Carl Runge(1856-1927) tarafından önerilenve 1901 yılında da Wilhelm Kutta (1867-1944)
// tarafından geliştirilen "Runge Kutta Yöntemleri", diferansiyel denklemlerin sayısal çözümlerinde kullanılan en etkin yöntemlerdendir.
//
// y' = y/(2+x) diferansiyel denkleminin girilen başlangıç koşulu, adım miktarı ve değer sayısınca sayısal çözümünü 3. derece
// "Runge Kutta Yöntemi" ile gerçekleştiren program.

import java.util.Scanner;

public class Main {
    public static float f(float a,float b){
        return -b/(2+a);
    }
    public static void main(String[] args) {

        int i,n;
        float x,y,x0,y0,h,k1,k2,k3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("x(0) : ");
        x0 = scanner.nextFloat();
        System.out.print("y(0) : ");
        y0 = scanner.nextFloat();
        System.out.print("Adım Değeri : ");
        h = scanner.nextFloat();
        System.out.print("Değer Sayısı : ");
        n = scanner.nextInt();
        x=x0;
        y=y0;
        System.out.print("\nSonuçlar (x,y)\n");
        System.out.printf("%f\t%f\n",x,y);

        for (i=0; i<n; i++){
            k1=f(x,y);
            k2=f(x+h/2,y+h*k1/2);
            k3=f(x+h,y-h*k1+2*h*k2);
            y+=h*(k1+4*k2+k3)/6;
            x+=h;
            System.out.printf("%f\t%f\n",x,y);
        }
    }
}
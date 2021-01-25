package javacore;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MathTest {

    public static void main(String[] args) {

        int abs1 = Math.abs(10);
        int abs2 = Math.abs(-20);
        System.out.println("abs1 : "+abs1+" | abs2 : "+abs2);

        double ceil = Math.ceil(7.343);
        System.out.println("ceil : "+ceil);

        double floor = Math.floor(7.343);
        System.out.println("floor : "+floor);

        double floorDiv1 = Math.floorDiv(-100,9);
        System.out.println("floorDiv1 : "+floorDiv1); //-12

        double div1 = -100 / 9;
        System.out.println("div1 : "+div1); //-11

        int min = Math.min(10, 20);
        System.out.println("min : "+min);

        int max = Math.max(10,20);
        System.out.println("max : "+max);

        double roundedDown = Math.round(23.445);
        double roundedUp = Math.round(23.545);
        System.out.println("roundedDown : "+roundedDown);
        System.out.println("roundedUp : "+roundedUp);

        double random = Math.random();
        System.out.println("random : "+random);
        random *= 100D;
        System.out.println("random : "+random);
        System.out.println("random : "+Math.ceil(random));

        double exp1 = Math.exp(1);
        System.out.println("exp1 : "+exp1);
        double exp2 = Math.exp(2);
        System.out.println("exp2 : "+exp2);

        double log1 = Math.log(1);
        System.out.println("log1 : "+log1);
        double log10 = Math.log(10);
        System.out.println("log10 : "+log10);

        double log10_1 = Math.log10(1);
        System.out.println("log10_1 : "+log10_1);
        double log10_100 = Math.log10(100);
        System.out.println("log10_100 : "+log10_100);

        double pow2 = Math.pow(2,2);
        System.out.println("pow2 : "+pow2);
        double pow8 = Math.pow(2,8);
        System.out.println("pow8 : "+pow8);

        double sqrt4 = Math.sqrt(4);
        System.out.println("sqrt4 : "+sqrt4);
        double sqrt9 = Math.sqrt(9);
        System.out.println("sqrt9 : "+sqrt9);

        double sin = Math.sin(Math.PI);
        System.out.println("sin : "+sin);
        System.out.println(Math.PI);

        double cos = Math.cos(Math.PI);
        System.out.println("cos : "+cos);

        double tan = Math.tan(Math.PI);
        System.out.println("tan : "+tan);

        double asin = Math.asin(1.0);
        System.out.println("asin : "+asin);

        double acos = Math.acos(1.0);
        System.out.println("acos : "+acos);

        double atan = Math.atan(1.0);
        System.out.println("atan : "+atan);

        double sinh = Math.sinh(1.0);
        System.out.println("sinh : "+sinh);

        double cosh = Math.cosh(1.0);
        System.out.println("cosh : "+cosh);

        double tanh = Math.tanh(1.0);
        System.out.println("tanh : "+tanh);

        double degree = Math.toDegrees(Math.PI);
        System.out.println("degree : "+degree);

        double radians = Math.toRadians(180);
        System.out.println("radians : "+radians);

    }
}

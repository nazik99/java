import java.util.Random;

public class Task {
    public static void main(String[] args) {
        String[] m = {  "Начало дня",
                        "Поднимаюсь с кровати с левой ноги",
                        "Поднимаюсь с кровати с правой ноги",
                        "Падаю с кровати",
                        "Пробежка по аллее",
                        "Физ.зарядка на балконе",
                        "Варю крепкий кофе",
                        "Готовлю плотный завтрак",
                        "Достаю вчерашний салат",
                        "Спустило колесо",
                        "Добираюсь на работу пешком",
                        "Добираюсь на работу на маршрутке",
                        "Добираюсь на работу на своем авто",
                        "Прихожу вовремя",
                        "Опаздываю на работу",
                        "Конец"
        };

        int r = getRandom(1, 2);
        if (r >= 1) {
            System.out.println(m[2]);
            int r2 = getRandom(1, 6);
            if(r2 >= 5) {
                System.out.println(m[5]);
                int r3 = getRandom(1, 4);
                if(r3 >= 2){
                    System.out.println(m[8]);
                    int r4 = getRandom(1, 5);
                    if(r4 >= 3){
                        System.out.println(m[12]);
                        int r5 = getRandom(1, 8);
                        if(r5 >= 6){
                            System.out.println(m[14]);
                        }
                        else{
                            System.out.println(m[13]);
                        }
                    }
                    else {
                        System.out.println(m[9]);
                        int r7 = getRandom(1, 8);
                        if(r7 >= 3){
                            System.out.println(m[11]);
                            int r15 = getRandom(1, 2);
                            if(r15 >= 2){
                                System.out.println(m[14]);
                            }
                            else{
                                System.out.println(m[13]);
                            }
                        }
                        else{
                            System.out.println(m[10]);
                            int r8 = getRandom(1, 8);
                            if(r8 >= 3){
                                System.out.println(m[14]);
                            }
                            else{
                                System.out.println(m[13]);
                            }
                        }
                    }
                }
                else{
                    System.out.println(m[7]);
                    int r40 = getRandom(1, 5);
                    if(r40 >= 3){
                        System.out.println(m[12]);
                        int r41 = getRandom(1, 8);
                        if(r41 >= 6){
                            System.out.println(m[14]);
                        }
                        else{
                            System.out.println(m[13]);
                        }
                    }
                    else {
                        System.out.println(m[9]);
                        int r42 = getRandom(1, 8);
                        if(r42 >= 3){
                            System.out.println(m[11]);
                            int r43 = getRandom(1, 2);
                            if(r43 >= 2){
                                System.out.println(m[14]);
                            }
                            else{
                                System.out.println(m[13]);
                            }
                        }
                        else{
                            System.out.println(m[10]);
                            int r44 = getRandom(1, 8);
                            if(r44 >= 3){
                                System.out.println(m[14]);
                            }
                            else{
                                System.out.println(m[13]);
                            }
                        }
                    }
                }
            }
            else{
                System.out.println(m[4]);
                int r6 = getRandom(1, 12);
                if(r6 >= 9){
                    System.out.println(m[7]);
                    int r51 = getRandom(1, 5);
                    if(r51 >= 3){
                        System.out.println(m[12]);
                        int r52 = getRandom(1, 8);
                        if(r52 >= 6){
                            System.out.println(m[14]);
                        }
                        else{
                            System.out.println(m[13]);
                        }
                    }
                    else {
                        System.out.println(m[9]);
                        int r54 = getRandom(1, 8);
                        if(r54 >= 3){
                            System.out.println(m[11]);
                            int r55 = getRandom(1, 2);
                            if(r55 >= 2){
                                System.out.println(m[14]);
                            }
                            else{
                                System.out.println(m[13]);
                            }
                        }
                        else{
                            System.out.println(m[10]);
                            int r57 = getRandom(1, 8);
                            if(r57 >= 3){
                                System.out.println(m[14]);
                            }
                            else{
                                System.out.println(m[13]);
                            }
                        }
                    }
                }
                else{
                    System.out.println(m[6]);
                    int r72 = getRandom(1, 5);
                    if(r72 >= 3){
                        System.out.println(m[12]);
                        int r73 = getRandom(1, 8);
                        if(r73 >= 6){
                            System.out.println(m[14]);
                        }
                        else{
                            System.out.println(m[13]);
                        }
                    }
                    else {
                        System.out.println(m[9]);
                        int r74 = getRandom(1, 8);
                        if(r74 >= 3){
                            System.out.println(m[11]);
                            int r75 = getRandom(1, 2);
                            if(r75 >= 2){
                                System.out.println(m[14]);
                            }
                            else{
                                System.out.println(m[13]);
                            }
                        }
                        else{
                            System.out.println(m[10]);
                            int r76 = getRandom(1, 8);
                            if(r76 >= 3){
                                System.out.println(m[14]);
                            }
                            else{
                                System.out.println(m[13]);
                            }
                        }
                }
                }
            }
        }
        else {
            System.out.println(m[1]);
            int r9 = getRandom(1, 10);
            if(r9 >= 8){
                System.out.println(m[4]);
                int r10 = getRandom(1, 12);
                if(r10 >= 9){
                    System.out.println(m[7]);
                    int r16 = getRandom(1, 5);
                    if(r16 >= 3){
                        System.out.println(m[12]);
                        int r17 = getRandom(1, 8);
                        if(r17 >= 6){
                            System.out.println(m[14]);
                        }
                        else{
                            System.out.println(m[13]);
                        }
                    }
                    else {
                        System.out.println(m[9]);
                        int r18 = getRandom(1, 8);
                        if(r18 >= 3){
                            System.out.println(m[11]);
                            int r19 = getRandom(1, 2);
                            if(r19 >= 2){
                                System.out.println(m[14]);
                            }
                            else{
                                System.out.println(m[13]);
                            }
                        }
                        else{
                            System.out.println(m[10]);
                            int r20 = getRandom(1, 8);
                            if(r20 >= 3){
                                System.out.println(m[14]);
                            }
                            else{
                                System.out.println(m[13]);
                            }
                        }
                    }
                }
                else{
                    System.out.println(m[6]);
                    int r21 = getRandom(1, 5);
                    if(r21 >= 3){
                        System.out.println(m[12]);
                        int r22 = getRandom(1, 8);
                        if(r22 >= 6){
                            System.out.println(m[14]);
                        }
                        else{
                            System.out.println(m[13]);
                        }
                    }
                    else {
                        System.out.println(m[9]);
                        int r23 = getRandom(1, 8);
                        if(r23 >= 3){
                            System.out.println(m[11]);
                            int r24 = getRandom(1, 2);
                            if(r24 >= 2){
                                System.out.println(m[14]);
                            }
                            else{
                                System.out.println(m[13]);
                            }
                        }
                        else{
                            System.out.println(m[10]);
                            int r25 = getRandom(1, 8);
                            if(r25 >= 3){
                                System.out.println(m[14]);
                            }
                            else{
                                System.out.println(m[13]);
                            }
                        }
                    }
                }
            }
            else{
                System.out.println(m[3]);
                int r26 = getRandom(1, 12);
                if(r26 >= 9){
                    System.out.println(m[7]);
                    int r27 = getRandom(1, 5);
                    if(r27 >= 3){
                        System.out.println(m[12]);
                        int r28 = getRandom(1, 8);
                        if(r28 >= 6){
                            System.out.println(m[14]);
                        }
                        else{
                            System.out.println(m[13]);
                        }
                    }
                    else {
                        System.out.println(m[9]);
                        int r29 = getRandom(1, 8);
                        if(r29 >= 3){
                            System.out.println(m[11]);
                            int r30 = getRandom(1, 2);
                            if(r30 >= 2){
                                System.out.println(m[14]);
                            }
                            else{
                                System.out.println(m[13]);
                            }
                        }
                        else{
                            System.out.println(m[10]);
                            int r31 = getRandom(1, 8);
                            if(r31 >= 3){
                                System.out.println(m[14]);
                            }
                            else{
                                System.out.println(m[13]);
                            }
                        }
                    }
                }
            }
        }

    }

    public static int getRandom(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt(max-min+1)+min;
        
    }
}
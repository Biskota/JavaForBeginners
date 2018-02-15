/**
 Вычисление веса на Луне(сила тяжести около 17% земной)
 */
public class Moon {
    public static void main(String[] args) {
        double weight, moonWeight;
        weight = 63;
        moonWeight=weight*0.17;
        System.out.println("Мой вес на Луне равен "+ moonWeight);
    }
}

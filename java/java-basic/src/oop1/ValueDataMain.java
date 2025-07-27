package oop1;

public class ValueDataMain {

    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        valueData.add();
    }

    static void add(ValueData data) {
        data.value++;
        System.out.println("숭자증가 value = " + data.value);
    }
}

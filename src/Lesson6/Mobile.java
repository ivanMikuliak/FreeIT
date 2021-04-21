package Lesson6;

import java.util.ArrayList;

public class Mobile {
//    Создать класс Mobile с внутренним классом, с помощью объектов которого можно хранить информацию
//    о моделях телефонов и их свойствах.

    private ArrayList<Phone> phones;

    public Mobile() {
        this.phones = new ArrayList<>();
    }

    public void addPhone(Phone phone) {
        this.phones.add(phone);
    }

    public void removePhone(Phone phone) {
        this.phones.remove(phone);
    }

    public void showAllItems() {
        for (Phone phone : phones) {
            System.out.println(phone.getProperties());
        }
    }

    class Phone {
        private int batteryCapacity;
        private int phoneBookCapacity;
        private String name;

        public Phone(int batteryCapacity, int phoneBookCapacity, String name) {
            this.batteryCapacity = batteryCapacity;
            this.phoneBookCapacity = phoneBookCapacity;
            this.name = name;
        }

        public int getBatteryCapacity() {
            return this.batteryCapacity;
        }

        public int getPhoneBookCapacity() {
            return this.phoneBookCapacity;
        }

        public String getName() {
            return this.name;
        }

        public String getProperties() {
            return this.getName() + " " + this.getBatteryCapacity() + " " + this.getPhoneBookCapacity();
        }
    }
}

package com.shristi.vehicle;

public class Main { public static void main(String[] args) {
    Vehicle honda = new Vehicle("Ford", "Mustang", 530000);
    Vehicle suzuki = new Vehicle("Honda", "civic", 190000);

    honda.getdetails();
    suzuki.getdetails();
}

}

package com.pcwk.ehr.t01;

public class Car {
    // 인스턴스 변수
    private String brand;
    private String model;
    private int year;
    
    // 클래스 변수
    private static int carCount = 0;
    
    // 기본 생성자
    public Car() {
        carCount++; // 객체가 생성될 때마다 carCount 증가
    }
    
    // 생성자 오버로딩
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        carCount++; // 객체가 생성될 때마다 carCount 증가
    }
    
    // Getter 및 Setter 메서드
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    // 클래스 변수에 대한 Getter 메서드
    public static int getCarCount() {
        return carCount;
    }
    
    // 메인 메서드 (테스트 용도)
    public static void main(String[] args) {
        // Car 객체 생성
        Car car1 = new Car("Hyundai", "Genesis", 2024);
        Car car2 = new Car("Kia", "K5", 2019);
        
        // 출력
        System.out.println("Car Count: " + Car.getCarCount()); // 클래스 변수 호출
        System.out.println("Car 1: " + car1.getBrand() + " " + car1.getModel() + " " + car1.getYear());
        System.out.println("Car 2: " + car2.getBrand() + " " + car2.getModel() + " " + car2.getYear());
    }
}


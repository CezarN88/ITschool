package session10.practice.inheritance;

public class MultiLevelInheritance {
}

class Grandparent{
    void dance(){
        System.out.println("Grandpa shoild not dance");
    }
}

class Parent extends Grandparent{
    @Override
    void dance() {
        super.dance();
    }
}

class Child extends Parent{
    @Override
    void dance() {
        super.dance();
        System.out.println("Child can dance too");
    }
}
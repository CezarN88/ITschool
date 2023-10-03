package session10.practice.inheritance;

public class HierarchicalInheritance {
}

class Lioness{
    void roar(){
        System.out.println("The lioness roars loudly");
    }
}

class Cub1 extends Lioness{
    @Override
    void roar() {
        super.roar();
        System.out.println("The cub roar softly");
    }
}

class Cub2 extends Lioness{
    @Override
    void roar() {
        super.roar();
        System.out.println("The cub roar softly");
    }
}
public class Cat extends Animal {

   private int appetite;
   private boolean isHungry = true;


    public Cat(String name, int appetite) {

        super("Кот  " + name);
        this.runLimit = 200;
        this.jumpLimit = 2;
        this.appetite = appetite;
    }
    public void swim(int distance){
        System.out.println(name + " не умеет плавать");
    }

    public void eat(Plate plate){
        if(plate.checkFoodAmount(this.appetite)){
            plate.decreaseFoodAmount(this.appetite);
            System.out.println(this.name + "  ест из миски  "+ this.appetite + "  ед.еды");
            isHungry = false;
        }
        else {
            System.out.println("В миске кончилась еда");
            plate.putSomeFood();
            eat(plate);
        }
    }

    public boolean isCatHungry(){
        return isHungry;
    }
}
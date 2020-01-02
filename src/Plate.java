public class Plate {
    private int foodAmount;
    private int plateVolume;

    public Plate (int userFoodAmount , int userPlateVolume){

        this.plateVolume = userPlateVolume;

        if(userPlateVolume <= userFoodAmount){
            this.foodAmount = userFoodAmount;
        }
        else {
            System.out.println(" Слишком маленькая миска");
        }
    }

    public void decreaseFoodAmount (int foodDelta) {
        if (foodDelta > foodAmount) {
            System.out.println(" В миске нет столько еды");
        } else {
            foodAmount -= foodDelta;
        }
    }

    public boolean checkFoodAmount(int foodDelta){
        return foodDelta <= foodAmount;
    }

    public void info(){
        System.out.println("В миске осталось " + foodAmount  + " ед. еды");
    }

    public void putSomeFood(){
        this.foodAmount += (this.plateVolume- this.foodAmount); // Заполняем миску
        System.out.println("Миска наполнена");
        info();
    }
}

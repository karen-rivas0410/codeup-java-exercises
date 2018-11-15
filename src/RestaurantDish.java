//public class RestaurantDish {  //this is the public method
//
//       public int costInCents;
//       public String nameOfDish;
//       public Boolean wouldRecommend;
//       public void eat() {
//        System.out.print("Nom nom nom!");
//
//
//    }
//}

///////////////PRIVATE METHOD//
public class RestaurantDish {

    private int costInCents;
    private String nameOfDish;
    private Boolean wouldRecommend;


    public int getCostInCents() {
        return costInCents;
    }

    public int setCostInCents() {
        return costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public String setNameOfDish() {
        return nameOfDish;
    }

    public Boolean getWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(Boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    private void eat() {
        System.out.print("Nom nom nom!");


    }
}

package lesson8.practice;

public class Good {

    private String fullName;
    private int salePrice;
    private int fullPrice;
    private String maker;
    private Review[] reviews = new Review[100];

    public Good() {
    }

    public Good(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public Review[] getReviews() {
        return reviews;
    }

    public void setReviews(Review[] reviews) {
        this.reviews = reviews;
    }

    public void addReviewToGood(Review review){
        for(int i = 0;i < reviews.length;i++){
            if(reviews[i] == null){
               reviews[i] = review;
               break;
            }
        }
    }

    public double avgRating(){
        int sum = 0;
        int countReviews = 0;
        for(Review r: reviews){
            if(r != null){
                sum+= r.getStars();
                countReviews++;
            }
        }
        return sum/countReviews;
    }
}

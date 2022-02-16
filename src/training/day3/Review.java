package training.day3;

import java.util.Date;
import java.util.List;

public class Review {

    private float rating;
    private Customer customer;
    private boolean isVerifiedPurchase;
    private String reviewDescription;
    private List<String> images;
    private long reviewLikeCount;
    private Date reviewDate;
    private Date responseDate;

    private String responseFromStore;
    private long responseLikeCount;

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isVerifiedPurchase() {
        return isVerifiedPurchase;
    }

    public void setVerifiedPurchase(boolean verifiedPurchase) {
        isVerifiedPurchase = verifiedPurchase;
    }

    public String getReviewDescription() {
        return reviewDescription;
    }

    public void setReviewDescription(String reviewDescription) {
        this.reviewDescription = reviewDescription;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public long getReviewLikeCount() {
        return reviewLikeCount;
    }

    public void setReviewLikeCount(long reviewLikeCount) {
        this.reviewLikeCount = reviewLikeCount;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getResponseFromStore() {
        return responseFromStore;
    }

    public void setResponseFromStore(String responseFromStore) {
        this.responseFromStore = responseFromStore;
    }

    public long getResponseLikeCount() {
        return responseLikeCount;
    }

    public void setResponseLikeCount(long responseLikeCount) {
        this.responseLikeCount = responseLikeCount;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }
}

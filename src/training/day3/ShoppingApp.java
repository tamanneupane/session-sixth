package training.day3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingApp {

    public static void main(String[] args) {

        Item fishOil = new Item();
        fishOil.setName("Nature's Care Australia Fish Oil, Omega 3, 1000mg, 200 Capsules");

        List<String> images = new ArrayList<>();
        images.add("https://static-01.daraz.com.np/p/21763ca517932a0a857a40a0ee79c480.jpg");
        images.add("https://static-01.daraz.com.np/p/21763ca517932a0a857a40a0ee79c480.jpg");
        images.add("https://static-01.daraz.com.np/p/21763ca517932a0a857a40a0ee79c480.jpg");

        fishOil.setImage(images);

        fishOil.setPrice(2780);
        fishOil.setDiscounted(true);
        fishOil.setDiscountPercentage(7);

        fishOil.setPromotionImage("https://static-01.daraz.com.np/p/ba3efe3c7c3b56b2ca54afe7e133df6a.jpg");


        //Description Start

        List<ItemDescription> itemDescriptions = new ArrayList<>();

        ItemDescription description1 = new ItemDescription();
        description1.setDescription("- Department of Food Technology and Quality Control Registration Number : 01-76-77-000-62");

        itemDescriptions.add(description1);

        ItemDescription description2 = new ItemDescription();
        description2.setDescription("- Suitable for Children Age 6 and above.");

        itemDescriptions.add(description2);

        ItemDescription description3 = new ItemDescription();
        description3.setDescription("- Expiry Date : April 2024");

        itemDescriptions.add(description3);

        fishOil.setDescription(itemDescriptions);
        //Description End

        List<Review> reviews = new ArrayList<>();

        Review review1 = new Review();
        review1.setRating(5);

        Customer customer1 = new Customer();
        customer1.setUserName("Ajay M.");
        review1.setCustomer(customer1);

        review1.setVerifiedPurchase(true);

        review1.setReviewDescription("This is a very nice & trustable product in Nepal.Using it since years.Got it in 2653 with shipping.\n" +
                "Nice packaging too.Thank you");

        List<String> reviewImages = new ArrayList<>();
        reviewImages.add("https://sg-live-05.slatic.net/other/roc/cb35b0987f294cb142cb6c7b01179333.jpg_720x720q80.jpg_.webp");
        reviewImages.add("https://sg-live-05.slatic.net/other/roc/cfc33935201148cccc043567b87b4154.jpg_720x720q80.jpg_.webp");

        review1.setImages(reviewImages);

        review1.setReviewDate(new Date("2021-11-12"));

        review1.setResponseFromStore("Thank you for your kind words! We wish you Good Health!");
        review1.setResponseDate(new Date("2021-11-12"));

        fishOil.setRatings(reviews);

        Specification specification = new Specification();
        specification.setBrand("Nature's Care");
        specification.setFlavour("Not Specified");
        specification.setSku("106227678_NP-1027997085");
        specification.setInsideBox("Nature's Care Australia Fish Oil, Omega 3, 1000mg, 200 Capsules");

        fishOil.setSpecification(specification);
    }
}

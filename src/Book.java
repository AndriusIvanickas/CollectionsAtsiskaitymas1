public class Book extends Edition{
    String publishingHouse;
    String Summary;

    public Book(String name, String authorName, int yearOfPublication, String publishingHouse, String summary) {
        super(name, authorName, yearOfPublication);
        this.publishingHouse = publishingHouse;
        Summary = summary;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public String getSummary() {
        return Summary;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    @Override
    public void GenerateDescription() {
        System.out.println("Lietuviskos knygos");
    }


}

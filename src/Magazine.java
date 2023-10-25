public class Magazine  extends Edition{
    private String publishingHouse;
    private String[] articles;


    public Magazine(String name, String authorName, int yearOfPublication, String publishingHouse, String[] articles) {
        super(name, authorName, yearOfPublication);
        this.publishingHouse = publishingHouse;
        this.articles = articles;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String[] getArticle() {
        return articles;
    }

    public void setArticle(String[] article) {
        this.articles = article;
    }


    @Override
    public void GenerateDescription() {
        System.out.println("Lietuviski zurnalai");
    }


}

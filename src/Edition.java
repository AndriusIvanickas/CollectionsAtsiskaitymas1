public abstract class Edition implements Comparable<Edition>
{
    private String name;
    private String authorName;
    private int yearOfPublication;
    private Department department;
    private Edition editions[];
    public Edition(){}
    public Edition(String name, String authorName, int yearOfPublication)
    {
        this.name = name;
        this.authorName = authorName;
        this.yearOfPublication = yearOfPublication;
    }

    public Edition[] getEditions() {
        return editions;
    }

    public String getName()
    {
        return name;
    }
    public void setName (String name)
    {
        this.name = name;
    }
    public String getAuthorName()
    {
        return authorName;
    }
    public void setAuthorName (String authorName)
    {
        this.authorName = authorName;
    }
    public int getYearOfPublication()
    {
        return yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication)
    {
        this.yearOfPublication = yearOfPublication;
    }
    public String toString ()
    {
        return "Name: " + name + ", Author name: " + authorName + ", Year of publication: " + yearOfPublication;
    }
    public abstract void GenerateDescription();


    @Override
    public int compareTo(Edition other) {
        return Integer.compare(getYearOfPublication(),other.getYearOfPublication());
    }



}
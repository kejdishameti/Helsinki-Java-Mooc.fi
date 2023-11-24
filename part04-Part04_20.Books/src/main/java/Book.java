public class Book {
    private String instanceName;
    private int instancePages;
    private int instancePublicationYear;

    public Book(String name,int pages, int publicationYear) {
        this.instanceName = name;
        this.instancePages = pages;
        this.instancePublicationYear = publicationYear;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public int getInstancePages() {
        return instancePages;
    }

    public void setInstancePages(int instancePages) {
        this.instancePages = instancePages;
    }

    public int getInstancePublicationYear() {
        return instancePublicationYear;
    }

    public void setInstancePublicationYear(int instancePublicationYear) {
        this.instancePublicationYear = instancePublicationYear;
    }

    public String toString() {
        return this.instanceName + ", " + this.instancePages + ", " + this.instancePublicationYear;
    }
}

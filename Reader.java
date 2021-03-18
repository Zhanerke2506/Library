package Gaara;

public class Reader {
    private int id;
    private String lastname;
    private String name;
    private Date2 date;
    private String phone;

    public Reader(int id, String lastname, String name, Date2 date, String phone) {
        this.id = id;
        this.lastname = lastname;
        this.name = name;
        this.date = date;
        this.phone = phone;
    }
    public Reader(){
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date2 getDate() {
        return date;
    }
    public void setDate(Date2 date) {
        this.date = date;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void takeBook(String... books){
        System.out.println(this.lastname+" "+this.name+" алған кітаптар:");
        for(String book:books){
            System.out.println(book);
        }
        System.out.println();
    }
    public void takeBook(Book... books) {
        System.out.println(this.lastname+" "+this.name+" алған кітаптар:");
        for (Book book : books) {
            System.out.println(book.getNaz() + " (" + book.getAuthor()+")");
        }
        System.out.println();
    }
    public String toString() {
        return this.id+". " +this.lastname+" "+this.name+", "+this.date+", "+this.phone;
    }
}

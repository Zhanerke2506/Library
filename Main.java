package Gaara;

public class Main {
    public static void main(String[] args) {
        Date2 d1=new Date2(19, 9, 1977);
        Date2 d2=new Date2(19, 9, 1981);
        Date2 d3=new Date2(9, 7, 2010);
        Date2[] d={d1,d2,d3};

        Reader r1=new Reader(1, "Даутбаев", "Қанат", d1, "+77764190977");
        Reader r2=new Reader(2, "Алканова", "Самал", d2, "+77078640650");
        Reader r3=new Reader(3, "Акимжан", "Камшат", d3, "+77764928881");
        Reader[] r={r1, r2, r3};

        Book b1=new Book("Абай жолы", "М.Ауезов");
        Book b2=new Book("Мирас","Т.Табасбаев");
        Book b3=new Book("Махаббат қызық мол жылдар", "Ә.Нұршайықов");
        Book[] b={b1, b2, b3};

        int summa=0, summa2=0;
        System.out.println("Кітаптар тізімі:");
        for (Book book : b) {
            System.out.println(book.toString());
            summa++;
        }
        System.out.println("\n"+"Кітапханадғы жалпы кітаптар саны: "+summa+"\n");

        System.out.println("Оқырмандар тізімі:");
        for (Reader reader : r) {
            System.out.println(reader.toString());
            summa2++;
        }
        System.out.println("\n"+"Жалпы оқырмандар саны: "+summa2+"\n");

        int max=0, min=3000;
        for(int i=0; i<summa2; i++){
            if(d[i].getYear()>max){
                max=d[i].getYear();
            }
            if(d[i].getYear()<min){
                min=d[i].getYear();
            }
        }
        System.out.println("Ең кіші оқырманның жасы: "+ (2021-max));
        System.out.println("Ең кәрі оқырманның жасы: "+(2021-min)+"\n");

        r1.takeBook(b2);
        r2.takeBook("50 дней до моего самоубийство (С.Крамер)", "Виноваты звезды (Д.Грин)");
        r3.takeBook(b1,b3);
    }
}

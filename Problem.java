package readerWriter;

public class Problem  {

    public static void main (String[] args){

        Database db = new Database();
        Reader red= new Reader(db);
        writer wri = new writer(db);

        Thread tr1 = new Thread(red);
        Thread tr2 = new Thread(red);

        Thread tw1 = new Thread(wri);
        Thread tw2 = new Thread(wri);

        tr1.start();
        tw1.start();
        tr2.start();
        tw2.start();

        System.out.println(db.toString());


    }




}

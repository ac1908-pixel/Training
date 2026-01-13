public class question5{
    public static void pensandstudents(int pens, int students){
        int remainder = pens % students;
        int each_gets = pens / students;

        System.out.println(" The Pen Per Student is " + each_gets + " and the remaining pen not distributed is " + remainder);
    }
    public static void main(String args[]){
        pensandstudents(14, 3);
    }
}
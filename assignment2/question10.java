public class question5{
    public static void numberOfchocolatesandnumberOfChildren(int numberOfchocolates, int numberOfChildren){
        int remainder = numberOfchocolates % numberOfChildren;
        int each_gets = numberOfchocolates / numberOfChildren;

        System.out.println(" The Pen Per Student is " + each_gets + " and the remaining pen not distributed is " + remainder);
    }
    public static void main(String args[]){
        numberOfchocolatesandnumberOfChildren(14, 3);
    }
}
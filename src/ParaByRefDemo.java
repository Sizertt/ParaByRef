
class ParaByRefDemo {
    public static void main(String[] args) {
        ParaByRef p = new ParaByRef(2, 3);
        ParaByRef q = new ParaByRef(3, 2);

        System.out.println("q.x = " + q.x);
        System.out.println("q.y = " + q.y);

        System.out.println("q.x =  " + q.x);
        System.out.println("q.y = " + q.y);
    }
}
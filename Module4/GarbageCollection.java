package Assignments.Assignment2.Module4;


public class GarbageCollection {
    @Override
    public void finalize(){
        System.out.println("Garbage collected");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            GarbageCollection obj=new GarbageCollection();
            obj=null;
        }
        System.gc();
    }
}

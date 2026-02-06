public class GarbageCollection {
    
    // TODO: Override the finalize() method
    // protected void finalize()
    // Inside it, print "Garbage Collected"
    protected void finalize()
    {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        // TODO: Create an object of GarbageCollection class
        
        // TODO: Make the object eligible for garbage collection (e.g., assign null)
        
        // TODO: Request Garbage Collection using System.gc()
        
        // Tip: You might need a small delay or simply exiting might trigger it in some JVMs, 
        // but System.gc() is the standard call.
        GarbageCollection g1 = new GarbageCollection();
        g1=null;
        System.gc();
         System.out.println("Garbage Collected");
    }
}

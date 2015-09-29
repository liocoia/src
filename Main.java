import java.util.Set;
import java.util.HashSet;

public class Main {
   /**
    * <pre>
    *           0..1     0..*
    * Main ------------------------- MultiGraphADT
    *           main        &gt;       multiGraphADT
    * </pre>
    */
   private Set<MultiGraphADT> multiGraphADT;
   
   public Set<MultiGraphADT> getMultiGraphADT() {
      if (this.multiGraphADT == null) {
         this.multiGraphADT = new HashSet<MultiGraphADT>();
      }
      return this.multiGraphADT;
   }
   
   /**
    * <pre>
    *           0..1     0..*
    * Main ------------------------- MetroSystem
    *           main        &gt;       metroSystem
    * </pre>
    */
   private Set<MetroSystem> metroSystem;
   
   public Set<MetroSystem> getMetroSystem() {
      if (this.metroSystem == null) {
         this.metroSystem = new HashSet<MetroSystem>();
      }
      return this.metroSystem;
   }
   
   }

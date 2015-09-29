import java.util.Set;
import java.util.HashSet;

public class MetroMapParser {
   /**
    * <pre>
    *           0..*     0..1
    * MetroMapParser ------------------------- MetroSystem
    *           metroMapParser        &lt;       metroSystem
    * </pre>
    */
   private MetroSystem metroSystem;
   
   public void setMetroSystem(MetroSystem value) {
      this.metroSystem = value;
   }
   
   public MetroSystem getMetroSystem() {
      return this.metroSystem;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * MetroMapParser ------------------------- BadFileException
    *           metroMapParser        &gt;       badFileException
    * </pre>
    */
   private Set<BadFileException> badFileException;
   
   public Set<BadFileException> getBadFileException() {
      if (this.badFileException == null) {
         this.badFileException = new HashSet<BadFileException>();
      }
      return this.badFileException;
   }
   
   public void usage() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public void generateGraphFromFile() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }

import java.util.Set;
import java.util.HashSet;

public class BadFileException {
   /**
    * <pre>
    *           0..*     0..*
    * BadFileException ------------------------- MetroMapParser
    *           badFileException        &lt;       metroMapParser
    * </pre>
    */
   private Set<MetroMapParser> metroMapParser;
   
   public Set<MetroMapParser> getMetroMapParser() {
      if (this.metroMapParser == null) {
         this.metroMapParser = new HashSet<MetroMapParser>();
      }
      return this.metroMapParser;
   }
   
   }

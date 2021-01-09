package generic.pair;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version 1.00 2004-05-10
 * @author Cay Horstmann
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pair<T> 
{
   private T first;
   private T second;
}

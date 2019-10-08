package practice.generic.pair;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;
import practice.T;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.01 2012-01-26
 * @author Cay Horstmann
 */
public class PairTest3
{
   public static void main(String[] args)
   {
      Employee lower= new Employee("lisi", 4.44,34,3,3);
      Employee lowe= new Employee("lisi", 4.44,34,3,3);
      Pair<Employee> es = new Pair<>(lowe,lower);

      Manager ceo = new Manager("Gus Greedy", 800000, 2003, 12, 15);
      Manager cfo = new Manager("Sid Sneaky", 600000, 2003, 12, 15);
      Pair<Manager> buddies = new Pair<>(ceo, cfo);

      printBuddies(es);
      printBuddies1(es);
      printBuddies(buddies);
      printBuddies1(buddies);

      ceo.setBonus(1000000);
      cfo.setBonus(500000);
      Manager[] managers = { ceo, cfo };

      Pair<Employee> result = new Pair<>();
      Pair<Manager> result1 = new Pair<>();
      minmaxBonus(managers, result);
      System.out.println("first: " + result.getFirst().getName()
              + ", second: " + result.getSecond().getName());
      minmaxBonus(managers, result1);
      System.out.println("first: " + result1.getFirst().getName()
         + ", second: " + result1.getSecond().getName());

      maxminBonus(managers, result);
      System.out.println("first: " + result.getFirst().getName()
         + ", second: " + result.getSecond().getName());


      List<?> l1 = new ArrayList<String>();
      List l7 = new ArrayList<String>();
      List<?> l2 = new ArrayList<Integer>();
      List<?> l3 = new ArrayList<Employee>();


      Employee[] employees = new Manager[10];
      employees[0] = lowe;
      System.out.println(employees[0]);
   }

   // 这是使用的泛型方法实现的
   public static <T extends Employee> void printBuddies(Pair<T> p)
   {
      T first = p.getFirst();
      T second = p.getSecond();
      System.out.println(first.getName() + " and " + second.getName() + " are buddies.");
   }

   // 这是使用的通配符实现的
   public static void printBuddies1(Pair<? extends Employee> p)
   {
      Employee first = p.getFirst();
      Employee second = p.getSecond();
      System.out.println(first.getName() + " and " + second.getName() + " are buddies.");
   }

   // 限定符类型可以改为泛型方法吗？
   public static void minmaxBonus(Manager[] a, Pair<? super Manager> result)
   {
      if (a.length == 0) return;
      Manager min = a[0];
      Manager max = a[0];
      for (int i = 1; i < a.length; i++)
      {
         if (min.getBonus() > a[i].getBonus()) min = a[i];
         if (max.getBonus() < a[i].getBonus()) max = a[i];
      }
      result.setFirst(min);
      result.setSecond(max);
      Object e = result.getFirst();
   }

   public static void maxminBonus(Manager[] a, Pair<? super Manager> result)
   {
      minmaxBonus(a, result);
      PairAlg.swapHelper(result); // OK--swapHelper captures wildcard type
   }
}

class PairAlg
{
   public static boolean hasNulls(Pair<?> p) {
      Object e = p.getFirst();
      return p.getFirst() == null || p.getSecond() == null;
   }

   public static void swap(Pair<?> p) { swapHelper(p); }

   public static <T> void swapHelper(Pair<T> p)
   {
      T t = p.getFirst();
      p.setFirst(p.getSecond());
      p.setSecond(t);
   }
}



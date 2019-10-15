package ch04.ex03;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
   @Test
   public void cloneTest() throws Exception {
       final LinkedList l1 = new LinkedList();
       StringBuilder s1 = new StringBuilder("test1");
       l1.addFirst(s1);
       final LinkedList l2 = l1.clone();
       Assert.assertEquals("test1", l2.getData(0).toString());
   }

   @Test
   public void cloneReferenceTest() throws Exception {
       final LinkedList l1 = new LinkedList();
       StringBuilder s1 = new StringBuilder("test1");
       l1.addFirst(s1);
       final LinkedList l2 = l1.clone();
       s1.append("test2");
       Assert.assertEquals("test1test2", l2.getData(0).toString());
   }

   @Test
   public void cloneDependencyTest() throws Exception {
       final LinkedList l1 = new LinkedList();
       StringBuilder s1 = new StringBuilder("test1");
       l1.addFirst(s1);
       final LinkedList l2 = l1.clone();
       l2.addFirst("test2");
       Assert.assertEquals(1, l1.getSize());
       Assert.assertEquals(2, l2.getSize());
   }

}
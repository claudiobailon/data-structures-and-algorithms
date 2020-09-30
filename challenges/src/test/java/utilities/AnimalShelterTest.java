package utilities;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    Cat Blue = new Cat("Blue");
    Cat Ollie = new Cat("Ollie");
    Cat Magic = new Cat("Magic");
    Dog Happy = new Dog("Happy");
    Dog George = new Dog("George");
    @Test public void testEnquue(){
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(Blue);
        assertEquals("{Blue cat} -> NULL", animalShelter.toString());//tests that blue was added and toString works as expected

        animalShelter.enqueue(Ollie);
        assertEquals("{Blue cat} -> {Ollie cat} -> NULL", animalShelter.toString());//ollie is added at back of queue (left is front)

        animalShelter.enqueue(Happy);
        assertEquals("{Blue cat} -> {Ollie cat} -> {Happy dog} -> NULL", animalShelter.toString());//happy should be at end of queue

        animalShelter.enqueue(Magic);
        assertEquals("{Blue cat} -> {Ollie cat} -> {Happy dog} -> {Magic cat} -> NULL", animalShelter.toString());//Magic should be behind Happy
        System.out.println(animalShelter.toString());

    }

    @Test public void testDequeue(){
        AnimalShelter animalShelter = new AnimalShelter();
        assertNull(animalShelter.dequeue("cat"));//should return null if queue is empty

        animalShelter.enqueue(Blue);
        assertEquals(Blue, animalShelter.dequeue("cat"));

        animalShelter.enqueue(Ollie);
        animalShelter.enqueue(Happy);
        animalShelter.enqueue(Magic);
        assertEquals(Happy, animalShelter.dequeue("dog"));//this should skip cat ollie and return dog Happy
        assertNull(animalShelter.dequeue("dog"));//no dogs left in queue so return null
        assertNull(animalShelter.dequeue("lion"));//not cat or dog so return null
        assertEquals(Ollie, animalShelter.dequeue("cat"));//now Ollie should be dequeued
        assertEquals(Magic, animalShelter.dequeue("cat"));
        assertNull(animalShelter.dequeue("dog"));

        animalShelter.enqueue(George);
        animalShelter.enqueue(Blue);
        animalShelter.enqueue(Happy);
        assertEquals(Blue,animalShelter.dequeue("cat"));//this should skip the dog george and go to the cat Blue
        assertNull(animalShelter.dequeue("cat"));//no cats left in queue
        assertEquals(George, animalShelter.dequeue("dog"));
        assertEquals(Happy, animalShelter.dequeue("dog"));
        System.out.println(animalShelter.toString());

    }

}

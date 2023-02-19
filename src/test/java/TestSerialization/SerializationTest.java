package TestSerialization;

import org.com.interafaces.serializible.Person;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SerializationTest {

    @Test
    void TestSerialization() throws IOException, ClassNotFoundException {

        Person person = new Person();
        person.setAge(20);
        person.setWeight(34);
        person.setCountry("Poland");

        FileOutputStream fileOutputStream = new FileOutputStream("testSerialization.txt");
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream
                = new FileInputStream("testSerialization.txt");
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);
        Person p2 = (Person) objectInputStream.readObject();
        objectInputStream.close();

        assertEquals(p2.getAge(), person.getAge());
        assertEquals(p2.getName(), person.getName());
    }

}

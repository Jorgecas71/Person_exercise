package dev.jorge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void testPersonHasAttributes() {
        Person pepa = new Person("Pepa", "Flores", null, 0);
        assertEquals(4, pepa.getClass().getDeclaredFields().length);
    }

    @Test
    void testGetName() {
        Person pepa = new Person("Pepa", "Flores", null, 0);
        assertEquals("Pepa", pepa.getName());
   
    }

    @Test
    void testGetLastName() {
        Person pepa = new Person("Pepa", "Flores", null, 0);
        assertEquals("Flores", pepa.getLastName());
    }

    @Test
    public void testGetDocumentNumber() {
        Person pepa = new Person("Pepa", "Flores", "12345678", 1980);
        assertEquals("12345678", pepa.getDocumentNumber());
    }

    @Test
    public void testYearOfBirth() {
        Person pepa = new Person("Pepa", "Flores", "12345678", 1980);
        assertEquals(1980, pepa.yearOfBirth());
    }
}

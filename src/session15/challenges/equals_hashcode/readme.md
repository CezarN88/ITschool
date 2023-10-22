1. Implement the equals() and hashCode() methods for a Rectangle class with width and height fields. Test that two instances with the same width and height return true for equals() and have the same hash code.

2. Create a Person class with name, age, and email fields. Implement the equals() method to check only the name and age fields. Implement the hashCode() method to use the name and age fields to calculate the hash code. Test that two instances with the same name and age return true for equals() and have the same hash code.

3. Create a Student class with name, age, studentId, and email fields. Implement the equals() method to check all fields except the studentId. Implement the hashCode() method to use all fields except the studentId to calculate the hash code. Test that two instances with the same name, age, and email return true for equals() and have the same hash code.

4. Create a Song class with title, artist, and length fields. Implement the equals() method to check only the title and artist fields. Implement the hashCode() method to use the title and artist fields to calculate the hash code. Test that two instances with the same title and artist return true for equals() and have the same hash code.

5. Create a Product class with name, price, and id fields. Implement the equals() method to check only the id field. Implement the hashCode() method to use the id field to calculate the hash code. Test that two instances with the same id return true for equals() and have the same hash code. Then change the id of one instance and test that they are no longer equal and have different hash codes.

6. Given a list of objects representing database entities with fields such as id, name, and timestamp, ensure that no two entities are considered equal if their id fields are different.

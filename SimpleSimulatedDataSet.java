import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.UUID;
public class SimpleSimulatedDataSet {
public static void main(String[] args) {
Random random = new Random();
try {
// Create a CSV file to store data
FileWriter writer = new FileWriter("simple_dataset.csv");
// Write header
writer.write("UUID,First Name,Last Name,Age,Email\n");
// Generate 100 random records
for (int i = 1; i <= 100; i++) {
String id = UUID.randomUUID().toString(); // unique id
String firstName = "FirstName" + i;
String lastName = "LastName" + i;
int age = random.nextInt(43) + 18; // age between 18–60
String email = "user" + i + "@example.com";
// Write to CSV file
writer.write(id + "," + firstName + "," + lastName + "," + age + "," + email + "\n");
}
writer.close();
System.out.println(" simple_dataset.csv created successfully!");
} catch (IOException e) {
System.out.println("Error writing file: " + e.getMessage());
}
}
}
package NhatAn.example.example;

public class Insurance {

    public double calculatePremium(int age, String type) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive");
        }
        if (type == null || (!type.equals("Health") && !type.equals("Life"))) {
            throw new IllegalArgumentException("Invalid insurance type");
        }

        // Giả định logic tính phí bảo hiểm
        if (type.equals("Health")) {
            return 500.0;
        } else {
            return 1000.0;
        }
    }
}

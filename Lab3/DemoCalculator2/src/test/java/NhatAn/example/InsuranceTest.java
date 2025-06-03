package NhatAn.example;

import NhatAn.example.example.Insurance;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InsuranceTest {

    static Insurance insurance;

    @BeforeAll
    static void setup() {
        insurance = new Insurance();
    }

    @AfterAll
    static void teardown() {
        insurance = null;
    }

    @DisplayName("Kiểm tra tính toán phí bảo hiểm hợp lệ")
    @Test
    void testCalculatePremium() {
        double premium = insurance.calculatePremium(30, "Health");
        assertEquals(500.0, premium, 0.001, "Phí bảo hiểm cho tuổi 30 và loại Health nên là 500.0");
    }

    @DisplayName("Kiểm tra tính toán phí bảo hiểm với tuổi không hợp lệ")
    @Test
    void testCalculatePremiumWithInvalidAge() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> insurance.calculatePremium(-5, "Health"));
        assertEquals("Age must be positive", exception.getMessage());
    }

    @DisplayName("Kiểm tra loại bảo hiểm không hợp lệ")
    @Test
    void testInvalidInsuranceType() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> insurance.calculatePremium(25, "InvalidType"));
        assertEquals("Invalid insurance type", exception.getMessage());
    }
}

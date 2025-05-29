package NhatAn.example;

import NhatAn.example.example.AccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class AccountServiceTest {

    private AccountService accountService;

    @BeforeEach
    void setUp() {
        accountService = new AccountService();
    }

    @ParameterizedTest(name = "Test {index} => username={0}, password={1}, email={2}, expected={3}")
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 1)
    void testRegisterAccount(String username, String password, String email, boolean expected) {
        boolean result = accountService.registerAccount(username, password, email);
        assertEquals(expected, result,
                () -> "Register with username=" + username + ", password=" + password + ", email=" + email);
    }
}

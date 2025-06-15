import org.junit.jupiter.api.Test;
import NhatAn.example.InsecureLogin;

public class InsecureLoginTest {

    @Test
    public void testLoginSuccess() {
        // Gọi hàm login với dữ liệu đúng
        InsecureLogin.login("admin", "123456");
        // Không cần assert nếu chỉ muốn kiểm tra không bị lỗi
    }

    @Test
    public void testLoginFail() {
        // Gọi hàm login với dữ liệu sai
        InsecureLogin.login("user", "wrongpassword");
    }

    @Test
    public void testPrintUserInfo() {
        // Tạo instance và gọi phương thức in thông tin người dùng
        InsecureLogin insecureLogin = new InsecureLogin();
        insecureLogin.printUserInfo("John Doe");
    }
}
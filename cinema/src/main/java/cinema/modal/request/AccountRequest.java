package cinema.modal.request;

import cinema.modal.entity.Account;
import cinema.modal.entity.constant.Role;
import cinema.modal.entity.constant.StatusAccount;
import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static cinema.util.ConvertDateTime.convertToLocalDate;

@Data
public class AccountRequest {
    private String username;
    private String fullName;
    private String birthDate;
    private String email;
    private String password;
    private String phoneNumber;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public Account asAccountByAdmin() {
        Account account = new Account();
        populateAccount(account);
        return account;
    }

    public Account updateAccount(Account account) {
       populateAccount(account);
       return account;
    }
    public void RegisterAccount(Account account) {
        account.setUsername(username);
        account.setPassword(passwordEncoder.encode(password));
        account.setEmail(email);
        account.setStatus(StatusAccount.PENDING);
        account.setRole(Role.USER);
    }
    private void populateAccount(Account account) {
        account.setUsername(username);
        account.setFullName(fullName);
        account.setBirthDate(convertToLocalDate(birthDate));
        account.setEmail(email);
        account.setPassword(passwordEncoder.encode(password));
        account.setPhoneNumber(phoneNumber);
    }
}

package cinema.modal.response.DTO;

import cinema.modal.entity.Account;
import lombok.Data;

@Data
public class AccountDTO {
    private String account_id;
    private String username;
    private String full_name;
    private String birth_date;
    private String email;
    private String phone_number;
    private String role;
    private String account_status;

    public AccountDTO(Account account) {
        this.account_id = String.valueOf(account.getId());
    }
}

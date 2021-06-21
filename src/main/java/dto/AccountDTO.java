package dto;

import entity.Account;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import service.ulti.DateTimeUtil;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
@Getter
@Setter
@NoArgsConstructor
public class AccountDTO {
    private String userName;
    private String fullName;
    private String email;
    private String passWord;
    private String role;
    private String status;
    private long createdAtMLS;
    private long updatedAtMLS;

    public AccountDTO(Account account){
        this.userName = account.getUserName();
        this.fullName = account.getFullName();
        this.email = account.getEmail();
        this.status = account.getStatusString();
        this.passWord = account.getPassWord();
        this.role = account.getRoleString();
    }
}

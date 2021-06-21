package entity;

import dto.AccountDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userName;
    private String fullName;
    private String email;
    private String passWord;
    private int role;
    private int status;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "account")
    private Set<Credential> tokens;
    public Account (AccountDTO accountDTO){
        this.fullName = accountDTO.getFullName();
        this.userName = accountDTO.getUserName();
        this.email = accountDTO.getEmail();
        this.status = 1;
        this.passWord = accountDTO.getPassWord();
        this.role = 1;

    }
    public String getStatusString() {
        return this.getStatus() == 1 ? "ACTIVE" : (this.getStatus() == 0 ? "DEACTIVE" : "DELETE");
    }
    public String getRoleString(){
        return  this.getRole() == 1? "ADMIN" : "USER";
    }
}

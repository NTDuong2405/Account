package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Credential {
    private String accessToken;
    private String refreshToken;
    private long createAtMLS;
    private long expiredAtLMS;
    private int status;
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH},fetch = FetchType.LAZY)
    @JoinColumn(name = "accountId")
    private Account account;
    @Column(insertable = false,updatable = false)
    private long accountId;
}

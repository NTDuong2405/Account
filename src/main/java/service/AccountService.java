package service;

import entity.Credential;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import repository.CredentialRepository;
import repository.IAccountRepository;

@Service

public class AccountService {
    @Autowired
   private IAccountRepository iAccountRepository;
    @Autowired
    private CredentialRepository credentialRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Credential login(String username, String password) {

        return null;
    }
}

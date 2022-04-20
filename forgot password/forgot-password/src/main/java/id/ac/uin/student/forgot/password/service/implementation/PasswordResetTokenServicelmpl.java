package id.ac.uin.student.forgot.password.service.implementation;

import id.ac.uin.student.forgot.password.entity.PasswordResetToken;
import id.ac.uin.student.forgot.password.repository.PasswordResetTokenRepository;
import id.ac.uin.student.forgot.password.service.framework.PasswordResetTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasswordResetTokenServicelmpl implements PasswordResetTokenService {
    private final PasswordResetTokenRepository passwordResetTokenRepository;

    @Autowired
    public PasswordResetTokenServicelmpl(PasswordResetTokenRepository passwordResetTokenRepository) {
        this.passwordResetTokenRepository = passwordResetTokenRepository;
    }

    @Override
    public PasswordResetToken findByToken(String token) {
        return passwordResetTokenRepository.findByToken(token).orElse(null);
    }

    @Override
    public PasswordResetToken save(PasswordResetToken passwordResetToken) {
        return passwordResetTokenRepository.save(passwordResetToken);
    }
}


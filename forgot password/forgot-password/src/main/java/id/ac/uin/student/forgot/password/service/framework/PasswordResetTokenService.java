package id.ac.uin.student.forgot.password.service.framework;

import id.ac.uin.student.forgot.password.entity.PasswordResetToken;

public interface PasswordResetTokenService {
    PasswordResetToken findByToken(String token);

    PasswordResetToken save(PasswordResetToken passwordResetToken);
}

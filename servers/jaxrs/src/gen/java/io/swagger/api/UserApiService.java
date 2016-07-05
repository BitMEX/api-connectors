package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Transaction;
import io.swagger.model.AccessToken;
import io.swagger.model.User;
import io.swagger.model.Affiliate;
import io.swagger.model.UserCommission;
import io.swagger.model.Margin;
import java.math.BigDecimal;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public abstract class UserApiService {
    public abstract Response userCancelWithdrawal(String token,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userCheckReferralCode(String referralCode,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userConfirmEmail(String token,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userConfirmEnableTFA(String token,String type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userConfirmPasswordReset(String token,String newPassword,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userConfirmWithdrawal(String token,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userDisableTFA(String token,String type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response userGetAffiliateStatus(SecurityContext securityContext) throws NotFoundException;
    public abstract Response userGetCommission(SecurityContext securityContext) throws NotFoundException;
    public abstract Response userGetDepositAddress(String currency,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userGetMargin(String currency,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userGetWalletHistory(String currency,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userLogin(String email,String password,String token,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userLogout(SecurityContext securityContext) throws NotFoundException;
    public abstract Response userLogoutAll(SecurityContext securityContext) throws NotFoundException;
    public abstract Response userNew(String email,String password,String country,String username,String firstname,String lastname,String acceptsTOS,String referrerID,String tfaType,String tfaToken,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userRequestEnableTFA(String type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userRequestPasswordReset(String email,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userRequestWithdrawal(String currency,BigDecimal amount,String address,String otpToken,Double fee,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userSavePreferences(String prefs,Boolean overwrite,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userSendVerificationEmail(String email,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userUpdate(String firstname,String lastname,String oldPassword,String newPassword,String newPasswordConfirm,String username,String country,String pgpPubKey,SecurityContext securityContext) throws NotFoundException;
}

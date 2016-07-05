package io.swagger.api;

import io.swagger.model.Transaction;
import io.swagger.model.AccessToken;
import io.swagger.model.User;
import io.swagger.model.Affiliate;
import io.swagger.model.UserCommission;
import io.swagger.model.Margin;
import java.math.BigDecimal;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-05T09:41:19.947-05:00")

@Controller
public class UserApiController implements UserApi {

    public ResponseEntity<Transaction> userCancelWithdrawal(@ApiParam(value = "", required=true ) @RequestPart(value="token", required=true)  String token) {
        // do some magic!
        return new ResponseEntity<Transaction>(HttpStatus.OK);
    }

    public ResponseEntity<Double> userCheckReferralCode(@ApiParam(value = "") @RequestParam(value = "referralCode", required = false) String referralCode) {
        // do some magic!
        return new ResponseEntity<Double>(HttpStatus.OK);
    }

    public ResponseEntity<AccessToken> userConfirmEmail(@ApiParam(value = "", required=true ) @RequestPart(value="token", required=true)  String token) {
        // do some magic!
        return new ResponseEntity<AccessToken>(HttpStatus.OK);
    }

    public ResponseEntity<Boolean> userConfirmEnableTFA(@ApiParam(value = "Token from your selected TFA type.", required=true ) @RequestPart(value="token", required=true)  String token,
        @ApiParam(value = "Two-factor auth type. Supported types: 'GA' (Google Authenticator), 'Yubikey'" ) @RequestPart(value="type", required=false)  String type) {
        // do some magic!
        return new ResponseEntity<Boolean>(HttpStatus.OK);
    }

    public ResponseEntity<Boolean> userConfirmPasswordReset(@ApiParam(value = "", required=true ) @RequestPart(value="token", required=true)  String token,
        @ApiParam(value = "", required=true ) @RequestPart(value="newPassword", required=true)  String newPassword) {
        // do some magic!
        return new ResponseEntity<Boolean>(HttpStatus.OK);
    }

    public ResponseEntity<Transaction> userConfirmWithdrawal(@ApiParam(value = "", required=true ) @RequestPart(value="token", required=true)  String token) {
        // do some magic!
        return new ResponseEntity<Transaction>(HttpStatus.OK);
    }

    public ResponseEntity<Boolean> userDisableTFA(@ApiParam(value = "Token from your selected TFA type.", required=true ) @RequestPart(value="token", required=true)  String token,
        @ApiParam(value = "Two-factor auth type. Supported types: 'GA' (Google Authenticator)" ) @RequestPart(value="type", required=false)  String type) {
        // do some magic!
        return new ResponseEntity<Boolean>(HttpStatus.OK);
    }

    public ResponseEntity<User> userGet() {
        // do some magic!
        return new ResponseEntity<User>(HttpStatus.OK);
    }

    public ResponseEntity<List<Affiliate>> userGetAffiliateStatus() {
        // do some magic!
        return new ResponseEntity<List<Affiliate>>(HttpStatus.OK);
    }

    public ResponseEntity<List<UserCommission>> userGetCommission() {
        // do some magic!
        return new ResponseEntity<List<UserCommission>>(HttpStatus.OK);
    }

    public ResponseEntity<String> userGetDepositAddress(@ApiParam(value = "", defaultValue = "XBt") @RequestParam(value = "currency", required = false, defaultValue="XBt") String currency) {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<Margin> userGetMargin(@ApiParam(value = "", defaultValue = "XBt") @RequestParam(value = "currency", required = false, defaultValue="XBt") String currency) {
        // do some magic!
        return new ResponseEntity<Margin>(HttpStatus.OK);
    }

    public ResponseEntity<List<Transaction>> userGetWalletHistory(@ApiParam(value = "", defaultValue = "XBt") @RequestParam(value = "currency", required = false, defaultValue="XBt") String currency) {
        // do some magic!
        return new ResponseEntity<List<Transaction>>(HttpStatus.OK);
    }

    public ResponseEntity<AccessToken> userLogin(@ApiParam(value = "Your email address.", required=true ) @RequestPart(value="email", required=true)  String email,
        @ApiParam(value = "Your password.", required=true ) @RequestPart(value="password", required=true)  String password,
        @ApiParam(value = "OTP Token (YubiKey, Google Authenticator)" ) @RequestPart(value="token", required=false)  String token) {
        // do some magic!
        return new ResponseEntity<AccessToken>(HttpStatus.OK);
    }

    public ResponseEntity<Void> userLogout() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Double> userLogoutAll() {
        // do some magic!
        return new ResponseEntity<Double>(HttpStatus.OK);
    }

    public ResponseEntity<User> userNew(@ApiParam(value = "Your email address.", required=true ) @RequestPart(value="email", required=true)  String email,
        @ApiParam(value = "Your password.", required=true ) @RequestPart(value="password", required=true)  String password,
        @ApiParam(value = "Country of residence.", required=true ) @RequestPart(value="country", required=true)  String country,
        @ApiParam(value = "Desired username." ) @RequestPart(value="username", required=false)  String username,
        @ApiParam(value = "First name." ) @RequestPart(value="firstname", required=false)  String firstname,
        @ApiParam(value = "Last name." ) @RequestPart(value="lastname", required=false)  String lastname,
        @ApiParam(value = "Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/terms)." ) @RequestPart(value="acceptsTOS", required=false)  String acceptsTOS,
        @ApiParam(value = "Optional Referrer ID." ) @RequestPart(value="referrerID", required=false)  String referrerID,
        @ApiParam(value = "Optional Two-Factor Type. Accepted values: GA, Yubikey, Clef" ) @RequestPart(value="tfaType", required=false)  String tfaType,
        @ApiParam(value = "Two-Factor Token." ) @RequestPart(value="tfaToken", required=false)  String tfaToken) {
        // do some magic!
        return new ResponseEntity<User>(HttpStatus.OK);
    }

    public ResponseEntity<Boolean> userRequestEnableTFA(@ApiParam(value = "Two-factor auth type. Supported types: 'GA' (Google Authenticator)" ) @RequestPart(value="type", required=false)  String type) {
        // do some magic!
        return new ResponseEntity<Boolean>(HttpStatus.OK);
    }

    public ResponseEntity<Boolean> userRequestPasswordReset(@ApiParam(value = "", required=true ) @RequestPart(value="email", required=true)  String email) {
        // do some magic!
        return new ResponseEntity<Boolean>(HttpStatus.OK);
    }

    public ResponseEntity<Transaction> userRequestWithdrawal(@ApiParam(value = "Currency you're withdrawing. Options: `XBt`", required=true , defaultValue="XBt") @RequestPart(value="currency", required=true)  String currency,
        @ApiParam(value = "Amount of withdrawal currency.", required=true ) @RequestPart(value="amount", required=true)  BigDecimal amount,
        @ApiParam(value = "Destination Address.", required=true ) @RequestPart(value="address", required=true)  String address,
        @ApiParam(value = "2FA token. Required if 2FA is enabled on your account." ) @RequestPart(value="otpToken", required=false)  String otpToken,
        @ApiParam(value = "Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email." ) @RequestPart(value="fee", required=false)  Double fee) {
        // do some magic!
        return new ResponseEntity<Transaction>(HttpStatus.OK);
    }

    public ResponseEntity<User> userSavePreferences(@ApiParam(value = "", required=true ) @RequestPart(value="prefs", required=true)  String prefs,
        @ApiParam(value = "If true, will overwrite all existing preferences." , defaultValue="false") @RequestPart(value="overwrite", required=false)  Boolean overwrite) {
        // do some magic!
        return new ResponseEntity<User>(HttpStatus.OK);
    }

    public ResponseEntity<Boolean> userSendVerificationEmail(@ApiParam(value = "", required=true ) @RequestPart(value="email", required=true)  String email) {
        // do some magic!
        return new ResponseEntity<Boolean>(HttpStatus.OK);
    }

    public ResponseEntity<User> userUpdate(@ApiParam(value = "" ) @RequestPart(value="firstname", required=false)  String firstname,
        @ApiParam(value = "" ) @RequestPart(value="lastname", required=false)  String lastname,
        @ApiParam(value = "" ) @RequestPart(value="oldPassword", required=false)  String oldPassword,
        @ApiParam(value = "" ) @RequestPart(value="newPassword", required=false)  String newPassword,
        @ApiParam(value = "" ) @RequestPart(value="newPasswordConfirm", required=false)  String newPasswordConfirm,
        @ApiParam(value = "Username can only be set once. To reset, email support." ) @RequestPart(value="username", required=false)  String username,
        @ApiParam(value = "Country of residence." ) @RequestPart(value="country", required=false)  String country,
        @ApiParam(value = "PGP Public Key. If specified, automated emails will be sentwith this key." ) @RequestPart(value="pgpPubKey", required=false)  String pgpPubKey) {
        // do some magic!
        return new ResponseEntity<User>(HttpStatus.OK);
    }

}

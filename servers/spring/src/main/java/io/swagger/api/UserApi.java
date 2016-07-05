package io.swagger.api;

import io.swagger.model.Transaction;
import io.swagger.model.AccessToken;
import io.swagger.model.User;
import io.swagger.model.Affiliate;
import io.swagger.model.UserCommission;
import io.swagger.model.Margin;
import java.math.BigDecimal;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-05T09:41:19.947-05:00")

@Api(value = "user", description = "the user API")
public interface UserApi {

    @ApiOperation(value = "Cancel a withdrawal.", notes = "", response = Transaction.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Transaction.class) })
    @RequestMapping(value = "/user/cancelWithdrawal",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Transaction> userCancelWithdrawal(@ApiParam(value = "", required=true ) @RequestPart(value="token", required=true)  String token);


    @ApiOperation(value = "Check if a referral code is valid.", notes = "If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404.", response = Double.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Double.class) })
    @RequestMapping(value = "/user/checkReferralCode",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<Double> userCheckReferralCode(@ApiParam(value = "") @RequestParam(value = "referralCode", required = false) String referralCode);


    @ApiOperation(value = "Confirm your email address with a token.", notes = "", response = AccessToken.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = AccessToken.class) })
    @RequestMapping(value = "/user/confirmEmail",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<AccessToken> userConfirmEmail(@ApiParam(value = "", required=true ) @RequestPart(value="token", required=true)  String token);


    @ApiOperation(value = "Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.", notes = "", response = Boolean.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })
    @RequestMapping(value = "/user/confirmEnableTFA",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Boolean> userConfirmEnableTFA(@ApiParam(value = "Token from your selected TFA type.", required=true ) @RequestPart(value="token", required=true)  String token,@ApiParam(value = "Two-factor auth type. Supported types: 'GA' (Google Authenticator), 'Yubikey'" ) @RequestPart(value="type", required=false)  String type);


    @ApiOperation(value = "Confirm a password reset.", notes = "", response = Boolean.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })
    @RequestMapping(value = "/user/confirmPasswordReset",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Boolean> userConfirmPasswordReset(@ApiParam(value = "", required=true ) @RequestPart(value="token", required=true)  String token,@ApiParam(value = "", required=true ) @RequestPart(value="newPassword", required=true)  String newPassword);


    @ApiOperation(value = "Confirm a withdrawal.", notes = "", response = Transaction.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Transaction.class) })
    @RequestMapping(value = "/user/confirmWithdrawal",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Transaction> userConfirmWithdrawal(@ApiParam(value = "", required=true ) @RequestPart(value="token", required=true)  String token);


    @ApiOperation(value = "Disable two-factor auth for this account.", notes = "", response = Boolean.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })
    @RequestMapping(value = "/user/disableTFA",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Boolean> userDisableTFA(@ApiParam(value = "Token from your selected TFA type.", required=true ) @RequestPart(value="token", required=true)  String token,@ApiParam(value = "Two-factor auth type. Supported types: 'GA' (Google Authenticator)" ) @RequestPart(value="type", required=false)  String type);


    @ApiOperation(value = "Get your user model.", notes = "", response = User.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = User.class) })
    @RequestMapping(value = "/user",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<User> userGet();


    @ApiOperation(value = "Get your current affiliate/referral status.", notes = "", response = Affiliate.class, responseContainer = "List", tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Affiliate.class) })
    @RequestMapping(value = "/user/affiliateStatus",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<List<Affiliate>> userGetAffiliateStatus();


    @ApiOperation(value = "Get your account's commission status.", notes = "", response = UserCommission.class, responseContainer = "List", tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = UserCommission.class) })
    @RequestMapping(value = "/user/commission",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<List<UserCommission>> userGetCommission();


    @ApiOperation(value = "Get a deposit address.", notes = "", response = String.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = String.class) })
    @RequestMapping(value = "/user/depositAddress",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<String> userGetDepositAddress(@ApiParam(value = "", defaultValue = "XBt") @RequestParam(value = "currency", required = false, defaultValue="XBt") String currency);


    @ApiOperation(value = "Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.", notes = "", response = Margin.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Margin.class) })
    @RequestMapping(value = "/user/margin",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<Margin> userGetMargin(@ApiParam(value = "", defaultValue = "XBt") @RequestParam(value = "currency", required = false, defaultValue="XBt") String currency);


    @ApiOperation(value = "Get a history of all of your wallet transactions (deposits and withdrawals).", notes = "", response = Transaction.class, responseContainer = "List", tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Transaction.class) })
    @RequestMapping(value = "/user/walletHistory",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<List<Transaction>> userGetWalletHistory(@ApiParam(value = "", defaultValue = "XBt") @RequestParam(value = "currency", required = false, defaultValue="XBt") String currency);


    @ApiOperation(value = "Log in to BitMEX.", notes = "", response = AccessToken.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = AccessToken.class) })
    @RequestMapping(value = "/user/login",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<AccessToken> userLogin(@ApiParam(value = "Your email address.", required=true ) @RequestPart(value="email", required=true)  String email,@ApiParam(value = "Your password.", required=true ) @RequestPart(value="password", required=true)  String password,@ApiParam(value = "OTP Token (YubiKey, Google Authenticator)" ) @RequestPart(value="token", required=false)  String token);


    @ApiOperation(value = "Log out of BitMEX.", notes = "", response = Void.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Void.class) })
    @RequestMapping(value = "/user/logout",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Void> userLogout();


    @ApiOperation(value = "Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.", notes = "", response = Double.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Double.class) })
    @RequestMapping(value = "/user/logoutAll",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Double> userLogoutAll();


    @ApiOperation(value = "Register a new user.", notes = "", response = User.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = User.class) })
    @RequestMapping(value = "/user",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<User> userNew(@ApiParam(value = "Your email address.", required=true ) @RequestPart(value="email", required=true)  String email,@ApiParam(value = "Your password.", required=true ) @RequestPart(value="password", required=true)  String password,@ApiParam(value = "Country of residence.", required=true ) @RequestPart(value="country", required=true)  String country,@ApiParam(value = "Desired username." ) @RequestPart(value="username", required=false)  String username,@ApiParam(value = "First name." ) @RequestPart(value="firstname", required=false)  String firstname,@ApiParam(value = "Last name." ) @RequestPart(value="lastname", required=false)  String lastname,@ApiParam(value = "Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/terms)." ) @RequestPart(value="acceptsTOS", required=false)  String acceptsTOS,@ApiParam(value = "Optional Referrer ID." ) @RequestPart(value="referrerID", required=false)  String referrerID,@ApiParam(value = "Optional Two-Factor Type. Accepted values: GA, Yubikey, Clef" ) @RequestPart(value="tfaType", required=false)  String tfaType,@ApiParam(value = "Two-Factor Token." ) @RequestPart(value="tfaToken", required=false)  String tfaToken);


    @ApiOperation(value = "Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.", notes = "", response = Boolean.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })
    @RequestMapping(value = "/user/requestEnableTFA",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Boolean> userRequestEnableTFA(@ApiParam(value = "Two-factor auth type. Supported types: 'GA' (Google Authenticator)" ) @RequestPart(value="type", required=false)  String type);


    @ApiOperation(value = "Request a password reset.", notes = "", response = Boolean.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })
    @RequestMapping(value = "/user/requestPasswordReset",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Boolean> userRequestPasswordReset(@ApiParam(value = "", required=true ) @RequestPart(value="email", required=true)  String email);


    @ApiOperation(value = "Request a withdrawal to an external wallet.", notes = "This will send a confirmation email to the email address on record, unless requested via an API Key with the `withdraw` permission.", response = Transaction.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Transaction.class) })
    @RequestMapping(value = "/user/requestWithdrawal",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Transaction> userRequestWithdrawal(@ApiParam(value = "Currency you're withdrawing. Options: `XBt`", required=true , defaultValue="XBt") @RequestPart(value="currency", required=true)  String currency,@ApiParam(value = "Amount of withdrawal currency.", required=true ) @RequestPart(value="amount", required=true)  BigDecimal amount,@ApiParam(value = "Destination Address.", required=true ) @RequestPart(value="address", required=true)  String address,@ApiParam(value = "2FA token. Required if 2FA is enabled on your account." ) @RequestPart(value="otpToken", required=false)  String otpToken,@ApiParam(value = "Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email." ) @RequestPart(value="fee", required=false)  Double fee);


    @ApiOperation(value = "Save user preferences.", notes = "", response = User.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = User.class) })
    @RequestMapping(value = "/user/preferences",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<User> userSavePreferences(@ApiParam(value = "", required=true ) @RequestPart(value="prefs", required=true)  String prefs,@ApiParam(value = "If true, will overwrite all existing preferences." , defaultValue="false") @RequestPart(value="overwrite", required=false)  Boolean overwrite);


    @ApiOperation(value = "Re-send verification email.", notes = "", response = Boolean.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })
    @RequestMapping(value = "/user/resendVerificationEmail",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Boolean> userSendVerificationEmail(@ApiParam(value = "", required=true ) @RequestPart(value="email", required=true)  String email);


    @ApiOperation(value = "Update your password, name, and other attributes.", notes = "", response = User.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = User.class) })
    @RequestMapping(value = "/user",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.PUT)
    ResponseEntity<User> userUpdate(@ApiParam(value = "" ) @RequestPart(value="firstname", required=false)  String firstname,@ApiParam(value = "" ) @RequestPart(value="lastname", required=false)  String lastname,@ApiParam(value = "" ) @RequestPart(value="oldPassword", required=false)  String oldPassword,@ApiParam(value = "" ) @RequestPart(value="newPassword", required=false)  String newPassword,@ApiParam(value = "" ) @RequestPart(value="newPasswordConfirm", required=false)  String newPasswordConfirm,@ApiParam(value = "Username can only be set once. To reset, email support." ) @RequestPart(value="username", required=false)  String username,@ApiParam(value = "Country of residence." ) @RequestPart(value="country", required=false)  String country,@ApiParam(value = "PGP Public Key. If specified, automated emails will be sentwith this key." ) @RequestPart(value="pgpPubKey", required=false)  String pgpPubKey);

}

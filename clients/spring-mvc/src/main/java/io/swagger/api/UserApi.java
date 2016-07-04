package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.User;
import io.swagger.model.Affiliate;
import io.swagger.model.Transaction;
import io.swagger.model.UserCommission;
import io.swagger.model.AccessToken;
import io.swagger.model.Margin;
import java.math.BigDecimal;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/user", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/user", description = "the user API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-07-04T18:25:23.952-05:00")
public class UserApi {
  

  @ApiOperation(value = "Get your user model.", notes = "", response = User.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<User> userGet()
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<User>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Update your password, name, and other attributes.", notes = "", response = User.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.PUT)
  public ResponseEntity<User> userUpdate(


@ApiParam(value = "" ) @RequestPart(value="firstname", required=false)  String firstname
,
    


@ApiParam(value = "" ) @RequestPart(value="lastname", required=false)  String lastname
,
    


@ApiParam(value = "" ) @RequestPart(value="oldPassword", required=false)  String oldPassword
,
    


@ApiParam(value = "" ) @RequestPart(value="newPassword", required=false)  String newPassword
,
    


@ApiParam(value = "" ) @RequestPart(value="newPasswordConfirm", required=false)  String newPasswordConfirm
,
    


@ApiParam(value = "Username can only be set once. To reset, email support." ) @RequestPart(value="username", required=false)  String username
,
    


@ApiParam(value = "Country of residence." ) @RequestPart(value="country", required=false)  String country
,
    


@ApiParam(value = "PGP Public Key. If specified, automated emails will be sentwith this key." ) @RequestPart(value="pgpPubKey", required=false)  String pgpPubKey
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<User>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Register a new user.", notes = "", response = User.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<User> userNew(


@ApiParam(value = "Your email address.", required=true ) @RequestPart(value="email", required=true)  String email
,
    


@ApiParam(value = "Your password.", required=true ) @RequestPart(value="password", required=true)  String password
,
    


@ApiParam(value = "Country of residence.", required=true ) @RequestPart(value="country", required=true)  String country
,
    


@ApiParam(value = "Desired username." ) @RequestPart(value="username", required=false)  String username
,
    


@ApiParam(value = "First name." ) @RequestPart(value="firstname", required=false)  String firstname
,
    


@ApiParam(value = "Last name." ) @RequestPart(value="lastname", required=false)  String lastname
,
    


@ApiParam(value = "Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/terms)." ) @RequestPart(value="acceptsTOS", required=false)  String acceptsTOS
,
    


@ApiParam(value = "Optional Referrer ID." ) @RequestPart(value="referrerID", required=false)  String referrerID
,
    


@ApiParam(value = "Optional Two-Factor Type. Accepted values: GA, Yubikey, Clef" ) @RequestPart(value="tfaType", required=false)  String tfaType
,
    


@ApiParam(value = "Two-Factor Token." ) @RequestPart(value="tfaToken", required=false)  String tfaToken
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<User>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get your current affiliate/referral status.", notes = "", response = Affiliate.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/affiliateStatus", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<List<Affiliate>> userGetAffiliateStatus()
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Affiliate>>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Cancel a withdrawal.", notes = "", response = Transaction.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/cancelWithdrawal", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<Transaction> userCancelWithdrawal(


@ApiParam(value = "", required=true ) @RequestPart(value="token", required=true)  String token
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Transaction>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Check if a referral code is valid.", notes = "If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404.", response = Double.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/checkReferralCode", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<Double> userCheckReferralCode(@ApiParam(value = "") @RequestParam(value = "referralCode", required = false) String referralCode


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Double>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get your account's commission status.", notes = "", response = UserCommission.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/commission", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<List<UserCommission>> userGetCommission()
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<UserCommission>>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Confirm your email address with a token.", notes = "", response = AccessToken.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/confirmEmail", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<AccessToken> userConfirmEmail(


@ApiParam(value = "", required=true ) @RequestPart(value="token", required=true)  String token
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<AccessToken>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.", notes = "", response = Boolean.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/confirmEnableTFA", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<Boolean> userConfirmEnableTFA(


@ApiParam(value = "Token from your selected TFA type.", required=true ) @RequestPart(value="token", required=true)  String token
,
    


@ApiParam(value = "Two-factor auth type. Supported types: 'GA' (Google Authenticator), 'Yubikey'" ) @RequestPart(value="type", required=false)  String type
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Boolean>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Confirm a password reset.", notes = "", response = Boolean.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/confirmPasswordReset", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<Boolean> userConfirmPasswordReset(


@ApiParam(value = "", required=true ) @RequestPart(value="token", required=true)  String token
,
    


@ApiParam(value = "", required=true ) @RequestPart(value="newPassword", required=true)  String newPassword
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Boolean>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Confirm a withdrawal.", notes = "", response = Transaction.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/confirmWithdrawal", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<Transaction> userConfirmWithdrawal(


@ApiParam(value = "", required=true ) @RequestPart(value="token", required=true)  String token
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Transaction>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get a deposit address.", notes = "", response = String.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/depositAddress", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<String> userGetDepositAddress(@ApiParam(value = "", defaultValue = "XBt") @RequestParam(value = "currency", required = false, defaultValue="XBt") String currency


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<String>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Disable two-factor auth for this account.", notes = "", response = Boolean.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/disableTFA", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<Boolean> userDisableTFA(


@ApiParam(value = "Token from your selected TFA type.", required=true ) @RequestPart(value="token", required=true)  String token
,
    


@ApiParam(value = "Two-factor auth type. Supported types: 'GA' (Google Authenticator)" ) @RequestPart(value="type", required=false)  String type
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Boolean>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Log in to BitMEX.", notes = "", response = AccessToken.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/login", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<AccessToken> userLogin(


@ApiParam(value = "Your email address.", required=true ) @RequestPart(value="email", required=true)  String email
,
    


@ApiParam(value = "Your password.", required=true ) @RequestPart(value="password", required=true)  String password
,
    


@ApiParam(value = "OTP Token (YubiKey, Google Authenticator)" ) @RequestPart(value="token", required=false)  String token
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<AccessToken>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Log out of BitMEX.", notes = "", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/logout", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<Void> userLogout()
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Void>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.", notes = "", response = Double.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/logoutAll", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<Double> userLogoutAll()
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Double>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.", notes = "", response = Margin.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/margin", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<Margin> userGetMargin(@ApiParam(value = "", defaultValue = "XBt") @RequestParam(value = "currency", required = false, defaultValue="XBt") String currency


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Margin>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Save user preferences.", notes = "", response = User.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/preferences", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<User> userSavePreferences(


@ApiParam(value = "", required=true ) @RequestPart(value="prefs", required=true)  String prefs
,
    


@ApiParam(value = "If true, will overwrite all existing preferences." , defaultValue="false") @RequestPart(value="overwrite", required=false)  Boolean overwrite
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<User>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.", notes = "", response = Boolean.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/requestEnableTFA", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<Boolean> userRequestEnableTFA(


@ApiParam(value = "Two-factor auth type. Supported types: 'GA' (Google Authenticator)" ) @RequestPart(value="type", required=false)  String type
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Boolean>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Request a password reset.", notes = "", response = Boolean.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/requestPasswordReset", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<Boolean> userRequestPasswordReset(


@ApiParam(value = "", required=true ) @RequestPart(value="email", required=true)  String email
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Boolean>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Request a withdrawal to an external wallet.", notes = "This will send a confirmation email to the email address on record, unless requested via an API Key with the `withdraw` permission.", response = Transaction.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/requestWithdrawal", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<Transaction> userRequestWithdrawal(


@ApiParam(value = "Currency you're withdrawing. Options: `XBt`", required=true , defaultValue="XBt") @RequestPart(value="currency", required=true)  String currency
,
    


@ApiParam(value = "Amount of withdrawal currency.", required=true ) @RequestPart(value="amount", required=true)  BigDecimal amount
,
    


@ApiParam(value = "Destination Address.", required=true ) @RequestPart(value="address", required=true)  String address
,
    


@ApiParam(value = "2FA token. Required if 2FA is enabled on your account." ) @RequestPart(value="otpToken", required=false)  String otpToken
,
    


@ApiParam(value = "Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email." ) @RequestPart(value="fee", required=false)  Double fee
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Transaction>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Re-send verification email.", notes = "", response = Boolean.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/resendVerificationEmail", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<Boolean> userSendVerificationEmail(


@ApiParam(value = "", required=true ) @RequestPart(value="email", required=true)  String email
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Boolean>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get a history of all of your wallet transactions (deposits and withdrawals).", notes = "", response = Transaction.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful") })
  @RequestMapping(value = "/walletHistory", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<List<Transaction>> userGetWalletHistory(@ApiParam(value = "", defaultValue = "XBt") @RequestParam(value = "currency", required = false, defaultValue="XBt") String currency


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Transaction>>(HttpStatus.OK);
  }

  
}

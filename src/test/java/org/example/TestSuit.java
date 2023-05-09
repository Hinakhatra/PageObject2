package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    LoginPage loginPage = new LoginPage();
    AppleMacBookPro13Page appleMacBookPro13Page = new AppleMacBookPro13Page();
    ProductEmailAFriendPage productEmailAFriendPage = new ProductEmailAFriendPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    LeicaDigitalCamera leicaDigitalCamera = new LeicaDigitalCamera();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CompareProductsPage compareProductsPage = new CompareProductsPage();
    ProductPage productPage = new ProductPage();
    FacebookPage facebookPage = new FacebookPage();
    CheckingAsGuestPage checkingAsGuestPage = new CheckingAsGuestPage();
    CheckOutBillingPage checkOutBillingPage = new CheckOutBillingPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    NopCommerceNewReleasePage nopCommerceNewReleasePage = new NopCommerceNewReleasePage();

    @Test
    public void VerifyUserShouldBeAbleToRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();
        //enter register details
        registrationPage.fillInRegistrationDetail();
        //verify register success or not
        registrationResultPage.VerifyUserShouldBeAbleToRegisterSuccessfully();
    }
    @Test
    public void VerifyRegisteredUserShouldBeAbleToReferAProductSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();
        //enter register details
        registrationPage.fillInRegistrationDetail();
        //click on login
        homePage.clickOnLogin();
        //enter login details
        loginPage.fillInLoginDetail();
        //click on apple-macbook-pro-13-inch to refer a product
        homePage.clickOnAppleMacBookPro_13();
        //click on email a friend
        appleMacBookPro13Page.emailAFriend();
        //type friend's email
        productEmailAFriendPage.fillInEmailAFriendDetailsForRegisterUser();
    }
    @Test
    public void VerifyRegisteredUserShouldBeAbleToVoteSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();
        //enter register details
        registrationPage.fillInRegistrationDetail();
        //click on login
        homePage.clickOnLogin();
        //enter login details
        loginPage.fillInLoginDetail();
        homePage.clickOnGoodRadioButton();
        homePage.clickOnVote();
        homePage.VerifyRegisteredUserShouldBeAbleToVoteSuccessfully();

    }
    @Test
    public void VerifyNonRegisteredUserShouldNotBeAbleToEmailAFriendSuccessfully(){
        //click on AppleMac Add to cart button
        homePage.clickOnAddToCartAppleMac();
        //click on email a friend button
        appleMacBookPro13Page.emailAFriend();
        //fill details on email a friend page as non-register user
        productEmailAFriendPage.fillInEmaildetailsForNonRegisterUser();
    }
    @Test
    public void VerifyUserShouldBeAbleToCompare2productsSuccessfully(){
        //click on HTC one M8 Android L 5.0 Lollipop compare button
        homePage.clickOnHTCAndroidCompareButton();
        //click on green line close button
        homePage.clickOnGreenLineClose();
        //click on $25 virtual gift card compare button
        homePage.clickOnGiftCardCompareButton();
        //click on green line close button
        homePage.clickOnGreenLineClose();
        //click on Green line product comparison text
        homePage.clickOnGreenlineProductComparisonText();
        //product comparison details
        compareProductsPage.productsComparisonPage();
    }
    @Test
    public void VerifyUserShouldBeAbleToSeeProductInShoppingCartSuccessfully(){
        //click on electronics
        homePage.clickOnElectronics();
        //click on camera and photo
        electronicsPage.clickOnCameraAndPhoto();
        //click on leica camera
        cameraAndPhotoPage.clickOnLeicaCamera();
        //get leica camera text
        leicaDigitalCamera.leicaCameraAddToCartAndShoppingCart();
        //compare product name matched or not in shopping cart
        shoppingCartPage.compareProductNameInCart();
    }
    @Test
    public void VerifyNonRegisteredUserShouldNotBeAbleToVoteSuccessfully(){
        //click on good radio button
       homePage.clickOnGoodRadioButton();
        //click on VOTE
        homePage.clickOnVote();
        //verify error message
        homePage.VerifyNonRegisteredUserShouldNotBeAbleToVoteSuccessfully();

    }
    @Test
    public void VerifyUserShouldBeAbleToSee4ProductNameSuccessfully(){
        //print out product titles
        homePage.printOutTheProductTitle();
    }
    @Test
    public void VerifyUserShouldAbleToAcceptAlert(){
        //verify search alert message
        homePage.verifySearchAlertMessage();
    }
    @Test
    public void VerifyUserShouldBeAbleToSelectAndPrintCurrencyAccordingly(){
        //select US Dollar from drop down
        homePage.printCurrencyInUSDollar();
        //select Euro from drop down
        homePage.printCurrencyInEuro();

    }
    @Test
    public void VerifySearchFunctionalityWorkingFine(){
        //type product name and click on search
        homePage.searchFunctionality();
        //print products name
        productPage.printProductname();
    }
    @Test
    public void VerifyNopCommerceNewReleaseLatestCommentShouldBeAppearLast(){
        //click on New Release
        homePage.clickOnNewReleaseDetails();
        //fill all details in New release page
        nopCommerceNewReleasePage.fillInNewReleaseDetails();


    }
    @Test
    public void VerifyGuestUserShouldBeAbleToCheckOutSuccessfully(){
        //click on build your own computer add to cart button
        homePage.clickOnBuildUrOwnAddToCart();
        //select all necessary fields on product page
        productPage.buildYourOwnComputer();
        //verifying all details of the product
        shoppingCartPage.verifyDetailsOfBuildYourOwnComputer();
        //click on checkout button in checkout as a guest page
        checkingAsGuestPage.verifyCheckoutAsGuest();
        //fill all the details on billing page
        checkOutBillingPage.fillInBillingDetails();
        //click on shipping method
        shippingMethodPage.clickOnShippingMethod();
        //fill all card payment details
        shippingMethodPage.paymentInfo();
        //click on confirm and verifying the message
        shippingMethodPage.confirmOrder();


    }
    @Test
    public void VerifyUserShouldBeAbleToSwitchToFaceBookWindowTab(){
        //bottom of homepage click on facebook in follow us
        homePage.handleMultipleWindow();
        //verifying email,password and login elements
        facebookPage.handleFaceBookPage();
        //return back on home page and verifying message
        homePage.verifyWelcomeMessage();

    }
    @Test
    public void VerifyAlertMessageWhenUserClickOnVoteWithoutSelectAnyOption(){
        //verifying vote alert message
        homePage.verifyVoteAlertMessage();

    }



}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

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
    CartPage cartPage = new CartPage();
    CompareProductsPage compareProductsPage = new CompareProductsPage();

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
        cartPage.compareProductNameInCart();
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


}

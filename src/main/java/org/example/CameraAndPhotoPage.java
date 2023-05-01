package org.example;

import org.openqa.selenium.By;

public class CameraAndPhotoPage extends Utils{
    private By _leicaCamera = By.linkText("Leica T Mirrorless Digital Camera");
    public void clickOnLeicaCamera(){
        clickOnElement(_leicaCamera);

    }

}

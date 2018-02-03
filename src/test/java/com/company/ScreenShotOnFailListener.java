package com.company;

import com.company.Tests.BaseTest;
import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.File;
import java.io.IOException;

public class ScreenShotOnFailListener extends BaseTest implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure  (ITestResult iTestResult) {
        try {
            app.common.getScreenShot();;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext context) {


    }



    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    @Attachment(value = "{0}", type = "image/png")
    public byte[] screenshot() throws IOException {
            return   app.common.getScreenShot();

    }
}

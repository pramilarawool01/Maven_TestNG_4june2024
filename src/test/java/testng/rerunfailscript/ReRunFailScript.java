package testng.rerunfailscript;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailScript implements IRetryAnalyzer {

    public static int retryCount = 0;
    public static final int maxRetryCount = 3;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(retryCount < maxRetryCount){
            retryCount++;
            return true;
        }

        return false;
    }
}

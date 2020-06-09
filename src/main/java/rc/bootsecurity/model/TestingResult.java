package rc.bootsecurity.model;




public class TestingResult {

    private boolean testSuccess = false;
    private String errorInfo = "";
    private String resultInfo = "";
    private boolean resultStatus = false;


    public boolean isTestSuccess() {
        return testSuccess;
    }

    public void setTestSuccess(boolean testSuccess) {
        this.testSuccess = testSuccess;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public boolean isResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(boolean resultStatus) {
        this.resultStatus = resultStatus;
    }


//    public String createTestingResult(SciencePlan scienceplan) {
//        result();
//        return "";
//    }
}

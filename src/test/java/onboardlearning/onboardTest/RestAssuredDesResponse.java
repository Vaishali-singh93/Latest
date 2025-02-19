package onboardlearning.onboardTest;
import java.util.*;

public class RestAssuredDesResponse {
    public java.util.List<EmployeeExpDetails> getDetails() {
        return details;
    }

    public void setDetails(java.util.List<EmployeeExpDetails> details) {
        this.details = details;
    }

    public RestAssuredDesResponse(java.util.List<EmployeeExpDetails> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "RestAssuredDesResponse{" +
                "details=" + details +
                '}';
    }

    private List<EmployeeExpDetails> details;


}

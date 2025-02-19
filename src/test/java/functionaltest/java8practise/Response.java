package functionaltest.java8practise;



import java.util.HashMap;
import java.util.Map;

public class Response {
    private String responseBody;
    private int statusCode;
    private String responseType;





    public Response(String responseBody,int statusCode,String responseType){
        super();
        this.responseBody=responseBody;
        this.statusCode=statusCode;
        this.responseType=responseType;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "Response{" +
                "responseBody='" + responseBody + '\'' +
                ", statusCode=" + statusCode +
                ", responseType='" + responseType + '\'' +
                '}';
    }
}

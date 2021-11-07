import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITestForListOfArticles {

    @Test
    void testGetForListOfArticles() {
        String path = "https://5f99522350d84900163b8737.mockapi.io/tech-test/articles";
        Response response = RestAssured.get(path);
        int status = response.getStatusCode();
        Assert.assertEquals(status, 200);
    }

    @Test
    void testPostForListOfArticles() {
        String path = "https://5f99522350d84900163b8737.mockapi.io/tech-test/articles";
        Response response = RestAssured.post(path);
        int status = response.getStatusCode();
        Assert.assertEquals(status, 415);
    }

    @Test
    void testPutForListOfArticles() {
        String path = "https://5f99522350d84900163b8737.mockapi.io/tech-test/articles";
        Response response = RestAssured.put(path);
        int status = response.getStatusCode();
        Assert.assertEquals(status, 400);
    }

    @Test
    void testDeleteForListOfArticles() {
        String path = "https://5f99522350d84900163b8737.mockapi.io/tech-test/articles";
        Response response = RestAssured.delete(path);
        int status = response.getStatusCode();
        Assert.assertEquals(status, 400);
    }
}


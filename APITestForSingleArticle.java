import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class APITestForSingleArticle {

    @Test
    void testGetForSingleArticle() {
        String path = "https://5f99522350d84900163b8737.mockapi.io/tech-test/articles/2";
        Response response = RestAssured.get(path);
        int status = response.getStatusCode();
        Assert.assertEquals(status,200);
    }

    @Test
    void testPostForSingleArticle() {
        String path = "https://5f99522350d84900163b8737.mockapi.io/tech-test/articles/2";
        Response response = RestAssured.post(path);
        int status = response.getStatusCode();
        Assert.assertEquals(status,415);
    }

    @Test
    void testPutForSingleArticle() {
        String path = "https://5f99522350d84900163b8737.mockapi.io/tech-test/articles/2";
        Response response = RestAssured.put(path);
        int status = response.getStatusCode();
        Assert.assertEquals(status,404);
    }

    @Test
    void testDeleteForSingleArticle() {
        String path = "https://5f99522350d84900163b8737.mockapi.io/tech-test/articles/2";
        Response response = RestAssured.delete(path);
        int status = response.getStatusCode();
        Assert.assertEquals(status,404);
    }
}

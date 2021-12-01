package org.Vapsi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import org.testng.Assert;;


public class UserCreation
{
    String user;
    @Test
    public void createUser()
    {
        String endpoint = "https://petstore.swagger.io/v2/user";
        String user = """
                    {
                        "id" : 101
                        "userName" : "GayatriP",
                        "firstName" : "Gayatri",
                        "lastName" : "Patil",
                        "email" : "gayatribhole75@gmail.com"
                        "phone" : 8668980167,
                        "status" : 0
                    }
                      """;
        var response =  given().
                                                contentType(ContentType.JSON).
                                                 body(user).
                                                log().body().
                                            when().
                                                 post(endpoint).
                                             then().
                                                 assertThat().statusCode(400);
    }

    @Test
    public void createMultipleUsers(){
        String endpoint = "https://petstore.swagger.io/v2/user";
        String user = """
                    {
                        "id" : 102
                        "userName" : "IshanP",
                        "firstName" : "Ishan",
                        "lastName" : "Patil",
                        "email" : "IshanPatil75@gmail.com"
                        "phone" : 9801676470,
                        "status" : 1
                    }
                    {
                    
                        "id" : 103
                        "userName" : "VihaanP",
                        "firstName" : "Vihaan",
                        "lastName" : "Patil",
                        "email" : "VihaanPatil75@gmail.com"
                        "phone" : 9801676670,
                        "status" : 0
                    }
                    
                      """;
        var response = given().
                                                contentType(ContentType.JSON).
                                                body(user).
                                                 log().body().
                                        when().
                                                post(endpoint).
                                        then();
                                                 response.log().body();
    }

    @Test
    public void ValidateUnregisteredUser() {
        String endpoint = "https://petstore.swagger.io/v2/user";
        given().
                contentType(ContentType.JSON).
                queryParam("id","111").
                log().body().
                when().
                get(endpoint).
                then().
                assertThat().
                statusCode(405);

    }
    @Test
    public void ValiateURL()
    {
        String endpoint = "https://petstore.swagger.io/v212/user";
                 given().
                        contentType(ContentType.JSON).
                        log().body().
                when().
                         post(endpoint).
                then().
                         assertThat().
                         statusCode(404);
    }

    public void ValidateContentType()
    {
        String endpoint = "https://petstore.swagger.io/v2/user";
                given().
                        contentType(ContentType.XML).
                         body(user).
                         log().
                         body().
                when().post(endpoint).
                        then().
                            assertThat().statusCode(400);
    }

    @Test
    public void ValiateUserStatus()
    {
        String endpoint = "https://petstore.swagger.io/v212/user";
        given().
                contentType(ContentType.JSON).
                queryParam("status","3").
                log().body().

                when().
                post(endpoint).
                then().
                assertThat().
                statusCode(404);
    }


}

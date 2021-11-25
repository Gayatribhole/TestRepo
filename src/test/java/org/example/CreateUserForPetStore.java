package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CreateUserForPetStore
{
    @Test
    public void verifySingleUserCreation(){
        CreateUserREquest user= new CreateUserREquest();

        user.setId("1");
        user.setUsername("GayatriP");
        user.setFirstName("Gayatri");
        user.setLastName("Patil");
        user.setEmail("gayatribhole75@gmail.com");
        user.setPassword("12345");
        user.setPhone("8668980167");

        CreateUserResponce responseBodyParsing =
                RestAssured.given().
                        contentType(ContentType.JSON).
                        body(user).
                        log().
                        body().
                        when().
                        post("https://petstore.swagger.io/v2/user").
                        as(CreateUserResponce.class);

        responseBodyParsing.printCreateUserResponse();

        Assert.assertEquals(200, responseBodyParsing.getCode());
        Assert.assertEquals("unknown", responseBodyParsing.getType());
    }
    @Test
    public void verifyMultipleUsersCreationbyArray() {
        List<CreateUserREquest> userCreationArray = new ArrayList<>();

        CreateUserREquest user1 = new CreateUserREquest();
        CreateUserREquest user2 = new CreateUserREquest();

        user1.setId("1");
        user1.setUsername("IshanP");
        user1.setFirstName("Ishan");
        user1.setLastName("Patil");
        user1.setEmail("patilIshan@gmail.com");
        user1.setPassword("123456");
        user1.setPhone("9067358317");

        user2.setId("2");
        user2.setUsername("VihaanP");
        user2.setFirstName("Vihaan");
        user2.setLastName("Patil");
        user2.setEmail("PatilVihaan@gmail.com");
        user2.setPassword("14042020");
        user2.setPhone("7620345566");

        userCreationArray.add(user1);
        userCreationArray.add(user2);

        CreateUserResponce responseBody =
                RestAssured.given().
                        contentType(ContentType.JSON).
                        body(userCreationArray).
                        log().
                        body().
                        when().
                        post("https://petstore.swagger.io/v2/user/createWithArray").
                        as(CreateUserResponce.class);

        responseBody.printCreateUserResponse();

        Assert.assertEquals(200, responseBody.getCode());
        Assert.assertEquals("unknown", responseBody.getType());
    }
}


package jwstest.test.cases;

import core.TestBase;
import io.restassured.response.Response;
import jwstest.service.data.response.TransactionObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class AllTransactionsByIncDate extends TestBase {
  @Test public void allTransactionsByIncDate() {

    Response response = given().auth().preemptive().basic(user, pass).when()
        .get(baseUrl.concat("?").concat("orderBy=").concat(orderByCriterias.get(1)));

    Assert.assertEquals(getOK, response.getStatusCode());
    System.out.println(CORRECT_CODE_RETURNED);

    List<TransactionObject> returnedTransactions =
        Arrays.asList(response.getBody().as(TransactionObject[].class));

    for (TransactionObject singleTransaction : returnedTransactions) {

      Assert.assertEquals(true,
          singleTransaction.action.equals(actions.get(0)) || singleTransaction.action
              .equals(actions.get(1)));
      System.out.println(CORRECT_ACTION);
      Assert.assertEquals(correctAmount, singleTransaction.amount);
      System.out.println(CORRECT_AMOUNT);
      Assert.assertEquals(true,
          singleTransaction.brandId >= firstBrandId && singleTransaction.brandId <= lastBrandId);
      System.out.println(CORRECT_BRAND_ID);
      Assert.assertEquals(CORRECT_CARD_EXPIRATION_YEAR, true,
          singleTransaction.card.expiryYear >= firstExpiryYear);
      System.out.println(CORRECT_CARD_EXPIRATION_YEAR);
      boolean correctCurrency = false;
      for (int i = 0; i < currencyCodes.size(); i++) {
        if (singleTransaction.currencyCode.equals(currencyCodes.get(i))) {
          correctCurrency = true;
        }
      }
      Assert.assertEquals(CORRECT_CURRENCY_CODE, true, correctCurrency);
      System.out.println(CORRECT_CURRENCY_CODE);
    }
  }
}

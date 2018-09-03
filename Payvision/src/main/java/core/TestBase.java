package core;

import java.util.Arrays;
import java.util.List;

public abstract class TestBase {
  protected static final String CORRECT_CODE_RETURNED = "Correct status code returned";
  protected static final String CORRECT_ACTION = "Correct action";
  protected static final String CORRECT_AMOUNT = "Correct amount";
  protected static final String CORRECT_BRAND_ID = "Correct brand ID";
  protected static final String CORRECT_CARD_EXPIRATION_YEAR = "Correct card expiration year";
  protected static final String CORRECT_CURRENCY_CODE = "Correct currency code";
  protected String user = "code-challenge";
  protected String pass = "payvisioner";
  protected int getOK = 200;
  protected int correctAmount = 100;
  protected int firstBrandId = 1010;
  protected int lastBrandId = 1060;
  protected int firstExpiryYear = 2018;



  protected String baseUrl =
      "https://jovs5zmau3.execute-api.eu-west-1.amazonaws.com/prod/transactions";
  protected List<String> currencyCodes = Arrays.asList("EUR", "GBP", "JPY", "USD");
  protected List<String> actions = Arrays.asList("payment", "credit");
  protected List<String> orderByCriterias = Arrays.asList("date", "-date");



}

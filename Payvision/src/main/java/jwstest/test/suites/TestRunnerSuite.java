package jwstest.test.suites;

import jwstest.test.cases.ActionByDecDate;
import jwstest.test.cases.ActionByIncDate;
import jwstest.test.cases.AllTransactionsByDecDate;
import jwstest.test.cases.AllTransactionsByIncDate;
import jwstest.test.cases.CreditByDecDate;
import jwstest.test.cases.CreditByIncDate;
import jwstest.test.cases.CurrencyByDecDate;
import jwstest.test.cases.CurrencyByIncDate;
import jwstest.test.cases.EurByDecDate;
import jwstest.test.cases.EurByIncDate;
import jwstest.test.cases.GbpByDecDate;
import jwstest.test.cases.GbpByIncDate;
import jwstest.test.cases.JpyByDecDate;
import jwstest.test.cases.JpyByIncDate;
import jwstest.test.cases.PaymentByDecDate;
import jwstest.test.cases.PaymentByIncDate;
import jwstest.test.cases.UsdByDecDate;
import jwstest.test.cases.UsdByIncDate;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses( {ActionByDecDate.class, ActionByIncDate.class, AllTransactionsByDecDate.class,
    AllTransactionsByIncDate.class, CreditByDecDate.class, CreditByIncDate.class,
    CurrencyByDecDate.class, CurrencyByIncDate.class, EurByIncDate.class, EurByDecDate.class,
    GbpByDecDate.class, GbpByIncDate.class, JpyByDecDate.class, JpyByIncDate.class,
    UsdByDecDate.class, UsdByIncDate.class, PaymentByIncDate.class, PaymentByDecDate.class})
public class TestRunnerSuite {
}

# RestAssuredGsonTestingFW
Testing framework based on Rest-assured, JUnit and Gson to test REST APIs. The pupose of this FW is undertaking the assignment described below: 

As a payment gateway, certain company offers multiple APIs to process payments and credits (also known as transactions). The idea is to create a test plan with all the cases considered.

Please, find bellow all the information of the API under test:

Transactions endpoint
https://jovs5zmau3.execute-api.eu-west-1.amazonaws.com/prod/transactions
This is the endpoint for retrieving transactions from the API. This is a protected endpoint; provide the following credentials using the basic auth mechanism.
Username: code-challenge
Password: payvisioner

This endpoint should be called with GET and accept filters.

Filter name           Possible values: 
action                payment, credit
currencyCode          EUR, GBP, JPY, USD
orderBy               date, -date

Here are some examples: 
https://jovs5zmau3.execute-api.eu-west1.amazonaws.com/prod/transactions?currency=EUR

https://jovs5zmau3.execute-api.eu-west1.amazonaws.com/prod/transactions?action=refund

https://jovs5zmau3.execute-api.eu-west1.amazonaws.com/prod/transactions?action=charge&currency=USD

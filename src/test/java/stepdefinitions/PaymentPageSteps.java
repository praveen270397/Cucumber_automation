package stepdefinitions;

import com.pages.PaymentPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.When;

public class PaymentPageSteps {


	PaymentPage paymentPage = new PaymentPage(DriverFactory.getdriver());

	@When("confirm the order by making payment with payoption as {string}")
	public void confirm_the_order_by_making_payment_with_payoption_as(String pay_option) {
		paymentPage.Pay_option(pay_option);
		paymentPage.Order_confirmation();
	}
}

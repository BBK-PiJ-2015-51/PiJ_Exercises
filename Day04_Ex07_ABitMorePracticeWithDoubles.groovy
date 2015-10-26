import java.lang.Math

println "what is the total amount borrowed for your mortgage"
String str = System.console().readLine()
Double mortgage = Double.parseDouble(str)

println "how many years to pay it back"
String str2 = System.console().readLine()
Double years = Double.parseDouble(str2)

println "what is the interest rate"
String str3 = System.console().readLine()
Double interest = Double.parseDouble(str3)

class Mortgage {

	double mortgage
	double years
	double interest

	double getTotalAmount() {
		return this.mortgage * (1 + (this.interest/100))
	}

	double getToPayEachYear() {
		return getTotalAmount()/this.years
	}

	double getYearsUntilInterestPaid() {
		double years = 0
		double mortgageLeft = getTotalAmount()
		while (mortgageLeft > this.mortgage) {
			mortgageLeft = mortgageLeft - getToPayEachYear()
			years++
		}
		return years
	}

}

Mortgage myMortgage = new Mortgage()
myMortgage.mortgage = mortgage
myMortgage.years = years
myMortgage.interest = interest

println myMortgage.getTotalAmount()
println myMortgage.getToPayEachYear()
println myMortgage.getYearsUntilInterestPaid()





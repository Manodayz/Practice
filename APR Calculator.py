def calculate_loan():
    try:
        Amount = float(input("Enter the end goal accumulated amount: "))
        Principal = float(input("Enter the Principal + Initial amount: "))
        APR = float(input("Enter the annual percentage rate (%) as a decimal (e.g., 5 for 5%): ")) / 100
        Years = float(input("Enter the time in years: "))
        CompoundsPerYear = float(input("Enter the number of compounds per year: "))
        RegularPaymentRate = float(input("Enter the amount you regularly pay in per compounding term. 0 if not adding: "))

        CompoundInterest = Amount * Principal * (1 + (APR / CompoundsPerYear))**(Years * CompoundsPerYear)

        RegularPaymentCalc = RegularPaymentRate * (((1 + (APR / CompoundsPerYear))**(CompoundsPerYear * Years) - 1) / (APR / CompoundsPerYear))
    
        print(f"\nCompound Interest: {CompoundInterest:.2f}")
        print(f"Regular Payment: {RegularPaymentCalc:.2f}")

    except ValueError:
        print("Invalid input. Please enter numeric values.")


if __name__ == "__main__":
    calculate_loan()

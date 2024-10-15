
    interface IBankAccount
    {
        boolean DepositAmount(double amount);
        boolean WithdrawAmount(double amount);
        double CheckBalance();
    }


      class SavingAccount implements IBankAccount
    {
        private double Balance = 0;
        private  double PerDayWithdrawLimit = 10000;
        private double TodayWithdrawal = 0;

        public boolean DepositAmount(double Amount)
        {
            Balance = Balance + Amount;
            System.out.println("You have Deposited: {Amount}="+Amount);
            System.out.println("Your Account Balance: {Balance}="+Balance);
            return true;
        }

        //Maximum Withdrawal Per Day: 10000
        public boolean WithdrawAmount(double Amount)
        {
            if (Balance < Amount)
            {
               System.out.println("You have Insufficient balance!");
                return false;
            }
            else if (TodayWithdrawal + Amount > PerDayWithdrawLimit)
            {
                System.out.println("Withdrawal attempt failed!");
                return false;
            }
            else
            {
                Balance = Balance - Amount;
                TodayWithdrawal = TodayWithdrawal + Amount;
                System.out.println("You have Successfully Withdraw: {Amount}="+Amount);
               System.out.println("Your Account Balance: {Balance}="+Balance);
                return true;
            }
        }
        public double CheckBalance()
        {
            return Balance;
        }
    }
 


 class Program
    {
      public static void main(String[] args)
        {
             
            IBankAccount savingAccount = new SavingAccount();
            savingAccount.DepositAmount(2000);
            savingAccount.DepositAmount(1000);
            savingAccount.WithdrawAmount(1500);
            savingAccount.WithdrawAmount(5000);
            System.out.println("Saving Account Balanace: " +savingAccount.CheckBalance());
}}



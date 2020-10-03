class Main {
  public static void main(String[] args) {
  byte [] days= {1,3,9,19,30};
  byte amountPerDay=100;
  float paid=500;
  float amountToPay=0f;
  float totalAmount=0f;
  float extraAmount;
  float AmountLeftToPay;
  byte daysPaid;
  byte daysNotPaid;
  byte i=0;

  for(byte x : days)
  totalAmount+=amountPerDay;
  System.out.println("Total amount to pay is "+totalAmount);
  daysPaid=(byte)(paid/amountPerDay);
  System.out.println("Days debtors paid for ");
  for(i=0;i<5 &&i<daysPaid;i++){
    System.out.println(days[i]+",");
  }
  System.out.println("");
  if (paid%amountPerDay>0&&i<5){
    amountToPay=paid%amountPerDay;
    System.out.println("You did not complete defaultedDays[i]");
  }
  if(totalAmount>paid){
    amountToPay=totalAmount-paid;
    daysNotPaid=(byte)(5-(paid/amountPerDay));
    System.out.println("Amount to pay is "+ amountToPay +"you did not pay for"+ daysNotPaid + "day(s)");
  }
  else if(totalAmount ==paid){
    System.out.println("You paid the exact amount");
  }
  else{
    extraAmount = paid - totalAmount;
    System.out.println("You paid extra by "+extraAmount);
  }
  }
}
